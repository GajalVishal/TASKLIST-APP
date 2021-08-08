package com.gajal.tasklist;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("readdata.php")
    Call<readResponce> readData();


}
