package com.rcd.phonity;

/**
 * Created by Duc Hung on 05/12/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView lbUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setTitle("Phonity");

        lbUsername = (TextView) findViewById(R.id.lbUsernameLoginSuccess);
        lbUsername.setText(Data.currentUser.getUsername());
    }
}
