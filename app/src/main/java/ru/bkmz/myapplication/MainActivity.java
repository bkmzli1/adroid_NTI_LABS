package ru.bkmz.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView; // Declare variable without initializing it
    EditText editText; // Declare variable without initializing it
    Button button; // Declare variable without initializing it

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set layout before accessing views

        // Now that setContentView() has been called, we can initialize our views
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        textView.setText(""); // This line can effectively be removed. TextView will be empty by default or can be set in XML layout
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Привет, " + editText.getText().toString() + "!");
                // This will set the text to "Привет, [User Input]!" upon clicking the button.
            }
        });
    }
}