package com.example.nick.COGS;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SplashPage extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);

        Student peep = new Student();
        String Test;
        Test = peep.studentOut();

        final Button bNotify = (Button) findViewById(R.id.bNotify);
        final Button bTopic = (Button) findViewById(R.id.bTopic);
        final Button bProgress = (Button) findViewById(R.id.bSteps);
        TextView text = (TextView) findViewById(R.id.textView);

        text.setId(View.generateViewId());

        text.setText("Party Parrot");

        bTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topicIntent = new Intent(SplashPage.this, TopicActivity.class);
                SplashPage.this.startActivity(topicIntent);
            }
        });

        bNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent splashIntent = new Intent(SplashPage.this, Notications.class);
                SplashPage.this.startActivity(splashIntent);
            }
        });

        bProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent splashIntent = new Intent(SplashPage.this, StepsActivity.class);
                SplashPage.this.startActivity(splashIntent);
            }
        });
    }
}
