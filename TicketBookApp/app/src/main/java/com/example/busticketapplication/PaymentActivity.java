package com.example.busticketapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {
    Button btnBkash;
    TextView txtNam,txtAdd,txtPho,txtSer,txtFro,txtTo,txtBus,txtDat,txtTim,txtSet,txtCost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        txtNam=findViewById(R.id.txtNam);
        txtAdd=findViewById(R.id.txtAdd);
        txtPho=findViewById(R.id.txtPho);
        txtSer=findViewById(R.id.txtSer);
        txtFro=findViewById(R.id.txtFro);
        txtTo=findViewById(R.id.txtTo);
        txtBus=findViewById(R.id.txtBus);
        txtTim=findViewById(R.id.txtTim);
        txtDat=findViewById(R.id.txtDat);
        txtSet=findViewById(R.id.txtSet);
        txtCost=findViewById(R.id.txtCost);


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

        txtNam.setText(name);
        txtAdd.setText(address);
        txtPho.setText(phone);
        txtSer.setText(service);
        txtFro.setText(from);
        txtTo.setText(to);
        txtBus.setText(bus);
        txtDat.setText(date);
        txtTim.setText(time);
        txtSet.setText(seat);
        txtCost.setText(cost);

        btnBkash=findViewById(R.id.btnBkash);







//        Intent is=new Intent(PaymentActivity.this,AlertActivity.class);
//        is.putExtra("name",txtNam.getText().toString());
//        is.putExtra("address",txtAdd.getText().toString());
//        is.putExtra("phone",txtPho.getText().toString());
//        is.putExtra("service",txtSer.getText().toString());
//        is.putExtra("from",txtFro.getText().toString());
//        is.putExtra("to",txtTo.getText().toString());
//        is.putExtra("bus",txtBus.getText().toString());
//        is.putExtra("date",txtDat.getText().toString());
//        is.putExtra("time",txtTim.getText().toString());
//        is.putExtra("seat",txtSet.getText().toString());
//        is.putExtra("cost",txtCost.getText().toString());
//        startActivity(i);









        btnBkash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//////////////link between App///////
//                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
//                if (launchIntent != null) {
//                    startActivity(launchIntent);
//                } else {
//                    Toast.makeText(PaymentActivity.this, "There is no package available in android", Toast.LENGTH_LONG).show();
//                }


                Intent is=new Intent(PaymentActivity.this,AlertActivity.class);
        is.putExtra("name",txtNam.getText().toString());
        is.putExtra("address",txtAdd.getText().toString());
        is.putExtra("phone",txtPho.getText().toString());
        is.putExtra("service",txtSer.getText().toString());
        is.putExtra("from",txtFro.getText().toString());
        is.putExtra("to",txtTo.getText().toString());
        is.putExtra("bus",txtBus.getText().toString());
        is.putExtra("date",txtDat.getText().toString());
        is.putExtra("time",txtTim.getText().toString());
        is.putExtra("seat",txtSet.getText().toString());
        is.putExtra("cost",txtCost.getText().toString());
        startActivity(is);






/////////////////////New DialogMethod///////////
//
//                final AlertDialog.Builder alert = new AlertDialog.Builder(PaymentActivity.this);
//                View mView
//                        = getLayoutInflater()
//                        .inflate(
//                                R.layout.activity_alert,
//                                null);
//
//                alert.setView(mView);
//                final AlertDialog alertDialog=alert.create();
//                alertDialog.setCanceledOnTouchOutside(false);
//
//                alertDialog.show();

            }
        });
    }
}