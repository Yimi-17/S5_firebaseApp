package com.pe.app.s5_firebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String userId="0002", name="user02";
        mDatabase= FirebaseDatabase.getInstance().getReference();
        mDatabase.child("users").child(userId).child("name").setValue(name);




    }
}