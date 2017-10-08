package com.example.woojinkim.passiveroutineproto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrTriggerGeneralWeather extends AppCompatActivity {

    @OnClick(R.id.pr_action_general_weather_back) void goback() {
        Intent intent = new Intent(this, PrTriggerSelect.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_action_general_weather_forecast) void gototrigger() {
        Intent intent = new Intent(this, PrTriggerSpecific.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_trigger_general_weather);
        ButterKnife.bind(this);
    }
}
