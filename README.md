###kadian app是什么?





* kadian





###kadian框架

* 核心框架采用了mvp架构+retrofit +rxjava





 ###kadian在android APP采用的第三方jar
* eventbus
* glide
* status-bar-compat
* BaseRecyclerViewAdapterHelper
* butterknife
* hawk
* rxjava
* rxandroid
* retrofit2




 ###快速熟悉包目录
 * http

    *   里面包含了加密解密算法
    *   服务地址管理类
    *   网络请求封装类

* ui

    *  所有界面存放位置
    *  modle 逻辑处理
    *  view  界面绘制相关
    *  present 连接modle 和view

* utils

    * 存放大量的工具类

* view

    * 自己绘制的各种平台需要的控件

* sql

    * 暂时没用，预留起来



* enity

    * 实体类目录，包含各个实体类，需要注意的是必须都得接口Serializable或parcelable ，不然对正式版混淆有影响

* manager

    * 管理类


* constans

    * 常量

* base

    * 父类






###网络请求代码

   * 方法名

```Java
    @FormUrlEncoded
    @POST("public/userLogin")
    Observable<HttpResult<List<userData>>> getUserLogin(@FieldMap Map<String, String> params);

```

   * 网络请求 生命周期，是否添加缓存，是否强制刷新缓存

```Java
        Observable ob = Api.getDefault().getUserLogin(params);
        HttpUtil.getInstance().toSubscribe(ob, new ProgressSubscriber<List<userData>>(loginActivity.this) {
            @Override
            protected void _onError(String message) {
                ToastUtil.showToast(message);
            }

            @Override
            protected void _onNext(List<userData> data) {

            }
        }, "cacheKey", ActivityLifeCycleEvent.DESTROY, lifecycleSubject, false, true, true);

```

   * 后端的格式要求，且要求data 一直统一为数组

```Java

public class HttpResult<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public String getMessage() {
        return msg;
    }

    public void setMessage(String message) {
        this.msg = message;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

```




### activity
略。。。。。。。



### fragment


略。。。。。。



 ###略。。。。。。

