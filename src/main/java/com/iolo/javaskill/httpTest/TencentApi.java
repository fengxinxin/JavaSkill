package com.iolo.javaskill.httpTest;

import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface TencentApi {
    @GET("/weather/common?source=xw&weather_type=forecast_1h|forecast_24h|index|alarm|limit|tips")
    Observable<JsonObject> weather(@Query("province") String province, @Query("city") String city, @Query("county") String county);
}
