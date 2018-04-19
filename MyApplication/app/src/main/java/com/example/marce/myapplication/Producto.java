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

    public static ArrayList<Producto> InicializarMacronutrientes()
    {
        ArrayList<Producto> Productos = new ArrayList<>();
        Productos.add(new Producto("Macronutrientes","Nutrimeal (Soya)","No description","1.1.1"));
        Productos.add(new Producto("Macronutrientes","My Smart Food","No description","1.1.4"));
        Productos.add(new Producto("Macronutrientes","Booster - Proteina Suero Leche","No description","1.1.5"));
        Productos.add(new Producto("Macronutrientes","Booster - Fibra","No description","1.1.6"));
        return Productos;
    }

    public static ArrayList<Producto> InicializarNinos()
    {
        ArrayList<Producto> Productos = new ArrayList<>();
        Productos.add(new Producto("Niños","Usanimals","No description","1.1.1"));
        Productos.add(new Producto("Niños","BiomegaJr","No description","1.1.2"));
        Productos.add(new Producto("Niños","Probiotics","No description","1.1.3"));
        Productos.add(new Producto("Niños","Paquete infantil","No description","1.1.4"));
        return Productos;
    }

    public static ArrayList<Producto> InicializarSenseCP()
    {
        ArrayList<Producto> Productos = new ArrayList<>();
        Productos.add(new Producto("Sense: Cuidado Personal","Cara","No description","1.1.1"));
        Productos.add(new Producto("Sense: Cuidado Personal","Cuerpo","No description","1.1.2"));
        Productos.add(new Producto("Sense: Cuidado Personal","Cabello","No description","1.1.3"));
        return Productos;
    }

    public static ArrayList<Producto> InicializarDetox()
    {
        ArrayList<Producto> Productos = new ArrayList<>();
        Productos.add(new Producto("Detox","HPS","No description","1.1.1"));
        Productos.add(new Producto("Detox","Probiotics","No description","1.1.2"));
        Productos.add(new Producto("Detox","Cellsentials","No description","1.1.3"));
        Productos.add(new Producto("Detox","Biomega","No description","1.1.3"));
        return Productos;
    }

    public static ArrayList<Producto> InicializarEnergia()
    {
        ArrayList<Producto> Productos = new ArrayList<>();
        Productos.add(new Producto("Detox","Rev3","No description","1.1.1"));
        Productos.add(new Producto("Detox","Coquinone","No description","1.1.2"));
        Productos.add(new Producto("Detox","Cellsentials","No description","1.1.3"));
        return Productos;
    }


}
