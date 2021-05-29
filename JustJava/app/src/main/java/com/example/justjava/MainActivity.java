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

    public void submitOrder(View view) {
        int quantity = 5;
        display(quantity);
        displayPrice(quantity * 5);
    }

    public void display(int i){
        TextView quantityText = findViewById(R.id.quantity_text_view);
        quantityText.setText(String.valueOf(i));
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void decrement(View view) {
        int quantity = 1;
        display(quantity);
    }

    public void increment(View view) {
        int quantity =3;
        display(quantity);
    }
}