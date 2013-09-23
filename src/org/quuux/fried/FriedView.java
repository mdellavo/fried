package org.quuux.fried;

import android.content.Context;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;

public class FriedView extends View {
    
    private float[]  hsv = { 0.0f, 1.0f, 1.0f } ;

    public FriedView(Context context) {
        super(context);
    }

    public FriedView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onDraw(Canvas canvas) {
	hsv[0] = (hsv[0]+1.0f) % 360.0f;

	int color = Color.HSVToColor(hsv);

	canvas.drawARGB(255, Color.red(color), Color.green(color), Color.blue(color));

	postInvalidateDelayed(25);	
    }
}
