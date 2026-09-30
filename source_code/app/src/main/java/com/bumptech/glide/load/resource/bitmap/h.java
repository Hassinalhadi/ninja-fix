package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class h extends d {
    public static final byte[] bravo = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(E3.f.alpha);

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        messageDigest.update(bravo);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.d
    public final Bitmap charlie(G3.b bVar, Bitmap bitmap, int i4, int i5) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = y.alpha;
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f5 = 0.0f;
        if (bitmap.getWidth() * i5 > bitmap.getHeight() * i4) {
            width = i5 / bitmap.getHeight();
            f5 = (i4 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i4 / bitmap.getWidth();
            height = (i5 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap hotel = bVar.hotel(i4, i5, config);
        hotel.setHasAlpha(bitmap.hasAlpha());
        y.alpha(bitmap, hotel, matrix);
        return hotel;
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // E3.f
    public final int hashCode() {
        return -599754482;
    }
}
