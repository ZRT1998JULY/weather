package com.uestc.weather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by chy on 2018/2/20.
 */

public class MyApplication extends Application {
    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }
}
