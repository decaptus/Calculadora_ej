package edu.upc.dsa.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    double operacion1;
    double operacion2;
    double result;
    int igual=0;
    boolean inicio;
    boolean decimal;
    String operacion="";
    String unidad_angular="DEG";
    DecimalFormat decimales = new DecimalFormat("#.###");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView pantalla = findViewById((R.id.pantalla));
        final Button btn1 = findViewById(R.id.button1);
        final Button btn2 = findViewById(R.id.button2);
        final Button btn3 = findViewById(R.id.button3);
        final Button btn4 = findViewById(R.id.button4);
        final Button btn5 = findViewById(R.id.button5);
        final Button btn6 = findViewById(R.id.button6);
        final Button btn7 = findViewById(R.id.button7);
        final Button btn8 = findViewById(R.id.button8);
        final Button btn9 = findViewById(R.id.button9);
        final Button btn0 = findViewById(R.id.button0);
        final Button btn_igual = findViewById(R.id.button_igual);
        final Button btn_suma = findViewById(R.id.button_suma);
        final Button btn_resta = findViewById(R.id.button_resta);
        final Button btn_prod = findViewById(R.id.button_prod);
        final Button btn_delete = findViewById(R.id.button_clear);
        final Button btn_division = findViewById(R.id.button_division);
        final Button btn_punto = findViewById(R.id.button_punto);
        final Button btn_sen = findViewById(R.id.button_sen);
        final Button btn_cos = findViewById(R.id.button_cos);
        final Button btn_tan = findViewById(R.id.button_tan);
        final Button btn_grados = findViewById(R.id.button_grados);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn0.getText().toString());
                } else {
                    pantalla.setText(btn0.getText().toString());
                    inicio = true;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn1.getText().toString());
                } else {
                    pantalla.setText(btn1.getText().toString());
                    inicio = true;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn2.getText().toString());
                } else {
                    pantalla.setText(btn2.getText().toString());
                    inicio = true;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn3.getText().toString());
                } else {
                    pantalla.setText(btn3.getText().toString());
                    inicio = true;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn4.getText().toString());
                } else {
                    pantalla.setText(btn4.getText().toString());
                    inicio = true;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn5.getText().toString());
                } else {
                    pantalla.setText(btn5.getText().toString());
                    inicio = true;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn6.getText().toString());
                } else {
                    pantalla.setText(btn6.getText().toString());
                    inicio = true;
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn7.getText().toString());
                } else {
                    pantalla.setText(btn7.getText().toString());
                    inicio = true;
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn8.getText().toString());
                } else {
                    pantalla.setText(btn8.getText().toString());
                    inicio = true;
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    pantalla.setText(pantalla.getText().toString() + btn9.getText().toString());
                } else {
                    pantalla.setText(btn9.getText().toString());
                    inicio = true;
                }
            }
        });

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                igual = 0;
                if (operacion.equals("")) {
                    operacion1 = Double.parseDouble(pantalla.getText().toString());
                    inicio = false;
                    decimal = false;
                    operacion = "suma";
                } else {
                    if (operacion.equals("suma")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 + operacion2;
                        pantalla.setText(decimales.format(result));
                        operacion1 = result;
                        inicio = false;
                        decimal = false;
                    }
                    operacion = "suma";
                }
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                igual = 0;
                if (operacion == "") {
                    operacion1 = Double.parseDouble(pantalla.getText().toString());
                    inicio = false;
                    decimal = false;
                    operacion = "resta";
                } else {
                    if (operacion.equals("resta")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 - operacion2;
                        pantalla.setText(decimales.format(result));
                        operacion1 = result;
                        inicio = false;
                        decimal = false;
                    }
                    operacion = "resta";
                }
            }
        });

        btn_prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                igual = 0;
                if (operacion.equals("")) {
                    operacion1 = Double.parseDouble(pantalla.getText().toString());
                    inicio = false;
                    decimal = false;
                    operacion = "prod";
                } else {
                    if (operacion.equals("prod")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 * operacion2;
                        pantalla.setText(decimales.format(result));
                        operacion1 = result;
                        inicio = false;
                        decimal = false;
                    }
                    operacion = "prod";
                }
            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                igual = 0;
                if (operacion.equals("")) {
                    operacion1 = Double.parseDouble(pantalla.getText().toString());
                    inicio = false;
                    decimal = false;
                    operacion = "division";
                } else {
                    if (operacion.equals("division")) {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 / operacion2;
                        pantalla.setText(String.valueOf(decimales.format(result)));
                        operacion1 = result;
                        inicio = false;
                        decimal = false;
                    }
                    operacion = "division";
                }
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 0;
                operacion = "";
                operacion1 = 0;
                operacion2 = 0;
                igual = 0;
                pantalla.setText(String.valueOf(0));
                inicio = false;
                decimal = false;
            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (igual == 0) {
                    if (operacion == "suma") {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 + Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(decimales.format(result));
                        operacion1 = result;
                        operacion = "";
                        igual = 1;
                        inicio = false;
                        decimal = false;
                    }
                    if (operacion == "prod") {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 * Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(decimales.format(result));
                        operacion1 = result;
                        operacion = "";
                        igual = 1;
                        inicio = false;
                        decimal = false;
                    }
                    if (operacion == "resta") {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 - Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(decimales.format(result));
                        operacion1 = result;
                        operacion = "";
                        igual = 1;
                        inicio = false;
                        decimal = false;
                    }
                    if (operacion == "division") {
                        operacion2 = Double.parseDouble(pantalla.getText().toString());
                        result = operacion1 / Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(decimales.format(result));
                        operacion1 = result;
                        operacion = "";
                        igual = 1;
                        inicio = false;
                        decimal = false;
                    }
                    if (operacion == "sen"){
                        if(unidad_angular == "DEG"){
                            double deg = operacion1;
                            double rad = Math.toRadians(deg);
                            result = Math.sin(rad);
                            pantalla.setText(decimales.format(result));
                            operacion1=result;
                            operacion = "";
                            inicio=false;
                            decimal=false;
                        }
                        else{
                            double rad = operacion1;
                            pantalla.setText(decimales.format(Math.sin(rad)));
                            operacion1 = result;
                            operacion = "";
                            inicio=false;
                            decimal=false;
                        }
                    }
                    if (operacion == "cos"){
                        if(unidad_angular == "DEG"){
                            double deg = operacion1;
                            double rad = Math.toRadians(deg);
                            result = Math.cos(rad);
                            pantalla.setText(decimales.format(result));
                            operacion1=result;
                            operacion = "";
                            inicio=false;
                            decimal=false;
                        }
                        else{
                            double rad = operacion1;
                            pantalla.setText(decimales.format(Math.tan(rad)));
                            operacion1 = result;
                            operacion = "";
                            inicio=false;
                            decimal=false;
                        }
                    }
                    if (operacion == "sen"){
                        if(unidad_angular == "DEG"){
                            double deg = operacion1;
                            double rad = Math.toRadians(deg);
                            result = Math.tan(rad);
                            pantalla.setText(decimales.format(result));
                            operacion1=result;
                            operacion = "";
                            inicio=false;
                            decimal=false;
                        }
                        else{
                            double rad = operacion1;
                            pantalla.setText(decimales.format(Math.tan(rad)));
                            operacion1 = result;
                            operacion = "";
                            inicio=false;
                            decimal=false;
                        }
                    }
                } else {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Haz una nueva operación", Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast1.show();
                }
            }
        });

        btn_punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio) {
                    if (decimal == false) {
                        pantalla.setText(pantalla.getText().toString() + btn_punto.getText().toString());
                        decimal = true;
                    } else {
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Ya es un decimal", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                        toast1.show();
                    }
                } else {
                    if (decimal == false) {
                        pantalla.setText(btn_punto.getText().toString());
                        inicio = true;
                        decimal = true;
                    } else {
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Ya es un decimal", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                        toast1.show();
                    }
                }
            }
        });

        btn_grados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_grados.getText().toString() == "RAD") {
                        btn_grados.setText("DEG");
                        unidad_angular = "DEG";
                        double num = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(decimales.format(Math.toDegrees(num)));
                } else {
                        btn_grados.setText("RAD");
                        unidad_angular = "RAD";
                        double num = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText(decimales.format(Math.toRadians(num)));
                }
            }
        });

        btn_sen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, introduzca números",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else if (Double.parseDouble(pantalla.getText().toString())<0)
                {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, número negativo",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else {
                    igual = 0;
                    if (operacion.equals("")) {
                        operacion1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("sin(" + operacion1 + ")");
                        operacion = "sen";
                        inicio = false;
                        decimal = false;
                    }
                }
            }
        });

        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, introduzca números",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else if (Double.parseDouble(pantalla.getText().toString())<0)
                {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, número negativo",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else {
                    igual = 0;
                    if (operacion.equals("")) {
                        operacion1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("cos(" + operacion1 + ")");
                        operacion = "cos";
                        inicio = false;
                        decimal = false;
                    }
                }
            }
        });

        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pantalla.getText().toString()== null || pantalla.getText().toString()=="" || !inicio){
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, introduzca números",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else if (Double.parseDouble(pantalla.getText().toString())<0)
                {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Función no valida, número negativo",
                            Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                    toast1.show();
                }
                else {
                    igual = 0;
                    if (operacion.equals("")) {
                        operacion1 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("tan(" + operacion1 + ")");
                        operacion = "tan";
                        inicio = false;
                        decimal = false;
                    }
                }
            }
        });
    }
}