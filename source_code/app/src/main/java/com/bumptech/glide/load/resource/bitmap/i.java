package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class i extends d {
    public static final byte[] bravo = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(E3.f.alpha);

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        messageDigest.update(bravo);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.d
    public final Bitmap charlie(G3.b bVar, Bitmap bitmap, int i4, int i5) {
        Paint paint = y.alpha;
        if (bitmap.getWidth() <= i4 && bitmap.getHeight() <= i5) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return y.bravo(bVar, bitmap, i4, i5);
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // E3.f
    public final int hashCode() {
        return -670243078;
    }
}
