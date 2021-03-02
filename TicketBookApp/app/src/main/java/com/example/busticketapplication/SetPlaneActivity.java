package com.example.busticketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SetPlaneActivity extends AppCompatActivity {
    DBHelper dbHelper;
    TextView textNid;

    Button btnA1,btnA2,btnA3,btnB1,btnB2,btnB3,btnC1,btnC2,btnC3,btnD1,btnD2,btnD3,btnE1,btnE2,btnE3,btnF1,btnF2,btnF3,btnG1,btnG2,btnG3,
            btnH1,btnH2,btnH3,btnPrice;



     int cValue;

     String booked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_plane);

        btnA1=findViewById(R.id.btnA1);
        btnA2=findViewById(R.id.btnA2);
        btnA3=findViewById(R.id.btnA3);

        btnB1=findViewById(R.id.btnB1);
        btnB2=findViewById(R.id.btnB2);
        btnB3=findViewById(R.id.btnB3);

        btnC1=findViewById(R.id.btnC1);
        btnC2=findViewById(R.id.btnC2);
        btnC3=findViewById(R.id.btnC3);

        btnD1=findViewById(R.id.btnD1);
        btnD2=findViewById(R.id.btnD2);
        btnD3=findViewById(R.id.btnD3);


        btnE1=findViewById(R.id.btnE1);
        btnE2=findViewById(R.id.btnE2);
        btnE3=findViewById(R.id.btnE3);




        btnF1=findViewById(R.id.btnF1);
        btnF2=findViewById(R.id.btnF2);
        btnF3=findViewById(R.id.btnF3);

        btnG1=findViewById(R.id.btnG1);
        btnG2=findViewById(R.id.btnG2);
        btnG3=findViewById(R.id.btnG3);


        btnH1=findViewById(R.id.btnH1);
        btnH2=findViewById(R.id.btnH2);
        btnH3=findViewById(R.id.btnH3);

        dbHelper =new DBHelper(this);




        String chk="booked";

        String strA1= dbHelper.getA1("booked");

        if(strA1.equals(chk)){
            btnA1.setBackgroundColor(Color.TRANSPARENT);
        }





        String strA2= dbHelper.getA2("booked");

        if(strA2.equals(chk)){
            btnA2.setBackgroundColor(Color.TRANSPARENT);
        }




        String strA3= dbHelper.getA3("booked");

        if(strA3.equals(chk)){
            btnA3.setBackgroundColor(Color.TRANSPARENT);
        }














        String strB1= dbHelper.getB1("booked");

        if(strB1.equals(chk)){
            btnB1.setBackgroundColor(Color.TRANSPARENT);
        }





        String strB2= dbHelper.getB2("booked");

        if(strB2.equals(chk)){
            btnB2.setBackgroundColor(Color.TRANSPARENT);
        }




        String strB3= dbHelper.getB3("booked");

        if(strB3.equals(chk)){
            btnB3.setBackgroundColor(Color.TRANSPARENT);
        }

















        String strC1= dbHelper.getC1("booked");

        if(strC1.equals(chk)){
            btnC1.setBackgroundColor(Color.TRANSPARENT);
        }





        String strC2= dbHelper.getC2("booked");

        if(strC2.equals(chk)){
            btnC2.setBackgroundColor(Color.TRANSPARENT);
        }




        String strC3= dbHelper.getC3("booked");

        if(strC3.equals(chk)){
            btnC3.setBackgroundColor(Color.TRANSPARENT);
        }














        String strD1= dbHelper.getD1("booked");

        if(strD1.equals(chk)){
            btnD1.setBackgroundColor(Color.TRANSPARENT);
        }





        String strD2= dbHelper.getD2("booked");

        if(strD2.equals(chk)){
            btnD2.setBackgroundColor(Color.TRANSPARENT);
        }




         String strD3= dbHelper.getD3("booked");

        if(strD3.equals(chk)){
            btnD3.setBackgroundColor(Color.TRANSPARENT);
        }









        String strE1= dbHelper.getE1("booked");

        if(strE1.equals(chk)){
            btnE1.setBackgroundColor(Color.TRANSPARENT);
        }





        String strE2= dbHelper.getE2("booked");

        if(strE2.equals(chk)){
            btnE2.setBackgroundColor(Color.TRANSPARENT);
        }




        String strE3= dbHelper.getE3("booked");

        if(strE3.equals(chk)){
            btnE3.setBackgroundColor(Color.TRANSPARENT);
        }














        String strF1= dbHelper.getF1("booked");

        if(strF1.equals(chk)){
            btnF1.setBackgroundColor(Color.TRANSPARENT);
        }





        String strF2= dbHelper.getF2("booked");

        if(strF2.equals(chk)){
            btnF2.setBackgroundColor(Color.TRANSPARENT);
        }




        String strF3= dbHelper.getF3("booked");

        if(strF3.equals(chk)){
            btnF3.setBackgroundColor(Color.TRANSPARENT);
        }











        String strG1= dbHelper.getG1("booked");

        if(strG1.equals(chk)){
            btnG1.setBackgroundColor(Color.TRANSPARENT);
        }





        String strG2= dbHelper.getG2("booked");

        if(strG2.equals(chk)){
            btnG2.setBackgroundColor(Color.TRANSPARENT);
        }




        String strG3= dbHelper.getG3("booked");

        if(strG3.equals(chk)){
            btnG3.setBackgroundColor(Color.TRANSPARENT);
        }














        String strH1= dbHelper.getH1("booked");

        if(strH1.equals(chk)){
            btnH1.setBackgroundColor(Color.TRANSPARENT);
        }





        String strH2= dbHelper.getH2("booked");

        if(strH2.equals(chk)){
            btnH2.setBackgroundColor(Color.TRANSPARENT);
        }




        String strH3= dbHelper.getH3("booked");

        if(strH3.equals(chk)){
            btnH3.setBackgroundColor(Color.TRANSPARENT);
        }











//        StringBuffer buffer=new StringBuffer();
//        while(c.moveToNext()){
//
//            buffer.append(c.getString(23));
//
//        }
//
//
//
//        System.out.println(buffer.toString());










        btnPrice=findViewById(R.id.btnPrice);

        textNid=findViewById(R.id.textNid);


        Intent i=getIntent();
        String nid=i.getStringExtra("nid");

        textNid.setText(nid);



//        if(cValue==1){
//            btnA1.setBackgroundColor();
//        }




//        btnA2.setBackgroundColor(Color.RED);










        btnA1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnA1.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);
                booked="booked";

              boolean status=dbHelper.updateA1(textNid.getText().toString(),booked);

              if(status == true){
                  cValue=cValue+1800;

                  System.out.println(cValue);
              }else{
                  cValue=cValue+0;
              }
            }
        });






        btnA2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnA2.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateA2(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnA3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnA3.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateA3(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });




        btnB1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnB1.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);
                booked="booked";

                boolean status=dbHelper.updateB1(textNid.getText().toString(),booked);

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });






        btnB2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnB2.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateB2(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnB3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnB3.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateB3(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnC1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnC1.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);
                booked="booked";

                boolean status=dbHelper.updateC1(textNid.getText().toString(),booked);

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });






        btnC2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnC2.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateC2(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnC3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnC3.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateC3(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });


        btnD1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnD1.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);
                booked="booked";

                boolean status=dbHelper.updateD1(textNid.getText().toString(),booked);

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });






        btnD2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnD2.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateD2(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnD3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnD3.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateD3(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });


        btnE1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnE1.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);
                booked="booked";

                boolean status=dbHelper.updateE1(textNid.getText().toString(),booked);

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });






        btnE2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnE2.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateE2(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnE3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnE3.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateE3(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnF1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnF1.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);
                booked="booked";

                boolean status=dbHelper.updateF1(textNid.getText().toString(),booked);

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });






        btnF2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnF2.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateF2(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnF3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnF3.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateF3(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });




        btnG1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnG1.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);
                booked="booked";

                boolean status=dbHelper.updateG1(textNid.getText().toString(),booked);

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });






        btnG2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnG2.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateG2(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnG3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnG3.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateG3(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnH1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnH1.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);
                booked="booked";

                boolean status=dbHelper.updateH1(textNid.getText().toString(),booked);

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });






        btnH2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnH2.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateH2(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });



        btnH3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btnH3.setBackgroundColor(Color.GRAY);

                System.out.println(cValue);

                boolean status=dbHelper.updateH3(textNid.getText().toString(),"booked");

                if(status == true){
                    cValue=cValue+1800;

                    System.out.println(cValue);
                }else{
                    cValue=cValue+0;
                }
            }
        });




        btnPrice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                System.out.println(cValue);

                boolean status=dbHelper.updateAMOUNT(textNid.getText().toString(), cValue);

                if(status == true){



                    Intent i =new Intent(SetPlaneActivity.this,TicketActivity.class);
                    i.putExtra("nid",textNid.getText().toString());
                    startActivity(i);



//                    Toast.makeText(getApplicationContext(),"Price Updated",Toast.LENGTH_LONG).show();
//                    System.out.println(cValue);
                }else{
                    Toast.makeText(getApplicationContext(),"Cost Not Updated",Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}