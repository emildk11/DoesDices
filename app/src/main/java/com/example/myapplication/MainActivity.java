package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //comment is commentgffgdggeddfgdf

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public View.OnClickListener dick(View v){
        Button buut = v.findViewById(v.getId());
        Toast.makeText(this, buut.getText(), Toast.LENGTH_SHORT).show();
        return null;
    }
}
