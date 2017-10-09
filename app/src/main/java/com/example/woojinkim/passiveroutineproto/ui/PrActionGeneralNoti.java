package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.woojinkim.passiveroutineproto.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrActionGeneralNoti extends AppCompatActivity {

    @OnClick(R.id.pr_action_general_noti_back) void gotomain() {
        Intent intent = new Intent(this, PrActionSelect.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_action_general_noti_notification) void gototrigger() {
        Intent intent = new Intent(this, PrActionSpecific.class);
        finish();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_action_general_notification);
        ButterKnife.bind(this);
    }
}
