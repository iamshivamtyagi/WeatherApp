package com.sama;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sama.utilities.NetworkUtils;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    TextView tvWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_forecast);

        tvWeatherData = findViewById(R.id.tv_weather_data);

    }

    public class NetworkBackgroundTask extends AsyncTask<String, Void, String[]> {
        @Override
        protected String[] doInBackground(String... params) {

            if (params.length == 0) {
                return null;
            }
            String location = params[0];

            URL weatherRequestUrl = NetworkUtils.buildUrl(location);
            try {
                String jsonWeatherResponse =
                        NetworkUtils.getResponseFromHttpUrl(weatherRequestUrl);
                String[] simpleJsonWeatherData = JsonUtils
                        .getSimpleWeatherStringsFromJson(MainActivity.this,jsonWeatherResponse);
                return simpleJsonWeatherData;
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String[] weatherData) {
            if(weatherData!=null){
                for(String weatherString : weatherData){
                    tvWeatherData.append(weatherString + "\n\n\n");
                }
            }
        }
    }
}
