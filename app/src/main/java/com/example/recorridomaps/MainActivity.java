package com.example.recorridomaps;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onSendMaps1(View view) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https")
                .authority("www.google.com")
                .appendPath("maps")
                .appendPath("dir")
                .appendPath("")
                .appendQueryParameter("api", "1")
                .appendQueryParameter( "origin" , 4.0323397 + "," + -74.9653500)
                .appendQueryParameter("destination", 4.632339710 + "," + -74.065350);
        String url = builder.build().toString();
        Log.d("Directions", url);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
    public void onSendMaps(View view) {
        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
        Intent maplntent =new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        maplntent.setPackage("com.google.android.apps.maps");
        Log.d("Directions", gmmIntentUri.toString());
        if (maplntent.resolveActivity(getPackageManager()) != null) {
            startActivity (maplntent) ;
        }
    }
    public void onSendMaps3(View view) {
        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
        Intent maplntent =new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        maplntent.setPackage("com.google.android.apps.maps");
        startActivity(maplntent);
    }
    public void onSendMaps4(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=restaurants");
        Intent maplntent =new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        maplntent.setPackage("com.google.android.apps.maps");
        startActivity(maplntent);
    }
    public void onSendMaps5(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=1600 Amphitheatre Parkway, Mountain+View, California");
        Intent maplntent =new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        maplntent.setPackage("com.google.android.apps.maps");
        startActivity(maplntent);
    }
    public void onSendMaps6(View view) {
        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194?q=101+main+street");
        Intent maplntent =new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        maplntent.setPackage("com.google.android.apps.maps");
        startActivity(maplntent);
    }
    public void onSendMaps7(View view) {
        //Uri gmmIntentUri = Uri.parse("google.navigation:q=Taronga+Zoo,+Sydney+Australia");
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Salt+Mines, +Zipaquira+Colombia");
        Intent maplntent =new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        maplntent.setPackage("com.google.android.apps.maps");
        startActivity(maplntent);
    }
    public void onSendMaps8(View view) {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Taronga+Zoo,+Sydney+Australia&avoid=tf");
        Intent maplntent =new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        maplntent.setPackage("com.google.android.apps.maps");
        startActivity(maplntent);
    }
    public void onSendMaps2(View view) {
        final String uri = "https://www.google.com/maps/dir/12.9747,77.6094/12.9365,77.5447" +
                "/12.9275,77.5906/12.9103,77.645/@12.9433289,77.5217216,12z" +
                "/data=!3m1!4b1!4m2!4m1!3e0";
        final Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        if (intent.resolveActivity(MainActivity.this.getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void onSendMaps9(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=18.5204,73.8567&destination=18.5204,73.8567&waypoints=18.520561,73.872435|18.519254,73.876614|18.52152,73.877327|18.52019,73.879935&travelmode=driving");
        Intent intent =new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show();
            }
        }
    }
    public void onSendMaps10(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=Usatama+Manzana+H,Bogota&destination=Museo+del+Oro,Bogota&travelmode=driving");
        Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            try {
                Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(unrestrictedIntent);
            } catch (ActivityNotFoundException innerEx) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show();
            }
        }
    }
}