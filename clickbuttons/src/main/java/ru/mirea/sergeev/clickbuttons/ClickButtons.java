package ru.mirea.sergeev.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ClickButtons extends AppCompatActivity {
    Button btnOk;
    Button btnCancel;
    TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_buttons);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        tvOut = (TextView) findViewById(R.id.tvOut);
        View.OnClickListener oclBtnOk;
        oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        View.OnClickListener oclBtnCancel;
        oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View k) {
                tvOut.setText("Нажата кнопка CANCEL");
            }
        };
        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(oclBtnCancel);


    }
}
