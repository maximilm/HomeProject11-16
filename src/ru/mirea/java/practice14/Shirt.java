package ru.mirea.java.practice14;

import java.util.Arrays;

public class Shirt {
    String[] shirts = new String[11];

    Shirt(String[] f) {
        for(int i = 0; i < 11; i++)
            shirts[i] = f[i];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "shirts=" + Arrays.toString(shirts) +
                '}';
    }
}
