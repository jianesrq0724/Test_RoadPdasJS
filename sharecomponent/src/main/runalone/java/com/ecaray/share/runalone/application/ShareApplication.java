package com.ecaray.share.runalone.application;

import android.content.Context;
import android.support.multidex.MultiDex;

import com.ecaray.basicres.base.BaseApplication;

/**
 * Created by mrzhang on 2017/8/16.
 */

public class ShareApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(context);
    }
}