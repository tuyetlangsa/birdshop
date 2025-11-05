package com.example.birdshop.model.Request;

public class UpdateFCMTokenRequest {
    private String fcmToken;

    public UpdateFCMTokenRequest() {}

    public UpdateFCMTokenRequest(String fcmToken) {
        this.fcmToken = fcmToken;
    }

    public String getFcmToken() { return fcmToken; }
    public void setFcmToken(String fcmToken) { this.fcmToken = fcmToken; }
}


