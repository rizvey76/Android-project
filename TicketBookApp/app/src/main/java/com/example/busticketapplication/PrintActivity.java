package com.example.busticketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PrintActivity extends AppCompatActivity {

    TextView textName;
    TextView textAddress;
    TextView textPhone;
    TextView textService;
    TextView textFrom;
    TextView textTo;
    TextView textBusNo;
    TextView textDate;
    TextView textTime;
    TextView textSeat;
    TextView textAmount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);


        textName=findViewById(R.id.textName);
        textAddress=findViewById(R.id.textAddress);
        textPhone=findViewById(R.id.textPhone);
        textService=findViewById(R.id.textService);
        textFrom=findViewById(R.id.textFrom);
        textTo=findViewById(R.id.textTo);
        textBusNo=findViewById(R.id.textBusNo);
        textDate=findViewById(R.id.textDate);
        textTime=findViewById(R.id.textTime);
        textSeat=findViewById(R.id.textSeat);
        textAmount=findViewById(R.id.textAmount);


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





        textName.setText(name);
        textAddress.setText(address);
        textPhone.setText(phone);
        textService.setText(service);
        textFrom.setText(from);
        textTo.setText(to);
        textBusNo.setText(bus);
        textDate.setText(date);
        textTime.setText(time);
        textSeat.setText(seat);
        textAmount.setText(cost);
    }
}