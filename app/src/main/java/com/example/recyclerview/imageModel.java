package com.example.recyclerview;

public class imageModel {

    private  String imageName;
    private Integer imageID;

    public imageModel(String imageName, Integer imageID) {
        this.imageName = imageName;
        this.imageID = imageID;
    }

    public String getImageName() {
        return imageName;
    }

    public Integer getImageID() {
        return imageID;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }
}
