package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.woojinkim.passiveroutineproto.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrTriggerGeneralDate extends AppCompatActivity {

    @OnClick(R.id.pr_action_general_dateandtime_back) void goback() {
        Intent intent = new Intent(this, PrTriggerSelect.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_action_general_dateandtime_everyday) void everyday() {
        Intent intent = new Intent(this, PrTriggerSpecific.class);
        startActivity(intent);
        // 값 저장 및 넘겨주기 ()
    }

    @OnClick(R.id.pr_action_general_dateandtime_everyhour) void everyhour() {
        Intent intent = new Intent(this, PrTriggerSpecific.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_trigger_general_dateandtime);
        ButterKnife.bind(this);
    }
}
