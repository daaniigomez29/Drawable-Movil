package com.example.ejercicio4;

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
        canvas.drawColor(Color.YELLOW);

        int anchura = getMeasuredWidth();
        int altura = getMeasuredHeight();
        int right = getRight();
        int bottom = getBottom();
        float densidad = getResources().getDisplayMetrics().density;

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(20);

        Paint paintValores = new Paint();
        paintValores.setColor(Color.BLACK);
        paintValores.setTextSize(60);

        canvas.drawLine(0, 0, anchura, altura, paint);
        canvas.drawText("width: " + anchura, 400, 100, paintValores);
        canvas.drawText("height: " + altura, 400, 200, paintValores);
        canvas.drawText("right: " + right, 400, 300, paintValores);
        canvas.drawText("botton: " + bottom, 400, 400, paintValores);

        canvas.drawLine(anchura, 0, 0, altura, paint);


    }
}
