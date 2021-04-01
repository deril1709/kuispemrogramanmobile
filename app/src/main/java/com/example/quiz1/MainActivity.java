package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void biodata(View view) {
        startActivity(new Intent(MainActivity.this, BiodataActivity.class));
    }

    public void moveMaps(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/3TdU81douRKbDE5y9")).setPackage("com.google.android.apps.maps"));
    }

    public void moveSms(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "0821510413335")).putExtra("sms_body", "Hai nama saya  Theodarryl Eleazar T"));
    }

    public void exit(View view) {
        logout(this);
    }

    public static void logout(Activity activity){
        AlertDialog.Builder builder= new AlertDialog.Builder(activity);
        builder.setTitle("Keluar");
        builder.setMessage("Serius Mau Keluar?");

        builder.setPositiveButton("IYE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finishAffinity();
                System.exit(0);
            }
        });

        builder.setNegativeButton("NDAJI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}