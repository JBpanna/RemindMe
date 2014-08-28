package com.example.jbworth.remindme;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by jbworth on 8/27/14.
 */
public class ColorWheel{

    //Member variable
    public String[] mColors = {
            "#ff82d5d3",
            "#ffb5ad99",
            "#ff81ea68",
            "#ffeed0fd",
            "#ffeec412",
            "#ff3d558f",
            "#ff6bc6ec",
            "#ff4f298f",
            "#ff7d1e39",
            "#ff499949"
    };

    //Method
    public int getColor() {

        String color = "";

        // Randomly select a reminder.
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;

    }
}
