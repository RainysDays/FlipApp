package com.iquery.vallet;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetApp {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<App> listApp;
    @SerializedName("message")
    String message;

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public List<App> getListApp() {
        return listApp;
    }

    public void setListApp(List<App> listApp) {
        this.listApp = listApp;
    }
}