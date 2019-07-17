package com.yyg.levellistdrawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_on, btn_off;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_on = findViewById(R.id.btn_open);
        btn_off = findViewById(R.id.btn_close);
        iv = findViewById(R.id.iv_1);
        btn_on.setOnClickListener(this);
        btn_off.setOnClickListener(this);
        iv.setImageLevel(5);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.btn_open) {
            iv.setImageLevel(15);
        } else if (v.getId() == R.id.btn_close) {
            iv.setImageLevel(5);
        }
    }
}
