package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.woojinkim.passiveroutineproto.R;
import com.example.woojinkim.passiveroutineproto.data.NotiData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrTriggerSpecific extends AppCompatActivity {

    String time="default";
    String token="default";
    String message="default";

    @OnClick(R.id.pr_trigger_specific_back) void goback() {
        finish();
    }

    @OnClick(R.id.pr_trigger_specific_tomain) void gomain() {
        Intent intent = new Intent(this, PrMakeNew.class);
        Log.d("spinner time value = ", ""+spinner_pr_trigger_specific_time.getSelectedItem().toString());
        Log.d("spinner ampm value = ", ""+spinner_pr_trigger_specific_ampm.getSelectedItem().toString());
        Log.d("final one is",""+spinner_pr_trigger_specific_time.getSelectedItem().toString()+
                spinner_pr_trigger_specific_ampm.getSelectedItem().toString());
        time = spinner_pr_trigger_specific_time.getSelectedItem().toString()+
                spinner_pr_trigger_specific_ampm.getSelectedItem().toString();

        NotiData notidata = new NotiData(time,token,message);
        intent.putExtra("come", notidata);
        finish();
        startActivity(intent);
    }

    @BindView(R.id.pr_trigger_specific_time_spinner) Spinner spinner_pr_trigger_specific_time;
    @BindView(R.id.pr_trigger_specific_ampm_spinner) Spinner spinner_pr_trigger_specific_ampm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_trigger_specific);
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
