package com.example.mvp_test;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvp_test.presenter.Contract;
import com.example.mvp_test.presenter.PresenterImp;

public class MainActivity extends AppCompatActivity implements Contract.ViewInf,View.OnClickListener{

    private TextView textView;
    private Button button;
    private Button button2;
    private Button button3;
    private PresenterImp presenterImp;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenterImp = new PresenterImp(this);
        textView = (TextView) findViewById(R.id.test_textmain);
        button = (Button) findViewById(R.id.button_btnmain);
        button2 = (Button) findViewById(R.id.button_btnmain2);
        button3 = (Button) findViewById(R.id.button_btnmain3);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("正在加载数据");
    }

    @Override
    public void Imsuccess(String successmsg) {
        textView.setText(successmsg);
    }

    @Override
    public void ImFuileur(String excptionmsg) {
        textView.setText(excptionmsg);
    }

    @Override
    public void Imboowboow(String boowboww) {
        textView.setText(boowboww);
    }

    @Override
    public void showLoading() {
        if (!progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    @Override
    public void hideLoading() {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_btnmain:
                presenterImp.getData("normal");
                break;
            case R.id.button_btnmain2:
                presenterImp.getData("fuiluar");
                break;
            case R.id.button_btnmain3:
                presenterImp.getData("boowboow");
                break;
        }
    }
}
