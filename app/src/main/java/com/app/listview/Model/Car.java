package com.app.listview.Model;

import android.graphics.drawable.Drawable;

public class Car {

    private String image;
    private String name;
    private String model;
    private double price;
    private String color;
    private String cylinderCapacity;

    public Car() { }

    public Car(String image, String name, String model, double price, String color, String cylinderCapacity) {
        this.image = image;
        this.name = name;
        this.model = model;
        this.price = price;
        this.color = color;
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }
}
