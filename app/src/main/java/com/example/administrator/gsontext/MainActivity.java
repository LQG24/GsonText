package com.example.administrator.gsontext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.gsontext.model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.logger.Logger;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setId(100);
        user.setBody("hi I am gson");
        user.setNumber(12);
        user.setCreated_at("2014-05-22 19:12:38");
        Gson gson = new Gson();
        String result = gson.toJson(user);
        Logger.json(result);
        Logger.d("hello");

        String jsonString = "{id:11,body:'李四',number:'123',created_at:'2016-07-22 29:12:38'}";

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-MM-dd HH:mm");
        Gson gson1 = gsonBuilder.create();
        User user1 = gson1.fromJson(jsonString, User.class);
        Logger.d(user1.getCreated_at());


        String json ="[{\n" +
                "    \"id\": 100,\n" +
                "    \"body\": \"It is my post1\",\n" +
                "    \"number\": 0.13,\n" +
                "    \"created_at\": \"2014-05-20 19:12:38\"\n" +
                "},\n" +
                "{\n" +
                "    \"id\": 101,\n" +
                "    \"body\": \"It is my post2\",\n" +
                "    \"number\": 0.14,\n" +
                "    \"created_at\": \"2014-05-22 19:12:38\"\n" +
                "}]";

        User childArray[]=gson.fromJson(json,User[].class);
        for (User i:childArray)
        {
            Logger.d(i.getId());
        }


        Type listType=new TypeToken<ArrayList<User>>(){}.getType();
        ArrayList<User> users=gson.fromJson(json,listType);
        for(User j:users)
        {
            Logger.d(j.getBody());
        }


    }
}
