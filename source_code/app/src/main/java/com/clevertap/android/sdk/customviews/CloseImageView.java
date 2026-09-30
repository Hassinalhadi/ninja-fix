package com.clevertap.android.sdk.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.clevertap.android.sdk.Logger;

/* loaded from: classes3.dex */
public final class CloseImageView extends AppCompatImageView {
    public static final int VIEW_ID = 199272;
    private final int canvasSize;

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.canvasSize = getScaledPixels(40);
        setId(VIEW_ID);
    }

    private int getScaledPixels(int i4) {
        return (int) TypedValue.applyDimension(1, i4, getResources().getDisplayMetrics());
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            Context context = getContext();
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("ct_close", "drawable", context.getPackageName()), null);
            if (decodeResource != null) {
                int i4 = this.canvasSize;
                canvas.drawBitmap(Bitmap.createScaledBitmap(decodeResource, i4, i4, true), 0.0f, 0.0f, new Paint());
            } else {
                Logger.v("Unable to find inapp notif close button image");
            }
        } catch (Throwable th) {
            Logger.v("Error displaying the inapp notif close button image:", th);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i4, int i5) {
        int i10 = this.canvasSize;
        setMeasuredDimension(i10, i10);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.canvasSize = getScaledPixels(40);
        setId(VIEW_ID);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context) {
        super(context, null);
        this.canvasSize = getScaledPixels(40);
        setId(VIEW_ID);
    }
}
