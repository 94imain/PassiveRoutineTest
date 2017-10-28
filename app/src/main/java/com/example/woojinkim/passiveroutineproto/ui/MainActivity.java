package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.woojinkim.passiveroutineproto.R;
import com.example.woojinkim.passiveroutineproto.data.NotiData;
import com.google.firebase.iid.FirebaseInstanceId;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    String time="default";
    String token= FirebaseInstanceId.getInstance().getToken();
    String message="default";

    @OnClick(R.id.plus) void addone() {
        Intent intent = new Intent(this, PrMakeNew.class);
        NotiData notidata = new NotiData(time,token,message);
        intent.putExtra("come", notidata);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}


