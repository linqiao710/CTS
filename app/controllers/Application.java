package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlUpdate;
import models.ToolCategory;
import models.ToolUser;

import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.*;
import play.mvc.*;
import views.html.*;


import java.util.List;

import static play.data.Form.form;


public class Application extends Controller {

    public Result index() {

        return redirect(routes.Home.index());
    }
/*
    public Result login() {
        DynamicForm userForm = form().bindFromRequest();
        String username = userForm.data().get("username");
        String password = userForm.data().get("password");

        ToolUser user = ToolUser.find.where().eq("username", username).findUnique();

        if(user != null && user.authenticate(password)) {
            session("user_id", user.id.toString());
            flash("success", "Welcome back " + user.username);
        } else {
            flash("error", "Invalid login. Check your username and password.");
        }

        return redirect(routes.Application.index());

    }

    public Result signup() {
       DynamicForm userForm = form().bindFromRequest();
        String username = userForm.data().get("username");
        String password = userForm.data().get("password");

       ToolUser tooluser = ToolUser.createNewUser(username, password);

        if(user == null) {
            flash("error", "Invalid user");
            return redirect(routes.Application.index());
        }

      //  ToolUser tooluser = Form.form(ToolUser.class).bindFromRequest().get();
        tooluser.save();
        flash("success", "Welcome new user " + tooluser.username);
        session("user_id", tooluser.id.toString());
        return redirect(routes.Application.index());
    }

    public Result logout() {
        session().remove("user_id");
        return redirect(routes.Application.index());
    }
*/
}

