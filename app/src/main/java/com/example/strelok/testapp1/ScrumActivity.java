package com.example.strelok.testapp1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ScrumActivity extends AppCompatActivity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
    }

    /**
     * Same as onCreate(Bundle) but called for those activities created with the attribute android.R.attr.persistableMode set to persistAcrossReboots.
     *
     * @param savedInstanceState if the activity is being re-initialized after previously being shut down then this Bundle contains the data it
     *                           most recently supplied in onSaveInstanceState.
     *                           Note: Otherwise it is null.
     * @param persistentState    if the activity is being re-initialized after previously being shut down or powered off then this
     *                           Bundle contains the data it most recently supplied to outPersistentState in onSaveInstanceState.
     *                           Note: Otherwise it is null.
     */
    @Override public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        init();
    }

    private void init() {
        setContentView(R.layout.dashboard);

        String log;
        TextView txt = (TextView) findViewById(R.id.loginName);
        txt.setText(getIntent().getStringExtra("login"));

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplication());
        log = preferences.getString("userName", "default_value");

        txt.setText(log);
    }
}
