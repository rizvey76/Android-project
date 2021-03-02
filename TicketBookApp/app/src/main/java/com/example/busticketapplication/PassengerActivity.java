package com.example.busticketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PassengerActivity extends AppCompatActivity {
    DBHelper dbHelper;
    Spinner classSpinner;
    Spinner classSpinner1;
     EditText editName,editAddress,editPhone,editEmail,editNid;
    Button btnCoach;
    RadioGroup radioGroup;
    RadioButton radioB,radioP,radioE;


    TextView textTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger);

        dbHelper =new DBHelper(this);
        btnCoach=findViewById(R.id.btnCoach);

        editName=findViewById(R.id.editName);
        editAddress=findViewById(R.id.editAddress);
        editPhone=findViewById(R.id.editPhone);
        editNid=findViewById(R.id.editNid);
        editEmail=findViewById(R.id.editEmail);

        radioGroup=findViewById(R.id.radioGroup);
        radioB=findViewById(R.id.radioB);
        radioP=findViewById(R.id.radioP);
        radioE=findViewById(R.id.radioE);

        btnCoach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                textTest=findViewById(R.id.textTest);
//                Intent iss=getIntent();
//                String fDeparture=iss.getStringExtra("fDep");
//                textTest.setText(fDeparture);


                int is=radioGroup.getCheckedRadioButtonId();
                RadioButton rb=radioGroup.findViewById(is);

                System.out.println(rb.getText().toString());

                System.out.println(editName.getText().toString());

                dbHelper.insertData(editName.getText().toString(),editAddress.getText().toString(),editPhone.getText().toString(),editNid.getText().toString(),editEmail.getText().toString(),rb.getText().toString()) ;

//                boolean insert=
//                if(insert==true){
//                    Toast.makeText(getApplicationContext(),"Data Inserted",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(getApplicationContext(),"Data Not Inserted",Toast.LENGTH_LONG).show();
//                }






                Intent i=new Intent(PassengerActivity.this,CoachActivity.class);
                i.putExtra("nid",editNid.getText().toString());
                startActivity(i);
            }
        });











//        classSpinner = (Spinner) findViewById(R.id.classSpinner);
//        classSpinner1 = (Spinner) findViewById(R.id.classSpinner1);
//
//
//
//
//
//
//
//
//        classSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
//        {
//
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });




//        classSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
//
//        {
//
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//             Intent i=new Intent(PassengerActivity.this,PassengerActivity.class);
//             i.putExtra("fDep",parent.getItemAtPosition(position).toString());
//             startActivity(i);
//
//                Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
//            }
//
//
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });






    }





}