package com.example.myatividade06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nome = findViewById(R.id.nome);
        EditText cpf = findViewById(R.id.cpf);
        EditText dataNascimento = findViewById(R.id.data_nascimento);
        EditText telefone = findViewById(R.id.telefone);
        EditText celular = findViewById(R.id.celular);
        EditText email = findViewById(R.id.email);
        Button btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalhesActivity.class);
                intent.putExtra("nome", nome.getText().toString());
                intent.putExtra("cpf", cpf.getText().toString());
                intent.putExtra("data_nascimento", dataNascimento.getText().toString());
                intent.putExtra("telefone", telefone.getText().toString());
                intent.putExtra("celular", celular.getText().toString());
                intent.putExtra("email", email.getText().toString());
                startActivity(intent);
            }
        });
    }
}