package com.example.chek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                refresh();
            }
        });
        refresh();
    }
    void refresh(){
        if (checkBox.isChecked()){
            checkBox.setText("feminin");
            int color = getResources().getColor(R.color.feminin);
            checkBox.setTextColor(color);
        } else{
            checkBox.setText("masculin");
            int color = getResources().getColor(R.color.masculin);
            checkBox.setTextColor(color);
        }
    }
}