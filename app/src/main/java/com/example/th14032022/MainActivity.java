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

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvbanh;
    private ImageButton btnTimKiem;
    private TextInputEditText txtTimKiem;
    private  ArrayList<Banh> dsbanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTimKiem=(TextInputEditText)findViewById(R.id.txtTimKiem);
        btnTimKiem=(ImageButton)findViewById(R.id.btnTimKiem);
        lvbanh=(ListView) findViewById(R.id.lvbanh);
        dsbanh=new ArrayList<>();
        dsbanh.add(new Banh(R.drawable.donut_yellow, "Tasty Dount", "Spicy tasty dount family", 10.00));
        dsbanh.add(new Banh(R.drawable.tasty_donut, "Pink Dount", "Spicy tasty dount family", 20.00));
        dsbanh.add(new Banh(R.drawable.green_donut, "Floating Dount", "Spicy tasty dount family", 30.00));
        dsbanh.add(new Banh(R.drawable.donut_red, "Tasty Dount", "Spicy tasty dount family", 10.00));
        BanhAdapter banhAdapter=new BanhAdapter(this, dsbanh, R.layout.lvbanh);
        lvbanh.setAdapter(banhAdapter);
        btnTimKiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Banh> kqTimKiem=new ArrayList<>();
                String tuKhoa=txtTimKiem.getText().toString();
                for (int i=0;i<dsbanh.size();i++){
                    Banh banh= dsbanh.get(i);
                    if(banh.getTen().contains(tuKhoa)){
                        kqTimKiem.add(banh);
                    }
                }
                BanhAdapter banhAdapter=new BanhAdapter(MainActivity.this, kqTimKiem, R.layout.lvbanh);
                lvbanh.setAdapter(banhAdapter);
            }
        });
    }
}