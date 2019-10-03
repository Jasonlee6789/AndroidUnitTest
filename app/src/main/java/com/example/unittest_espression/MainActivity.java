package com.example.unittest_espression;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnGetMessage;
    private EditText et_meaasgeToCopay;
    private TextView tv_copiedMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et_meaasgeToCopay = findViewById(R.id.editText_messageToCopy);
        tv_copiedMessage = findViewById(R.id.textView_copiedMeaasge);

    }

    public void getMessage(View view){
        String message = et_meaasgeToCopay.getText().toString();
        tv_copiedMessage.setText(message);
        tv_copiedMessage.setTextColor(Color.RED);
    }

    public void openActivity2(View view) {
    }
}
