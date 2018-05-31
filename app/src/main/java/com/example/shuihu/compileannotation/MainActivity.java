package com.example.shuihu.compileannotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lib_annotation.LActivity;
import com.example.lib_annotation.LView;

@LActivity
public class MainActivity extends AppCompatActivity {
    @LView(R.id.tv)
    TextView textView;
    @LView(R.id.btn_leon)
    Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DIMainActivity.bindView(this);
        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
