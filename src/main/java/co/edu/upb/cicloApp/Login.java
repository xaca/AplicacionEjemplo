package co.edu.upb.cicloApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import co.edu.upb.cicloApp.util.Datos;

public class Login extends AppCompatActivity {

    private Datos temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        temp = (Datos)this.getApplication();
        Toast.makeText(Login.this,temp.getNombre(),Toast.LENGTH_SHORT);

    }
}