package com.qdjg.zxry.test;

import android.app.Application;

import org.xutils.x;

/**
 * Created by cjq on 2017/2/25.
 */

public class test01 extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        x.Ext.init(this);
    }
}
