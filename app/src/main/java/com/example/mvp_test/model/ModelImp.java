package com.example.mvp_test.model;

import android.os.Handler;

/**
 * Created by 吕楠 on 2018/3/22.
 */

public class ModelImp implements ModelInf{
    private Handler handler = new Handler();
    @Override
    public void getData(final String param, final CallbackInf callbackInf) {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (param){
                    case "normal":
                        callbackInf.toSuccess("恭喜你，成功了");
                        break;
                    case "fuiluar":
                        callbackInf.toFuiluar("服务器繁忙");
                        break;
                    case "boowboow":
                        callbackInf.toBoowboow("傻逼");
                        break;
                }
                callbackInf.compleelt();
            }
        },2000);
    }
}
