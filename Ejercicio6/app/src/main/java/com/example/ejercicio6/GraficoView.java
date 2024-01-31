package com.example.ejercicio6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;

public class GraficoView extends View {
    public GraficoView(Context context) {

        super(context);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint pincel = new Paint();

        pincel.setColor(Color.BLUE);

        pincel.setStrokeWidth(8);

        pincel.setStyle(Paint.Style.STROKE);

        canvas.drawCircle(450, 450, 100, pincel);

        canvas.drawLine(450,450,550,600,pincel);

        Path trazo = new Path();

        trazo.moveTo(50, 100);

        //curva cúbica que discurre por los puntos asignados

        trazo.cubicTo(60,70, 150,90, 200,110);

        trazo.lineTo(300,200);

        canvas.drawPath(trazo, pincel);

        pincel.setStrokeWidth(1);

        pincel.setStyle(Paint.Style.FILL);

        pincel.setTextSize(20);

        pincel.setTypeface(Typeface.SANS_SERIF);

        canvas.drawTextOnPath("Desarrollo de aplicaciones para móviles con Android", trazo, 10, 40, pincel);


    }
}
