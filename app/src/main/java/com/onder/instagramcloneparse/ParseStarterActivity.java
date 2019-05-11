package com.onder.instagramcloneparse;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("kEQvXPXh4gxSaFxRbb1TtGdmH189Ln2WM0tFWCDQ")
        .clientKey("eyptf9Ly4284CvG4X5Z7ydGqE6kUbzgQbvoBabcx")
        .server("https://parseapi.back4app.com/")
        .build());

    }
}
