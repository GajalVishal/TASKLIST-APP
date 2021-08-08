package com.gajal.tasklist;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiInstance {

    public static Retrofit  retrofit =null;
    public static Retrofit getInstance(){

        if (retrofit==null){
            OkHttpClient okHttpClient=new OkHttpClient.Builder().build();
            Gson gson=new GsonBuilder().create();

            retrofit=new Retrofit.Builder().baseUrl("https://succursal-combs.000webhostapp.com/").client(okHttpClient).addConverterFactory(GsonConverterFactory.create(gson)).build();
        }


        return retrofit;
    }

}
