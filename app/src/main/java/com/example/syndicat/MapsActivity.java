package com.example.syndicat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap map;
    MapView mapview;
    private LocationManager locationManager;
    private static final int REQUEST_LOCATION_PERMISSION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        mapview = findViewById(R.id.map);
        mapview.onCreate(savedInstanceState);
        mapview.getMapAsync(this);
// Initialize LocationManager
        locationManager = (LocationManager)
                getSystemService(Context.LOCATION_SERVICE);
    }

    //initialize the map and request location updates.
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        // Configurer la carte comme vous le souhaitez
        // Add a marker in your place and move the camera
        LatLng place = new LatLng(33.594584, -6.712530);//just example
        map.addMarker(new MarkerOptions().position(place).title("Marker in Rabat"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(place, 12));
//to get current Location


        //(LocationManager.GPS_PROVIDER,0, 0,this);
    }
// is a callback method triggered whenever the location changes. Here, you add a
    //  marker for the current location and move the camera to focus on it.
}