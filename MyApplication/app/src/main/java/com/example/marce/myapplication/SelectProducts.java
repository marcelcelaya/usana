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
                ArrayList<Producto> theproducts = Producto.InicializarMicronutrientes();
                myIntent.putExtra("Producto",theproducts.get(position));
                startActivity(myIntent);
            }
        });
       lv.setAdapter(arrayAdapter);
    }
}

