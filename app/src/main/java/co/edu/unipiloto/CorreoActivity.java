package co.edu.unipiloto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CorreoActivity extends Activity {

    private Button botonEnviar;
    private EditText animal;
    private EditText nombre;
    private EditText raza;
    private EditText edad;
    private EditText descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);

        botonEnviar = findViewById(R.id.botonEnviar);
        animal = findViewById(R.id.editTextText);
        nombre = findViewById(R.id.editTextText3);
        raza = findViewById(R.id.editTextText4);
        edad = findViewById(R.id.editTextText5);
        descripcion = findViewById(R.id.editTextText2);

        botonEnviar.setOnClickListener(v -> {
            animal.setText("");
            nombre.setText("");
            raza.setText("");
            edad.setText("");
            descripcion.setText("");

            Toast.makeText(getApplicationContext(), "Datos guardados", Toast.LENGTH_SHORT).show();

            animal.requestFocus();
        });
    }
}
