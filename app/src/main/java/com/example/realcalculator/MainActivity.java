package com.example.realcalculator;

import static android.util.Log.INFO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.println(INFO, "TrueButtonStart","Нажата клавиша 'Стандартный'.");
                    Intent intent = new Intent(MainActivity.this, SimpleCalculator.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.println(INFO, "TrueButtonStart","Нажата клавиша 'Продвинутый'.");
                    Intent intent = new Intent(MainActivity.this, ProCalculator.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private long backPressedTime;
    private Toast backToast;

    //Системная кнопка "Назад"
    @Override
    public void onBackPressed(){
        Log.println(INFO,"TrueButtonBack","Нажата системная клавиша 'Назад'.");
        if (backPressedTime +2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Нажмите ещё раз, чтобы выйти", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}