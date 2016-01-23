package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.List;


@Entity
public class SubToolCategory extends Model{
    @Id
    public Integer id;
    @Constraints.Required
    public String name;
    public String imageLink;

    public Integer categoryId;
   @ManyToOne
    public ToolCategory category;
   @OneToMany
    public List<Tool> toolList;

    public static Finder<Integer, SubToolCategory> find = new Finder<Integer,SubToolCategory>(SubToolCategory.class);
}