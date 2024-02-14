package com.example.flowerobjectdetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    static{

        if(OpenCVLoader.initDebug()){

            Log.i("OpenCV", "OpenCV init successfully");

        }else{

            Log.e("OpenCV", "OpenCV init failed");

        }

    }

    private Button btn_detect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUi();

        initializeDetectAction();

    }

    private void initializeUi() {

        btn_detect = findViewById(R.id.btn_detect);

    }

    private void initializeDetectAction() {

        btn_detect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, CameraActivity.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));

            }
        });
    }


}