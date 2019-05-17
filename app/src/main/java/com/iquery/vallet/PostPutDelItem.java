package com.iquery.vallet;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostPutDelItem {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    App mApp;
    @SerializedName("message")
    String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public App getApp(){
        return mApp;
    }

    public void setApp(App app){
        mApp = app;
    }
}
