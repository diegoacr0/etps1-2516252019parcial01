package sv.edu.utec.diegoceron2516252019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtNom,edtPas;
Button btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNom=findViewById(R.id.edtUsuario);
        edtPas=findViewById(R.id.edtPassword);
        btnLog=findViewById(R.id.btnLogin);
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNom.getText().toString().equals("parcialETps1") && edtPas.getText().toString().equals("p4rC14l#tp$")){
                    Intent intento= new Intent(getApplicationContext(),pantalla2.class);
                    startActivity(intento);
                }
                else
                {
                    Toast toastP = new Toast(getApplicationContext());
                    LayoutInflater inflater = getLayoutInflater();
                    View layout=inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.lytMensaje));
                    TextView TxtMensaje = (TextView) layout.findViewById(R.id.textView5);
                    TxtMensaje.setText("Contraseña y usuario no son correctos");
                    toastP.setDuration(Toast.LENGTH_LONG);
                    toastP.setView(layout);
                    toastP.show();
                }
            }
        });
    }

}