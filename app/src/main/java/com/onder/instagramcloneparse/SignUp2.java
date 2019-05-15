package com.onder.instagramcloneparse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignUp2 extends AppCompatActivity {

    EditText usernameText, passwordText, passwordText2, mailadressText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        usernameText = findViewById(R.id.userName);
        mailadressText = findViewById(R.id.userMail);
        passwordText = findViewById(R.id.userPassword);
        passwordText2 = findViewById(R.id.userPassword_again);
    }



    public void signUp2(View view) {


        if (passwordText.getText().toString().matches(passwordText2.getText().toString())){

            ParseUser user = new ParseUser();
            user.setUsername(usernameText.getText().toString());
            user.setEmail(mailadressText.getText().toString());
            user.setPassword(passwordText.getText().toString());
            user.setPassword(passwordText2.getText().toString());


            user.signUpInBackground(new SignUpCallback() {
                @Override
                public void done(ParseException e) {
                    if (e != null) {
                        Toast.makeText(SignUp2.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();

                    }else{
                        Toast.makeText(SignUp2.this, "User Created", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(getApplicationContext(), FeedActivity.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}
