package com.example.birdshop.model.response;

import com.example.birdshop.model.User;
import com.google.gson.annotations.SerializedName;

public class UserResponse {
    @SerializedName("statusCode")
    private int statusCode;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private User data;

    public int getStatusCode() { return statusCode; }
    public String getMessage() { return message; }
    public User getData() { return data; }
}