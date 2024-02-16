package ru.bkmz.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static String text2remember = ""; // Для хранения текста из EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Устанавливаем layout

        // Определяем нужные элементы
        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        // Устанавливаем текст в EditText из статической переменной
        editText.setText(text2remember);

        // Устанавливаем слушатель для кнопки
        button.setOnClickListener(v -> {
            // Сохраняем текст из EditText в статическую переменную
            text2remember = editText.getText().toString();

            // Создаем Intent и открываем SecondActivity
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}