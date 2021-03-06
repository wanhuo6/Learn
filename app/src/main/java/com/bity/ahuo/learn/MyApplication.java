package com.bity.ahuo.learn;

import android.app.Application;

import com.ahuo.tools.util.MLog;
import com.ahuo.tools.util.ToastUtils;

/**
 * Created on 17-5-11
 *
 * @author liuhuijie
 */

public class MyApplication extends Application {

    private static MyApplication sKKApplication;

    public static MyApplication getApp() {
        return sKKApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sKKApplication = this;
        init();
    }

    private void init() {
        ToastUtils.init(this);
        MLog.init(true,this.getString(R.string.app_name));

    }


}
