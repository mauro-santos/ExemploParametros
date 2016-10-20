package br.com.maurosantos.android.exemploparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtValor;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = (EditText) findViewById(R.id.edtValor);
        btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent it = new Intent(this, SecondActivity.class);
        it.putExtra("VALOR", edtValor.getText().toString());

        startActivity(it);
    }
}
