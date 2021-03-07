package com.example.cityguide.HelperClasses.HomeAdaptersHelperClasses;

import android.graphics.drawable.Drawable;

public class CategoriesHelperClass {

    Drawable gradient;
    int image;
    String title;

    public CategoriesHelperClass(Drawable gradient, int image, String title) {
        this.gradient = gradient;
        this.image = image;
        this.title = title;
    }

    public Drawable getGradient() {
        return gradient;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
