package com.example.winchester.parquesnaturales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ServChicaque extends Chicaque {

    Spinner datoServicios;
    Spinner datoServicios1;
    Spinner datoServicios2;
    Spinner datoServicios3;
    String [] datos1 = {"RESTAURANTE", "Arboloco", "El Refugio"};
    String [] datos2 = {"GUIAS", "Convencional", "Biologo", "Bilingüe", "Ornitólogo", "Ornitólogo Bilingüe"};
    String [] datos3 = {"ESTADIA", "Nido Roblegrande", "Nido Tangara", "Cabañas Zona Refugio", "Hostal El Refugio", "Camping Portería", "Camping Refugio"};
    String [] datos4 = {"TRANSPORTE", "Portería Gruta o Gruta Portería", "Portería Refugio o Refugio Portería", "Terreros Parque", "Parque Terreros"};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serv_chicaque);
        datoServicios = (Spinner)findViewById(R.id.ChicaServ);
        datoServicios1 = (Spinner)findViewById(R.id.ChicaServ1);
        datoServicios2 = (Spinner)findViewById(R.id.ChicaServ2);
        datoServicios3 = (Spinner)findViewById(R.id.ChicaServ3);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos1);
        ArrayAdapter<String> adaptador1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos2);
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos3);
        ArrayAdapter<String> adaptador3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos4);
        datoServicios.setAdapter(adaptador);
        datoServicios1.setAdapter(adaptador1);
        datoServicios2.setAdapter(adaptador2);
        datoServicios3.setAdapter(adaptador3);
    }

}
