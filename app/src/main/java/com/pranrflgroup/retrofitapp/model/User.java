package com.pranrflgroup.retrofitapp.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by MD.Rabius sani raju on 1/30/22.
 */
@Getter
@Setter
public class User {
    private int id;
    private int userId;
    private String title;
    private String body;


    public User(int id, int userId, String title, String body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }
}
