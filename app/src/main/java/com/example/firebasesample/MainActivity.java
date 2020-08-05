package com.example.firebasesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button  btnInsertData;
    Button  btnRetreiveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInsertData = findViewById(R.id.btnInsertData);
        btnRetreiveData = findViewById(R.id.btnRetreiveData);

        btnInsertData.setOnClickListener(this);
        btnRetreiveData.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnInsertData:
                startActivity(new Intent(MainActivity.this,InsertingDataActivity.class));
                break;

            case R.id.btnRetreiveData:
                startActivity(new Intent(MainActivity.this,RetreiveDataActivity.class));
                break;
        }

    }
}