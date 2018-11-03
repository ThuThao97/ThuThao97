package com.example.admin.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends Activity  {
  //  Button btnTinh;
    EditText editChuanDoan, editCanNang, editChieuCao, editTen, editBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   btnTinh.setOnClickListener(this);
        editTen = (EditText) findViewById(R.id.editTen);
        editCanNang = (EditText) findViewById(R.id.editCanNang);
        editChieuCao = (EditText) findViewById(R.id.editChieuCao);
        editBMI = (EditText) findViewById(R.id.editBMI);
        editChuanDoan = (EditText) findViewById(R.id.editChuanDoan);
    }
    //@Override
    public void TinhBMI(View v) {
        double H = Double.parseDouble(editChieuCao.getText() + "");
        double W = Double.parseDouble(editCanNang.getText() + "");
        double BMI = W / Math.pow(H, 2);
        String chuandoan = "";
        if (BMI < 18) {
            chuandoan = "Bạn gầy";
        } else if (BMI <= 24.9) {
            chuandoan = "Bạn bình thường";
        } else if (BMI <= 29.9) {
            chuandoan = "Bạn béo phì độ 1";
        } else if (BMI <= 34.9) {
            chuandoan = "Bạn béo phì độ 2";
        } else {
            chuandoan = "Bạn béo phì độ 3";
        }
        DecimalFormat dcf = new DecimalFormat("#.0");
        editBMI.setText(dcf.format(BMI));
        editChuanDoan.setText(chuandoan);
    }


}

