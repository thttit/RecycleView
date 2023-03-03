package com.example.btapbuoi6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {

    private final LayoutInflater mInflater;
    private ArrayList<Image> mimages = new ArrayList<>();
    Context context;

    public WordListAdapter(Context context, ArrayList<Image> images){
        mInflater = LayoutInflater.from(context);
        this.mimages = images;
        this.context = context;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.itemlayout, parent, false);
        return new WordViewHolder(mItemView, this, context);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        Image mCurrent = mimages.get(position);

        holder.setId(mCurrent.getId());
        holder.getItem_title().setText(mCurrent.getTitle_photo());
        Picasso.get().load(mCurrent.getSource_photo()).resize(1268,800).centerCrop().into(holder.getItem_photo());

        ArrayList<String> div = new ArrayList<>();
        div.addAll(Arrays.asList(mCurrent.getDescription_photo().split(" ")));
        if(div.size() <=10){
            holder.getItem_content().setText(mCurrent.getDescription_photo());
        } else {
            div.subList(10, div.size()).clear();
            String Join = String.join(" ", div);
            holder.getItem_content().setText(Join + "...");
        }
    }


    @Override
    public int getItemCount() {
        //Return the number of data items to display
        return mimages.size();
    }
}
