package com.overseastechnologies.GradeApp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.overseastechnologies.GradeApp.ui.Studymaterial.SectionsPagerAdapter;

import GradeApp.databinding.ActivityStudyMaterialBinding;

public class StudyMaterialActivity extends MainActivity {

    ActivityStudyMaterialBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStudyMaterialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

        //for back button
        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudyMaterialActivity.this, MainActivity.class));
            }
        });
    }
}
