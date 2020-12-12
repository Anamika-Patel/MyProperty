package com.example.myproperty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.myproperty.Adapters.PropertyAdapter;
import com.example.myproperty.Models.PropertyModel;
import com.example.myproperty.PropertyDetails.RecyclerItemClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        ArrayList<PropertyModel> list = new ArrayList<>();
        list.add(new PropertyModel(R.drawable.duplex1, "Click here to Buy"));
        list.add(new PropertyModel(R.drawable.duplex2, "Click here to Buy"));
        list.add(new PropertyModel(R.drawable.duplex3, "Click here to Buy"));
        list.add(new PropertyModel(R.drawable.duplex4, "Click here to Buy"));
        list.add(new PropertyModel(R.drawable.duplex1, "Click here to Buy"));
        list.add(new PropertyModel(R.drawable.duplex1, "Click here to Buy"));
        list.add(new PropertyModel(R.drawable.duplex1, "Click here to Buy"));
        list.add(new PropertyModel(R.drawable.duplex1, "Click here to Buy"));
        PropertyAdapter adapter = new PropertyAdapter(list, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener
                (this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        switch (position){
                            case 0:
                            Intent intent = new Intent(MainActivity.this, PropertyDetailsAndBuy.class);
                            startActivity(intent);

                            break;
                            case 1:
                                Toast.makeText(MainActivity.this, "second item is clicked", Toast.LENGTH_SHORT).show();
                            break;
                            default:
                        }
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }

                ));
    }
}