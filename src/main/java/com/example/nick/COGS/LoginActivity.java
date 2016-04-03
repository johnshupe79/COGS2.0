package com.example.nick.COGS;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    public EditText editText;
    public TextView textView;
    public Button submit, login;

    public String FILENAME = "hello_file";
    public String string = "hello world!";

    public String path = Environment.getExternalStorageDirectory() + "/aaTutorial";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText = (EditText) findViewById(R.id.etUserName);
        textView = (TextView) findViewById(R.id.textView);
        submit = (Button) findViewById(R.id.btSubmit);
        login = (Button) findViewById(R.id.btLogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent splashIntent = new Intent(LoginActivity.this, SplashPage.class);
                LoginActivity.this.startActivity(splashIntent);
            }
        });
    }

}
