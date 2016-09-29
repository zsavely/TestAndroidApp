package com.example.strelok.testapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String login;
    String password;

    EditText loginView;
    EditText passView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginView = (EditText) findViewById(R.id.login);
        passView = (EditText) findViewById(R.id.password);

        Button btn = (Button) findViewById(R.id.onAuth);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                login = loginView.getText().toString();
                password = passView.getText().toString();

                if("admin".equals(login) && "Qwerty123".equals(password)) {
                    //SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplication());
                    //SharedPreferences.Editor editor = preferences.edit();
                    //editor.putString("userName", login);
                    //editor.apply();

                    Toast.makeText(getApplication(), "Пароль верный", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplication(), ScrumActivity.class);
                    intent.putExtra("login", login);
                    startActivity(intent);
                } else {
                  Toast.makeText(getApplication(), "Пароль не верный", Toast.LENGTH_SHORT).show();
                }
                // txt = (TextView) findViewById(R.id.newText);
                // txt.setText(login);
            }
        });
    }
}
