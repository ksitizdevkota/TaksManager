package Url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Url {
public static final String base_url = "http://localhost:3000";

public static String token= "Bearer ";

public static Retrofit getInstance(){
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    return retrofit;
}
}
