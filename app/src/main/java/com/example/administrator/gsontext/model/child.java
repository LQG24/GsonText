package com.example.administrator.gsontext.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Linqiaogeng on 2016/7/29.
 */
public class child {
    /**
     * id : 100
     * body : It is my post
     * number : 0.13
     * created_at : 2014-05-22 19:12:38
     * childFoo : {"id":200,"name":"jack"}
     */

    private int id;
    private String body;
    private double number;
    @SerializedName("created_at")
    private String createdAt;
    private ChildFooEntity childFoo;

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
        this.createdAt = created_at;
    }

    public void setChildFoo(ChildFooEntity childFoo) {
        this.childFoo = childFoo;
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
        return createdAt;
    }

    public ChildFooEntity getChildFoo() {
        return childFoo;
    }

    public static class ChildFooEntity {
        /**
         * id : 200
         * name : jack
         */

        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
