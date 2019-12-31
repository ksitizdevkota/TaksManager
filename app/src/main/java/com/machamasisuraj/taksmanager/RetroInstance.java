package com.machamasisuraj.taksmanager;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance {

    public static final String baseurl="";

    public static String token="";

    public  static Retrofit getInstance(){
        Retrofit retrofit=  new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
                return retrofit;
    }
}
