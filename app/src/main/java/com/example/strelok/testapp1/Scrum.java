package com.example.strelok.testapp1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by strelok on 28.09.16.
 */

public class Scrum extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.dashboard);

        String log;
        TextView txt = (TextView) findViewById(R.id.loginName);
        txt.setText(getIntent().getExtras().get("login").toString());

        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(getApplication());
        log = preferences.getString("userName", "default_value");

        txt.setText(log);

    }
}
