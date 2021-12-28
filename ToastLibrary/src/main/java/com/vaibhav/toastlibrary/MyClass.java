package com.vaibhav.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class MyClass {
    private static void printToast (String s , Context c ){
        Toast.makeText(c, s, Toast.LENGTH_SHORT).show();
    }
}