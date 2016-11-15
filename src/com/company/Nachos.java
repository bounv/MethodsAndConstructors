package com.company;
/**
 * Created by boun on 11/15/16.
 */
public class Nachos {
    String origination;
    String mainIngredient;
    boolean bestSnack;

    public Nachos(String a, String b, boolean c) {
        origination = a;
        mainIngredient = b;
        bestSnack = c;
    }

    public String getOrigination() {
        return origination;
    }

    public void setOrigination(String a) {
        origination = a;
    }

    public static boolean isValidOringination(String origination) {
        return origination.length() <= 20;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String a) {
        if (a.length() <= 5) {
            mainIngredient = a;
        }
    }

    public boolean isBestSnack() {
        return bestSnack;
    }

    public void setbestSnack( boolean snack ) {
        bestSnack = snack;
    }

}
