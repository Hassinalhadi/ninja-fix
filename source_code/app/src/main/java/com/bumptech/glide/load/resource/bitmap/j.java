package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public final class j extends d {
    public static final byte[] bravo = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(E3.f.alpha);

    @Override // E3.f
    public final void alpha(MessageDigest messageDigest) {
        messageDigest.update(bravo);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    @Override // com.bumptech.glide.load.resource.bitmap.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap charlie(G3.b bVar, Bitmap bitmap, int i4, int i5) {
        Bitmap.Config config;
        Bitmap hotel;
        Bitmap.Config config2;
        Lock lock;
        Bitmap.Config config3;
        Bitmap.Config config4;
        Paint paint = y.alpha;
        int min = Math.min(i4, i5);
        float f5 = min;
        float f10 = f5 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f5 / width, f5 / height);
        float f11 = width * max;
        float f12 = max * height;
        float f13 = (f5 - f11) / 2.0f;
        float f14 = (f5 - f12) / 2.0f;
        RectF rectF = new RectF(f13, f14, f11 + f13, f12 + f14);
        int i10 = Build.VERSION.SDK_INT;
        try {
            if (i10 >= 26) {
                config4 = Bitmap.Config.RGBA_F16;
                if (config4.equals(bitmap.getConfig())) {
                    config = Bitmap.Config.RGBA_F16;
                    if (!config.equals(bitmap.getConfig())) {
                        hotel = bitmap;
                    } else {
                        hotel = bVar.hotel(bitmap.getWidth(), bitmap.getHeight(), config);
                        new Canvas(hotel).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                    if (i10 >= 26) {
                        config3 = Bitmap.Config.RGBA_F16;
                        if (config3.equals(bitmap.getConfig())) {
                            config2 = Bitmap.Config.RGBA_F16;
                            Bitmap hotel2 = bVar.hotel(min, min, config2);
                            hotel2.setHasAlpha(true);
                            lock = y.delta;
                            lock.lock();
                            Canvas canvas = new Canvas(hotel2);
                            canvas.drawCircle(f10, f10, f10, y.bravo);
                            canvas.drawBitmap(hotel, (Rect) null, rectF, y.charlie);
                            canvas.setBitmap(null);
                            lock.unlock();
                            if (!hotel.equals(bitmap)) {
                                bVar.delta(hotel);
                            }
                            return hotel2;
                        }
                    }
                    config2 = Bitmap.Config.ARGB_8888;
                    Bitmap hotel22 = bVar.hotel(min, min, config2);
                    hotel22.setHasAlpha(true);
                    lock = y.delta;
                    lock.lock();
                    Canvas canvas2 = new Canvas(hotel22);
                    canvas2.drawCircle(f10, f10, f10, y.bravo);
                    canvas2.drawBitmap(hotel, (Rect) null, rectF, y.charlie);
                    canvas2.setBitmap(null);
                    lock.unlock();
                    if (!hotel.equals(bitmap)) {
                    }
                    return hotel22;
                }
            }
            Canvas canvas22 = new Canvas(hotel22);
            canvas22.drawCircle(f10, f10, f10, y.bravo);
            canvas22.drawBitmap(hotel, (Rect) null, rectF, y.charlie);
            canvas22.setBitmap(null);
            lock.unlock();
            if (!hotel.equals(bitmap)) {
            }
            return hotel22;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
        config = Bitmap.Config.ARGB_8888;
        if (!config.equals(bitmap.getConfig())) {
        }
        if (i10 >= 26) {
        }
        config2 = Bitmap.Config.ARGB_8888;
        Bitmap hotel222 = bVar.hotel(min, min, config2);
        hotel222.setHasAlpha(true);
        lock = y.delta;
        lock.lock();
    }

    @Override // E3.f
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // E3.f
    public final int hashCode() {
        return 1101716364;
    }
}
