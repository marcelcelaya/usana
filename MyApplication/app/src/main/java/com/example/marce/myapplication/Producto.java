package com.example.marce.myapplication;

import android.media.Image;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {
    public String Categoria;
    public  String Titulo;
    public  String Descripcion;
    public String Numero;
    //public Image Imagen;

    public Producto(String Categoria, String Titulo, String Descripcion,String Numero)
    {
        this.Categoria = Categoria;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Numero = Numero;
        //Imagen=null;
    }

    public static ArrayList<Producto> InicializarMicronutrientes()
    {
        ArrayList<Producto> Productos = new ArrayList<>();
        Productos.add(new Producto("Micronutrientes","Cellsentials","No description","1.1.1"));
        Productos.add(new Producto("Micronutrientes","Biomega","No description","1.1.2"));
        Productos.add(new Producto("Micronutrientes","Procosa","No description","1.1.3"));
        Productos.add(new Producto("Micronutrientes","Coquinone","No description","1.1.4"));
        Productos.add(new Producto("Micronutrientes","Magnecal","No description","1.1.5"));
        Productos.add(new Producto("Micronutrientes","HPS","No description","1.1.6"));
        Productos.add(new Producto("Micronutrientes","Probiotics","No description","1.1.7"));
        Productos.add(new Producto("Micronutrientes","Proflavanol","No description","1.1.8"));
        Productos.add(new Producto("Micronutrientes","Optima IFX","No description","1.1.9"));
        return Productos;
    }
}
