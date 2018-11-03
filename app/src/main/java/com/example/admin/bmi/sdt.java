package com.example.admin.bmi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class sdt extends AppCompatActivity {
    EditText editTen, editSDT;
    Button btnSave, btnTim;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdt);

        editTen = (EditText) findViewById(R.id.editTen);
        editSDT = (EditText) findViewById(R.id.editSDT);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnTim = (Button) findViewById(R.id.btnTim);
        listView = (ListView) findViewById(R.id.listView);
        final ArrayList<Contact> arrayContact= new ArrayList<Contact>();
        final ArrayAdapter adapter = new ArrayAdapter<Contact>(this,android.R.layout.simple_spinner_item,arrayContact);

        listView.setAdapter(adapter);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }

            private void save() {
                String hoTen = editTen.getText().toString();
                String SDT = editSDT.getText().toString();
                arrayContact.add(new Contact(hoTen, SDT));
                adapter.notifyDataSetChanged();
            };
        });
        btnTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seach();
            }
            private void seach()
            {
                int kt=0;
                String hoTen = editTen.getText().toString();
                for(int i=0;i<arrayContact.size();i++) {
                    if (arrayContact.get(i).getHoTen().equals( hoTen)) {
                        Toast.makeText(sdt.this, "Co", Toast.LENGTH_LONG).show();
                        kt = 1;
                    }
                }
                if(kt==0)
                    Toast.makeText(sdt.this, "Khong co", Toast.LENGTH_LONG).show();
            }

        });
    }
}
