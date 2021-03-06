package org.sumon.retrofitwithretry;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface RetrofitInterface {
    @Retry
    @Headers("Key: 123")
    @GET("indexdata")
    Call<CommonResponse> getIndex();
}
