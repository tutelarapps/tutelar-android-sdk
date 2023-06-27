package com.tutelar.sample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.tutelar.Tutelar;
import io.tutelar.TutelarListener;

public class MainActivity extends AppCompatActivity implements TutelarListener {

    Button btnDetail;
    TextView txtDetail;
    Tutelar tutelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDetail = findViewById(R.id.btnDetail);
        txtDetail = findViewById(R.id.txtDetail);
        tutelar = new Tutelar(MainActivity.this, "YOUR API KEY");
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tutelar.getDeviceDetails(MainActivity.this);
            }
        });
    }

    @Override
    public void onFailure(@NonNull String message) {
        txtDetail.setText(message);
    }

    @Override
    public void onSuccess(@NonNull String data) {
        txtDetail.setText(data);
    }
}