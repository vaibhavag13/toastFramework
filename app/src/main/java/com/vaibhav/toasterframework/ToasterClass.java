package com.vaibhav.toasterframework;

import android.content.Context;
import android.widget.Toast;

public class ToasterClass {

    public static void printToast(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
