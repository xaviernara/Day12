package com.example.myapplication.repo;


import io.reactivex.Observable;

public class CountryRepo {

    public Observable<CountryResponse> getCountryRx(String name){

        return RetrofitInstance.getINSTANCE().getCountires(name);
    }


}




