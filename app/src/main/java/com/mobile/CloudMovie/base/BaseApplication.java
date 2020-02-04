package com.mobile.CloudMovie.base;

import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.mobile.CloudMovie.R;
import com.orhanobut.hawk.Hawk;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import rx.subjects.PublishSubject;

/**
 * Created by 张同举
 * on 2017/8/14.
 */

public class BaseApplication extends MultiDexApplication {
    public final PublishSubject<ActivityLifeCycleEvent> lifecycleSubject = PublishSubject.create();
    private static BaseApplication myzxApp;

    @Override
    public void onCreate() {
        super.onCreate();
        myzxApp = this;
        MultiDex.install(this); //分包支持
        Hawk.init(this).build();
    }


    static {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator((context, layout) -> {
//            layout.setPrimaryColorsId(R.color.colorPrimary, android.R.color.white);
            return new MaterialHeader(context).setColorSchemeResources(R.color.theme_toast, R.color.blue_0b84d3);
        });
    }


    public static BaseApplication getInstance() {
        return myzxApp;
    }


}


