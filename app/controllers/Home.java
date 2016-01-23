package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlUpdate;
import models.SubToolCategory;
import models.Tool;
import models.ToolCategory;
import models.ToolUser;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
import java.util.Locale;

/**
 * Created by Qiao on 2015/12/8.
 */
public class Home extends Controller {
    //initialize tables and display home page
    List<ToolCategory> toolCategory = ToolCategory.find.all();
    public Result index() {
        //List<ToolCategory> genres = ToolCategory.find.all();


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
        toolCategory.get(0).subToolCategoryList= SubToolCategory.find.where().eq("category_id", id1).findList();
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
            ToolUser testuser=ToolUser.createNewUser("admin","12345678","admin@bq.com","111-111-1234");
            testuser.save();
            /*
            SqlUpdate insert = Ebean.createSqlUpdate("Insert into tool_user(username,password_hash, email, image_link) values" +
                    "('test', '"+testuser.password_hash+"', 'test@test.com','http://i.imgur.com/w9G61gq.jpg') ");
            insert.execute();
            */
            users = ToolUser.find.all();
        }

        //SqlUpdate delete = Ebean.createSqlUpdate("delete from Tools");
        //delete.execute();
       // List<Tools> tools=Tools.find.all();

        toolCategory.get(0).subToolCategoryList.get(0).toolList= Tool.find.where().eq("category_id", toolCategory.get(0).id).eq("subcategory_id", toolCategory.get(0).subToolCategoryList.get(0).id).findList();


        if(toolCategory.get(0).subToolCategoryList.get(0).toolList.size()==0){
            SqlUpdate insert = Ebean.createSqlUpdate("Insert into " +
                    "tool(name,owner_id,image_link,is_available,category_id,subcategory_id,sub_category_id) values" +
                    "('Husky 6 in. Low Vibration Palm Sander',1,'https://i.imgur.com/E1gla3h.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('EMAX 6 in. Dual Action Orbital Sander Industrial Duty',1,'https://i.imgur.com/srDTdn4.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('Florida Pneumatic Jitterbug and Block Sander',1,'https://i.imgur.com/leokA1b.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('Husky 5 in. Pneumatic High-Speed Disc Sander',1,'https://i.imgur.com/YHWJZDR.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('Husky 6 in. Dual Action Sander',1,'https://i.imgur.com/2nqfaL6.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('Ingersoll Rand Dual Action Sander',1,'https://i.imgur.com/Kdg3mdv.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('Ingersoll Rand High Speed Sander',1,'https://i.imgur.com/CcgQ9FS.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('Ingersoll Rand Random Orbital Sander',1,'https://i.imgur.com/eXriWhk.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('Ingersoll Rand Straight Line Sander',1,'https://i.imgur.com/uhlMemt.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('JET Mini Belt Sander',1,'https://i.imgur.com/1FhnJLH.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('Powermate 6 in. Dual Action Sander',1,'https://i.imgur.com/yCEcsQo.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")," +
                    "('PowRyte 6 in. Dual Action Sander',1,'https://i.imgur.com/KtO3VZ2.jpg','Available',"+toolCategory.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+","+toolCategory.get(0).subToolCategoryList.get(0).id+")" );

                    insert.execute();
                    toolCategory.get(0).subToolCategoryList.get(0).toolList= Tool.find.where().eq("category_id", toolCategory.get(0).id).eq("subcategory_id", toolCategory.get(0).subToolCategoryList.get(0).id).findList();

           }
        //check if user logged in.

        return ok(views.html.home.index.render(toolCategory));
    }

    public Result subcategory(Integer category_Id, Integer subcategory_Id) {
       // List<Tools> tools=Tools.find.all();
       // return ok(views.html.home.subcategory.render(tools, id));
        ToolCategory category = ToolCategory.find.byId(category_Id);
        SubToolCategory subcategory = SubToolCategory.find.byId(subcategory_Id);
        if (category==null||subcategory == null) {
            return notFound("not found");
        } else {
              List<Tool> tools= Tool.find.where().eq("category_id", category.id).eq("subcategory_id",subcategory.id).findList();
              if(tools==null)    return notFound("not found");
              return ok(views.html.home.subcategory.render(tools, category.name, subcategory.name));
        }
    }


}
