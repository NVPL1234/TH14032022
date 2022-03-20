package com.example.th14032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DatHangActivity extends AppCompatActivity {
    int soLuong;
    TextView tvSoLuong;
    TextView tvGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dathang);
        ImageView imageView= (ImageView) findViewById(R.id.hinh);
        TextView tvTen=(TextView) findViewById(R.id.tenBanh);
        TextView tvMoTa=(TextView) findViewById(R.id.moTaBanh);
        tvGia=(TextView) findViewById(R.id.giaBanh);
        ImageButton btnTang=(ImageButton) findViewById(R.id.btnTang);
        ImageButton btnGiam=(ImageButton) findViewById(R.id.btnGiam);
        tvSoLuong=(TextView) findViewById(R.id.tvSoLuong);
        soLuong= Integer.parseInt(tvSoLuong.getText().toString());
        btnTang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSoLuong.setText(Integer.toString(soLuong=soLuong+1));
            }
        });
        btnGiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soLuong>0) {
                    tvSoLuong.setText(Integer.toString(soLuong=soLuong-1));
                }
            }
        });
        Banh banh = (Banh) getIntent().getSerializableExtra("banh");
        imageView.setImageResource(banh.getHinhNen());
        tvTen.setText(banh.getTen());
        tvMoTa.setText(banh.getMoTa());
        tvGia.setText(Double.toString(banh.getGia()));
    }
}