package co.edu.upb.cicloApp.controladores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import co.edu.upb.cicloApp.R;
import co.edu.upb.cicloApp.constantes.Configuracion;
import co.edu.upb.cicloApp.constantes.Secciones;
import co.edu.upb.cicloApp.logica.LogicaSeleccion;
import co.edu.upb.cicloApp.util.Datos;

public class Login extends AppCompatActivity {

    private Datos temp;
    private TextView tv;
    private RadioGroup rg;
    private LogicaSeleccion ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        temp = (Datos)this.getApplication();
        //Toast.makeText(Login.this,""+temp.getNombre(),Toast.LENGTH_LONG);
        tv = findViewById(R.id.txt_login);
        tv.setText(temp.getNombre());

        rg = findViewById(R.id.grupo_radio);
        ls = new LogicaSeleccion();

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton)
                {
                    ls.setSeleccion_actual(Secciones.SECCION_1);
                    Log.i(Configuracion.DEBUG_TAG, ""+Secciones.SECCION_1);
                }else if(checkedId == R.id.radioButton2){
                    ls.setSeleccion_actual(Secciones.SECCION_2);
                    Log.i(Configuracion.DEBUG_TAG,""+Secciones.SECCION_2);
                }else{
                    ls.setSeleccion_actual(Secciones.SECCION_3);
                    Log.i(Configuracion.DEBUG_TAG,""+Secciones.SECCION_3);
                }

                Log.i(Configuracion.DEBUG_TAG,ls.mostrarMensaje());
            }
        });

    }
}