package com.example.ejercicio5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class GraficoView extends View {
    public GraficoView(Context context) {

        super(context);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        Paint contornoPaint = new Paint();
        contornoPaint.setColor(Color.BLACK);
        contornoPaint.setStyle(Paint.Style.STROKE);
        contornoPaint.setStrokeWidth(1 * getResources().getDisplayMetrics().scaledDensity);

        canvas.drawPaint(paint);

        int width=canvas.getWidth();

        int height=canvas.getHeight();

        int right=canvas.getClipBounds().right;

        int bottom=canvas.getClipBounds().bottom;

        float s=getResources().getDisplayMetrics().scaledDensity;
        float radio=30*s;
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(50*s,50*s,radio,paint);
        canvas.drawCircle(50*s,50*s,radio,contornoPaint);
        canvas.drawRect(160 * s, height-2000, 120+180 * s, height-1830 , paint);
        canvas.drawRect(160 * s, height-2000, 120+180 * s, height-1830 , contornoPaint);
        paint.setColor(Color.GREEN);
        contornoPaint.setStrokeWidth(2 * getResources().getDisplayMetrics().scaledDensity);
        canvas.drawCircle(50*s,90*s,radio,paint);
        canvas.drawCircle(50*s,90*s,radio,contornoPaint);
        canvas.drawRect(160 * s, height-1700, 120+180 * s, height-1530, paint);
        canvas.drawRect(160 * s, height-1700, 120+180 * s, height-1530, contornoPaint);
        paint.setColor(Color.BLUE);
        contornoPaint.setStrokeWidth(3 * getResources().getDisplayMetrics().scaledDensity);
        canvas.drawCircle(50*s,130*s,radio,paint);
        canvas.drawCircle(50*s,130*s,radio,contornoPaint);
        canvas.drawRect(160 * s, height-1400, 120+180 * s, height-1230, paint);
        canvas.drawRect(160 * s, height-1400, 120+180 * s, height-1230, contornoPaint);
        paint.setColor(Color.MAGENTA);
        contornoPaint.setStrokeWidth(5 * getResources().getDisplayMetrics().scaledDensity);
        canvas.drawCircle(50*s,170*s,radio,paint);
        canvas.drawCircle(50*s,170*s,radio,contornoPaint);
        canvas.drawRect(160 * s, height-1100, 120+180 * s, height-930, paint);
        canvas.drawRect(160 * s, height-1100, 120+180 * s, height-930, contornoPaint);


    }
}
