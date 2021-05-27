package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrders(View view) {
        int numberOfCoffees = 2;
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * 5);
    }

    public void display(int i){
        TextView quantityText = findViewById(R.id.quantity_text_view);
        quantityText.setText(String.valueOf(i));
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}