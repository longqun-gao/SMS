package com.example.androidfix;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;

/**
 * Created by Administrator on 2017/7/30.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 这里实现SDK初始化，appId替换成你的在Bugly平台申请的appId
        // 调试时，将第三个参数改为true
        Bugly.init(this, "900029763", false);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // you must install multiDex whatever tinker is installed!
        MultiDex.install(base);


        // 安装tinker
        Beta.installTinker();
    }

}
