package ipn.cecyt9.HolaMundoAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void suma(View miView)
    { }
    public void resta(View miView)
    { }
    public void multiplicacion(View miView)
    { }
    public void division(View miView)
    { }
    public void MetrosPies(View miView)
    { }

    private Button Button_suma;
    private Button Button_resta;
    private Button Button_division;
    private Button Button_multiplicacion;
    private Button ButtonPesosDolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button_suma = findViewById(R.id.Button_suma);
        Button_resta = findViewById(R.id.Button_resta);
        Button_multiplicacion = findViewById(R.id.Button_multiplicacion);
        Button_division = findViewById(R.id.Button_division);
        ButtonPesosDolar = findViewById(R.id.ButtonMetrosPies);

        Button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSuma();
            }
        });

        Button_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirResta();
            }
        });

        Button_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirMultiplicacion();
            }
        });

        Button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirDivision();
            }
        });

        ButtonPesosDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirMetrosPies();
            }
        });

    }

    private void abrirSuma() {
        Intent intent = new Intent(this , SumaActivity.class);
    startActivity(intent);
    }

    private void abrirResta() {
        Intent intent = new Intent(this , restaActivity.class);
        startActivity(intent);
    }

    private void abrirMultiplicacion() {
        Intent intent = new Intent(this , multiplicacionActivity.class);
        startActivity(intent);
    }

    private void abrirDivision() {
        Intent intent = new Intent(this , divisionActivity.class);
        startActivity(intent);
    }

    private void abrirMetrosPies() {
        Intent intent = new Intent(this , MetrosPies.class);
        startActivity(intent);
    }

}