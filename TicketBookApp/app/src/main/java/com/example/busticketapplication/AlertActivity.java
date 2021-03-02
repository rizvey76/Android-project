package com.example.busticketapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlertActivity extends AppCompatActivity {
    Button btnPay;

    TextView textNames;
    TextView textAddresss;
    TextView textPhones;
    TextView textServices;
    TextView textFroms;
    TextView textTos;
    TextView textBusNos;
    TextView textDates;
    TextView textTimes;
    TextView textSeats;
    TextView textAmounts;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);


        btnPay=findViewById(R.id.btnPay);

        textNames=findViewById(R.id.textNames);
        textAddresss=findViewById(R.id.textAddresss);
        textPhones=findViewById(R.id.textPhones);
        textServices=findViewById(R.id.textServices);
        textFroms=findViewById(R.id.textFroms);
        textTos=findViewById(R.id.textTos);
        textBusNos=findViewById(R.id.textBusNos);
        textDates=findViewById(R.id.textDates);
        textTimes=findViewById(R.id.textTimes);
        textSeats=findViewById(R.id.textSeats);
        textAmounts=findViewById(R.id.textAmounts);


        Intent i=getIntent();
        String name=i.getStringExtra("name");
        String address=i.getStringExtra("address");
        String phone=i.getStringExtra("phone");
        String service=i.getStringExtra("service");
        String from=i.getStringExtra("from");
        String to=i.getStringExtra("to");
        String bus=i.getStringExtra("bus");
        String date=i.getStringExtra("date");
        String time=i.getStringExtra("time");
        String seat=i.getStringExtra("seat");
        String cost=i.getStringExtra("cost");





        textNames.setText(name);
        textAddresss.setText(address);
        textPhones.setText(phone);
        textServices.setText(service);
        textFroms.setText(from);
        textTos.setText(to);
        textBusNos.setText(bus);
        textDates.setText(date);
        textTimes.setText(time);
        textSeats.setText(seat);
        textAmounts.setText(cost);







        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent is=new Intent(AlertActivity.this,PrintActivity.class);
                is.putExtra("name",textNames.getText().toString());
                is.putExtra("address",textAddresss.getText().toString());
                is.putExtra("phone",textPhones.getText().toString());
                is.putExtra("service",textServices.getText().toString());
                is.putExtra("from",textFroms.getText().toString());
                is.putExtra("to",textTos.getText().toString());
                is.putExtra("bus",textBusNos.getText().toString());
                is.putExtra("date",textDates.getText().toString());
                is.putExtra("time",textTimes.getText().toString());
                is.putExtra("seat",textSeats.getText().toString());
                is.putExtra("cost",textAmounts.getText().toString());
                startActivity(is);







            }
        });
    }
}