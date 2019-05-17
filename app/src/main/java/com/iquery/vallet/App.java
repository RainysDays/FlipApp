package com.iquery.vallet;

import com.google.gson.annotations.SerializedName;

import java.sql.Struct;

public class App {
    @SerializedName("app_id")
    private String id;
    @SerializedName("app_name")
    private  String name;
    @SerializedName("app_dev")
    private String dev;
    @SerializedName("app_desc")
    private String desc;
    @SerializedName("app_hashtag")
    private String hashtag;

    public App(){}

    public App(String id,String name,String dev,String desc,String hashtag){
        this.id = id;
        this.name = name;
        this.dev = dev;
        this.desc = desc;
        this.hashtag = hashtag;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDev(){
        return dev;
    }

    public void setDev(String dev){
        this.dev = dev;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getHashtag(){
        return hashtag;
    }

    public void setHashtag(String hashtag){
        this.hashtag = hashtag;
    }
}
