package com.sopan.swipeselect.swipe;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

class Indicator {
    /**
     * Creates a new ShapeDrawable, in this case a circle.
     * @param size the width and height for the circle
     * @param color the color resource for the circle
     * @return a nice and adorable tiny little circle indicator.
     */
    protected static ShapeDrawable newOne(int size, int color) {
        ShapeDrawable indicator = new ShapeDrawable(new OvalShape());
        indicator.setIntrinsicWidth(size);
        indicator.setIntrinsicHeight(size);
        indicator.getPaint().setColor(color);
        return indicator;
    }
}
