package net.simplifiedcoding.googlelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FrontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

    }
    public void onClick(View v)
    {
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);

    }
}
