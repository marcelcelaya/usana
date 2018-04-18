package com.example.marce.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Producto producto = (Producto) getIntent().getSerializableExtra("Producto");
        TextView tv1 = (TextView)findViewById(R.id.tvInfoTitle);
        tv1.setText(producto.Titulo);
        TextView tv2 = (TextView) findViewById(R.id.tvInfoDescription);
        tv2.setText(producto.Descripcion);
        Toast.makeText(getBaseContext(), producto.Titulo, Toast.LENGTH_LONG).show();
    }
}
