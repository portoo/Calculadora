package com.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;



public class MainActivity extends ActionBarActivity {
	
	public double V1, V2;
	public EditText qV1, qV2;
	public TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        qV1 = (EditText) findViewById(R.id.editText1);
        qV2 = (EditText) findViewById(R.id.editText2);
        Resultado = (TextView) findViewById(R.id.textView1);
        
        
    }
    public void Suma(View view){
	     V1 = Double.parseDouble(qV1.getText().toString());
	     V2 = Double.parseDouble(qV2.getText().toString());
	     Resultado.setText(Double.toString(V1+V2));
  }

    public void Resta(View view){
	     V1 = Double.parseDouble(qV1.getText().toString());
	     V2 = Double.parseDouble(qV2.getText().toString());
	     Resultado.setText(Double.toString(V1-V2));
 }
    
    public void Multiplicacion(View view){
	     V1 = Double.parseDouble(qV1.getText().toString());
	     V2 = Double.parseDouble(qV2.getText().toString());
	     Resultado.setText(Double.toString(V1*V2));
 }
    public void Division(View view){
	     V1 = Double.parseDouble(qV1.getText().toString());
	     V2 = Double.parseDouble(qV2.getText().toString());
	     Resultado.setText(Double.toString(V1/V2));
 }
    
  
}
