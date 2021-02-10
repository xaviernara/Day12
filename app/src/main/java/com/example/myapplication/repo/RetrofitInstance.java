package com.example.myapplication.repo;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class RetrofitInstance {

    private static CountryApiService INSTANCE;

    private static final String BASE_URL = "ttps://restcountries.eu/rest/v2/";
    /*public static  CountryApiService getINSTANCE(){

        if (INSTANCE == null) INSTANCE = getRetrofit().create(ShibeService.class);

        return INSTANCE;

    }*/


    public static CountryApiService getINSTANCE() {

        if (INSTANCE == null)
            INSTANCE = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .client(getClient())
                    .build()
                    .create(CountryApiService.class);

        return INSTANCE;

    }

    private static OkHttpClient getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder().addInterceptor(interceptor).build();
    }


}