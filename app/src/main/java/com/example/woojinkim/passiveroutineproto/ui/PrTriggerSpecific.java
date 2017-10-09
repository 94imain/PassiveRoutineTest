package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.woojinkim.passiveroutineproto.R;
import com.example.woojinkim.passiveroutineproto.data.NotiData;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrTriggerSpecific extends AppCompatActivity {

    int time=4;
    String tokem="hihi";
    String message="what";

    @OnClick(R.id.pr_trigger_specific_back) void goback() {
        finish();
    }

    @OnClick(R.id.pr_trigger_specific_tomain) void gomain() {
        Intent intent = new Intent(this, PrMakeNew.class);
        NotiData notidata = new NotiData(time,tokem,message);
        intent.putExtra("come", notidata);
        finish();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_trigger_specific);
        ButterKnife.bind(this);
    }
}
