package com.sama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_forecast);

        tvWeatherData = findViewById(R.id.tv_weather_data);
        
        String[] weatherData = {
                "Mon -> 19° Cloudy",
                "Tues -> 29° Clear",
                "Wed -> 39° Clear",
                "Thurs -> 19° Thunderstorm",
                "Fri -> 69°  Clear",
                "Sat -> 59°  Clear",
                "Sun -> 99°  Clear",
                "Mon -> 109° Clear",
                "Tue -> 39° Clear",
                "Wed -> 49° Clear",
        };
        for (String data : weatherData) {
            tvWeatherData.append(data + " \n\n\n ");
        }
    }
}
