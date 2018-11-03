package com.example.admin.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChuyenDoi extends AppCompatActivity implements View.OnClickListener {
    Button btnFar, btnCel, btnClear;
    EditText editF, editC,editClear;

    //View.OnClickListener myVarListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //int G = Integer.parseInt(editF.getText().toString());
        // int C = Integer.parseInt(editC.getText().toString());
        float kq = 0;
        if (v == btnFar) {
            String soa = editF.getText()+"";
            float a = Float.parseFloat(soa);
            kq = a * 9 / 5 + 32;
            editC.setText(kq+"");
        } else if (v == btnCel) {
            String sob = editC.getText()+"";
            float b = Float.parseFloat(sob);
            kq = (b - 32) * 5 / 9;
            editF.setText(kq+"");
        } else if(v==btnClear) {
            editF.setText("");
            editC.setText("");
            editF.requestFocus();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyen_doi);

        btnFar = (Button) findViewById(R.id.btnFar);
        btnCel = (Button) findViewById(R.id.btnCel);
        btnClear = (Button) findViewById(R.id.btnClear);
        editF = (EditText) findViewById(R.id.editF);
        editC = (EditText) findViewById(R.id.editC);
        btnFar.setOnClickListener(this);
        btnCel.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

}




