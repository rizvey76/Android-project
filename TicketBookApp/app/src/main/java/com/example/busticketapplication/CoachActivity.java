package com.example.busticketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CoachActivity extends AppCompatActivity {
    DBHelper dbHelper;
    Spinner spFrom;
    Spinner spTo;

    Spinner dateSpinner;
    Spinner timeSpinner;


    TextView textNID;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);
        dbHelper =new DBHelper(this);


        dateSpinner=findViewById(R.id.dateSpinner);
        timeSpinner=findViewById(R.id.timeSpinner);

        spFrom=findViewById(R.id.spFrom);
        spTo=findViewById(R.id.spTo);
        textNID=findViewById(R.id.textNID);
        Intent i=getIntent();
        String nid=i.getStringExtra("nid");

        textNID.setText(nid);

        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(textNID.getText().toString());

                Intent i=new Intent(CoachActivity.this,SetPlaneActivity.class);
                i.putExtra("nid",textNID.getText().toString());
                startActivity(i);
            }
        });



        spFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//             Intent i=new Intent(PassengerActivity.this,PassengerActivity.class);
//             i.putExtra("fDep",parent.getItemAtPosition(position).toString());
//             startActivity(i);

//                Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();



                dbHelper.updateFrom(textNID.getText().toString(),parent.getItemAtPosition(position).toString());
//                boolean update=
//                if(update==true){
//                    Toast.makeText(getApplicationContext(),"Data Updated",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(getApplicationContext(),"Data Not Updated",Toast.LENGTH_LONG).show();
//                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });







        spTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//             Intent i=new Intent(PassengerActivity.this,PassengerActivity.class);
//             i.putExtra("fDep",parent.getItemAtPosition(position).toString());
//             startActivity(i);

//                Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();



                dbHelper.updateTo(textNID.getText().toString(),parent.getItemAtPosition(position).toString());
//                boolean update=
//                if(update==true){
//                    Toast.makeText(getApplicationContext(),"Data Updated",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(getApplicationContext(),"Data Not Updated",Toast.LENGTH_LONG).show();
//                }
            }







            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





        dateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//             Intent i=new Intent(PassengerActivity.this,PassengerActivity.class);
//             i.putExtra("fDep",parent.getItemAtPosition(position).toString());
//             startActivity(i);

//                Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();



                dbHelper.updateDate(textNID.getText().toString(),parent.getItemAtPosition(position).toString());

//                boolean update=
//                if(update==true){
//                    Toast.makeText(getApplicationContext(),"Data Updated",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(getApplicationContext(),"Data Not Updated",Toast.LENGTH_LONG).show();
//                }
            }







            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        timeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//             Intent i=new Intent(PassengerActivity.this,PassengerActivity.class);
//             i.putExtra("fDep",parent.getItemAtPosition(position).toString());
//             startActivity(i);

//                Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();



                dbHelper.updateTime(textNID.getText().toString(),parent.getItemAtPosition(position).toString());

//                boolean update=
//                if(update==true){
//                    Toast.makeText(getApplicationContext(),"Data Updated",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(getApplicationContext(),"Data Not Updated",Toast.LENGTH_LONG).show();
//                }
            }







            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });











    }
}