package com.toastlib;

import android.app.Activity;

public class DoToast {
    Activity activity;

    public DoToast(Activity activity) {
        this.activity = activity;
    }
    public void show(String message){
        android.widget.Toast.makeText(activity, message, android.widget.Toast.LENGTH_LONG).show();
    }
}
