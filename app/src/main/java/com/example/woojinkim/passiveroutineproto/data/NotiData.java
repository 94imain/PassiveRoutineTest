package com.example.woojinkim.passiveroutineproto.data;

/**
 * Created by woojinkim on 2017. 10. 8..
 */

public class NotiData {
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    int time;
    String token;
    String message;
}
