package models;
/**
 * Created by qiao on 11/12/15.
 */

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
public class ToolCategory extends Model{
    @Id
    public Integer id;
    @Constraints.Required
    public String name;
    public String imageLink;
    @OneToMany
    public List<SubToolCategory> subToolCategoryList;
/*
    @OneToMany
    public List<Tool> toolList;
*/
    public static Finder<Integer, ToolCategory> find = new Finder<Integer, ToolCategory>(ToolCategory.class);
}
