package com.ravisravan.sunshine;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ravisravankumar on 31/01/16.
 */
public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int hSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        int hSpecSize = MeasureSpec.getSize(heightMeasureSpec);
        int myHeight = hSpecSize;

        int wSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int wSpecSize = MeasureSpec.getSize(widthMeasureSpec);
        int myWidth = wSpecSize;

        if(hSpecMode == MeasureSpec.EXACTLY){
            //Sizes have been passed or fill parent is used.
            myHeight = hSpecSize;
        } else if (hSpecMode == MeasureSpec.AT_MOST){
            //Wrap content has been used
        }

        if(wSpecMode == MeasureSpec.EXACTLY) {
            //Sizes have been passed or fill parent is used.
            myWidth = wSpecSize;
        } else if (wSpecMode == MeasureSpec.AT_MOST) {
            //Wrap content has been used
        }
        //If this method is not called the app will crash after the view is laid out
        setMeasuredDimension(myWidth,myHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Objects in this method are created and destroyed at an alarming frequency,
        //when ever the screen is refreshed (many times a second).
        //This can be expensive. Move the scope of any variable used in the onDraw to the class scope.
    }
}
