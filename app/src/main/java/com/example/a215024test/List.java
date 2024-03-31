package com.example.a215024test;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class List extends AppCompatActivity {
    String[] arr={"水平座","双鱼座","白羊座","金牛座","双子座","巨蟹座","狮子座","处女座","天秤座","天蝎座","射手座","摩羯座"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        Spinner spinner=(Spinner) findViewById(R.id.sp01);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        Button button=findViewById(R.id.button03);
        button.setOnClickListener(new MyOnClickListener());
        spinner.setOnItemSelectedListener(new MyItemSelectedListener());
    }
    class  MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.button03){
                Spinner spinner=findViewById(R.id.sp01);
                Toast.makeText(List.this, arr[spinner.getSelectedItemPosition()], Toast.LENGTH_SHORT).show();
            }
        }
    }
    class MyItemSelectedListener implements AdapterView.OnItemSelectedListener{
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(List.this, arr[i], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }

}
