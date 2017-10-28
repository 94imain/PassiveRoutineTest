package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.woojinkim.passiveroutineproto.R;
import com.example.woojinkim.passiveroutineproto.data.NotiData;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrActionSelect extends AppCompatActivity {

    String time="default";
    String token="default";
    String message="default";

    @OnClick(R.id.pr_action_select_back) void gotomain() {
        Intent intent = new Intent(this, PrMakeNew.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_action_select_noti) void gototrigger() {
        Intent intent = new Intent(this, PrActionGeneralNoti.class);
        NotiData notidata = new NotiData(time,token,message);
        intent.putExtra("come", notidata);
        finish();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_action_select);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        NotiData notidata = (NotiData)intent.getSerializableExtra("come");

        Log.d("findme",""+notidata.time);
        Log.d("findme",""+notidata.token);
        Log.d("findme",""+notidata.message);

        time = notidata.time;
        token = notidata.token;
        message = notidata.message;
    }
}
