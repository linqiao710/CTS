package models;

/**
 * Created by qiao on 11/12/15.
 */

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;

import com.avaje.ebean.SqlUpdate;
import org.mindrot.jbcrypt.BCrypt;
import play.data.validation.Constraints;

import javax.persistence.*;
import javax.validation.Constraint;
import java.util.List;

import static org.postgresql.gss.MakeGSS.authenticate;

@Entity
public class ToolUser extends Model {
    @Id
    public Integer id;
    @Constraints.Required
    public String username;

    public String password_hash;

    public String email;
    public String imageLink;
    public String phone;
    public String add;


    public static Finder<Integer, ToolUser> find = new Finder<Integer, ToolUser>(ToolUser.class);

    public boolean authenticate(String password) {
        return BCrypt.checkpw(password, this.password_hash);
    }

    public static ToolUser createNewUser(String username, String password, String email, String phone) {
        if (password == null || username == null || password.length() < 8) {
            return null;
        }
        String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
        ToolUser user = new ToolUser();
        user.username=username;
        user.password_hash=passwordHash;
        user.email=email;
        user.imageLink="http://i.imgur.com/w9G61gq.jpg";
        user.phone=phone;
        return user;
    }
    public static boolean editUser(String username, String email) {
        if (email == null || username == null ) {
            return false;
        }

        SqlUpdate update = Ebean.createSqlUpdate("UPDATE tool_user SET email='" +email+ "' WHERE username='" +username+ "';");

        update.execute();

        return true;
    }


}
