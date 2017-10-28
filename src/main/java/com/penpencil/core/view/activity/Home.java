package com.penpencil.core.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.penpencil.core.R;

public class Home extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
