package com.example.v_chproject.Utils;


import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public class MyScroller extends Scroller {
    public MyScroller(Context context) {
        super(context, new DecelerateInterpolator());
    }

    /**
     * Start scrolling by providing a starting point and the distance to travel.
     * The scroll will use the default value of 250 milliseconds for the
     * duration.
     *
     * @param startX Starting horizontal scroll offset in pixels. Positive
     *               numbers will scroll the content to the left.
     * @param startY Starting vertical scroll offset in pixels. Positive numbers
     *               will scroll the content up.
     * @param dx     Horizontal distance to travel. Positive numbers will scroll the
     *               content to the left.
     * @param dy     Vertical distance to travel. Positive numbers will scroll the
     */
    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        super.startScroll(startX, startY, dx, dy, 400);
    }
}
