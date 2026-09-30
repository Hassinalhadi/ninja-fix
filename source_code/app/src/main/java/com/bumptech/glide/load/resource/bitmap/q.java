package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public abstract class q {
    public static final p alpha = new com.google.mlkit.common.sdkinternal.b(3);

    public static c alpha(G3.b bVar, Drawable drawable, int i4, int i5) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z2 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i4 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
            } else if (i5 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i4 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i5 = current.getIntrinsicHeight();
                }
                Lock lock = y.delta;
                lock.lock();
                Bitmap hotel = bVar.hotel(i4, i5, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(hotel);
                    current.setBounds(0, 0, i4, i5);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = hotel;
                    z2 = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            bitmap = null;
            z2 = true;
        } else {
            bitmap = null;
        }
        if (!z2) {
            bVar = alpha;
        }
        return c.charlie(bVar, bitmap);
    }
}
