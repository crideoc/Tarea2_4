package com.example.tarea2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class actividadWeb extends AppCompatActivity {


    Button btnFinalizar;
    WebView webVista;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_web);


        btnFinalizar=findViewById(R.id.btnFinalizar);
        webVista=findViewById(R.id.webVista);
        webVista.setWebViewClient(new WebViewClient());

        Intent intent=getIntent();
        String link=intent.getDataString();


        webVista.loadUrl(link);

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}