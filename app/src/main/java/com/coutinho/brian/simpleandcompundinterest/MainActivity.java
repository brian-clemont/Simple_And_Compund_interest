package com.coutinho.brian.simpleandcompundinterest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button button_simple_interest , button_compound_interest;
    private TextView output_result;
    private EditText input_principal ,input_no_of_times_per_year, input_rate,input_no_of_years;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_simple_interest =(Button)findViewById(R.id.button_simpleInterest);
        button_simple_interest.setOnClickListener(this);
        button_compound_interest =(Button)findViewById(R.id.button_compoundInterest);
        button_compound_interest.setOnClickListener(this);
        output_result =(TextView)findViewById(R.id.output_Result);
        input_principal =(EditText)findViewById(R.id.input_principal_amount);
        input_no_of_times_per_year =(EditText)findViewById(R.id.input_no_of_times);
        input_no_of_years =(EditText)findViewById(R.id.input_no_of_years);
        input_rate =(EditText) findViewById(R.id.input_rate);
    }

    @Override
    public void onClick(View v) {
        int P=Integer.parseInt(input_principal.getText().toString());
        int n =Integer.parseInt(input_no_of_times_per_year.getText().toString());
        int r = Integer.parseInt(input_rate.getText().toString());
        double res;
        switch (v.getId()){

        case R.id.button_simpleInterest:
            res = (P*n*r)/100;
            output_result.setText(getString(R.string.simple_interest_is)+res);
            break;

        case R.id.button_compoundInterest:
            int t =Integer.parseInt(input_no_of_years.getText().toString());
//            res =   P*(1+(r/n)) (n*t);
            res= P*Math.pow((1+(r/n)),(n*t));

            output_result.setText("Compound interest is "+res);
            break;

        }

    }

    }

