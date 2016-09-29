package com.example.strelok.testapp1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String login;
    String password;
    Button btn;
    EditText login_view;
    EditText pass_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.onAuth);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                login_view = (EditText) findViewById(R.id.login);
                pass_view = (EditText) findViewById(R.id.password);
                login = login_view.getText().toString();
                password = pass_view.getText().toString();
                if(login.equals("admin") && password.equals("Qwerty123")){
                    //SharedPreferences preferences = PreferenceManager
                    //        .getDefaultSharedPreferences(getApplication());
                    //SharedPreferences.Editor editor = preferences.edit();
                    //editor.putString("userName", login);
                    //editor.apply();

                    Toast.makeText(getApplication(), "Пароль верный", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplication(), Scrum.class);
                    intent.putExtra("login", login);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplication(), "Пароль не верный", Toast.LENGTH_SHORT).show();
                    return;
                }

              //  txt = (TextView) findViewById(R.id.newText);
              //  txt.setText(login);

            }
        });

    }
}
