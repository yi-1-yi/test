package com.example.a215024test;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Select extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);
        CheckBox checkBox1 = findViewById(R.id.checkbox01);
        CheckBox checkBox2 = findViewById(R.id.checkbox02);
        CheckBox checkBox3 = findViewById(R.id.checkbox03);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(Select.this, "滑雪被选中", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Select.this, "滑雪被取消选中", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(Select.this, "蹦极被选中", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Select.this, "蹦极被取消选中", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(Select.this, "旅游被选中", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Select.this, "旅游被取消选中", Toast.LENGTH_SHORT).show();
                }
            }
        });

        RadioGroup radioGroup = findViewById(R.id.rg1);
        RadioButton radioButton1 = findViewById(R.id.rb1);
        RadioButton radioButton2 = findViewById(R.id.rb2);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb1:
                        Toast.makeText(Select.this, "学号被选中", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(Select.this, "姓名被选中", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}