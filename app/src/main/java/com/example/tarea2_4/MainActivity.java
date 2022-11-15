package com.example.tarea2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnVer;
    EditText txtLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVer=findViewById(R.id.btnVer);
        txtLink=findViewById(R.id.txtLink);
        Intent intent= new Intent(this,actividadWeb.class);

        btnVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String link;

                try{
                    link=txtLink.getText().toString();
                    intent.putExtra("actividad1",link);
                    startActivity(intent);

                }catch(Exception e){
                    System.out.println(e);
                }
            }
        });

    }
}