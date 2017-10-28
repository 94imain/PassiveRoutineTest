package com.example.woojinkim.passiveroutineproto.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.woojinkim.passiveroutineproto.R;
import com.example.woojinkim.passiveroutineproto.data.NotiData;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PrTriggerGeneralDate extends AppCompatActivity {

    String time="default";
    String token="default";
    String message="default";

    @OnClick(R.id.pr_trigger_general_dateandtime_back) void goback() {
        Intent intent = new Intent(this, PrTriggerSelect.class);
        finish();
        startActivity(intent);
    }

    @OnClick(R.id.pr_trigger_general_dateandtime_everyday) void everyday() {
        Intent intent = new Intent(this, PrTriggerSpecific.class);
        NotiData notidata = new NotiData(time,token,message);
        intent.putExtra("come", notidata);
        startActivity(intent);
        // 값 저장 및 넘겨주기 ()
    }

    @OnClick(R.id.pr_trigger_general_dateandtime_everyhour) void everyhour() {
        Intent intent = new Intent(this, PrTriggerSpecific.class);
        NotiData notidata = new NotiData(time,token,message);
        intent.putExtra("come", notidata);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_trigger_general_dateandtime);
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
