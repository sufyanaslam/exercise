package com.homify.exercise1;

/**
 * Created by Sufyan on 1/13/2018.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class ImageRecyclerViewAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    private List<ImageObject> imagesList;
    private Context context;

    public ImageRecyclerViewAdapter(Context context, List<ImageObject> imagesList){
        this.imagesList = imagesList;
        this.context = context;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.images_list, null);
        ImageViewHolder rcv = new ImageViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        holder.photoName.setText(imagesList.get(position).getPhotoName());
        holder.photo.setImageResource(imagesList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.imagesList.size();
    }
}
