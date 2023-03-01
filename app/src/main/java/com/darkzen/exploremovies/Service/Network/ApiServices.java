package com.darkzen.exploremovies.Service.Network;

import com.darkzen.exploremovies.Service.Model.MovieModelClass;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("/3/movie/top_rated?api_key=5ac63e5fb15c28d0caa4bc2f56f62b68&language=en-US&page=1")
    Call<MovieModelClass> getTopratedMovieList();
}
