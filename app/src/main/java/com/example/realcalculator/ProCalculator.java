package com.example.realcalculator;

import static android.util.Log.INFO;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_calculator);

        Button button_back = (Button)findViewById(R.id.buttonBack);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.println(INFO,"TrueButtonBack","Нажата клавиша 'Назад'.");
                    System.out.println("Нажата клавиша buttonBack.");
                    Intent intent = new Intent(ProCalculator.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Кнопки уровней
        TextView textViewResult = (TextView)findViewById(R.id.textViewResult);

        // Столбец очистки
        TextView textViewclear = (TextView) findViewById(R.id.textViewclear);
        TextView textViewdelete = (TextView) findViewById(R.id.textViewdelete);

        // Столбец взаимодействия
        TextView textViewleftscoba = (TextView) findViewById(R.id.textViewleftscoba);
        TextView textViewrightscoba = (TextView) findViewById(R.id.textViewrightscoba);
        TextView textViewplus = (TextView) findViewById(R.id.textViewplus);
        TextView textViewminus = (TextView) findViewById(R.id.textViewminus);
        TextView textViewymnojenie = (TextView) findViewById(R.id.textViewymnojenie);
        TextView textViewdelenie = (TextView) findViewById(R.id.textViewdelenie);
        TextView textViewpoint = (TextView) findViewById(R.id.textViewpoint);
        TextView textViewrovno = (TextView) findViewById(R.id.textViewrovno);

        // Столбец цифр
        TextView textView0 = (TextView) findViewById(R.id.textView0);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        TextView textView9 = (TextView) findViewById(R.id.textView9);

        // Проверки

        // Слушатели кнопок
        {
            // Кнопка - 0
            textView0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView0", "Нажата клавиша '0'.");
                        textViewResult.setText(textViewResult.getText() + "0");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 1
            textView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView1", "Нажата клавиша '1'.");
                        textViewResult.setText(textViewResult.getText() + "1");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 2
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView2", "Нажата клавиша '2'.");
                        textViewResult.setText(textViewResult.getText() + "2");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 3
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView3", "Нажата клавиша '3'.");
                        textViewResult.setText(textViewResult.getText() + "3");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 4
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView4", "Нажата клавиша '4'.");
                        textViewResult.setText(textViewResult.getText() + "4");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 5
            textView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView5", "Нажата клавиша '5'.");
                        textViewResult.setText(textViewResult.getText() + "5");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 6
            textView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView1", "Нажата клавиша '6'.");
                        textViewResult.setText(textViewResult.getText() + "6");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 7
            textView7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView7", "Нажата клавиша '7'.");
                        textViewResult.setText(textViewResult.getText() + "7");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 8
            textView8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView8", "Нажата клавиша '8'.");
                        textViewResult.setText(textViewResult.getText() + "8");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - 9
            textView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextView9", "Нажата клавиша '9'.");
                        textViewResult.setText(textViewResult.getText() + "9");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });

            // Кнопка - Удалить все символы
            textViewclear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewClear", "Нажата клавиша 'C'.");
                        textViewResult.setText("");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - Удалить последний символ
            textViewdelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewdelete", "Нажата клавиша '←'.");
                        CharSequence newResult = "";
                        for (int index = 0; index < textViewResult.getText().length() - 1; index++) {
                            Character n = textViewResult.getText().charAt(index);
                            newResult = newResult + n.toString();
                        }
                        textViewResult.setText(newResult);
                        checkResult();

                    } catch (Exception e) {
                    }
                }
            });

            // Кнопка - (
            textViewleftscoba.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewleftscoba", "Нажата клавиша '('.");
                        textViewResult.setText(textViewResult.getText() + "(");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - )
            textViewrightscoba.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewrightcoba", "Нажата клавиша ')'.");
                        textViewResult.setText(textViewResult.getText() + ")");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - +
            textViewplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewplus", "Нажата клавиша '+'.");
                        textViewResult.setText(textViewResult.getText() + "+");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - -
            textViewminus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewminus", "Нажата клавиша '-'.");
                        textViewResult.setText(textViewResult.getText() + "-");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - *
            textViewymnojenie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewymnojenie", "Нажата клавиша '*'.");
                        textViewResult.setText(textViewResult.getText() + "*");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - /
            textViewdelenie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewdelenie", "Нажата клавиша '/'.");
                        textViewResult.setText(textViewResult.getText() + "/");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - .
            textViewpoint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewpoint", "Нажата клавиша '.'.");
                        textViewResult.setText(textViewResult.getText() + ".");
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
            // Кнопка - =
            textViewrovno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {
                        Log.println(INFO, "TrueTextViewrovno", "Нажата клавиша '='.");
                        String newCalculatedResult = calculateResult(textViewResult.getText().toString());
                        textViewResult.setText(newCalculatedResult);
                        checkResult();
                    } catch (Exception e) {
                    }
                }
            });
        }
    }

    public void checkResult(){
        // Кнопки уровней
        TextView textViewResult = (TextView)findViewById(R.id.textViewResult);

        // Столбец очистки
        TextView textViewclear = (TextView) findViewById(R.id.textViewclear);
        TextView textViewdelete = (TextView) findViewById(R.id.textViewdelete);

        // Столбец взаимодействия
        TextView textViewleftscoba = (TextView) findViewById(R.id.textViewleftscoba);
        TextView textViewrightscoba = (TextView) findViewById(R.id.textViewrightscoba);
        TextView textViewplus = (TextView) findViewById(R.id.textViewplus);
        TextView textViewminus = (TextView) findViewById(R.id.textViewminus);
        TextView textViewymnojenie = (TextView) findViewById(R.id.textViewymnojenie);
        TextView textViewdelenie = (TextView) findViewById(R.id.textViewdelenie);
        TextView textViewpoint = (TextView) findViewById(R.id.textViewpoint);
        TextView textViewrovno = (TextView) findViewById(R.id.textViewrovno);

        // Столбец цифр
        TextView textView0 = (TextView) findViewById(R.id.textView0);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        TextView textView9 = (TextView) findViewById(R.id.textView9);


        // Разрешения по умолчанию
        textView0.setEnabled(true);
        textView1.setEnabled(true);
        textView2.setEnabled(true);
        textView3.setEnabled(true);
        textView4.setEnabled(true);
        textView5.setEnabled(true);
        textView6.setEnabled(true);
        textView7.setEnabled(true);
        textView8.setEnabled(true);
        textView9.setEnabled(true);
        textViewleftscoba.setEnabled(true);
        textViewrightscoba.setEnabled(true);
        textViewplus.setEnabled(true);
        textViewminus.setEnabled(true);
        textViewymnojenie.setEnabled(true);
        textViewdelenie.setEnabled(true);
        textViewpoint.setEnabled(true);
        textViewrovno.setEnabled(true);

        // Проверка на пустую строку
        if (textViewResult.getText().length()==0){
            textViewleftscoba.setEnabled(true);
            textViewrightscoba.setEnabled(false);
            textViewplus.setEnabled(false);
            textViewminus.setEnabled(true);
            textViewymnojenie.setEnabled(false);
            textViewdelenie.setEnabled(false);
            textViewpoint.setEnabled(false);
            textViewrovno.setEnabled(false);
        }
        // Проверки при заполненной строке
        if (textViewResult.getText().length()>0) {
            Character lastChar = textViewResult.getText().charAt(textViewResult.length() - 1);
            String lastCharStr = lastChar.toString();
            // Проверка на цифру
            if (lastCharStr == "0" || lastCharStr == "1" || lastCharStr == "2" || lastCharStr == "3"
                    || lastCharStr == "4" || lastCharStr == "5" || lastCharStr == "6"
                    || lastCharStr == "7" || lastCharStr == "8" || lastCharStr == "9") {
                textViewleftscoba.setEnabled(false);
                textViewrightscoba.setEnabled(true);
                textViewplus.setEnabled(true);
                textViewminus.setEnabled(true);
                textViewymnojenie.setEnabled(true);
                textViewdelenie.setEnabled(true);
                textViewpoint.setEnabled(true);
                textViewrovno.setEnabled(true);

                textView0.setEnabled(true);
                textView1.setEnabled(true);
                textView2.setEnabled(true);
                textView3.setEnabled(true);
                textView4.setEnabled(true);
                textView5.setEnabled(true);
                textView6.setEnabled(true);
                textView7.setEnabled(true);
                textView8.setEnabled(true);
                textView9.setEnabled(true);
            }
            // Проверка на символ
            if (lastCharStr == "/" || lastCharStr == "+" || lastCharStr == "-" || lastCharStr == "*") {
                textViewleftscoba.setEnabled(true);
                textViewrightscoba.setEnabled(false);
                textViewplus.setEnabled(false);
                textViewminus.setEnabled(false);
                textViewymnojenie.setEnabled(false);
                textViewdelenie.setEnabled(false);
                textViewpoint.setEnabled(false);
                textViewrovno.setEnabled(false);

                textView0.setEnabled(true);
                textView1.setEnabled(true);
                textView2.setEnabled(true);
                textView3.setEnabled(true);
                textView4.setEnabled(true);
                textView5.setEnabled(true);
                textView6.setEnabled(true);
                textView7.setEnabled(true);
                textView8.setEnabled(true);
                textView9.setEnabled(true);
            }
            // Проверка на открывающую (левую) скобку
            System.out.println(lastCharStr);
            if (lastCharStr == "(") {
                textViewleftscoba.setEnabled(true);
                textViewrightscoba.setEnabled(false);

                textView0.setEnabled(true);
                textView1.setEnabled(true);
                textView2.setEnabled(true);
                textView3.setEnabled(true);
                textView4.setEnabled(true);
                textView5.setEnabled(true);
                textView6.setEnabled(true);
                textView7.setEnabled(true);
                textView8.setEnabled(true);
                textView9.setEnabled(true);
            }
            // Проверка на закрывающую (правую) скобку
            if (lastCharStr == ")") {
                textViewleftscoba.setEnabled(false);
                textViewrightscoba.setEnabled(true);
                textViewplus.setEnabled(true);
                textViewminus.setEnabled(true);
                textViewymnojenie.setEnabled(true);
                textViewdelenie.setEnabled(true);
                textViewpoint.setEnabled(false);
                textViewrovno.setEnabled(true);

                textView0.setEnabled(false);
                textView1.setEnabled(false);
                textView2.setEnabled(false);
                textView3.setEnabled(false);
                textView4.setEnabled(false);
                textView5.setEnabled(false);
                textView6.setEnabled(false);
                textView7.setEnabled(false);
                textView8.setEnabled(false);
                textView9.setEnabled(false);
            }
        }
    }

    public String calculateResult(String yravnenie){
        String result = "";
        if (yravnenie.length()==0) return "";

        Calc calculator = new Calc();
        yravnenie = calculator.opn(yravnenie);
        Double resultDouble = calculator.calculate(yravnenie);
        result = resultDouble.toString();
        return result;
    }

    //Системная кнопка "Назад"
    @Override
    public void onBackPressed(){
        try {
            Log.println(INFO,"TrueButtonBack","Нажата системная клавиша 'Назад'.");
            Intent intent = new Intent(ProCalculator.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }
}