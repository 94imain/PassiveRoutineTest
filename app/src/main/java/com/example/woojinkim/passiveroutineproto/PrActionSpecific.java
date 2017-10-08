package com.example.woojinkim.passiveroutineproto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrActionSpecific extends AppCompatActivity {

    @OnClick(R.id.pr_trigger_specific_back) void gotomain() {
        Intent intent = new Intent(this, PrActionGeneralNoti.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_trigger_specific_setnoti) void gototrigger() {
        Intent intent = new Intent(this, PrMakeNew.class);
        finish();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_action_specific);
        ButterKnife.bind(this);
    }
}