package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodorderapp.databinding.ActivityDetialBinding;

public class DetialActivity extends AppCompatActivity {

    ActivityDetialBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       final int image=getIntent().getIntExtra("image",0);
       final int price=Integer.parseInt(getIntent().getStringExtra("price"));
        String name=getIntent().getStringExtra("name");
        String description=getIntent().getStringExtra("desc");

        binding.detialImage.setImageResource(image);
        binding.detailprice.setText(String.format("%d",price));
        binding.nameBox.setText(name);
        binding.detialdescription.setText(description);

        final DBHelper helper=new DBHelper(this);
        binding.OrderNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            boolean isInserted=     helper.insertorder(
                         binding.PersonName.getText().toString(),
                         binding.PhoneBox.getText().toString(),
                         price,
                         image,
                         name,
                         description,
                         Integer.parseInt(binding.quvantity.getText().toString())
                 );
            if(isInserted)
                Toast.makeText(DetialActivity.this, "Data Success", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(DetialActivity.this, "Error.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}