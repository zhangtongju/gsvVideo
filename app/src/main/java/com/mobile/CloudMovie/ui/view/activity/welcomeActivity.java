package com.mobile.CloudMovie.ui.view.activity;

import com.mobile.CloudMovie.R;
import com.mobile.CloudMovie.base.ActivityLifeCycleEvent;
import com.mobile.CloudMovie.base.BaseActivity;
import com.mobile.CloudMovie.constans.BaseConstans;
import com.mobile.CloudMovie.http.Api;
import com.mobile.CloudMovie.http.HttpUtil;
import com.mobile.CloudMovie.http.ProgressSubscriber;
import com.mobile.CloudMovie.utils.LogUtil;
import com.mobile.CloudMovie.utils.screenUtil;

import java.util.HashMap;

import rx.Observable;

public class welcomeActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.act_welcome;
    }

    @Override
    protected void initView() {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                goActivity(HomeMainActivity.class);
                this.finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


    }

    @Override
    protected void initAction() {
//        requestConfig();
    }



//    private void requestConfig() {
//        HashMap<String, String> params =new HashMap<>();
//        Observable ob = Api.getDefault().toConfig(  BaseConstans.getRequestHead(params));
//        HttpUtil.getInstance().toSubscribe(ob, new ProgressSubscriber<Object>(welcomeActivity.this) {
//            @Override
//            protected void _onError(String message) {
////                ToastUtil.showToast(message);
//            }
//
//            @Override
//            protected void _onNext(Object data) {
//
//            }
//        }, "cacheKey", ActivityLifeCycleEvent.DESTROY, lifecycleSubject, false, true, false);
//    }
}
