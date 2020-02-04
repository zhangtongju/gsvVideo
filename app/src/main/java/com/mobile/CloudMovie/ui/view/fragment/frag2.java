package com.mobile.CloudMovie.ui.view.fragment;

import com.mobile.CloudMovie.R;
import com.mobile.CloudMovie.base.BaseFragment;
import com.mobile.CloudMovie.ui.interfaces.PermissionListener;

import java.util.List;


/**
 * description ：上新
 * date: ：2019/5/8 15:08
 * author: 张同举 @邮箱 jutongzhang@sina.com
 */

public class frag2 extends BaseFragment implements  PermissionListener {



    @Override
    protected int getContentLayout() {
        return R.layout.frg_2;
    }


    @Override
    protected void initView() {

    }




    @Override
    protected void initAction() {

    }

    @Override
    protected void initData() {

    }


    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    public void onPause() {
        super.onPause();
    }



    @Override
    public void onGranted() {
    }

    @Override
    public void onGranted(List<String> grantedPermission) {

    }

    @Override
    public void onDenied(List<String> deniedPermission) {
    }
}


