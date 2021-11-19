package co.edu.upb.cicloApp.util;

import android.app.Application;

public class Datos extends Application {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
