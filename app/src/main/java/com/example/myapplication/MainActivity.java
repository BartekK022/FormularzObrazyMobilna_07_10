package com.example.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewObraz;
    RadioGroup radioGroupObrazy;
    RadioButton radioButtonObraz1, radioButtonObraz2, radioButtonObraz3;
    EditText editTextNrObrazu;
    SeekBar seekBarNrObrazu;
    Spinner spinnerObrazy;
    int numerObrazka;

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
        imageViewObraz = findViewById(R.id.imageView);

        int[] obrazkiID = new int[]{
                R.drawable.obraz1,
                R.drawable.obraz2,
                R.drawable.obraz3

        };


        seekBarNrObrazu.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        imageViewObraz.setImageResource(obrazkiID[i - 1]);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
        spinnerObrazy.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();
                        imageViewObraz.setImageResource(obrazkiID[i]);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                }
        );
        radioGroupObrazy.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(@NonNull RadioGroup radioGroup, int i) {
                        Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();
                        if(i == R.id.radioButton) {
                            imageViewObraz.setImageResource(R.drawable.obraz1);
                        } else if(i == R.id.radioButton2) {
                            imageViewObraz.setImageResource(R.drawable.obraz2);
                        } else if(i == R.id.radioButton3) {
                            imageViewObraz.setImageResource(obrazkiID[2]);
                            //moze tez byc imageViewObraz.setImageResource(R.drawable.obraz3);
                        }

                    }
                }
        );


    }
}