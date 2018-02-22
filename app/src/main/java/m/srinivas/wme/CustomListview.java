package m.srinivas.wme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class CustomListview extends AppCompatActivity {
RecyclerView custom_recyler;
ArrayList<Items> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_listview);
        custom_recyler = (RecyclerView) findViewById(R.id.custom_recyler);
        items = new ArrayList<Items>();
        items.add(new Items("Collge",R.drawable.college));
        items.add(new Items("NOtification",R.drawable.notification));
        items.add(new Items("HOsipitals",R.drawable.hospitals));
        items.add(new Items("Collge",R.drawable.college));
        items.add(new Items("Collge",R.drawable.college));


        custom_recyler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        custom_recyler.setAdapter(new Custom_Adapter(items, R.layout.mycutom, this));
    }
}
