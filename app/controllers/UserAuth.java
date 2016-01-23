package controllers;

/**
 * Created by qiao on 11/14/15.
 */
import models.ToolUser;

import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

public class UserAuth extends Security.Authenticator {
    // When return is null, Authentication failed
    @Override
    public String getUsername(final Http.Context ctx) {
        String userIdStr = ctx.session().get("user_id");
        if(userIdStr == null) return null;
        ToolUser tooluser = ToolUser.find.byId(Integer.parseInt(userIdStr));
        return (tooluser != null ? tooluser.id.toString() : null);
    }

    @Override
    public Result onUnauthorized(final Http.Context ctx) {
        ctx.flash().put("error", "Nice try, but you need to log in first!");
        return redirect(routes.Home.index());
    }
}