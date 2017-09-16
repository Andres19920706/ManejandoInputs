package es.ujaen.ssmm.manejandoinputs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador;
    public TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador=0;
        textoResultado = (TextView) findViewById(R.id.textValueContador);
        textoResultado.setText(""+contador);
    }

    public void incrementaContador (View vista){
        contador++;
        textoResultado.setText(""+contador);
    }

    public void decrementaContador (View vista){
        contador--;

        //Comprobamos si contador es negativo.
        if(contador<0){
            //Comprobamos si la casilla de verificacion esta on/off
            CheckBox negativos = (CheckBox) findViewById(R.id.idNegativo);
            if(!negativos.isChecked()){
                //Si es false, no se permite los negativos
                contador=0;
            }
        }

        textoResultado.setText(""+contador);
    }

    public void resetearContador (View vista){

        //Extraemos el valor del cuadro de texto
        EditText numero_reset = (EditText) findViewById(R.id.n_reseteo);
        //Lo almacenamos como entero
        contador = Integer.parseInt(numero_reset.getText().toString());
        //Lo mostramos por pantalla
        textoResultado.setText(""+contador);



    }


}
