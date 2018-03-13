package com.ecaray.e_pda_js.application;

import android.app.Application;

import com.ecaray.basicres.base.BaseApplication;

/**
 * @author Carl
 * @version 1.0
 * @since 2018/3/11
 */

public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        //如果isRegisterCompoAuto为false，则需要通过反射加载组件
//        Router.registerComponent("com.mrzhang.reader.applike.ReaderAppLike");
//        Router.registerComponent("com.mrzhang.share.applike.ShareApplike");

    }


}
