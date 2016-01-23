package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlUpdate;
import models.Tool;
import models.ToolUser;
import play.data.DynamicForm;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.data.Form.form;

/**
 * Created by Qiao on 2015/12/8.
 */
public class Account extends Controller {

    public Result signup() {

        return ok(views.html.account.signup.render());
    }
    public Result login() {
        return ok(views.html.account.login.render());
    }

    public Result signupPost() {
        DynamicForm userForm = form().bindFromRequest();
        if (userForm.hasErrors()) {
            return badRequest(views.html.account.signup.render( ));
        }
        String user_name = userForm.data().get("username");
        ToolUser tool_user=ToolUser.find.where().eq("username",user_name ).findUnique();
        if(tool_user!=null) {
            flash("error", "Invalid sign up, username already exists");
            return redirect(routes.Home.index());
        }
        String password = userForm.data().get("passw1");
        String email = userForm.data().get("email");
        String phone = userForm.data().get("phone");

        ToolUser tooluser = ToolUser.createNewUser(user_name, password,email,phone);

        if(tooluser == null) {
            flash("error", "Invalid user");
            return redirect(routes.Home.index());
        }

        tooluser.save();

        session().clear();
        session("user_id",tooluser.id.toString());
        session("user_name",tooluser.username);
        flash("success","Welcome,"+tooluser.username);
        return redirect(routes.Home.index());
    }

    public Result loginPost() {
        DynamicForm userForm = form().bindFromRequest();
        String username = userForm.data().get("username");
        String password = userForm.data().get("passw1");

        ToolUser tooluser = ToolUser.find.where().eq("username", username).findUnique();

        if(tooluser != null && tooluser.authenticate(password)) {
            session().clear();
            session("connected",tooluser.id.toString());
            session("user_id",tooluser.id.toString());
            session("user_name",tooluser.username);
            flash("success",tooluser.username+" successfully logged in");
        } else {
            flash("error", "Invalid username or password");
        }

        return redirect(routes.Home.index());

    }

    public Result logout() {
        session().clear();
        flash("disconnected", "Logged out");
        return redirect(routes.Home.index());
    }
    public Result user() {
        String userId=session().get("user_id");
        Integer user_id=Integer.parseInt(userId);
        return redirect(routes.Account.userById(user_id));
    }

    public Result userById(int userId) {

        ToolUser tooluser=ToolUser.find.byId(userId);
        if(tooluser==null){
            return notFound("User not available");
        }
        List<Tool> tools= Tool.find.where().eq("owner_id", userId).findList();
        return ok(views.html.account.user.render(tooluser,tools));

    }

    public Result userlist(){
        List<ToolUser> users = ToolUser.find.all();
        return ok(views.html.account.userlist.render(users));
    }

    public Result saveProfile(int userId) {
        ToolUser tooluser=ToolUser.find.byId(userId);
        if(tooluser==null){
            return notFound("User not available");
        }
        DynamicForm userForm = form().bindFromRequest();

        tooluser.phone = userForm.data().get("phone");
        tooluser.email = userForm.data().get("email");
        tooluser.update();
        /*
        String email = userForm.data().get("email");

        boolean status = ToolUser.editUser(username, email);

        if(status == false) {
            flash("error", "Failed to edit user");
            return redirect(routes.Home.index());
        }
        */
        flash("success", "User profile saved successfully");
        return redirect(routes.Account.userById( userId));
    }
}
