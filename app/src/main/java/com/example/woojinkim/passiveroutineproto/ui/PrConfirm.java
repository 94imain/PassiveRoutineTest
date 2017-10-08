package com.example.woojinkim.passiveroutineproto.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.woojinkim.passiveroutineproto.R;

import butterknife.ButterKnife;

public class PrConfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_confirm);
        ButterKnife.bind(this);
    }
}
