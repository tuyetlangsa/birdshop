package com.example.birdshop.api;

import com.example.birdshop.model.Request.ChangePasswordRequest;
import com.example.birdshop.model.Request.UpdateUserRequest;
import com.example.birdshop.model.response.ApiResponse;
import com.example.birdshop.model.response.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;

public interface ProfileApi {
    @GET("users/getUser")
    Call<UserResponse> getUser();

    @PUT("users/updateUser")
    Call<UserResponse> updateUser(@Body UpdateUserRequest request);

    @PUT("users/changePassword")
    Call<ApiResponse> changePassword(@Body ChangePasswordRequest request);
}