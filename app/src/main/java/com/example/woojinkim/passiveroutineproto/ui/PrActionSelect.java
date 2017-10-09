package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.woojinkim.passiveroutineproto.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrActionSelect extends AppCompatActivity {

    @OnClick(R.id.pr_action_select_back) void gotomain() {
        Intent intent = new Intent(this, PrMakeNew.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_action_select_noti) void gototrigger() {
        Intent intent = new Intent(this, PrActionGeneralNoti.class);
        finish();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_action_select);
        ButterKnife.bind(this);
    }
}
