package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.MyViewHolder> {
    public ImagesAdapter(ArrayList<imageModel> imagesList) {
        this.imagesList = imagesList;
    }

    ArrayList<imageModel> imagesList = new ArrayList<imageModel>();
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        imageModel currentImage = imagesList.get(position);
        holder.ivPicture.setImageResource(currentImage.getImageID());
        holder.tvPictureName.setText(currentImage.getImageName());
    }

    @Override
    public int getItemCount() {
        return imagesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPicture;
        TextView tvPictureName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPicture=itemView.findViewById(R.id.iv_picture);
            tvPictureName = itemView.findViewById(R.id.tv_picture_name);
        }
    }
}
