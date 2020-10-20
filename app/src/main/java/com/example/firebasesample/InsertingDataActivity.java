package com.example.firebasesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InsertingDataActivity extends AppCompatActivity {

    EditText etName;
    EditText etRollno;
    Spinner spinnerCourses;
    Button btnInsertData;
    DatabaseReference studentDbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserting_data);

        etName = findViewById(R.id.etName);
        etRollno = findViewById(R.id.etRollno);
        spinnerCourses = findViewById(R.id.spinnerCourse);
        btnInsertData = findViewById(R.id.btnInsertData);
        studentDbRef = FirebaseDatabase.getInstance().getReference("Students");
        btnInsertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertStudentData();
            }
        });
    }

    private void insertStudentData(){
        String name = etName.getText().toString();
        String rollno = etRollno.getText().toString();
        String course = spinnerCourses.getSelectedItem().toString();

        String id = studentDbRef.push().getKey();

        Students students = new Students(id,name,rollno,course);
        assert id != null;
        studentDbRef.child(id).setValue(students);
        Toast.makeText(InsertingDataActivity.this,"Data inserted!",Toast.LENGTH_SHORT).show();
    }
}