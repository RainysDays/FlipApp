package com.iquery.vallet;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("android")
    Call<GetApp> getApp();
    @FormUrlEncoded
    @POST("app")
    Call<PostPutDelItem> postApp(@Field("name") String name,@Field("dev") String dev, @Field("desc") String desc);

    @FormUrlEncoded
    @PUT("app")
    Call<PostPutDelItem> putApp(@Field("id") String id,@Field("name") String name,@Field("dev")String dev,@Field("desc")String desc);

    @FormUrlEncoded
    @HTTP(method = "DELETE",path = "app",hasBody = true)
    Call<PostPutDelItem> deleteApp(@Field("id")String id);
}
