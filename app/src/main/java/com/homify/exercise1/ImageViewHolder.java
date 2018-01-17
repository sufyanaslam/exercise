package com.homify.exercise1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Sufyan on 1/13/2018.
 */

public class ImageViewHolder extends RecyclerView.ViewHolder {

    public TextView photoName;
    public ImageView photo;

    public ImageViewHolder(View itemView) {
        super(itemView);
        photo = (ImageView) itemView.findViewById(R.id.photo);
        photoName = (TextView) itemView.findViewById(R.id.photo_name);

    }
}
