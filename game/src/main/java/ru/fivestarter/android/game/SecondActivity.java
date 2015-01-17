package ru.fivestarter.android.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * @author yuriy on 17.01.15.
 */
public class SecondActivity extends Activity {

    private TextView txtLogin;
    private TextView txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtLogin = (TextView) findViewById(R.id.txtLogin);
        txtPassword = (TextView) findViewById(R.id.txtPassword);

        txtLogin.setText(getIntent().getStringExtra("login"));
        txtPassword.setText(getIntent().getStringExtra("pass"));
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
