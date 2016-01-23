package controllers;

/**
 * Created by qiao on 11/14/15.
 */
import models.*;
import play.data.DynamicForm;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.data.Form.form;


public class Tools extends Controller {
    public Result index(Integer tool_id){
        Tool tool= Tool.find.byId(tool_id);
        List<Review> reviews = Review.find.where().eq("tool_id", tool_id).findList();
        return ok(views.html.tools.index.render(tool, reviews));
    }
    public Result add() {
        Integer user_id=Integer.parseInt(session().get("user_id"));
        ToolUser tooluser=ToolUser.find.byId(user_id);
        if(tooluser==null){
            flash("error", "Please Log In");
            return redirect(routes.Home.index());
        }
        /*
        List<ToolCategory> toolCategory = ToolCategory.find.all();
        List<SubToolCategory> subtoolCategory = SubToolCategory.find.all();
        */
        return ok(views.html.tools.add.render(tooluser));
    }
    public Result edit(int tool_id) {
        Tool tool= Tool.find.byId(tool_id);

        Integer user_id=Integer.parseInt(session().get("user_id"));
        ToolUser tooluser=ToolUser.find.byId(user_id);
        if(tooluser==null){
            flash("error", "Please Log In");
            return redirect(routes.Home.index());
        }
        //List<ToolCategory> toolCategory = ToolCategory.find.all();
        //List<SubToolCategory> subtoolCategory = SubToolCategory.find.all();
        String categoryName=ToolCategory.find.byId(tool.categoryID).name;
        String subcategoryName=SubToolCategory.find.byId(tool.subcategoryID).name;
        return ok(views.html.tools.edit.render(tool, tooluser,categoryName,subcategoryName ));
    }
    public Result editPost(int toolId) {

        Integer user_id=Integer.parseInt(session().get("user_id"));
        ToolUser tooluser=ToolUser.find.byId(user_id);
        if(tooluser==null){
            flash("error", "Please Log In");
            return redirect(routes.Home.index());
        }
        DynamicForm toolForm = form().bindFromRequest();
       // String categoryName=toolForm.data().get("categoryName");
        String subcategoryName=toolForm.data().get("subcategory");
        if(subcategoryName==null){
            flash("error", "subcategoryName is unavailable");
            return redirect(routes.Home.index());
        }
        //ToolCategory toolCategory=ToolCategory.find.where().eq("name", categoryName).findUnique();
        SubToolCategory subtoolCategory=SubToolCategory.find.where().eq("name", subcategoryName).findUnique();

        if(subtoolCategory==null){
            flash("error", "subtoolCategory is unavailable");
            return redirect(routes.Home.index());
        }
        Tool tool= Tool.find.byId(toolId);
        tool.name=toolForm.data().get("toolname");
        //tool.ownerId=tooluser.id;
        String link=toolForm.data().get("imageLink");
        if(link.length()<15){
            tool.imageLink="http://i.imgur.com/OPeCY1q.jpg";
        }else {
            tool.imageLink = link;
        }
        tool.isAvailable=toolForm.data().get("isAvailable");
        tool.description=toolForm.data().get("description");
        tool.specification=toolForm.data().get("specification");
        tool.categoryID=subtoolCategory.categoryId;
        tool.subcategoryID=subtoolCategory.id;
        if(toolForm.data().get("price")!=""){
            tool.price=Float.parseFloat(toolForm.data().get("price"));
        }
        tool.update();
        flash("success", "Successfully saved Tool: " + tool.name);
        return redirect(routes.Account.userById(user_id));


    }

    public Result addPost() {
        //Form<Tool> toolForm = form(Tool.class).bindFromRequest();
        Integer user_id=Integer.parseInt(session().get("user_id"));
        ToolUser tooluser=ToolUser.find.byId(user_id);
        if(tooluser==null){
            flash("error", "Please Log In");
            return redirect(routes.Home.index());
        }
        DynamicForm toolForm = form().bindFromRequest();

        String subcategoryName=toolForm.data().get("subcategory");
        if(subcategoryName==null){
            flash("error", "subcategoryName is unavailable");
            return redirect(routes.Home.index());
        }
        SubToolCategory subtoolCategory=SubToolCategory.find.where().eq("name", subcategoryName).findUnique();

        if(subtoolCategory==null){
            flash("error", "subtoolCategory is unavailable");
            return redirect(routes.Home.index());
        }
        Tool tool=new Tool();
        tool.name=toolForm.data().get("toolname");
        tool.ownerId=tooluser.id;
        String link=toolForm.data().get("imageLink");
        if(link.length()<15){
            tool.imageLink="http://i.imgur.com/OPeCY1q.jpg";
        }else {
            tool.imageLink = link;
        }
        tool.isAvailable=toolForm.data().get("isAvailable");
        tool.description=toolForm.data().get("description");
        tool.specification=toolForm.data().get("specification");
        tool.categoryID=subtoolCategory.categoryId;
        tool.subcategoryID=subtoolCategory.id;
        if(toolForm.data().get("price")!=""){
           tool.price=Float.parseFloat(toolForm.data().get("price"));
        }
        /*
        String category_id = toolForm.data().get("category_id");
        SubToolCategory subtoolCategory = SubToolCategory.find.byId(Integer.parseInt(category_id));
        if(subtoolCategory == null) {
            flash("error", "Invalid Genre: " + category_id + " Try again.");
            return redirect(routes.Tools.index());
        }*/
        //Tool tool = toolForm.get();

        tool.save();
        flash("success", "Successfully added your new Tool: " + tool.name);
        return redirect(routes.Account.userById(user_id));
    }

    public Result delete(int tool_id) {
        Tool tool= Tool.find.byId(tool_id);

        Integer user_id=Integer.parseInt(session().get("user_id"));
        ToolUser tooluser=ToolUser.find.byId(user_id);
        if(tooluser==null){
            flash("error", "Please Log In");
            return redirect(routes.Home.index());
        }

        String categoryName=ToolCategory.find.byId(tool.categoryID).name;
        String subcategoryName=SubToolCategory.find.byId(tool.subcategoryID).name;
        return ok(views.html.tools.delete.render(tool, tooluser,categoryName,subcategoryName ));
    }
    public Result deletePost(int tool_id) {
        Tool tool= Tool.find.byId(tool_id);
        String toolname=tool.name;
        Integer user_id=Integer.parseInt(session().get("user_id"));
        ToolUser tooluser=ToolUser.find.byId(user_id);
        if(tooluser==null){
            flash("error", "Please Log In");
            return redirect(routes.Home.index());
        }
        tool.delete();
        flash("success", "Successfully deleted your Tool: " + toolname);
        return redirect(routes.Account.userById(user_id));
    }

    public Result overview(int tool_id) {
        String id = session().get("user_id");
        if (id == null) {
            flash("error", "For more information, please login");
            return redirect(routes.Home.index());
        } else {
            Integer user_id = Integer.parseInt(id);
            ToolUser loginUser = ToolUser.find.byId(user_id);
            if (loginUser == null) {
                flash("error", "For more information, please login");
                return redirect(routes.Home.index());
            }

            Tool tool = Tool.find.byId(tool_id);
            ToolUser toolOwner = ToolUser.find.byId(tool.ownerId);
            List<Review> reviews = Review.find.where().eq("tool_id", tool_id).findList();
            ToolCategory toolCategory = ToolCategory.find.byId(tool.categoryID);
            SubToolCategory subToolCategory = SubToolCategory.find.byId(tool.subcategoryID);

            return ok(views.html.tools.overview.render(tool, toolOwner, toolCategory, subToolCategory, reviews, loginUser));
        }
    }

    public Result reviewPost(int tool_id) {
        String id = session().get("user_id");
        if (id == null) {
            flash("error", "To add review, please login");
            return redirect(routes.Home.index());
        } else {
            Integer user_id = Integer.parseInt(id);
            ToolUser loginUser = ToolUser.find.byId(user_id);
            if (loginUser == null) {
                flash("error", "To add review, please login");
                return redirect(routes.Home.index());
            }

            Tool tool = Tool.find.byId(tool_id);
            //ToolUser toolOwner = ToolUser.find.byId(tool.ownerId);
            DynamicForm commentForm = form().bindFromRequest();
            Review review =new Review();
            review.tool_id=tool_id;
            review.poster_id=loginUser.id;
            review.poster_name=loginUser.username;
            review.body=commentForm.data().get("review");

        /*
            List<Review> comments = Review.find.where().eq("tool_id", tool_id).findList();
            ToolCategory toolCategory = ToolCategory.find.byId(tool.categoryID);
            SubToolCategory subToolCategory = SubToolCategory.find.byId(tool.subcategoryID);
            */
            review.save();
            flash("success", "Successfully added your review of Tool: " + tool.name);
            return redirect(routes.Tools.overview(tool_id));
        }
    }
}
