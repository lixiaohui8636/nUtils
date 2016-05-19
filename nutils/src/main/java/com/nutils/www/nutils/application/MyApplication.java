package com.nutils.www.nutils.application;

import android.app.Application;

/**
 * 类描述：Application
 * 创建人：xh_l
 * 创建时间：2016/5/9 13:08
 * 修改人：xh_l
 * 修改时间：2016/5/9 13:08
 * 修改备注：
 * */
public class MyApplication extends Application {
    private static  MyApplication application;
    public static MyApplication getInstance(){
        return application==null?new MyApplication():application;
    }
}
