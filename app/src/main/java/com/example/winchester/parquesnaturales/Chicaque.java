package com.example.winchester.parquesnaturales;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.lang.*;


    public class Chicaque extends Lista {


        protected boolean isRouteDisplayed() {
            return false;
        }

                public void onLocationChanged(Location location) {
        }


        public void onProviderDisable(String provider) {
        }


        public void onStatusChanged(String provider, int status, Bundle extras) {
        }


        public void onProviderEnable(String provider) {
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_chicaque);
        }

        public void B_SERVICIOS(View Next) {
            Intent intent = new Intent(this, ServChicaque.class);
            startActivity(intent);
        }

        public void B_ACTIVIDADES(View Next) {
            Intent intent = new Intent(this, ServChicaque.class); // Crear Actividades Chicaque new activity
            startActivity(intent);
        }

        public void B_UBICACION(View Next) {
            Intent intent = new Intent(this, ServChicaque.class); // Crear ubicación en mapa pdte
            startActivity(intent);
        }
    }