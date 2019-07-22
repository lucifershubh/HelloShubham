package com.example.helloshubham;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity<TextView> extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view)
    {
        display(1);
    }

    public void display(int number) {


        TextView quantityTextView= (TextView) findViewById(R.id.textView6);
        quantityTextView.setText(""+number);
    }
}
