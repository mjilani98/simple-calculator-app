package com.example.homeworkq01;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }


    //Addition method
    public void addition(View v)
    {
        //get the numbers from the edit text boxes

        //Edit text box 1
        EditText edtTxtOne = findViewById(R.id.edtTxtInput1);
        String strNum1 = edtTxtOne.getText().toString();
        float num1;
        try
        {
            num1 = Float.parseFloat(strNum1);
        }
        catch (NumberFormatException e)
        {
            num1 = 0;
        }

        //Edit text box 2
        EditText edtTxtTwo = findViewById(R.id.edtTxtInput2);
        String strNum2 = edtTxtTwo.getText().toString();
        float num2;
        try
        {
            num2 = Float.parseFloat(strNum2);
        }
        catch (NumberFormatException e)
        {
            num2 = 0;
        }

        //Addition operation
        float result = num1 + num2;

        //setting the result to the text view

        //get hold of the text view and set the text
        TextView txtVewResult = findViewById(R.id.txtViewResult);
        txtVewResult.setText(result+"");


    }

    //Subtraction operation
    public void subtraction(View v)
    {
        //get the numbers from the edit text boxes

        //Edit text box 1
        EditText edtTxtOne = findViewById(R.id.edtTxtInput1);
        String strNum1 = edtTxtOne.getText().toString();
        float num1;
        try
        {
            num1 = Float.parseFloat(strNum1);
        }
        catch (NumberFormatException e)
        {
            num1 = 0;
        }

        //Edit text box 2
        EditText edtTxtTwo = findViewById(R.id.edtTxtInput2);
        String strNum2 = edtTxtTwo.getText().toString();
        float num2;
        try
        {
            num2 = Float.parseFloat(strNum2);
        }
        catch (NumberFormatException e)
        {
            num2 = 0;
        }

        //Subtraction operation
        float result = num1 - num2;

        //setting the result to the text view

        //get hold of the text view and set the text
        TextView txtVewResult = findViewById(R.id.txtViewResult);
        txtVewResult.setText(result+"");


    }

    //Multiplication operation
    public void multiplication(View v)
    {
        //get the numbers from the edit text boxes

        //Edit text box 1
        EditText edtTxtOne = findViewById(R.id.edtTxtInput1);
        String strNum1 = edtTxtOne.getText().toString();
        float num1;
        try
        {
            num1 = Float.parseFloat(strNum1);
        }
        catch (NumberFormatException e)
        {
            num1 = 0;
        }

        //Edit text box 2
        EditText edtTxtTwo = findViewById(R.id.edtTxtInput2);
        String strNum2 = edtTxtTwo.getText().toString();
        float num2;
        try
        {
            num2 = Float.parseFloat(strNum2);
        }
        catch (NumberFormatException e)
        {
            num2 = 0;
        }

        //Multiplication operation
        float result = num1 * num2;

        //setting the result to the text view

        //get hold of the text view and set the text
        TextView txtVewResult = findViewById(R.id.txtViewResult);
        txtVewResult.setText(result+"");


    }

    //Division operation
    public void division(View v)
    {
        //get the numbers from the edit text boxes

        //Edit text box 1
        EditText edtTxtOne = findViewById(R.id.edtTxtInput1);
        String strNum1 = edtTxtOne.getText().toString();
        float num1;
        try
        {
            num1 = Float.parseFloat(strNum1);
        }
        catch (NumberFormatException e)
        {
            num1 = 0;
        }

        //Edit text box 2
        EditText edtTxtTwo = findViewById(R.id.edtTxtInput2);
        String strNum2 = edtTxtTwo.getText().toString();
        float num2;
        try
        {
            num2 = Float.parseFloat(strNum2);
        }
        catch (NumberFormatException e)
        {
            num2 = 0;
        }

        //Division operation
        float result = num1 / num2;

        //setting the result to the text view

        //get hold of the text view and set the text
        TextView txtVewResult = findViewById(R.id.txtViewResult);
        txtVewResult.setText(result+"");

    }
}