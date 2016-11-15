package com.company;
/**
 * Created by boun on 11/15/16.
 */
public class Car {
    int year;
    String makeModel;
    String color;


    public Car(int a, String b, String c) {
        year = a;
        makeModel = b;
        color = c;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int a) {
        if (a > 1950 && a < 2018) {
            year = a;
        }
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String n) {
        makeModel = n;
    }

    public static boolean isValidMakeModel(String makeModel) {
        return makeModel.contains(" ") && !makeModel.isEmpty() && makeModel.length() <= 25;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String n) {
        color = n;
    }

}
