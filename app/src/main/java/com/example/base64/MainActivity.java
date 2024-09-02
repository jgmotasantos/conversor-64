package com.example.base64;

import android.os.Bundle;
import android.util.Base64;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView copiedTextView;
    private Button convertButton;
    private Button decodeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Referenciando os elementos de UI
        editText = findViewById(R.id.editText);
        copiedTextView = findViewById(R.id.copiedTextView);
        convertButton = findViewById(R.id.convertButton);
        decodeButton = findViewById(R.id.decodeButton);

        // Ajustando o padding com base nas insets da janela
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurando a ação do botão "Converter para base64"
        convertButton.setOnClickListener(v -> {
            String inputText = editText.getText().toString();
            if (!inputText.isEmpty()) {
                // Convertendo o texto para Base64
                String base64Text = Base64.encodeToString(inputText.getBytes(), Base64.DEFAULT);
                // Exibindo o texto convertido no TextView
                copiedTextView.setText(base64Text);
            } else {
                copiedTextView.setText("Digite algo para converter.");
            }
        });

        // Configurando a ação do botão "Decodificar da base64"
        decodeButton.setOnClickListener(v -> {
            String base64Text = editText.getText().toString();
            if (!base64Text.isEmpty()) {
                try {
                    // Decodificando o texto de Base64
                    byte[] decodedBytes = Base64.decode(base64Text, Base64.DEFAULT);
                    String decodedText = new String(decodedBytes);
                    // Exibindo o texto decodificado no TextView
                    copiedTextView.setText(decodedText);
                } catch (IllegalArgumentException e) {
                    copiedTextView.setText("Texto Base64 inválido.");
                }
            } else {
                copiedTextView.setText("Digite algo para decodificar.");
            }
        });
    }
}
