package com.toastlib;

import android.app.Activity;

public class DoToast {

    public static void show(Activity activity,String message){
        android.widget.Toast.makeText(activity, message, android.widget.Toast.LENGTH_LONG).show();
    }
}
