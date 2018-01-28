package Wojciech.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Użytkownik on 27.01.2018.
 */
public class Post {
    private Long id;
    private String title;
    private String body;
    private User author;
    private Cathegory cat;
    private Set<Comment> comments = new HashSet<>();
    private Date date = new Date();


    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Cathegory getCat() {
        return cat;
    }

    public void setCat(Cathegory cat) {
        this.cat = cat;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
