package ru.gb.student.hello_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Button sayHello;
    private EditText userName;
    private ToggleButton showToast;
    private CheckBox gbStudent;
    private Switch reviewer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViev();
    }

    private void initViev() {
        sayHello = findViewById(R.id.btnSayHello);
        userName = findViewById(R.id.editTextTextPersonName);
        showToast = findViewById(R.id.toggleButton);
        gbStudent = findViewById(R.id.checkBox);
        reviewer = findViewById(R.id.switch1);

        sayHello.setOnClickListener((View v) -> {
            Toast.makeText(this, "Hello " + userName.getText() + "\n I'm Dmitry, Android Developer", Toast.LENGTH_LONG).show();
        });

        nextPage(findViewById(R.id.btnMore));
    }

    private void nextPage(Button next) {
        next.setOnClickListener((View v) -> {
            setContentView(R.layout.activity_about_user);
        });
    }
}