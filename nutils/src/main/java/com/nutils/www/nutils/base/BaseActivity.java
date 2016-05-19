package com.nutils.www.nutils.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 类描述：所有activity的父类
 * 创建人：xh_l
 * 创建时间：2016/5/9 13:08
 * 修改人：xh_l
 * 修改时间：2016/5/9 13:08
 * 修改备注：
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityLayout();
        initView();
        initData();
        requestData();
    }

    protected abstract void setActivityLayout();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void requestData();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
