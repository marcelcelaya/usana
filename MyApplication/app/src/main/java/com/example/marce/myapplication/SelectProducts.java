package com.example.marce.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectProducts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_select_products);
        final ArrayList<Producto> cadena = (ArrayList<Producto>) getIntent().getSerializableExtra("Nutrientes");

        ListView lv = (ListView) findViewById(R.id.lvSelectProducts);
        ArrayList<String> theproductsstring = new ArrayList<>();
        for (Producto producto: cadena) {
            theproductsstring.add(producto.Titulo);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,theproductsstring);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(view.getContext(),Info.class);
                ArrayList<Producto> theproducts;
                switch(position)
                {
                    case 0: theproducts = Producto.InicializarMicronutrientes();break;
                    case 1: theproducts = Producto.InicializarMacronutrientes();break;
                    case 2: theproducts = Producto.InicializarNinos();break;
                    case 3: theproducts = Producto.InicializarSenseCP();break;
                    case 4: theproducts = Producto.InicializarDetox();break;
                    case 5: theproducts =  Producto.InicializarEnergia();break;
                    default: theproducts = null;
                }

                myIntent.putExtra("Producto",theproducts.get(position));
                startActivity(myIntent);
            }
        });
       lv.setAdapter(arrayAdapter);
    }
}

