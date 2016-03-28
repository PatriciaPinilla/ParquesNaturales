package com.example.winchester.parquesnaturales;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import java.lang.*;

public class Lista extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        Evento();

    }
    private void Evento()
        {
        ListView ClickLista = (ListView) findViewById(R.id.Lista);
        ClickLista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String etiquetaSelect = adapterView.getItemAtPosition(i).toString();
                if (etiquetaSelect.equals("PARQUE NATURAL DE CHICAQUE"))
                {
                    chicaque();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), etiquetaSelect, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void chicaque()
    {
        Intent intent = new Intent(this, Chicaque.class);
        startActivity(intent);
    }

}
