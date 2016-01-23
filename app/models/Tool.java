package models;

/**
 * Created by qiao on 11/12/15.
 */

import com.avaje.ebean.Model;
import org.joda.time.DateTime;
import play.data.validation.Constraints;
import play.mvc.BodyParser;
import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.*;
import javax.xml.soap.Text;
import java.util.List;


@Entity
public class Tool extends Model {
    @Id
    public Integer id;
    @Constraints.Required
    public String name;
    @Constraints.Required
    public Integer ownerId;
    public String imageLink;
    public String isAvailable;
    @Lob
    public String description;
    @Lob
    public String specification;
    public Integer categoryID;
    public Integer subcategoryID;
    public Float price;
/*
    @ManyToOne
    public ToolCategory category;
*/
 @ManyToOne
    public SubToolCategory subCategory;



    public static Finder<Integer, Tool> find=new Finder<Integer, Tool>(Tool.class);


}
