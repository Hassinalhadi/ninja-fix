package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public abstract class y {
    public static final Paint alpha = new Paint(6);
    public static final Paint bravo = new Paint(7);
    public static final Paint charlie;
    public static final Lock delta;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        if (new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL)) {
            r02 = new ReentrantLock();
        } else {
            r02 = new Object();
        }
        delta = r02;
        Paint paint = new Paint(7);
        charlie = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void alpha(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = delta;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, alpha);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap bravo(G3.b bVar, Bitmap bitmap, int i4, int i5) {
        Bitmap.Config config;
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
                return bitmap;
            }
        } else {
            float min = Math.min(i4 / bitmap.getWidth(), i5 / bitmap.getHeight());
            int round = Math.round(bitmap.getWidth() * min);
            int round2 = Math.round(bitmap.getHeight() * min);
            if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "adjusted target size matches input, returning input");
                }
            } else {
                int width = (int) (bitmap.getWidth() * min);
                int height = (int) (bitmap.getHeight() * min);
                if (bitmap.getConfig() != null) {
                    config = bitmap.getConfig();
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap hotel = bVar.hotel(width, height, config);
                hotel.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i4 + "x" + i5);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + hotel.getWidth() + "x" + hotel.getHeight());
                    StringBuilder sb2 = new StringBuilder("minPct:   ");
                    sb2.append(min);
                    Log.v("TransformationUtils", sb2.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(min, min);
                alpha(bitmap, hotel, matrix);
                return hotel;
            }
        }
        return bitmap;
    }
}
