package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    TextView quantityText;
    private int quantity = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantityText = findViewById(R.id.quantity_text_view);
        quantityText.setText(quantity+"");
    }

    public void submitOrder(View view) {

        display(quantity);
        displayPrice(quantity * 5);
    }

    public void display(int i){

        quantityText.setText(String.valueOf(i));
    }

    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }
}