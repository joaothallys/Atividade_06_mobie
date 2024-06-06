package com.example.myatividade06;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalhesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Intent intent = getIntent();

        String nome = intent.getStringExtra("nome");
        String cpf = intent.getStringExtra("cpf");
        String dataNascimento = intent.getStringExtra("data_nascimento");
        String telefone = intent.getStringExtra("telefone");
        String celular = intent.getStringExtra("celular");
        String email = intent.getStringExtra("email");

        ((TextView) findViewById(R.id.nome)).setText("Nome: " + nome);
        ((TextView) findViewById(R.id.cpf)).setText("CPF: " + cpf);
        ((TextView) findViewById(R.id.data_nascimento)).setText("Data de Nascimento: " + dataNascimento);
        ((TextView) findViewById(R.id.telefone)).setText("Telefone: " + telefone);
        ((TextView) findViewById(R.id.celular)).setText("Celular: " + celular);
        ((TextView) findViewById(R.id.email)).setText("Email: " + email);
    }
}
