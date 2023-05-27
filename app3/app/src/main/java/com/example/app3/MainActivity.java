package com.example.app3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        button2 = findViewById(R.id.button2);

        String[] opc = {"Gabriel Bustillos", "Gabriel Prieto", "Jared Flores"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_names, opc);
        spinner.setAdapter(adapter);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selection = spinner.getSelectedItem().toString();
                String url = "";

                if (selection.equals("Gabriel Bustillos")) {
                    url = "https://gabribu.github.io/curr_vitae/";
                } else if (selection.equals("Gabriel Prieto")) {
                    url = "https://ejemplo.com/cv-gabriel-prieto";
                } else if (selection.equals("Jared Flores")) {
                    url = "https://ejemplo.com/cv-jared-flores";
                }

                if (!url.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, CVActivity.class);
                    intent.putExtra("url", url);
                    startActivity(intent);
                }

                Toast.makeText(MainActivity.this, selection, Toast.LENGTH_SHORT).show();
            }
        });
    }

}