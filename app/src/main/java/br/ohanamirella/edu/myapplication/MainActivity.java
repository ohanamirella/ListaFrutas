package br.ohanamirella.edu.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.KeyEventDispatcher;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        final ArrayList<String> lista_frutinhas = new ArrayList<>();

        lista_frutinhas.add("maça");
        lista_frutinhas.add("pera");
        lista_frutinhas.add("uva");
        lista_frutinhas.add("melancia");
        lista_frutinhas.add("mamão");
        lista_frutinhas.add("pesegão");
        lista_frutinhas.add("bananão");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                lista_frutinhas
                );

        listView.setAdapter( adapter );

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, lista_frutinhas.get(i), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,ComponenteView.class);

                intent.putExtra("Fruta",lista_frutinhas.get(i));
                startActivity(intent);
            }
        });
        Button;

        RadioButton;
        ImageButton;
        CheckBox;
        RatingBar;
        ToggleButton;
        DatePicker;
        AlertDialog;




    }
}
