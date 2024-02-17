package ru.bkmz.myapplication;

public class Image {
    private String name; // название
    private int imageRes; // картинка

    public Image(String name, int image) {
        this.name = name;
        this.imageRes = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}