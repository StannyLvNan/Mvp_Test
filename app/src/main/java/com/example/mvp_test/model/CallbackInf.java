package com.example.mvp_test.model;

/**
 * Created by 吕楠 on 2018/3/22.
 */

public interface CallbackInf {

    void toSuccess(String responsestr);

    void toFuiluar(String excptionmsg);

    void toBoowboow(String SB);

    void compleelt();

}
