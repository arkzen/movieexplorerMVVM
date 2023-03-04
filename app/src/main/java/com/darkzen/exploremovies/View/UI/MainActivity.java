package com.darkzen.exploremovies.View.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.darkzen.exploremovies.R;
import com.darkzen.exploremovies.Service.Model.Result;
import com.darkzen.exploremovies.View.Adapter.TopMovielistAdapter;
import com.darkzen.exploremovies.ViewModel.MovieListViewmodel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView topmvRV;
    private MovieListViewmodel MVviewmodel;
    private TopMovielistAdapter topMVadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topmvRV = (RecyclerView) findViewById(R.id.MVrv);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        topmvRV.setLayoutManager(gridLayoutManager);

        MVviewmodel = new ViewModelProvider(this).get(MovieListViewmodel.class);
        MVviewmodel.getTopratedMovieList().observe(this, results -> {
            topMVadapter = new TopMovielistAdapter(MainActivity.this, results);
            topmvRV.setAdapter(topMVadapter);
        });
    }
}