package fei.mx.uv.cocinita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RestaurantesActivity extends AppCompatActivity {
    ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
        lista = (ListView)findViewById(R.id.listView1);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.restaurantes ,android.R.layout.simple_list_item_1);
        lista.setAdapter(adaptador);
    }
}
