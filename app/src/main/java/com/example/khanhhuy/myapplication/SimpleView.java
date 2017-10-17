package com.example.khanhhuy.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yeu_thuong on 10/17/2017.
 */

public class SimpleView extends View {
    private float dim;
    private int shape;
    Paint paint;

    public static final int CIRCLE = 0;
    public static final int SQUARE = 1;

    public SimpleView(Context context) {
        super(context);
    }

    public SimpleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.SimpleView,
                0, 0
        );
        try {
            dim = typedArray.getDimension(R.styleable.SimpleView_dim, 20f);
            shape = typedArray.getInteger(R.styleable.SimpleView_shape, 0);
        } finally {
            typedArray.recycle();
        }
        paint = new Paint();
        paint.setColor(0xfffed325); // yellow
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch(shape){
            case CIRCLE:
                canvas.drawCircle(dim, dim, dim, paint);
                break;
            case SQUARE:
                canvas.drawRect(0, 0, dim, dim, paint);
                break;
        }
    }
}
