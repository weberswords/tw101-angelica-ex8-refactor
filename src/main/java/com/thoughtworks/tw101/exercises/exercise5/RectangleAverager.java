package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float sum = 0.0f;
        for (Rectangle rect: rectangles) {
            sum += (float) rect.area();
        }
        return sum/(float)rectangles.length;
    }
}
