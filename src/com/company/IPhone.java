package com.company;
/**
 * Created by boun on 11/15/16.
 */
public class IPhone {
    String phoneModel;
    int modelYear;
    int latestModel;


    public IPhone(String n, int a, int b) {
        phoneModel = n;
        modelYear = a;
        latestModel = b;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String n) {
        phoneModel = n;
    }

    public static boolean isValidPhoneModel(String phoneModel) {
        return phoneModel.length() <= 2;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int a) {
        if (a < 2017) {
            modelYear = a;
        }
    }

    public int getLatestModel() {
        return latestModel;
    }

    public void setLatestModel(int b) {
        if (b == 7) {
            latestModel = b;
        }
    }
}
