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

        int anchura = canvas.getWidth();
        int altura = canvas.getHeight();
        float densidad = getResources().getDisplayMetrics().density;
        float ratio = (float) altura / anchura;

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setTextSize(30);

        Paint paintValores = new Paint();
        paintValores.setColor(Color.BLACK);
        paintValores.setTextSize(60);

        int numeroLineas = 14;
        for (int i = 1; i <= numeroLineas; i++) {
            float Y = (altura / (numeroLineas + 1)) * i;
            canvas.drawLine(0, Y, anchura, Y, paint);
            canvas.drawText(String.valueOf(Y), 50, Y, paint);
        }

        // Escribir valores en pantalla
        canvas.drawText("scale= " + densidad, anchura / 2, 302 , paintValores);
        canvas.drawText("anchura= " + anchura , anchura / 2 , 604 ,paintValores );
        canvas.drawText("altura= " + altura ,anchura / 2,1208,paintValores );
        canvas.drawText(String.valueOf((float) altura-110), 50, altura-110, paint);
        canvas.drawLine(0, altura - 100, anchura, altura-100, paint);
        canvas.drawText("ratio= " + ratio ,anchura / 2,altura-100,paintValores );
    }
}
