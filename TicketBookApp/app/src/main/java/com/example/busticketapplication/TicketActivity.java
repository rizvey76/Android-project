package com.example.busticketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class TicketActivity extends AppCompatActivity {
    DBHelper dbHelper;
    TextView textNid;

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






    String a1;
    String a2;
    String a3;

    String b1;
    String b2;
    String b3;

    String c1;
    String c2;
    String c3;


    String d1;
    String d2;
    String d3;


    String e1;
    String e2;
    String e3;

    String f1;
    String f2;
    String f3;

    String g1;
    String g2;
    String g3;


    String h1;
    String h2;
    String h3;


    Button btnConfirm;

    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);


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

        textNid=findViewById(R.id.textNid);

        btnConfirm=findViewById(R.id.btnConfirm);




        btnCancel=findViewById(R.id.btnCancel);




        Intent i=getIntent();
        String nid=i.getStringExtra("nid");

        textNid.setText(nid);

        dbHelper =new DBHelper(this);

        Model m=dbHelper.getAllData(nid);
//        System.out.println(m.getName());
//        System.out.println(m.getAddress());
//
//        System.out.println(m.getPhone());
//        System.out.println(m.getAddress());

          textName.setText(m.getName());
          textAddress.setText(m.getAddress());
          textPhone.setText(m.getPhone());
          textService.setText(m.getSclass());
          textFrom.setText(m.getdFrom());
          System.out.println("From"+m.getdFrom());
          System.out.println("To"+m.getdTo());
          textTo.setText(m.getdTo());
          textBusNo.setText("48");
          textDate.setText(m.getDate());
          textTime.setText(m.getTime());
//          textSeat.setText(m.getA1());
//          textSeat.setText(m.getA2());
//          textSeat.setText(m.getA3());
//
//
//        textSeat.setText(m.getB1());
//        textSeat.setText(m.getB2());
//        textSeat.setText(m.getB3());
//
//        textSeat.setText(m.getC1());
//        textSeat.setText(m.getC2());
//        textSeat.setText(m.getC3());
//
//        textSeat.setText(m.getD1());
//        textSeat.setText(m.getD2());
//        textSeat.setText(m.getD3());
//
//        textSeat.setText(m.getE1()+ m.getE2());
//        textSeat.setText(m.getE2());
//        textSeat.setText(m.getE3());
//
//        textSeat.setText(m.getF1());
//        textSeat.setText(m.getF2());
//        textSeat.setText(m.getF3());
//
//        System.out.println(m.getF3());
//
//        textSeat.setText(m.getG1());
//        textSeat.setText(m.getG2());
//        textSeat.setText(m.getG3());

//        textSeat.setText(m.getE1()+m.getE2()+m.getE3());

        System.out.println(m.getA1());
        System.out.println(m.getA2());
        System.out.println(m.getA3());

        if(m.getA1() != null){
            a1="A1 ,";
        }else{
            a1="";
        }
        if(m.getA2() != null){
            a2="A2 ,";
        }else{
            a2="";
        }

        if(m.getA3() != null){
            a3="A3 ,";
        }else{
            a3="";
        }










        if(m.getB1() != null){
            b1="B1 ,";
        }else{
            b1="";
        }



        if(m.getB2() != null){
            b2="B2 ,";
        }else{
            b2="";
        }



        if(m.getB3() != null){
            b3="B3 ,";
        }else{
            b3="";
        }





        if(m.getC1() != null){
            c1="C1 ,";
        }else{
            c1="";
        }





        if(m.getC2() != null){
            c2="C2 ,";
        }else{
            c2="";
        }




        if(m.getC3() != null){
            c3="C3 ,";
        }else{
            c3="";
        }






        if(m.getD1() != null){
            d1="D1 ,";
        }else{
            d1="";
        }

        if(m.getD2() != null){
            d2="D2 ,";
        }else{
            d2="";
        }


        if(m.getD3() != null){
            d3="D3 ,";
        }else{
            d3="";
        }







        if(m.getE1() != null){
            e1="E1 ,";
        }else{
            e1="";
        }



        if(m.getE2() != null){
            e2="E2 ,";
        }else{
            e2="";
        }

        if(m.getE3() != null){
            e3="E3 ,";
        }else{
            e3="";
        }






        if(m.getF1() != null){
            f1="F1 ,";
        }else{
            f1="";
        }
        if(m.getF2() != null){
            f2="F2 ,";
        }else{
            f2="";
        }
        if(m.getF3() != null){
            f3="F3 ,";
        }else{
            f3="";
        }


        if(m.getG1() != null){
            g1="G1 ,";
        }else{
            g1="";
        }

        if(m.getG2() != null){
            g2="G2 ,";
        }else{
            g2="";
        }
        if(m.getG3() != null){
            g3="G3 ,";
        }else{
            g3="";
        }


        if(m.getH1() != null){
            h1="H1 ,";
        }else{
            h1="";
        }

        if(m.getH2() != null){
            h2="H2 ,";
        }else{
            h2="";
        }
        if(m.getH3() != null){
            h3="H3";
        }else{
            h3="";
        }


        textSeat.setText(a1+a2+a3+b1+b2+b3+c1+c2+c3+d1+d2+d3+e1+e2+e3+f1+f2+f3+g1+g2+g3+h1+h2+h3);




//        textSeat.setText(m.getH2());
//        textSeat.setText(m.getH3());

        textAmount.setText(m.getAmount());




//        Cursor res = dbHelper.getAllData(nid);
//
//
//        StringBuffer buffer = new StringBuffer();
//        while (res.moveToNext()) {
//            System.out.println("N:"+buffer.append( res.getString(3)).toString());
//            System.out.println("A"+buffer.append( res.getString(4)).toString());
//            System.out.println("K"+buffer.append( res.getString(5)).toString());
//            System.out.println("P"+buffer.append( res.getString(6)).toString());
//
//            textName.setText(buffer.append( res.getString(3)).toString());
//            textAddress.setText(buffer.append( res.getString(4)).toString());
//            buffer.append( res.getString(0));
//            buffer.append( res.getString(1));
//            buffer.append( res.getString(2));
//            buffer.append( res.getString(3));
//        }

         btnConfirm.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View v) {
              Intent i=new Intent(TicketActivity.this,PaymentActivity.class);
              i.putExtra("name",textName.getText().toString());
              i.putExtra("address",textAddress.getText().toString());
              i.putExtra("phone",textPhone.getText().toString());
              i.putExtra("service",textService.getText().toString());
              i.putExtra("from",textFrom.getText().toString());
              i.putExtra("to",textTo.getText().toString());
              i.putExtra("bus",textBusNo.getText().toString());
              i.putExtra("date",textDate.getText().toString());
              i.putExtra("time",textTime.getText().toString());
              i.putExtra("seat",textSeat.getText().toString());
              i.putExtra("cost",textAmount.getText().toString());
              startActivity(i);

           }
});




         btnCancel.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Integer value=dbHelper.deleteData(textNid.getText().toString());
                 if(value >0){
                     Toast.makeText(getApplicationContext(),"Booking Cancel",Toast.LENGTH_LONG).show();

                     Intent i=new Intent(TicketActivity.this,MainActivity.class);
                     startActivity(i);

                 }else{
                     Toast.makeText(getApplicationContext(),"Data Not Deleted",Toast.LENGTH_LONG).show();
                 }
             }
         });







    }
}