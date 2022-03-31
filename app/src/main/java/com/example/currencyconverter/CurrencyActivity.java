package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CurrencyActivity extends AppCompatActivity {

    Button btnConvert;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        btnConvert = findViewById(R.id.button);
        txtResult = findViewById(R.id.txtResult);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToEuro();
            }
        });
    }

    public void convertToEuro(){
        EditText editText = (EditText) findViewById(R.id.edtText);
        int rupee = Integer.parseInt(editText.getText().toString());
        double dollars = 72.94;
        double result = dollars * rupee ;
        txtResult.setText("Converted Amount to Euros: "+Double.toString(result));
      //  Toast.makeText(CurrencyActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }
}