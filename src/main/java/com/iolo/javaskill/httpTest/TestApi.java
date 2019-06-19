package com.iolo.javaskill.httpTest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface TestApi {
    @GET("/WebService1.asmx/QueryCertificateSingle")
    Call<ResponseVO> getCar(@Query("key") String key, @Query("cph") String cph);

    @POST("/getWangYiNews")
    Call<WYNewsResponse> getWangYiNews(@Body WangYiNewsRequestBody wangYiNewsRequestBody);
}
