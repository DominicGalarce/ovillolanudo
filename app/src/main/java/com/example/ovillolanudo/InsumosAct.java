package com.example.ovillolanudo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import Objetos.Productos;

public class InsumosAct extends AppCompatActivity {

    private Spinner producto, color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insumos);

        producto = (Spinner)findViewById(R.id.sp1);
        color = (Spinner)findViewById(R.id.sp2);

        Productos pro = new Productos();

        ArrayAdapter adaptProd = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pro.getProducto());
        ArrayAdapter adaptColor = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pro.getColor());

        producto.setAdapter(adaptProd);
        color.setAdapter(adaptColor);
    }
}