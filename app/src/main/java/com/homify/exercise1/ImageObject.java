package com.homify.exercise1;

/**
 * Created by Sufyan on 1/13/2018.
 */

public class ImageObject {
    private String photoName;
    private int photo;

    public ImageObject(String photoName, int photo){
        this.photo = photo;
        this.photoName = photoName;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
