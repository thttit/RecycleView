package com.example.btapbuoi6;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView item_title, item_content;
    private ImageView item_photo;
    private int id;
    private Context context;
    public Context getContext(){
        return context;
    }
    public void setContext(Context context){
        this.context = context;
    }
    public TextView getItem_title(){
        return item_title;
    }
    public void setItem_title(TextView item_title){
        this.item_title = item_title;
    }
    public TextView getItem_content(){
        return item_content;
    }
    public void setItem_content(TextView item_content){
        this.item_content = item_content;
    }
    public ImageView getItem_photo(){
        return item_photo;
    }
    public void setItem_photo(ImageView item_photo){
        this.item_photo = item_photo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    private  final WordListAdapter mAdapter;

    public WordViewHolder(View itemView, WordListAdapter adapter, Context context) {
        super(itemView);
        //Get the layout
        item_title = itemView.findViewById(R.id.item_title);
        item_content = itemView.findViewById(R.id.item_content);
        item_photo = itemView.findViewById(R.id.item_photo);
        //Associate with this adapter
        this.mAdapter = adapter;
        this.context = context;
        //Add click listener, if desired
        itemView.setOnClickListener((this));
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, ListItem.class);
        Image mCurrent = ImageData.getImageFromId(id);
        intent.putExtra("image", mCurrent);
        context.startActivities(new Intent[]{intent});
    }
}
