package com.example.v_chproject;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
    }

    public void moveToLoadingActivity(View loadingActivity) {
        Intent move = new Intent(this, LoadingActivity.class);
        startActivity(move);
        //Ket thuc hoat dong Home
        finish();
    }

    public void moveToBlogger(View blogger) {
        underlineMoveToBlogger();

        //dialog
        final AlertDialog.Builder alert = new AlertDialog.Builder(Home.this);
        alert.setTitle("Alert");
        alert.setMessage("If you keep this action, editor application will be paused");
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

                //Go to blog
                String blog = "https://vchphotoeditor.blogspot.com/";
                Uri webaddress = Uri.parse(blog);
                Intent goToBlog = new Intent(Intent.ACTION_VIEW, webaddress);
                startActivity(goToBlog);
            }
        });

        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = alert.create();
        dialog.show();
    }

    /*
    underline moveToBlogger after it's clicked
     */
    private void underlineMoveToBlogger() {
        final TextView groupInformation = (TextView) findViewById(R.id.groupInformation);
        groupInformation.setPaintFlags(groupInformation.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
}