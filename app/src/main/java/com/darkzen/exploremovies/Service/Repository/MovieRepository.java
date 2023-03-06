package com.darkzen.exploremovies.Service.Repository;

import androidx.lifecycle.MutableLiveData;

import com.darkzen.exploremovies.Service.Model.Result;

import java.util.List;

public interface MovieRepository {
    MutableLiveData<List<Result>> getTopRatedMovielist();
}
