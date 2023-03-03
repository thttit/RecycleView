package com.example.btapbuoi6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ListItem extends AppCompatActivity {

    ImageView list_image;
    TextView list_title, description;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        list_image = findViewById(R.id.list_image);
        list_title = findViewById(R.id.list_title);
        description = findViewById(R.id.description);

        Image image = (Image) getIntent().getSerializableExtra("image");

        description.setText(image.getDescription_photo());
        list_title.setText(image.getTitle_photo());
        Picasso.get().load(image.getSource_photo()).into(list_image);
    }
}