package com.app.listview;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.listview.Model.Car;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterCar extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Car> cars;
    private ImageView image;

    public AdapterCar(Activity activity, ArrayList<Car> cars) {
        this.activity = activity;
        this.cars = cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void addCar(ArrayList<Car> carsElements){
        cars.addAll(carsElements);
    }

    @Override
    public int getCount() {
        return cars.size();
    }

    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.car_item, null);
        }

        Car carElement = cars.get(position);

        image = v.findViewById(R.id.imageView);
        Picasso.get().load(carElement.getImage()).into(image);

        TextView nameCar = v.findViewById(R.id.txtName);
        nameCar.setText(carElement.getName());

        TextView modelCar = v.findViewById(R.id.txtModel);
        modelCar.setText(carElement.getModel());

        TextView priceCar = v.findViewById(R.id.txtPrice);
        priceCar.setText(carElement.getPrice()+"");

        TextView colorCar = v.findViewById(R.id.txtColor);
        colorCar.setText(carElement.getColor());

        TextView cylinderCapacity = v.findViewById(R.id.txtCylinderCapacity);
        cylinderCapacity.setText(carElement.getCylinderCapacity());

        return v;
    }
}
