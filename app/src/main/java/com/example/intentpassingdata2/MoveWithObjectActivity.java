package com.example.intentpassingdata2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {

    public static String EXTRA_PERSON = "extra_person";
    public TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        tvObject = (TextView)findViewById(R.id.tv_object_received);
        Person person = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : "+person.getName()+", Email : "+person.getEmail()+", Age : "+person.getAge()+", Location : "+person.getCity();
        tvObject.setText(text);
    }
}
