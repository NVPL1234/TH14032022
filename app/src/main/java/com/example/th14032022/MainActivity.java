package com.example.th14032022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvbanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvbanh=(ListView) findViewById(R.id.lvbanh);
        ArrayList<Banh> dsbanh=new ArrayList<>();
        dsbanh.add(new Banh(R.drawable.donut_yellow, "Tasty Dount", "Spicy tasty dount family", 10.00));
        dsbanh.add(new Banh(R.drawable.tasty_donut, "Pink Dount", "Spicy tasty dount family", 20.00));
        dsbanh.add(new Banh(R.drawable.green_donut, "Floating Dount", "Spicy tasty dount family", 30.00));
        dsbanh.add(new Banh(R.drawable.donut_red, "Tasty Dount", "Spicy tasty dount family", 10.00));
        BanhAdapter banhAdapter=new BanhAdapter(this, dsbanh, R.layout.lvbanh);
        lvbanh.setAdapter(banhAdapter);
    }
}