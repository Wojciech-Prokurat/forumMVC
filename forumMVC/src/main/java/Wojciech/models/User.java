package Wojciech.models;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Użytkownik on 27.01.2018.
 */
public class User {
    private Long id;
    private String username;
    private String passwordHash;


    public User() {
    }

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

}
