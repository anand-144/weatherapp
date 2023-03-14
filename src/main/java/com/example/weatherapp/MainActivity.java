package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    final String APP_ID="0f21adfbbad6904de065ef2a51a39628";
    final String WEATHER_URL="https://api.openweathermap.org/data/2.5/weather";

    final long MIN_TIME=5000;
    final float MIN_DISTANCE=1000;
    final int REQUEST_CODE=101;



    String location_provider= LocationManager.GPS_PROVIDER;

    TextView NameofCity,weatherState,Temperature;
    ImageView mweatherIcon;

    RelativeLayout mCityFinder;

    LocationManager mLocationManager;
    LocationListener mLocationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}