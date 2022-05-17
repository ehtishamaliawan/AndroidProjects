package com.freetoreads.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.DialogCompat;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ContentProviderClient;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Alert_Box extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_box);
        Button alert = (Button) findViewById(R.id.alertbutton);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = LayoutInflater.from(Alert_Box.this);
                View AlertView = layoutInflater.inflate(R.layout.custom_alert, null);
                Button AlertYes = (Button) AlertView.findViewById(R.id.Dialog_Yes);
                Button AlertNo = (Button) AlertView.findViewById(R.id.Dialog_No);
                AlertDialog.Builder alertBox = new AlertDialog.Builder(Alert_Box.this);
               /* alertBox.setMessage("Do you want to close the app?");
               alertBox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        }); */
                alertBox.setView(AlertView);
                alertBox.setCancelable(false);
                AlertDialog aleart = alertBox.create();
             // aleart.setTitle("Alert Box");
                aleart.show();
                AlertYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
                AlertNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        aleart.cancel();
                        alert.setText("EHTISHAM ALI");
                    }
                });
            }
        });
    }
}