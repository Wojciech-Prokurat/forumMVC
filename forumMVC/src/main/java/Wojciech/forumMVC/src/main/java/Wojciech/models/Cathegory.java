package Wojciech.models;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Użytkownik on 27.01.2018.
 */
public class Cathegory {
    private long id;
    private String title;
    private Set<Post> posts = new HashSet<>();

    public Cathegory() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}
