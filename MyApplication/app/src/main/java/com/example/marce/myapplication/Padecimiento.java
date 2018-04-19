package com.example.marce.myapplication;

import java.util.ArrayList;

public class Padecimiento {
    public String Enfermedad;
    public String Tipo;
    public String SubTipo = null;
    public String Receta;
    public ArrayList<String> Productos;

    public Padecimiento() {
    }

    public Padecimiento(String enfermedad, String tipo, String subTipo, String receta, String producto) {
        Enfermedad = enfermedad;
        Tipo = tipo;
        SubTipo = subTipo;
        Receta = receta;
       // Producto = producto;
    }

    public static ArrayList<Padecimiento> InicializarObseidad()
    {
        ArrayList<Padecimiento> Padecimientos = new ArrayList<>();
        //Padecimientos.add(new Padecimiento("Obesidad","Accion Carbohidratos","Reset",))
        return Padecimientos;
    }
}

