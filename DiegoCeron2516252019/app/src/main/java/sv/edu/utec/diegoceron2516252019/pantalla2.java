package sv.edu.utec.diegoceron2516252019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {
EditText edtPes,edtEs;
TextView twRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
    }
    public void CalcularIMC(View v){
        double imc,peso,estatura;
        edtPes=findViewById(R.id.edtPeso);
        edtEs=findViewById(R.id.edtEstatura);
        twRes=findViewById(R.id.twIMC);
        peso=Double.parseDouble(edtPes.getText().toString());
        estatura=Double.parseDouble(edtEs.getText().toString());
        imc=peso/(estatura*estatura);
        if(imc<10.5){
            twRes.setText("Críticamente Bajo de peso");
        }
        else if(imc<15.9){
            twRes.setText("Severamente Bajo de peso");
        }
        else if(imc<18.5){
            twRes.setText("Bajo de peso");
        }
        else if(imc<25){
            twRes.setText("Normal (peso saludable)");
        }
        else if(imc<30){
            twRes.setText("Sobrepeso");
        }
        else if(imc<35){
            twRes.setText("Obesidad Clase 1 - Moderadamente Obeso");
        }
        else if(imc<40){
            twRes.setText("Obesidad Clase 2 - Severamente Obeso");
        }
        else if(imc>50){
            twRes.setText("Obesidad Clase 3 - Críticamente Obeso");
        }
    }
}