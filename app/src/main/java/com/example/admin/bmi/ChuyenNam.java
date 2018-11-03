package com.example.admin.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class  ChuyenNam extends AppCompatActivity {
    Button btnChuyen;
    EditText editTextAL, editTextDL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuyen_nam);

        btnChuyen = (Button)findViewById(R.id.btnChuyen);
        editTextAL = (EditText)findViewById(R.id.editAL);
        editTextDL=(EditText)findViewById(R.id.editDL);
        btnChuyen.setOnClickListener(myClick);
    }
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int d=Integer.parseInt(editTextDL.getText().toString());
            int Can = d%10;
            int Chi = d%12;
            String can="", chi="";
            switch (Can)
            {
                case 0:
                    can="Canh";
                    break;
                case 1:
                    can="Tân";
                    break;
                case 2:
                    can="Nhâm";
                    break;
                case 3:
                    can="Qúy";
                    break;
                case 4:
                    can="Giáp";
                    break;
                case 5:
                    can="Ất";
                    break;
                case 6:
                    can="Bính";
                    break;
                case 7:
                    can="Đinh";
                    break;
                case 8:
                    can="Mậu";
                    break;
                case 9:
                    can="Kì";
                    break;

            }
            switch (Chi)
            {
                case 0:
                    chi="Thân";
                    break;
                case 1:
                    chi="Dậu";
                    break;
                case 2:
                    chi="Tuất";
                    break;
                case 3:
                    chi="Hợi";
                    break;
                case 4:
                    chi="Tý";
                    break;
                case 5:
                    chi="Sửu";
                    break;
                case 6:
                    chi="Dần";
                    break;
                case 7:
                    chi="Mẹo";
                    break;
                case 8:
                    chi="Thìn";
                    break;
                case 9:
                    chi="Ngọ";
                    break;
                case 11:
                    chi="Mùi";
                    break;
            }
            editTextAL.setText((can+chi)+"");
        }
    };
}
