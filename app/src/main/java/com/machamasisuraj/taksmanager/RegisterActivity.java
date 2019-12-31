package com.machamasisuraj.taksmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {

    private EditText firstname, lastname,username,password,confirmpassword;
    private Button register;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstname= findViewById(R.id.editText3);
        lastname=findViewById(R.id.editText4);
        username=findViewById(R.id.editText5);
        password=findViewById(R.id.editText8);
        confirmpassword=findViewById(R.id.editText9);

        imageView=findViewById(R.id.imageView);

        register=findViewById(R.id.button2);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
