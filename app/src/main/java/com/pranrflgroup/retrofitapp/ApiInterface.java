package com.pranrflgroup.retrofitapp;

import com.pranrflgroup.retrofitapp.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by MD.Rabius sani raju on 1/30/22.
 */
public interface ApiInterface {

    @GET("posts")
    Call<List<User>> getUser();
}
