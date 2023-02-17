package br.edu.scl.ifsp.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nomeEt, telefoneEt, emailEt, cidadeEt;
    private CheckBox checkBox;
    private Spinner spinner;
    private RadioButton mascRb, femRb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEt = findViewById(R.id.nomeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        checkBox = findViewById(R.id.checkBox);
        mascRb = findViewById(R.id.mascRb);
        femRb = findViewById(R.id.femRb);
        cidadeEt = findViewById(R.id.cidadeEt);
        spinner = findViewById(R.id.spinner);

        Button salverBtn = findViewById(R.id.salvarBtn);

        salverBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String nome = nomeEt.getText().toString();
                String telefone = telefoneEt.getText().toString();
                String email = emailEt.getText().toString();
                String cidade = cidadeEt.getText().toString();
                String uf = ((TextView) spinner.getSelectedView()).getText().toString();
                boolean ingressa = checkBox.isChecked();
                String sexo = mascRb.isChecked() ? "Masculino" : "Feminino";

                Formulario formulario = new Formulario(nome, telefone, email, cidade, uf, ingressa, sexo);

                Toast.makeText(MainActivity.this, formulario.toString(), Toast.LENGTH_LONG).show();
            }
        });

        Button limparBtn = findViewById(R.id.limparBtn);

        limparBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomeEt.setText("");
                telefoneEt.setText("");
                emailEt.setText("");
                cidadeEt.setText("");
                spinner.setSelection(0);
                checkBox.setChecked(false);
                mascRb.setChecked(false);
                femRb.setChecked(false);
            }
        });
    }
}