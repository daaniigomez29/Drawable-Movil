package com.example.ejercicio3;

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

        Paint paint = new Paint();

        paint.setColor(Color.WHITE);

        canvas.drawPaint(paint);

        int width = canvas.getWidth();

        int height = canvas.getHeight();


        float s = getResources().getDisplayMetrics().scaledDensity;

        paint.setColor(Color.BLACK);

        paint.setTextSize(25 * s);

        paint.setAntiAlias(true);

        float lineHeight = height / 5;


        String densityInfo = "Densidad de escala: " + getResources().getDisplayMetrics().density;
        String widthInfo = "Anchura del canvas: " + width;
        String heightInfo = "Altura del canvas: " + height;
        String aspectRatioInfo = "Ratio: " + (float) height / width;


        for (int i = 1; i < 10; i++) {
            float y = i * lineHeight;

            canvas.drawLine(0, y, width, y, paint);

            float textY = y - 10;

            switch (i) {
                case 1:
                    canvas.drawText("Densidad de escala: " + getResources().getDisplayMetrics().density, 10, textY, paint);
                    break;
                case 2:
                    canvas.drawText("Anchura del canvas: " + width, 10, textY, paint);
                    break;
                case 3:
                    canvas.drawText("Altura del canvas: " + height, 10, textY, paint);
                    break;
                case 4:
                    canvas.drawText("Ratio: " + (float) height / width, 10, textY, paint);
                    break;
            }
        }
    }
}
