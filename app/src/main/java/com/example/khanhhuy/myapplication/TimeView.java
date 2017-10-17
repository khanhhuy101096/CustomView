package com.example.khanhhuy.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by yeu_thuong on 10/17/2017.
 */

public class TimeView extends android.support.v7.widget.AppCompatTextView {
    private String titleText;
    private boolean color;

    public TimeView(Context context) {
        super(context);
        setTimeView();
    }

    public TimeView(Context context, AttributeSet attrs){
        super(context,attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs,
                R.styleable.TimeView,0,0);
        try{
            titleText = typedArray.getString(R.styleable.TimeView_title);
            setTimeView();
            color = typedArray.getBoolean(R.styleable.TimeView_setColor, false);
            decorateText();
        } finally {
            typedArray.recycle();
        }
    }

    public TimeView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setTimeView();
    }

    private void decorateText() {
        if(this.color == true){
            setShadowLayer(4, 2, 2, Color.rgb(250, 00, 250));
            setBackgroundColor(Color.CYAN);
        } else {
            setBackgroundColor(Color.RED);
        }
    }

    private void setTimeView(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh--mm--aa");
        String time = dateFormat.format(Calendar.getInstance().getTime());
        if(this.titleText != null )
            setText(this.titleText+" "+time);
        else
            setText(time);
    }
}
