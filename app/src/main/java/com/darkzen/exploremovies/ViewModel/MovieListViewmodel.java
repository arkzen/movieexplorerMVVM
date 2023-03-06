package com.darkzen.exploremovies.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.darkzen.exploremovies.Service.Model.Result;
import com.darkzen.exploremovies.Service.Repository.MovieRepository;
import com.darkzen.exploremovies.Service.Repository.MovieRepositoryImpl;

import java.util.List;

public class MovieListViewmodel extends AndroidViewModel {

    MovieRepository mRepo;
    public MovieListViewmodel(@NonNull Application application) {
        super(application);
        mRepo= MovieRepositoryImpl.getInstance(application);
    }

    public LiveData<List<Result>> getTopratedMovieList(){
        return mRepo.getTopRatedMovielist();
    }
}
