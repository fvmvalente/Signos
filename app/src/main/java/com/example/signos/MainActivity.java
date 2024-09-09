package com.example.signos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private final String[] signos = {
            "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"
    };
    private final String[] perfis = {
            "Dinâmico, impulsivo e pioneiro. Adora desafios e é bastante independente.",
            "Estável, paciente e sensual. Valoriza o conforto e a segurança.",
            "Comunicativo, curioso e versátil. Adora novidades e interagir com as pessoas.",
            "Intuitivo, emocional e protetor. Valoriza a família e o lar.",
            "Confiante, generoso e líder nato. Busca sempre o centro das atenções.",
            "Analítico, perfeccionista e organizado. Busca sempre a ordem e a eficiência.",
            "Diplomático, harmonioso e justo. Busca sempre o equilíbrio e a beleza.",
            "Intensivo, apaixonado e misterioso. Possui uma grande força interior.",
            "Aventureiro, otimista e filosófico. Ama aprender e explorar o mundo.",
            "Ambicioso, disciplinado e responsável. É conhecido pela sua determinação.",
            "Original, independente e humanitário. Defende causas sociais e a liberdade.",
            "Sonhador, compassivo e intuitivo. É muito sensível e empático."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                signos
        );

        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int posicaoClicada = i;
                String nomeClicado = signos[posicaoClicada];
                String perfilClicado = perfis[posicaoClicada];
                Toast.makeText(getApplicationContext(), perfilClicado, Toast.LENGTH_LONG).show();
            }
        });
    }
}