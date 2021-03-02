package com.example.busticketapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    public static  final String DB_NAMAE="appFinal.db";
//    public static final String TABLE="userTable";

    public static final String COL_1="ID";
    public static final String COL_2="DFROM";
    public static final String COL_3="DTO";
    public static final String COL_4="NAME";
    public static final String COL_5="ADDRESS";

    public static final String COL_6="PHONE";
    public static final String COL_7="NID";
    public static final String COL_8="EMAIL";
    public static final String COL_9="CLASS";

    public static final String COL_10="TIME";
    public static final String COL_11="DATE";



    public static final String COL_12="A1";
    public static final String COL_13="A2";
    public static final String COL_14="A3";
    public static final String COL_15="B1";
    public static final String COL_16="B2";

    public static final String COL_17="B3";
    public static final String COL_18="C1";
    public static final String COL_19="C2";
    public static final String COL_20="C3";

    public static final String COL_21="D1";
    public static final String COL_22="D2";
    public static final String COL_23="D3";


    public static final String COL_24="E1";
    public static final String COL_25="E2";
    public static final String COL_26="E3";
    public static final String COL_27="F1";
    public static final String COL_28="F2";

    public static final String COL_29="F3";
    public static final String COL_30="G1";
    public static final String COL_31="G2";
    public static final String COL_32="G3";

    public static final String COL_33="H1";
    public static final String COL_34="H2";
    public static final String COL_35="H3";

    public static final String COL_36="AMOUNT";
    public static final String COL_37="STATUS";


    public DBHelper(@Nullable Context context) {
        super(context,DB_NAMAE,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table uTable (ID INTEGER PRIMARY KEY AUTOINCREMENT,DFROM TEXT,DTO TEXT,NAME TEXT,ADDRESS TEXT,PHONE TEXT,NID TEXT,EMAIL TEXT,CLASS TEXT,TIME TEXT,DATE TEXT ,A1 TEXT,A2 TEXT,A3 TEXT,B1 TEXT,B2 TEXT,B3 TEXT,C1 TEXT,C2 TEXT,C3 TEXT,D1 TEXT ,D2 TEXT,D3 TEXT,E1 TEXT,E2 TEXT,E3 TEXT,F1 TEXT,F2 TEXT,F3 TEXT,G1 TEXT,G2 TEXT,G3 TEXT,H1 TEXT,H2 TEXT,H3 TEXT,AMOUNT TEXT,STATUS TEXT)";
        db.execSQL(sql);
    }



    public boolean insertData(String name,String address,String phone,String nid,String email,String mclass){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();

        contentValues.put(COL_4,name);
        contentValues.put(COL_5,address);

        contentValues.put(COL_6,phone);
        contentValues.put(COL_7,nid);

        contentValues.put(COL_8,email);
        contentValues.put(COL_9,mclass);
        long insert = db.insert("uTable",null,contentValues);
        if(insert == -1){
            return false;
        }else{
            return true;
        }
    }


    public boolean updateFrom(String nid,String dFrom){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_2,dFrom);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }


    public boolean updateTo(String nid,String dTo){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_3,dTo);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }


    public boolean updateTime(String nid,String time){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_10,time);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }


    public boolean updateDate(String nid,String date){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_11,date);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public boolean updateA1(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_12,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }

    public boolean updateA2(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_13,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    public boolean updateA3(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_14,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }







    public boolean updateB1(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_15,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }

    public boolean updateB2(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_16,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    public boolean updateB3(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_17,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }




    public boolean updateC1(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_18,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }

    public boolean updateC2(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_19,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    public boolean updateC3(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_20,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }







    public boolean updateD1(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_21,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }

    public boolean updateD2(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_22,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    public boolean updateD3(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_23,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }




    public boolean updateE1(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_24,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }

    public boolean updateE2(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_25,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    public boolean updateE3(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_26,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }







    public boolean updateF1(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_27,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }

    public boolean updateF2(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_28,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    public boolean updateF3(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_29,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    public boolean updateG1(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_30,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }

    public boolean updateG2(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_31,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    public boolean updateG3(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_32,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }





    public boolean updateH1(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_33,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }

    public boolean updateH2(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_34,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }



    public boolean updateH3(String nid,String booked){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_35,booked);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }


    public boolean updateAMOUNT(String nid,int price){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_7,nid);
        contentValues.put(COL_36,price);

        db.update("uTable",contentValues,"NID=?",new String[]{nid});
        return true;
    }















//    public Cursor getAll(){
//        SQLiteDatabase db=this.getWritableDatabase();
//        String sql="select * from "+TABLE+"";
//        Cursor res=db.rawQuery(sql,null);
//        return  res;
//
//
//    }
public String getA1(String booked) {
    SQLiteDatabase db = this.getReadableDatabase();

    Cursor res = db.rawQuery( "select * from uTable where A1 = '"+booked+"'", null );

    StringBuffer buffer=new StringBuffer();
    while(res.moveToNext()){

        buffer.append(res.getString(res.getColumnIndex("A1")));

    }

    if(res !=null){

        return buffer.toString();
    }else{
        System.out.println("Null");
        return null;

    }

}












    public String getA2(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where A2 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("A2")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }






















    public String getA3(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where A3 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("A3")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }



















    public String getB1(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where B1 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("B1")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }












    public String getB2(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where B2 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("B2")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }






















    public String getB3(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where B3 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("B3")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }


























    public String getC1(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where C1 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("C1")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }












    public String getC2(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where C2 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("C2")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }






















    public String getC3(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where C3 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("C3")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }





























    public String getD1(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where D1 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("D1")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }












    public String getD2(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where D2 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("D2")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }






















    public String getD3(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where D3 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("D3")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }













    public String getE1(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where E1 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("E1")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }












    public String getE2(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where E2 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("E2")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }






















    public String getE3(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where E3 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("E3")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }











    public String getF1(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where F1 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("F1")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }












    public String getF2(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where F2 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("F2")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }






















    public String getF3(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where F3 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("F3")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }










    public String getG1(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where G1 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("G1")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }












    public String getG2(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where G2 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("G2")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }






















    public String getG3(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where G3 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("G3")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }







    public String getH1(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where H1 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("H1")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }












    public String getH2(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where H2 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("H2")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }






















    public String getH3(String booked) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor res = db.rawQuery( "select * from uTable where H3 = '"+booked+"'", null );

        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append(res.getString(res.getColumnIndex("H3")));

        }

        if(res !=null){

            return buffer.toString();
        }else{
            System.out.println("Null");
            return null;

        }

    }







    public Cursor getAllDataa(String nid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from uTable where NID = '"+nid+"'", null);
        return res;
    }




    /////////////////
    public Model getAllData(String nid){
        SQLiteDatabase db = this.getWritableDatabase();
//        List<Model> users = new ArrayList<>();
        String sql = "select * from uTable where NID = '"+nid+"'";
        Cursor c = db.rawQuery(sql, null);
        Model u = new Model();
        if(c.moveToFirst()){
            do{

//                u.setId(Integer.parseInt(c.getString(0)));
                u.setdFrom(c.getString(1));
                u.setdTo(c.getString(2));
                u.setName(c.getString(3));
                u.setAddress(c.getString(4));
                u.setPhone(c.getString(5));
                u.setSclass(c.getString(8));
                u.setTime(c.getString(9));
                u.setDate(c.getString(10));

                u.setA1(c.getString(11));
                u.setA2(c.getString(12));
                u.setA3(c.getString(13));

                u.setB1(c.getString(14));
                u.setB2(c.getString(15));
                u.setB3(c.getString(16));

                u.setC1(c.getString(17));
                u.setC2(c.getString(18));
                u.setC3(c.getString(19));


                u.setD1(c.getString(20));
                u.setD2(c.getString(21));
                u.setD3(c.getString(22));


                u.setE1(c.getString(23));
                u.setE2(c.getString(24));
                u.setE3(c.getString(25));

                u.setF1(c.getString(26));
                u.setF2(c.getString(27));
                u.setF3(c.getString(28));

                u.setG1(c.getString(29));
                u.setG2(c.getString(30));
                u.setG3(c.getString(31));

                u.setH1(c.getString(32));
                u.setH2(c.getString(33));
                u.setH3(c.getString(34));

                u.setAmount(c.getString(35));
//                users.add(u);
            }while(c.moveToNext());
        }

        return u;
    }




    public Integer deleteData(String id){
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete("uTable","NID=?",new String[]{id});


    }









}
