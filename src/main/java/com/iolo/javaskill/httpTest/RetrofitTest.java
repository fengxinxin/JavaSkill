package com.iolo.javaskill.httpTest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;

/**
 * 学习Retrofit + RxJava
 *
 * @author Fengxinxin
 * @date 2019-06-18
 */
@Slf4j
public class RetrofitTest {
    public static void main(String[] args) {
        TestApi testApi = OneHttpUtil.getInstance();
        TencentApi tencentApi = TwoHttpUtil.getInstance();

        Call<WYNewsResponse> responseVOCall = testApi.getWangYiNews(new WangYiNewsRequestBody("1", "10"));
        responseVOCall.enqueue(new Callback<WYNewsResponse>() {
            @Override
            public void onResponse(Call<WYNewsResponse> call, Response<WYNewsResponse> response) {
                log.info(new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<WYNewsResponse> call, Throwable throwable) {
                log.error(new Gson().toJson(throwable));
            }
        });

        Observable<JsonObject> tencentWCall = tencentApi.weather("天津", "天津", null);
        tencentWCall.subscribe(new Observer<JsonObject>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(JsonObject jsonObject) {

            }
        });
    }

}
