package com.overseastechnologies.GradeApp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import GradeApp.databinding.ActivityLoginOtpBinding;


public class LoginActivityOtp extends AppCompatActivity {

    ActivityLoginOtpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginOtpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       //et mathi mob nmber laine store kravanu
        //& display thay 6 k ni e jovanu  (video jovana)

        binding.otpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivityOtp.this, MainActivity.class) );
            }
        });

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
