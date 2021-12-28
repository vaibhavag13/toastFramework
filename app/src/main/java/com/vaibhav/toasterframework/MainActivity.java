package com.vaibhav.toasterframework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void showToast(Context c, String message){
        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
    }

}