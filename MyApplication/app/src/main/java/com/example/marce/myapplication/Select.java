package com.example.marce.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        final ArrayList<String> cadena = (ArrayList<String>) getIntent().getSerializableExtra("Nombres");
        ListView lv = (ListView) findViewById(R.id.lvSelect);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cadena);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(view.getContext(),SelectProducts.class);
                ArrayList<Producto> theproducts = Producto.InicializarMicronutrientes();
                myIntent.putExtra("Nutrientes",theproducts);
                //.makeText(getBaseContext(), cadena.get(position).Titulo, Toast.LENGTH_SHORT).show();

                startActivity(myIntent);
            }
        });
        lv.setAdapter(arrayAdapter);
    }
}
