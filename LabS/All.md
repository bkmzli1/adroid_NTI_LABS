# LR1
![img.png](LR1/img.png)
![img_1.png](LR1/img_1.png)
# LR2
![img.png](LR2/Fimg.png)
![img_1.png](LR2/img_1.png)
# LR3
![gif1.gif](LR3/gif1.gif)
```java
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



public class SecondActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); // Устанавливаем layout

        // Определяем элементы, в данном случае TextView и кнопку
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = findViewById(R.id.textView6);
        textView.setText("Вы ввели:" + MainActivity.text2remember); // Устанавливаем текст из переменной MainActivity.text2remember

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.button2);

        // Устанавливаем слушатель для кнопки для возврата в MainActivity
        button.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
```
# LR4

![img.png](../app/src/main/res/drawable/img.png)
![img_1.png](../app/src/main/res/drawable/img_1.png)

# LR5
![img.png](LR5/img.png)
![studio64_EfiQLguP6R.gif](LR5/studio64_EfiQLguP6R.gif)

# LR6
![studio64_tvbaRI3i9L.gif](LR6/studio64_tvbaRI3i9L.gif)
# LR7
![img_1.png](img_1.png)

# 8 
![studio64_WvlMoPA0BR.gif](studio64_WvlMoPA0BR.gif)

# 9 
![studio64_WkbMNYO50g.gif](studio64_WkbMNYO50g.gif)

# 10 
![studio64_vSJlrfFjYD.gif](studio64_vSJlrfFjYD.gif)
# 11

# 12
![studio64_QuRf76z57x.gif](studio64_QuRf76z57x.gif)
# 13
![studio64_r55zOvhZbN.gif](studio64_r55zOvhZbN.gif)
# 14
![studio64_Y6GpJCBOva.gif](studio64_Y6GpJCBOva.gif)