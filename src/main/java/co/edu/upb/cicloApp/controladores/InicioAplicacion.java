package co.edu.upb.cicloApp.controladores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import co.edu.upb.cicloApp.R;
import co.edu.upb.cicloApp.util.Datos;


public class InicioAplicacion extends AppCompatActivity {

    //Declaracion de un miembro dato de la clase
    private Button btn_siguiente;
    private Datos dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dato = (Datos) (this.getApplication());

        btn_siguiente = findViewById(R.id.btn_login);
        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(InicioAplicacion.this,"¡hizo click!",Toast.LENGTH_SHORT);
                Intent siguiente = new Intent(InicioAplicacion.this,Login.class);
                Log.i("upb","Mensaje para la universidad");
                dato.setNombre("Juan");
                Toast.makeText(InicioAplicacion.this,""+dato.getNombre(),Toast.LENGTH_LONG);
                startActivity(siguiente);
            }

        });
    }
}