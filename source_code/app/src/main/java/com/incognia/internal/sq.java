package com.incognia.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import kotlin.collections.ArraysKt;

/* loaded from: classes2.dex */
public abstract class sq {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String b(Drawable drawable) {
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                bitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), 50, 50, false);
                if (bitmap != null) {
                    return null;
                }
                ByteBuffer allocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getRowBytes());
                bitmap.copyPixelsToBuffer(allocate);
                byte[] array = allocate.array();
                t9 t9Var = new t9();
                t9Var.b(array);
                return ArraysKt.lime(t9Var.b(), "", 0, Cv.f8497b, 30);
            }
        }
        bitmap = null;
        if (bitmap != null) {
        }
    }
}
