package com.company;

/**
 * Created by boun on 11/14/16.
 */
public class Fan {
    String name;
    int age;
    boolean athlete;

    public Fan(String n, int a, boolean b) {
        name = n;
        age = a;
        athlete = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public static boolean isValidName(String name) {
        return name.contains(" ") && !name.isEmpty() && name.length() <= 20;
    }

    public int getAge() {
        return age;
}

    public void setAge(int a) {
        if (a > 0 && a < 150) {
            age = a;
        }
    }

    public boolean isAthlete() {
        return athlete;
    }

    public void setAthlete( boolean active ) {
        athlete = active;
    }


}
