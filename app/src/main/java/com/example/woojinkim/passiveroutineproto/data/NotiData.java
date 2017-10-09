package com.example.woojinkim.passiveroutineproto.data;

import java.io.Serializable;

/**
 * Created by woojinkim on 2017. 10. 8..
 */

public class NotiData implements Serializable{

    public int time;
    public String token;
    public String message;

    public NotiData(int time, String token, String message) {
        this.time = time;
        this.token = token;
        this.message = message;
    }
}
