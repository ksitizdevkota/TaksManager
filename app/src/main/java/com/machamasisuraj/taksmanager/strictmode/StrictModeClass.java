package com.machamasisuraj.taksmanager.strictmode;

public class StrictModeClass {
    public void StrictMode(){
        android.os.StrictMode.ThreadPolicy policy=
                new android.os.StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        android.os.StrictMode.setThreadPolicy(policy);
    }
}
