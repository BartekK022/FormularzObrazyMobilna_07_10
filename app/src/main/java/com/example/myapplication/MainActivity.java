package com.example.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewObraz1, imageViewObraz2, imageViewObraz3;
    RadioGroup radioGroupObrazy;
    RadioButton radioButtonObraz1, radioButtonObraz2, radioButtonObraz3;
    EditText editTextNrObrazu;
    SeekBar seekBarNrObrazu;
    Spinner spinnerObrazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        radioGroupObrazy = findViewById(R.id.radioGroup);
        radioButtonObraz1 = findViewById(R.id.radioButton);
        radioButtonObraz2 = findViewById(R.id.radioButton2);
        radioButtonObraz3 = findViewById(R.id.radioButton3);
        editTextNrObrazu = findViewById(R.id.editTextNumber);
        seekBarNrObrazu = findViewById(R.id.seekBar);
        spinnerObrazy = findViewById(R.id.spinner);
        imageViewObraz1 = findViewById(R.id.imageView);


    }
}