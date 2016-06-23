package com.example.diu.salarycalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText basicSalaryEt;
    EditText medicalPercentageEt;
    EditText houseRentEt;

    TextView totalSalaryTv;

    SalaryCalculator salaryCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basicSalaryEt=(EditText)findViewById(R.id.basicSalary);
        medicalPercentageEt=(EditText)findViewById(R.id.medicalPercentage);
        houseRentEt=(EditText)findViewById(R.id.houseRentPercentage);

        totalSalaryTv=(TextView)findViewById(R.id.showTotalSalary);

    }


    public void btnShowTotalSalary(View view) {


        salaryCalculator=new SalaryCalculator();


        salaryCalculator.setBasicSalary(Double.parseDouble(basicSalaryEt.getText().toString()));
        salaryCalculator.setMedicalAmount(Float.parseFloat(medicalPercentageEt.getText().toString()));

        salaryCalculator.setHouseRent(Float.parseFloat(houseRentEt.getText().toString()));


        double totalSalary=salaryCalculator.CalculateTotalSalary();





        totalSalaryTv.setText((new DecimalFormat("##").format(totalSalary)));



    }
}

