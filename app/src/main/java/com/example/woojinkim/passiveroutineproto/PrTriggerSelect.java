package com.example.woojinkim.passiveroutineproto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrTriggerSelect extends AppCompatActivity {

    @OnClick(R.id.pr_action_select_back) void goback() {
        Intent intent = new Intent(this, PrMakeNew.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_action_select_weather) void godate() {
        Intent intent = new Intent(this, PrTriggerGeneralWeather.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_action_select_dateandtime) void goweather() {
        Intent intent = new Intent(this, PrTriggerGeneralDate.class);
        finish();
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_trigger_select);
        ButterKnife.bind(this);
    }
}
