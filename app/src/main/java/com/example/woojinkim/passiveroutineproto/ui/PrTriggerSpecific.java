package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.woojinkim.passiveroutineproto.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrTriggerSpecific extends AppCompatActivity {

    @OnClick(R.id.pr_action_specific_back) void goback() {
        finish();
    }

    @OnClick(R.id.pr_action_specific_toconfirm) void gototrigger() {
        Intent intent = new Intent(this, PrConfirm.class);
        finish();
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
