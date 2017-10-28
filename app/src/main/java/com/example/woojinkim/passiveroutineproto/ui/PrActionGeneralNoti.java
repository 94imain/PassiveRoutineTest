package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.woojinkim.passiveroutineproto.R;
import com.example.woojinkim.passiveroutineproto.data.NotiData;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrActionGeneralNoti extends AppCompatActivity {

    String time="default";
    String token="default";
    String message="default";

    @OnClick(R.id.pr_action_general_noti_back) void gotomain() {
        Intent intent = new Intent(this, PrActionSelect.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_action_general_noti_notification) void gotospecific() {
        Intent intent = new Intent(this, PrActionSpecific.class);
        NotiData notidata = new NotiData(time,token,message);
        intent.putExtra("come", notidata);
        finish();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_action_general_notification);
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
