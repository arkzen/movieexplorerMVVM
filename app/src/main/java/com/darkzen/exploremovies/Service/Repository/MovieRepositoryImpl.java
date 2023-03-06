package com.darkzen.exploremovies.Service.Repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.darkzen.exploremovies.Service.Model.MovieModelClass;
import com.darkzen.exploremovies.Service.Model.Result;
import com.darkzen.exploremovies.Service.Network.ApiServices;
import com.darkzen.exploremovies.Service.Network.RetrofitInstanse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepositoryImpl implements MovieRepository {

    public MovieModelClass movieModelClass;
    public List<Result> mresult;
    public static Context mcontext;
    public static MovieRepositoryImpl instance;
    public MutableLiveData mLivedata;

    public static MovieRepositoryImpl getInstance(Context context) {

        if (instance == null) {
            mcontext = context;
            instance = new MovieRepositoryImpl();
        }
        return instance;
    }

    public MutableLiveData<List<Result>> getTopRatedMovielist() {

        if (mLivedata == null) {
            mLivedata = new MutableLiveData();
        }

        ApiServices apiServices = RetrofitInstanse.getRetrofitInstanse().create(ApiServices.class);
        Call<MovieModelClass> call = apiServices.getTopratedMovieList();
        call.enqueue(new Callback<MovieModelClass>() {
            @Override
            public void onResponse(Call<MovieModelClass> call, Response<MovieModelClass> response) {

                movieModelClass = response.body();
                mresult = movieModelClass.getResults();
                mLivedata.postValue(mresult);

            }

            @Override
            public void onFailure(Call<MovieModelClass> call, Throwable t) {

            }
        });
        return mLivedata;

    }
}
