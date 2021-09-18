package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;

import com.example.foodorderapp.Adaptors.MainAdaptor;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list=new ArrayList<>();
        list.add(new MainModel(R.drawable.bruger,"Burger","5","A hamburger (or burger for short) is a food, typically considered a sandwich, consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun."));
        list.add(new MainModel(R.drawable.pizza,"pizza","10","Pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting,"));
        list.add(new MainModel(R.drawable.chavmin,"chavmin","8","a Chinese-style dish of steamed or stir-fried vegetables, topped with shredded chicken, shrimp, etc., and served with fried noodles."));
        list.add(new MainModel(R.drawable.dosa,"dosa","15","A dosa (also dosai or dosha or dose or 'thosai') is a thin pancake or crepe originating from South India, made from a fermented batter predominantly consisting of lentils and rice. ... Its main ingredients are rice and black gram, ground together in a fine, smooth batter with a dash of salt, then fermented."));
        list.add(new MainModel(R.drawable.bruger,"Burger","25","big burger"));

        MainAdaptor adaptor=new MainAdaptor(list,this);
        binding.recycleview.setAdapter(adaptor);

        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        binding.recycleview.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}