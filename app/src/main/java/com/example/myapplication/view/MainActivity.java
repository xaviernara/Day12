package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.repo.CountryAdapter;
import com.example.myapplication.repo.CountryResponse;
import com.example.myapplication.viewmodel.MainViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    MainViewModel viewModel;



    private CountryAdapter countryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();

        initObservers();




    }

    private void initObservers() {

        viewModel.getCountriesRx(binding.editTextTextPersonName.getText().toString());

        viewModel.getCountryResponseList().observe(this,new Observer<List<CountryResponse>>() {
            /*
             * Called when the data is changed.
             *
             * @param o The new data
             */
            @Override
            public void onChanged(List<CountryResponse>  countryResponseList) {

                generateCountryData(countryResponseList);
            }
        });

    }

    private void generateCountryData(List<CountryResponse> countryResponseList) {
        countryAdapter = new CountryAdapter (countryResponseList);
        binding.recycler.setAdapter(countryAdapter);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this);
        //GridLayout gridLayout = new GridLayoutManager(MainActivity.this);
        binding.recycler.setLayoutManager(layoutManager);


    }

    private void initViews() {
        binding.editTextTextPersonName.setOnClickListener(this);

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.editTextTextPersonName){

            //binding.editTextTextPersonName.getText().toString();
            initObservers();

        }
    }
}