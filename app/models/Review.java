package models;

/**
 * Created by qiao on 11/12/15.
 */

import com.avaje.ebean.Model;
import play.data.format.Formats;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Date;


@Entity
public class Review extends Model{
    @Id
    public Integer id;
    public Integer poster_id;
    public String poster_name;
    public Integer tool_id;
    @Lob
    public String body;
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date posted_on= new Date();

    public static Finder<Integer, Review> find=new Finder<Integer, Review>(Review.class);

}