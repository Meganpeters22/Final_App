package com.example.final_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.final_app.adapter.RecentsAdapter;
import com.example.final_app.adapter.TopPlacesAdapter;
import com.example.final_app.model.RecentsData;
import com.example.final_app.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;
    ImageView hotel, profile, flights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        flights = (ImageView) findViewById(R.id.flight);
        flights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFlightActivity();
            }
        });

        profile = (ImageView) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfileActivity();
            }
        });

        hotel = (ImageView) findViewById(R.id.hotel);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHotelActivity();
            }
        });



        // Dummy Data for recent
        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake", "India","From €250", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills", "India","From €350", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake", "India","From €250", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills", "India","From €350", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake", "India","From €250", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills", "India","From €350", R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        //Dummy data for top suggestions
        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);
    }

    public void openFlightActivity(){
        Intent intent = new Intent(this,FlightSearchActivity.class);
        startActivity(intent);
    }

    public void openProfileActivity(){
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }

    public void openHotelActivity(){
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
}