package com.example.mvp_test.presenter;

import com.example.mvp_test.model.CallbackInf;
import com.example.mvp_test.model.ModelImp;
import com.example.mvp_test.model.ModelInf;

/**
 * Created by 吕楠 on 2018/3/22.
 */

public class PresenterImp {

    private Contract.ViewInf viewInf;
    private ModelInf modelInf;

    public PresenterImp(Contract.ViewInf viewInf) {
        this.viewInf = viewInf;
        modelInf = new ModelImp();
    }

    public void getData(String parmars){
        viewInf.showLoading();
        modelInf.getData(parmars, new CallbackInf() {
            @Override
            public void toSuccess(String responsestr) {
                viewInf.Imsuccess(responsestr);
            }

            @Override
            public void toFuiluar(String excptionmsg) {
                viewInf.ImFuileur(excptionmsg);
            }

            @Override
            public void toBoowboow(String SB) {
                viewInf.Imboowboow(SB);
            }

            @Override
            public void compleelt() {
                viewInf.hideLoading();
            }

        });
    }
}
