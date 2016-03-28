package com.example.winchester.parquesnaturales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.lang.*;

public class Chicaque extends Lista {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicaque);
    }
    public void B_SERVICIOS (View Next) {
        Intent intent = new Intent(this, ServChicaque.class);
        startActivity(intent);
    }
    public void B_ACTIVIDADES (View Next) {
        Intent intent = new Intent(this, ServChicaque.class); // Crear Actividades Chicaque new activity
        startActivity(intent);
    }
    public void B_UBICACION (View Next) {
        Intent intent = new Intent(this, ServChicaque.class); // Crear ubicación en mapa pdte
        startActivity(intent);
    }
}
