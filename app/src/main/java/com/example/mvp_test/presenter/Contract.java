package com.example.mvp_test.presenter;

/**
 * Created by 吕楠 on 2018/3/22.
 */

public interface Contract {
    interface ViewInf{
        void Imsuccess(String successmsg);
        void ImFuileur(String excptionmsg);
        void Imboowboow(String boowboww);
        void showLoading();
        void hideLoading();

    }
}
