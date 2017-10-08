package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.woojinkim.passiveroutineproto.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrMakeNew extends AppCompatActivity {

    @OnClick(R.id.pr_make_new_back) void gotomain() {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_make_new_trigger) void gototrigger() {
        Intent intent = new Intent(this, PrTriggerSelect.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_make_new_action) void gotoaction() {
        Intent intent = new Intent(this, PrActionSelect.class);
        finish();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_make_new);
        ButterKnife.bind(this);
    }
}
