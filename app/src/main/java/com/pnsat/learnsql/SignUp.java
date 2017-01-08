package com.pnsat.learnsql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    //explicit
    private EditText nameEditText, userEditText, passwordEditText;
    private Button button;
    private String nameString, userString, passwordString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bindWidget();

        buttonController();



    } // Main Method

    private void buttonController() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get value from edit text
                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                // check Space
                if (nameString.equals("") || userString.equals("") || passwordString.equals("")) {
                    // have space
                    Toast.makeText(SignUp.this, getResources().getString(R.string.haveSpace),
                            Toast.LENGTH_SHORT).show();
                } else {
                    // No space
                    MyManage myManage = new MyManage(SignUp.this);
                    myManage.addNewValue(nameString, userString, passwordString);
                    finish();

                }  // if

            } // on Click
        });

    }

    private void bindWidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button3);

    }

}  // Main Class
