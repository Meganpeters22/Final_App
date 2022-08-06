package com.example.final_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HotelActivity extends AppCompatActivity {
    TextView hotelBook;
    ImageView profile, flights, back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        hotelBook = findViewById(R.id.hotelBook);

        hotelBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.booking.com/index.en-gb.html?label=gen173nr-1BCAEoggI46AdIM1gEaGmIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4Auuuu5cGwAIB0gIkYjdiMGRlN2MtOWI0OC00MzcwLWEwZTQtYWFhMWRiMGQ5NGU22AIF4AIB&sid=3b94a3a0f0e95f72acb5294e69b070c9&keep_landing=1&sb_price_type=total&");
            }
        });

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

        back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });
    }

    public void openFlightActivity(){
        Intent intent = new Intent(this,FlightSearchActivity.class);
        startActivity(intent);
    }

    public void openProfileActivity(){
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }

    public void openHomeActivity(){
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }

    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}