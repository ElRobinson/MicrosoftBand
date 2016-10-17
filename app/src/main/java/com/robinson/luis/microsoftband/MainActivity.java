package com.robinson.luis.microsoftband;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;




import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startActivityAcelerometer(View view) {
        Intent intent = new Intent(this, Acelerometro.class);
        startActivity(intent);
    }

    public void startActivityListarDados(View view) {
        Intent intent = new Intent(this, listarDados.class);
        startActivity(intent);
    }









}

