package com.company;

/**
 * Created by boun on 11/14/16.
 */
public class Football {
    String favoriteTeam;
    int established;
    boolean defendingChamp;

    public Football(String n, int a, boolean b) {
        favoriteTeam = n;
        established = a;
        defendingChamp = b;
    }

    public String favoriteTeam() {
        return favoriteTeam;
    }

    public void setFavoriteTeam(String n) {
        favoriteTeam = n;
    }

    public static boolean isValidFavoriteTeam(String favoriteTeam) {
        return favoriteTeam.contains(" ") && !favoriteTeam.isEmpty() && favoriteTeam.length() <= 25;
    }

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int a) {
        if (a > 10 && a < 100) {
            established = a;
        }
    }

    public boolean isDefendingChamp() {
        return defendingChamp;
    }

    public void setDefendingChamp( boolean currentChampion ) {
        defendingChamp = currentChampion;
    }

}