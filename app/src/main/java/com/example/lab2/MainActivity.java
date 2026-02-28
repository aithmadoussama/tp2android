package com.example.lab2;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText surface;
    private EditText nb_pieces;
    private CheckBox is_picine;
    private TextView resultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        surface = findViewById(R.id.input_surface);
        nb_pieces = findViewById(R.id.input_pieces);
        is_picine = findViewById(R.id.checkbox_piscine);
        resultat = findViewById(R.id.result);

        findViewById(R.id.button_calcul).setOnClickListener(v -> {
            double surface_value = Double.parseDouble(surface.getText().toString());
            int nb_pieces_value = Integer.parseInt(nb_pieces.getText().toString());
            boolean is_picine_value = is_picine.isChecked();

            double impotBase = surface_value * 2;
            double supplement = nb_pieces_value * 50 + (is_picine_value ? 100 : 0);
            double total = impotBase + supplement;

            resultat.setText("Impôt total : " + total + " DH");
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}