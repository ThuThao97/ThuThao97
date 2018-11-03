package com.example.admin.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class PTBac2 extends AppCompatActivity {
   Button btnTiepTuc, btnGiai, btnThoat;
   EditText editA, editB,editC;
   TextView txtKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptbac2);

        btnGiai = (Button)findViewById(R.id.btnGiai);
        btnThoat = (Button)findViewById(R.id.btnThoat);
        btnTiepTuc= (Button)findViewById(R.id.btnTiepTuc);
        btnGiai.setOnClickListener(new  MyEvent());
        btnTiepTuc.setOnClickListener(new MyEvent());
        btnThoat.setOnClickListener(new  MyEvent());
        editA=(EditText)findViewById(R.id.editA);
        editB=(EditText)findViewById(R.id.editB);
        editC=(EditText)findViewById(R.id.editC);
        txtKQ=(TextView)findViewById(R.id.txtKQ);
    }
    public void GiaiPTbac2()
    {
        String sa=editA.getText()+"";
        String sb=editB.getText()+"";
        String sc=editC.getText()+"";
        int a=Integer.parseInt(sa);
        int b=Integer.parseInt(sb);
        int c=Integer.parseInt(sc);
        String kq="";
        DecimalFormat dcf=new DecimalFormat("#.00");

        if(a==0)
            if(b==0)
                if(c==0)
                    kq="PT vô số nghiệm";
                else
                     kq="PT vô nghiệm";
            else
                { kq="Pt có 1 nghiệm, x="+dcf.format(-c/b); }
        else
        { double delta=b*b-4*a*c;

        if(delta<0)
            kq="PT vô nghiệm";
            else
                if(delta==0)
                { kq="Pt có No kép x1=x2="+dcf.format(-b/(2*a));
                }
            else
                { kq="Pt có 2 No: x1=" + dcf.format((-b-Math.sqrt(delta))/(2*a))+ "; " +
                                    "x2="+dcf.format((-b-Math.sqrt(delta))/(2*a));
                }
        }
        txtKQ.setText(kq);
    }
    private class MyEvent implements View.OnClickListener
    {
        public void onClick(View view)
        {
            if(view==btnTiepTuc)
            {
                editA.setText("");
                editB.setText("");
                editC.setText("");
                editA.requestFocus();
            }
            else if(view.getId()==R.id.btnGiai)
                GiaiPTbac2();
            else if(view.getId()==R.id.btnThoat)
                finish();}
    }
}






