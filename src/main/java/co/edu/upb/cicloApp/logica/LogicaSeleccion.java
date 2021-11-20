package co.edu.upb.cicloApp.logica;

import co.edu.upb.cicloApp.constantes.Secciones;

public class LogicaSeleccion {

    private int seleccion_actual;
    private int seleccion_anterior;

    public String mostrarMensaje(){
        return (seleccion_actual== Secciones.SECCION_1)?"Hola mundo":"Chao mundo";
    }

    public int getSeleccion_actual() {
        return seleccion_actual;
    }

    public void setSeleccion_actual(int seleccion_actual) {
        this.seleccion_actual = seleccion_actual;
    }

    public int getSeleccion_anterior() {
        return seleccion_anterior;
    }

    public void setSeleccion_anterior(int seleccion_anterior) {
        this.seleccion_anterior = seleccion_anterior;
    }
}
