package com.adida.aka.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mBtnClick, mBtnCustomToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnClick = (Button) findViewById(R.id.btn_click);
        mBtnClick.setOnClickListener(this);

        mBtnCustomToast = (Button) findViewById(R.id.btn_custom_toast);
        mBtnCustomToast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_click:
                Toast.makeText(this, "Custom toast", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_custom_toast:
                CustomToast customToast = new CustomToast(this);
                customToast.show();
            default:
                break;
        }
    }
}
