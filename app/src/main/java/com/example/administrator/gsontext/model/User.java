package com.example.administrator.gsontext.model;

import java.io.Serializable;

/**
 * Created by Linqiaogeng on 2016/7/29.
 */
public class User implements Serializable {


    /**
     * id : 100
     * body : It is my post
     * number : 0.13
     * created_at : 2014-05-22 19:12:38
     */

    private int id;
    private String body;
    private double number;
    private String created_at;

    public void setId(int id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public double getNumber() {
        return number;
    }

    public String getCreated_at() {
        return created_at;
    }
}
