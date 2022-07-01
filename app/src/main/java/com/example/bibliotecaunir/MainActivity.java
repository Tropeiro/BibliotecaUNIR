package com.example.bibliotecaunir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Button btnCadastra, btnPesquisa;
    private RadioGroup rdgrupo;
    private EditText editPesquisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastra = findViewById(R.id.btnCadastra);
        btnPesquisa = findViewById(R.id.btnPesquisa);
        rdgrupo = findViewById(R.id.rdgrupo);
        editPesquisa = findViewById(R.id.editPesquisa);

        btnCadastra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, TelaCadastro.class);
                startActivity(intent);
            }
        });

        btnPesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TelaPesquisa.class);
                int id = rdgrupo.getCheckedRadioButtonId();
                String busca = editPesquisa.getText().toString();
                intent.putExtra("tipo", id);
                intent.putExtra("busca", busca);
                startActivity(intent);
            }
        });
    }
}