package com.example.ejercicio7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

public class GraficoView extends View {
    public GraficoView(Context context) {

        super(context);
    }

    protected void onDraw(Canvas canvas) {
        float s=getResources().getDisplayMetrics().scaledDensity;

        canvas.drawColor(Color.WHITE);

        Paint paint=new Paint();

        paint.setAntiAlias(true);

        paint.setTextSize(30*s);

        //salva el canvas antes de transformarlo

        canvas.save();

        //traslacion

        float x=50*s;

        float y=150*s;

        canvas.translate(x,y);

        //rectangulo bounding-box de un texto

        String texto="Rotación de un canvas";

        Rect bounds=new Rect();

        paint.getTextBounds(texto,0,texto.length(),bounds);

        paint.setColor(Color.BLUE);

        paint.setStyle(Paint.Style.STROKE);

        paint.setStrokeWidth(2*s);

        //dibuja el rectangulo en el origen

        canvas.drawRect(bounds,paint);

        //centro del rectangulo

        float centreX=bounds.exactCenterX();

        float centreY=bounds.exactCenterY();

        //rotacion respecto al centro del rectangulo

        canvas.rotate(-45,centreX,centreY);

        //escribe en el origen del canvas rotado

        paint.setColor(Color.BLACK);

        paint.setStyle(Paint.Style.FILL);

        canvas.drawText(texto,0,0,paint);

        //restablece el canvas

        canvas.restore();

        canvas.drawText("Tras la rotación",50*s,300*s,paint);
    }
}
