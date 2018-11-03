package com.example.admin.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhepToan extends AppCompatActivity {
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView txt1, txtKQ;
    EditText editSoA, editSoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_toan);
            btnCong = (Button) findViewById(R.id.btnCong);
            btnTru = (Button) findViewById(R.id.btnTru);
            btnNhan = (Button) findViewById(R.id.btnNhan);
            btnChia = (Button) findViewById(R.id.btnChia);
            editSoA = (EditText) findViewById(R.id.editSoA);
            editSoB = (EditText) findViewById(R.id.editSoB);
            txtKQ = (TextView) findViewById(R.id.txtKQ);
            btnCong.setOnClickListener(myclick);
            btnTru.setOnClickListener(myclick);
            btnNhan.setOnClickListener(myclick);
            btnChia.setOnClickListener(myclick);
        }

    View.OnClickListener myclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a = Integer.parseInt(editSoA.getText().toString());
            int b = Integer.parseInt(editSoB.getText().toString());
            switch (v.getId()) {
                case R.id.btnCong:
                    txtKQ.setText((a + b) + "");
                    break;
                case R.id.btnTru:
                    txtKQ.setText((a - b) + "");
                    break;
                case R.id.btnNhan:
                    txtKQ.setText((a * b) + "");
                    break;
                case R.id.btnChia:
                    txtKQ.setText((a / b) + "");
                    break;
            }
        }
    };
}

