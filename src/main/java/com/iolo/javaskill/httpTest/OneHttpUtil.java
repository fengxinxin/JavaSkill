package com.iolo.javaskill.httpTest;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author Fengxinxin
 * @date 2019-06-19
 */
public class OneHttpUtil {
    public static TestApi getInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl("https://api.apiopen.top")
                .build();
        TestApi testApi = retrofit.create(TestApi.class);
        return testApi;
    }
}
