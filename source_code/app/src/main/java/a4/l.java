package a4;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.util.Pair;
import com.canhub.cropper.CropException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2716m6;

/* loaded from: classes3.dex */
public abstract class l {
    public static final Rect alpha = new Rect();
    public static final RectF bravo = new RectF();
    public static final RectF charlie = new RectF();
    public static final float[] delta = new float[6];
    public static final float[] echo = new float[6];
    public static int foxtrot;
    public static Pair golf;

    public static int alpha(int i4, int i5) {
        int i10 = 1;
        if (foxtrot == 0) {
            int i11 = 2048;
            try {
                EGL egl = EGLContext.getEGL();
                Intrinsics.charlie(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
                EGL10 egl10 = (EGL10) egl;
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
                int i12 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i12];
                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i12, iArr);
                int[] iArr2 = new int[1];
                int i13 = iArr[0];
                int i14 = 0;
                for (int i15 = 0; i15 < i13; i15++) {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i15], 12332, iArr2);
                    int i16 = iArr2[0];
                    if (i14 < i16) {
                        i14 = i16;
                    }
                }
                egl10.eglTerminate(eglGetDisplay);
                i11 = Math.max(i14, 2048);
            } catch (Exception unused) {
            }
            foxtrot = i11;
        }
        if (foxtrot > 0) {
            while (true) {
                int i17 = i5 / i10;
                int i18 = foxtrot;
                if (i17 <= i18 && i4 / i10 <= i18) {
                    break;
                }
                i10 *= 2;
            }
        }
        return i10;
    }

    public static int bravo(int i4, int i5, int i10, int i11) {
        int i12 = 1;
        if (i5 <= i11 && i4 <= i10) {
            return 1;
        }
        while ((i5 / 2) / i12 > i11 && (i4 / 2) / i12 > i10) {
            i12 *= 2;
        }
        return i12;
    }

    public static Fe.c charlie(Context context, Uri uri, float[] fArr, int i4, int i5, int i10, boolean z2, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        float[] cropPoints = fArr;
        Intrinsics.echo(cropPoints, "cropPoints");
        int i15 = 1;
        while (true) {
            try {
                Intrinsics.checkNotNull(uri);
                return delta(context, uri, cropPoints, i4, i5, i10, z2, i11, i12, i13, i14, z10, z11, i15);
            } catch (OutOfMemoryError e) {
                i15 *= 2;
                if (i15 <= 16) {
                    cropPoints = fArr;
                } else {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i15 + "): " + uri + "\r\n" + e.getMessage(), e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Fe.c delta(Context context, Uri uri, float[] fArr, int i4, int i5, int i10, boolean z2, int i11, int i12, int i13, int i14, boolean z10, boolean z11, int i15) {
        int width;
        int height;
        Uri uri2;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i16;
        Bitmap bitmap3;
        float[] fArr2;
        Bitmap bitmap4;
        int i17;
        Rect oscar = oscar(fArr, i5, i10, z2, i11, i12);
        if (i13 > 0) {
            width = i13;
        } else {
            width = oscar.width();
        }
        if (i14 > 0) {
            height = i14;
        } else {
            height = oscar.height();
        }
        int i18 = 1;
        Bitmap bitmap5 = null;
        try {
            Fe.c juliet = juliet(context, uri, oscar, width, height, i15);
            uri2 = uri;
            try {
                bitmap = (Bitmap) juliet.red;
            } catch (Exception unused) {
                bitmap = null;
                bitmap2 = bitmap;
                i16 = 1;
                if (bitmap2 != null) {
                }
            }
            try {
                bitmap2 = bitmap;
                i16 = juliet.purple;
            } catch (Exception unused2) {
                bitmap2 = bitmap;
                i16 = 1;
                if (bitmap2 != null) {
                }
            }
        } catch (Exception unused3) {
            uri2 = uri;
        }
        if (bitmap2 != null) {
            if (i4 > 0 || z10 || z11) {
                try {
                    Matrix matrix = new Matrix();
                    matrix.setRotate(i4);
                    if (z10) {
                        i17 = -1;
                    } else {
                        i17 = 1;
                    }
                    float f5 = i17;
                    if (z11) {
                        i18 = -1;
                    }
                    matrix.postScale(f5, i18);
                    bitmap4 = bitmap2;
                    try {
                        bitmap2 = Bitmap.createBitmap(bitmap4, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, false);
                        if (!Intrinsics.areEqual(bitmap2, bitmap4)) {
                            bitmap4.recycle();
                        }
                        Intrinsics.delta(bitmap2, "{\n      val matrix = Mat…  }\n      newBitmap\n    }");
                    } catch (OutOfMemoryError e) {
                        e = e;
                        bitmap2 = bitmap4;
                        bitmap2.recycle();
                        throw e;
                    }
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    bitmap4 = bitmap2;
                }
            }
            try {
                if (i4 % 90 != 0) {
                    bitmap2 = golf(bitmap2, fArr, oscar, i4, z2, i11, i12);
                }
                return new Fe.c(bitmap2, i16, 8);
            } catch (OutOfMemoryError e5) {
                e = e5;
                bitmap2.recycle();
                throw e;
            }
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int bravo2 = bravo(oscar.width(), oscar.height(), width, height) * i15;
            options.inSampleSize = bravo2;
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.delta(contentResolver, "context.contentResolver");
            Bitmap hotel = hotel(contentResolver, uri2, options);
            if (hotel != null) {
                try {
                    int length = fArr.length;
                    fArr2 = new float[length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    for (int i19 = 0; i19 < length; i19++) {
                        fArr2[i19] = fArr2[i19] / options.inSampleSize;
                    }
                    bitmap3 = hotel;
                } catch (Throwable th) {
                    th = th;
                    bitmap3 = hotel;
                }
                try {
                    bitmap5 = foxtrot(bitmap3, fArr2, i4, z2, i11, i12, 1.0f, z10, z11);
                    if (!Intrinsics.areEqual(bitmap5, bitmap3)) {
                        bitmap3.recycle();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (!Intrinsics.areEqual(null, bitmap3)) {
                        bitmap3.recycle();
                    }
                    throw th;
                }
            }
            return new Fe.c(bitmap5, bravo2, 8);
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri2, e10.getMessage());
        } catch (OutOfMemoryError e11) {
            if (0 != 0) {
                bitmap5.recycle();
            }
            throw e11;
        }
    }

    public static Fe.c echo(Bitmap bitmap, float[] cropPoints, int i4, boolean z2, int i5, int i10, boolean z10, boolean z11) {
        Intrinsics.echo(cropPoints, "cropPoints");
        int i11 = 1;
        do {
            try {
                Intrinsics.checkNotNull(bitmap);
                return new Fe.c(foxtrot(bitmap, cropPoints, i4, z2, i5, i10, 1 / i11, z10, z11), i11, 8);
            } catch (OutOfMemoryError e) {
                i11 *= 2;
            }
        } while (i11 <= 8);
        throw e;
    }

    public static Bitmap foxtrot(Bitmap bitmap, float[] fArr, int i4, boolean z2, int i5, int i10, float f5, boolean z10, boolean z11) {
        float f10;
        float f11;
        Rect oscar = oscar(fArr, bitmap.getWidth(), bitmap.getHeight(), z2, i5, i10);
        Matrix matrix = new Matrix();
        matrix.setRotate(i4, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        if (z10) {
            f10 = -f5;
        } else {
            f10 = f5;
        }
        if (z11) {
            f11 = -f5;
        } else {
            f11 = f5;
        }
        matrix.postScale(f10, f11);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, oscar.left, oscar.top, oscar.width(), oscar.height(), matrix, true);
        if (Intrinsics.areEqual(createBitmap, bitmap)) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        Bitmap bitmap2 = createBitmap;
        if (i4 % 90 != 0) {
            return golf(bitmap2, fArr, oscar, i4, z2, i5, i10);
        }
        return bitmap2;
    }

    public static Bitmap golf(Bitmap bitmap, float[] fArr, Rect rect, int i4, boolean z2, int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i4 % 90 != 0) {
            double radians = Math.toRadians(i4);
            if (i4 >= 90 && (181 > i4 || i4 >= 270)) {
                i11 = rect.right;
            } else {
                i11 = rect.left;
            }
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i16 < fArr.length) {
                    float f5 = fArr[i16];
                    if (f5 >= i11 - 1 && f5 <= i11 + 1) {
                        int i17 = i16 + 1;
                        i15 = (int) Math.abs(Math.sin(radians) * (rect.bottom - fArr[i17]));
                        i13 = (int) Math.abs(Math.cos(radians) * (fArr[i17] - rect.top));
                        i14 = (int) Math.abs((fArr[i17] - rect.top) / Math.sin(radians));
                        i12 = (int) Math.abs((rect.bottom - fArr[i17]) / Math.cos(radians));
                        break;
                    }
                    i16 += 2;
                } else {
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    break;
                }
            }
            rect.set(i15, i13, i14 + i15, i12 + i13);
            if (z2) {
                kilo(rect, i5, i10);
            }
            Intrinsics.checkNotNull(bitmap);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
            if (!Intrinsics.areEqual(bitmap, createBitmap) && bitmap != null) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    public static Bitmap hotel(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) {
        do {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            try {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, alpha, options);
                    AbstractC2716m6.alpha(openInputStream, null);
                    return decodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    AbstractC2716m6.alpha(openInputStream, null);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2716m6.alpha(openInputStream, th);
                    throw th2;
                }
            }
        } while (options.inSampleSize <= 512);
        throw new CropException.FailedToDecodeImage(uri);
    }

    public static Fe.c india(Context context, Uri uri, int i4, int i5) {
        try {
            ContentResolver resolver = context.getContentResolver();
            Intrinsics.delta(resolver, "resolver");
            InputStream openInputStream = resolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(openInputStream, alpha, options);
                options.inJustDecodeBounds = false;
                AbstractC2716m6.alpha(openInputStream, null);
                int i10 = options.outWidth;
                if (i10 == -1 && options.outHeight == -1) {
                    throw new RuntimeException("File is not a picture");
                }
                options.inSampleSize = Math.max(bravo(i10, options.outHeight, i4, i5), alpha(options.outWidth, options.outHeight));
                return new Fe.c(hotel(resolver, uri, options), options.inSampleSize, 8);
            } finally {
            }
        } catch (Exception e) {
            throw new CropException.FailedToLoadBitmap(uri, e.getMessage());
        }
    }

    public static Fe.c juliet(Context context, Uri uri, Rect rect, int i4, int i5, int i10) {
        BitmapRegionDecoder newInstance;
        int i11;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i10 * bravo(rect.width(), rect.height(), i4, i5);
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    Intrinsics.checkNotNull(openInputStream);
                    newInstance = BitmapRegionDecoder.newInstance(openInputStream);
                } else {
                    Intrinsics.checkNotNull(openInputStream);
                    newInstance = BitmapRegionDecoder.newInstance(openInputStream, false);
                }
                do {
                    try {
                        try {
                            Intrinsics.checkNotNull(newInstance);
                            Fe.c cVar = new Fe.c(newInstance.decodeRegion(rect, options), options.inSampleSize, 8);
                            newInstance.recycle();
                            AbstractC2716m6.alpha(openInputStream, null);
                            return cVar;
                        } finally {
                            if (newInstance != null) {
                                newInstance.recycle();
                            }
                        }
                    } catch (OutOfMemoryError unused) {
                        i11 = options.inSampleSize * 2;
                        options.inSampleSize = i11;
                    }
                } while (i11 <= 512);
                AbstractC2716m6.alpha(openInputStream, null);
                return new Fe.c((Object) null, 1, 8);
            } finally {
            }
        } catch (Exception e) {
            throw new CropException.FailedToLoadBitmap(uri, e.getMessage());
        }
    }

    public static void kilo(Rect rect, int i4, int i5) {
        if (i4 == i5 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    public static float lima(float[] points) {
        Intrinsics.echo(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    public static float mike(float[] points) {
        Intrinsics.echo(points, "points");
        return (quebec(points) + romeo(points)) / 2.0f;
    }

    public static float november(float[] points) {
        Intrinsics.echo(points, "points");
        return (sierra(points) + lima(points)) / 2.0f;
    }

    public static Rect oscar(float[] cropPoints, int i4, int i5, boolean z2, int i10, int i11) {
        Intrinsics.echo(cropPoints, "cropPoints");
        Rect rect = new Rect(Zd.a.delta(Math.max(0.0f, quebec(cropPoints))), Zd.a.delta(Math.max(0.0f, sierra(cropPoints))), Zd.a.delta(Math.min(i4, romeo(cropPoints))), Zd.a.delta(Math.min(i5, lima(cropPoints))));
        if (z2) {
            kilo(rect, i10, i11);
        }
        return rect;
    }

    public static float papa(float[] points) {
        Intrinsics.echo(points, "points");
        return lima(points) - sierra(points);
    }

    public static float quebec(float[] points) {
        Intrinsics.echo(points, "points");
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    public static float romeo(float[] points) {
        Intrinsics.echo(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    public static float sierra(float[] points) {
        Intrinsics.echo(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    public static float tango(float[] points) {
        Intrinsics.echo(points, "points");
        return romeo(points) - quebec(points);
    }

    public static Bitmap uniform(Bitmap bitmap, int i4, int i5, int i10) {
        Bitmap createScaledBitmap;
        com.google.android.material.datepicker.j.papa(i10, "options");
        if (i4 > 0 && i5 > 0 && (i10 == 4 || i10 == 3 || i10 == 5)) {
            try {
                if (i10 == 5) {
                    Intrinsics.checkNotNull(bitmap);
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i5, false);
                } else {
                    Intrinsics.checkNotNull(bitmap);
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float max = Math.max(width / i4, height / i5);
                    if (max <= 1.0f && i10 != 4) {
                        createScaledBitmap = null;
                    }
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                }
                if (createScaledBitmap != null) {
                    if (!Intrinsics.areEqual(createScaledBitmap, bitmap)) {
                        bitmap.recycle();
                    }
                    return createScaledBitmap;
                }
            } catch (Exception e) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e);
            }
        }
        Intrinsics.checkNotNull(bitmap);
        return bitmap;
    }

    public static Uri victor(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i4, Uri uri) {
        String str;
        Intrinsics.echo(bitmap, "bitmap");
        Intrinsics.echo(compressFormat, "compressFormat");
        if (uri == null) {
            try {
                int i5 = k.$EnumSwitchMapping$0[compressFormat.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        str = ".webp";
                    } else {
                        str = ".png";
                    }
                } else {
                    str = ".jpg";
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        File file = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                        Intrinsics.delta(file, "file");
                        uri = V8.a.bravo(context, file);
                    } catch (Exception e) {
                        Log.e("AIC", String.valueOf(e.getMessage()));
                        File file2 = File.createTempFile("cropped", str, context.getCacheDir());
                        Intrinsics.delta(file2, "file");
                        uri = V8.a.bravo(context, file2);
                    }
                } else {
                    uri = Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
                }
                Intrinsics.delta(uri, "{\n      val ext = when (….cacheDir))\n      }\n    }");
            } catch (IOException e4) {
                throw new RuntimeException("Failed to create temp file for output image", e4);
            }
        }
        OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri, "wt");
        try {
            bitmap.compress(compressFormat, i4, openOutputStream);
            AbstractC2716m6.alpha(openOutputStream, null);
            return uri;
        } finally {
        }
    }
}
