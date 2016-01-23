package controllers;

/**
 * Created by qiao on 11/14/15.
 */
import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlUpdate;
import models.SubToolCategory;
import models.Tool;
import models.ToolUser;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import models.ToolCategory;
import play.mvc.Security;

import java.util.List;


public class Categories extends Controller{

    // List all of the Genres
    public Result index() {
        //List<ToolCategory> genres = ToolCategory.find.all();
        List<ToolCategory> toolCategory = ToolCategory.find.all();

        if(toolCategory.size()==0){
            SqlUpdate insert= Ebean.createSqlUpdate("Insert into " +
                    "tool_category (name, image_link) values" +
                    " ('Air Tools','http://i.imgur.com/ZkwDPg2.jpg')," +
                    "('Hand Tools','http://i.imgur.com/mS6TMa9.jpg')," +
                    "('Power Tools','http://i.imgur.com/AWU9NDO.jpg')");
            insert.execute();
            toolCategory = ToolCategory.find.all();
        }
       // List<ToolCategory> toolCategory2 = ToolCategory.find.all();


       int id1=toolCategory.get(0).id;
        int id2=toolCategory.get(1).id;
        int id3=toolCategory.get(2).id;
        toolCategory.get(0).subToolCategoryList=SubToolCategory.find.where().eq("category_id", id1).findList();
        if(toolCategory.get(0).subToolCategoryList.size()==0){

            SqlUpdate insert= Ebean.createSqlUpdate("Insert into " +
                    "sub_tool_category (name,category_id) values" +
                    " ('Air Impact Wrenches',"+id1+")," +
                    "('Grease Guns',"+id1+")," +
                    "('Sanders & Polishers',"+id1+")");
            insert.execute();
            toolCategory.get(0).subToolCategoryList=SubToolCategory.find.where().eq("category_id", id1).findList();
        }

        toolCategory.get(1).subToolCategoryList = SubToolCategory.find.where().eq("category_id", id2).findList();
        if(toolCategory.get(1).subToolCategoryList.size()==0){

            SqlUpdate insert= Ebean.createSqlUpdate("Insert into " +
                    "sub_tool_category (name,category_id) values" +
                    " ('Cutting Tools',"+id2+")," +
                    "('Wrenches',"+id2+")," +
                    "('Screwdrivers',"+id2+"),"+
                    "('Pliers',"+id2+"),"+
                    "('Fastening Tools',"+id2+"),"+
                    "('Hammers',"+id2+"),"+
                    "('Plumbing Tools',"+id2+")"
            );
            insert.execute();
            toolCategory.get(1).subToolCategoryList = SubToolCategory.find.where().eq("category_id", id2).findList();
        }
        toolCategory.get(2).subToolCategoryList=SubToolCategory.find.where().eq("category_id", id3).findList();
        if(toolCategory.get(2).subToolCategoryList.size()==0){

            SqlUpdate insert= Ebean.createSqlUpdate("Insert into " +
                    "sub_tool_category (name,category_id) values" +
                    " ('Drills',"+id3+")," +
                    "('Saws',"+id3+")," +
                    "('Sanders',"+id3+"),"+
                    "('Oscillating Tools',"+id3+"),"+
                    "('Woodworking',"+id3+"),"+
                    "('Grinders',"+id3+")"
            );
            insert.execute();
            toolCategory.get(2).subToolCategoryList=SubToolCategory.find.where().eq("category_id", id3).findList();
        }
        List<ToolUser> users = ToolUser.find.all();
        if(users.size()==0) {
            SqlUpdate insert = Ebean.createSqlUpdate("Insert into tool_user(username,password_hash, email, image_link) values" +
                    "('test', '12345678', 'test@test.com','http://i.imgur.com/w9G61gq.jpg') ");
            insert.execute();
            users = ToolUser.find.all();
        }
        return ok(views.html.categories.index.render(toolCategory));
    }

  @Security.Authenticated(UserAuth.class)
    public Result create() {
        ToolCategory toolCategory = Form.form(ToolCategory.class).bindFromRequest().get();
        toolCategory.save();
        flash("success", "received data: " +toolCategory.name);
        return redirect(routes.Categories.index());
    }

    public Result show(Integer id) {
        SubToolCategory subcategory = SubToolCategory.find.byId(id);
        if(subcategory == null) {
            return notFound("not found");
        } else {
            List<Tool> tools = subcategory.toolList;
            return ok(views.html.categories.show.render(subcategory, tools));
        }
    }

}
