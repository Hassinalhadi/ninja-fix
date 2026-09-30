package com.airbnb.lottie.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.airbnb.lottie.L;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.content.TrimPathContent;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes3.dex */
public final class Utils {
    public static final int SECOND_IN_NANOS = 1000000000;
    public static final Matrix IDENTITY_MATRIX = new Matrix();
    private static final ThreadLocal<PathMeasure> threadLocalPathMeasure = new ThreadLocal<PathMeasure>() { // from class: com.airbnb.lottie.utils.Utils.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> threadLocalTempPath = new ThreadLocal<Path>() { // from class: com.airbnb.lottie.utils.Utils.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<Path> threadLocalTempPath2 = new ThreadLocal<Path>() { // from class: com.airbnb.lottie.utils.Utils.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> threadLocalPoints = new ThreadLocal<float[]>() { // from class: com.airbnb.lottie.utils.Utils.4
        @Override // java.lang.ThreadLocal
        public float[] initialValue() {
            return new float[4];
        }
    };
    private static final float INV_SQRT_2 = (float) (Math.sqrt(2.0d) / 2.0d);

    private Utils() {
    }

    public static void applyTrimPathIfNeeded(Path path, TrimPathContent trimPathContent) {
        if (trimPathContent == null || trimPathContent.isHidden()) {
            return;
        }
        applyTrimPathIfNeeded(path, ((FloatKeyframeAnimation) trimPathContent.getStart()).getFloatValue() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.getEnd()).getFloatValue() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.getOffset()).getFloatValue() / 360.0f);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static Path createPath(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != INV_SQRT_2 || pointF4.length() != INV_SQRT_2)) {
            float f5 = pointF.x + pointF3.x;
            float f10 = pointF.y + pointF3.y;
            float f11 = pointF2.x;
            float f12 = f11 + pointF4.x;
            float f13 = pointF2.y;
            path.cubicTo(f5, f10, f12, f13 + pointF4.y, f11, f13);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static float dpScale() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float getAnimationScale(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float getScale(Matrix matrix) {
        float[] fArr = threadLocalPoints.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f5 = INV_SQRT_2;
        fArr[2] = f5;
        fArr[3] = f5;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean hasZeroScaleAxis(Matrix matrix) {
        float[] fArr = threadLocalPoints.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            return false;
        }
        return true;
    }

    public static int hashFor(float f5, float f10, float f11, float f12) {
        int i4 = f5 != INV_SQRT_2 ? (int) (527 * f5) : 17;
        if (f10 != INV_SQRT_2) {
            i4 = (int) (i4 * 31 * f10);
        }
        if (f11 != INV_SQRT_2) {
            i4 = (int) (i4 * 31 * f11);
        }
        return f12 != INV_SQRT_2 ? (int) (i4 * 31 * f12) : i4;
    }

    public static boolean isAtLeastVersion(int i4, int i5, int i10, int i11, int i12, int i13) {
        if (i4 < i11) {
            return false;
        }
        if (i4 > i11) {
            return true;
        }
        if (i5 < i12) {
            return false;
        }
        return i5 > i12 || i10 >= i13;
    }

    public static boolean isNetworkException(Throwable th) {
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            return false;
        }
        return true;
    }

    public static int mixOpacities(int i4, int i5) {
        return (int) ((((i4 / 255.0f) * i5) / 255.0f) * 255.0f);
    }

    public static Bitmap renderPath(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        LPaint lPaint = new LPaint();
        lPaint.setAntiAlias(true);
        lPaint.setColor(-16776961);
        canvas.drawPath(path, lPaint);
        return createBitmap;
    }

    public static Bitmap resizeBitmapIfNeeded(Bitmap bitmap, int i4, int i5) {
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i5, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint) {
        saveLayerCompat(canvas, rectF, paint, 31);
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint, int i4) {
        if (L.isTraceEnabled()) {
            L.beginSection("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (L.isTraceEnabled()) {
            L.endSection("Utils#saveLayer");
        }
    }

    public static void applyTrimPathIfNeeded(Path path, float f5, float f10, float f11) {
        if (L.isTraceEnabled()) {
            L.beginSection("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = threadLocalPathMeasure.get();
        Path path2 = threadLocalTempPath.get();
        Path path3 = threadLocalTempPath2.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f5 == 1.0f && f10 == INV_SQRT_2) {
            if (L.isTraceEnabled()) {
                L.endSection("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length >= 1.0f && Math.abs((f10 - f5) - 1.0f) >= 0.01d) {
            float f12 = f5 * length;
            float f13 = f10 * length;
            float f14 = f11 * length;
            float min = Math.min(f12, f13) + f14;
            float max = Math.max(f12, f13) + f14;
            if (min >= length && max >= length) {
                min = MiscUtils.floorMod(min, length);
                max = MiscUtils.floorMod(max, length);
            }
            if (min < INV_SQRT_2) {
                min = MiscUtils.floorMod(min, length);
            }
            if (max < INV_SQRT_2) {
                max = MiscUtils.floorMod(max, length);
            }
            if (min == max) {
                path.reset();
                if (L.isTraceEnabled()) {
                    L.endSection("applyTrimPathIfNeeded");
                    return;
                }
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(INV_SQRT_2, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < INV_SQRT_2) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            if (L.isTraceEnabled()) {
                L.endSection("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (L.isTraceEnabled()) {
            L.endSection("applyTrimPathIfNeeded");
        }
    }
}
