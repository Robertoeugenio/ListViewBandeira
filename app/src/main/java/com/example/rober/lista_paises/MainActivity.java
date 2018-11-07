package com.example.rober.lista_paises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /* dados da list view */

    /* array lista ranks */
    String [] ranks = {"1","2","3","4","5","6","7","8","9","10"};

    /* array paises */
    String[] paises = {"China","India","United States", "Indonesia", "Brazil", "Pakistan", "Nigeria", "Bangladesh", "Russia","Japan"};

    /* array população */
    String[] populacoes = {"1,354,040,000","1,210,193,422","315,761,000","237,641,326","193,946,886","182,912,000","170,901,000","152,518,015","143,369,806","100,000,000"};
    int [] imagens = {R.drawable.china, R.drawable.india, R.drawable.usa, R.drawable.indonesia, R.drawable.brasil, R.drawable.pakistan, R.drawable.nigeria, R.drawable.bangladesh, R.drawable.russia, R.drawable.japan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*listando a list view*/
        ListView listView = findViewById(R.id.llistaPaises);

        PaisesAdapter paisesAdapter = new PaisesAdapter();

        listView.setAdapter(paisesAdapter);
    }

    class PaisesAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return imagens.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.descricaotextopaises, null);

            TextView rank = (TextView) view.findViewById(R.id.rank);
            TextView pais = (TextView) view.findViewById(R.id.country);
            TextView populacao = (TextView) view.findViewById(R.id.population);
            ImageView imagem = (ImageView) view.findViewById(R.id.bandeira);

            rank.setText("Rank: " + ranks[position]);
            pais.setText("Country: " + paises[position]);
            populacao.setText("Population: " + populacoes[position]);
            imagem.setImageResource(imagens[position]);

            return view;
        }
    }
}
