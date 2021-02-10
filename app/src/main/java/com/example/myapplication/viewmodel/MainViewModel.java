package com.example.myapplication.viewmodel;

import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.repo.CountryRepo;
import com.example.myapplication.repo.CountryResponse;
import com.example.myapplication.view.MainActivity;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<List<CountryResponse>> countryResponseList;
    private CountryRepo countryRepo;

    public MutableLiveData<List<CountryResponse>> getCountryResponseList() {
        return countryResponseList;
    }

    public MainViewModel(MutableLiveData<List<CountryResponse>> countryResponseList) {
        this.countryResponseList = countryResponseList;
    }

    public void getCountriesRx(String countryName){

        new CountryRepo().getCountryRx(countryName).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<CountryResponse>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                // Before everything starts, here we can start a circular progress for example
            }

            @Override
            public void onNext(@NonNull CountryResponse countryResponse) {
                // This is where we get our data AKA onSucess method
            }

            @Override
            public void onError(@NonNull Throwable e) {
                // Something went wrong

                Log.d("Error",e.getMessage());
            }

            @Override
            public void onComplete() {
                // Process completed, this runs after onNext or onError, can also hide the circular progress here
            }
        });


    }
}
