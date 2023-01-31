package com.example.ganjil_20030001_faris;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etJari;
    private Button btnHitung;
    private TextView tvHasil;
    private RadioGroup rgPilihan;
    private RadioButton rbLingkaran, rbBola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etJari = findViewById(R.id.et_jari);
        btnHitung = findViewById(R.id.btn_hitung);
        tvHasil = findViewById(R.id.tv_hasil);
        rgPilihan = findViewById(R.id.rg_pilihan);
        rbLingkaran = findViewById(R.id.rb_lingkaran);
        rbBola = findViewById(R.id.rb_bola);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etJari.getText().toString().isEmpty()) {
                    double r = Double.parseDouble(etJari.getText().toString());
                    int checkedRadioButtonId = rgPilihan.getCheckedRadioButtonId();
                    if (checkedRadioButtonId == R.id.rb_lingkaran) {
                        double luasLingkaran = Math.PI * r * r;
                        double kelilingLingkaran = 2 * Math.PI * r;
                        tvHasil.setText("Luas Lingkaran : " + luasLingkaran + "\n" + "Keliling Lingkaran : " + kelilingLingkaran);
                    } else if (checkedRadioButtonId == R.id.rb_bola) {
                        double volumeBola = (4.0 / 3.0) * Math.PI * r * r * r;
                        double kelilingBola = 4 * Math.PI * r * r;
                        tvHasil.setText("Volume Bola : " + volumeBola + "\n" + "Keliling Bola : " + kelilingBola);
                    }
                }
            }
        });
    }
}