package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public final class o {
    public static final E3.h foxtrot = E3.h.alpha(E3.b.red, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final E3.h golf = new E3.h("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, E3.h.echo);
    public static final E3.h hotel;
    public static final E3.h india;
    public static final Set juliet;
    public static final U8.a kilo;
    public static final ArrayDeque lima;
    public final G3.b alpha;
    public final DisplayMetrics bravo;
    public final G3.g charlie;
    public final ArrayList delta;
    public final u echo = u.alpha();

    static {
        m mVar = m.bravo;
        Boolean bool = Boolean.FALSE;
        hotel = E3.h.alpha(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        india = E3.h.alpha(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        juliet = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        kilo = new U8.a(19);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = Y3.l.alpha;
        lima = new ArrayDeque(0);
    }

    public o(ArrayList arrayList, DisplayMetrics displayMetrics, G3.b bVar, G3.g gVar) {
        this.delta = arrayList;
        Y3.f.charlie(displayMetrics, "Argument must not be null");
        this.bravo = displayMetrics;
        Y3.f.charlie(bVar, "Argument must not be null");
        this.alpha = bVar;
        Y3.f.charlie(gVar, "Argument must not be null");
        this.charlie = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap charlie(v vVar, BitmapFactory.Options options, n nVar, G3.b bVar) {
        if (!options.inJustDecodeBounds) {
            nVar.bravo();
            vVar.golf();
        }
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = y.delta;
        lock.lock();
        try {
            try {
                Bitmap echo = vVar.echo(options);
                lock.unlock();
                return echo;
            } catch (IllegalArgumentException e) {
                StringBuilder hotel2 = av.q.hotel(i4, i5, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                hotel2.append(str);
                hotel2.append(", inBitmap: ");
                hotel2.append(delta(options.inBitmap));
                IOException iOException = new IOException(hotel2.toString(), e);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        bVar.delta(bitmap);
                        options.inBitmap = null;
                        Bitmap charlie = charlie(vVar, options, nVar, bVar);
                        y.delta.unlock();
                        return charlie;
                    } catch (IOException unused) {
                        throw iOException;
                    }
                }
                throw iOException;
            }
        } catch (Throwable th) {
            y.delta.unlock();
            throw th;
        }
    }

    public static String delta(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return Constants.AES_PREFIX + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void echo(BitmapFactory.Options options) {
        foxtrot(options);
        ArrayDeque arrayDeque = lima;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void foxtrot(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c alpha(v vVar, int i4, int i5, E3.i iVar, n nVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z2;
        byte[] bArr = (byte[]) this.charlie.echo(65536, byte[].class);
        synchronized (o.class) {
            ArrayDeque arrayDeque = lima;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                foxtrot(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        E3.b bVar = (E3.b) iVar.charlie(foxtrot);
        E3.j jVar = (E3.j) iVar.charlie(golf);
        m mVar = (m) iVar.charlie(m.golf);
        boolean booleanValue = ((Boolean) iVar.charlie(hotel)).booleanValue();
        E3.h hVar = india;
        if (iVar.charlie(hVar) != null && ((Boolean) iVar.charlie(hVar)).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return c.charlie(this.alpha, bravo(vVar, options2, mVar, bVar, jVar, z2, i4, i5, booleanValue, nVar));
        } finally {
            echo(options2);
            this.charlie.juliet(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0430  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap bravo(v vVar, BitmapFactory.Options options, m mVar, E3.b bVar, E3.j jVar, boolean z2, int i4, int i5, boolean z10, n nVar) {
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        G3.b bVar2;
        int i16;
        int i17;
        boolean z13;
        Bitmap.Config config;
        boolean z14;
        boolean z15;
        float f5;
        G3.b bVar3;
        String str2;
        int round;
        int i18;
        G3.b bVar4;
        Bitmap charlie;
        Bitmap.Config config2;
        ColorSpace colorSpace;
        boolean z16;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        Bitmap.Config config3;
        Bitmap.Config config4;
        Bitmap.Config config5;
        String str3;
        String str4;
        int i19;
        int i20;
        int min;
        int i21;
        int i22;
        int floor;
        double floor2;
        int i23;
        double bravo;
        double d4;
        double d9;
        int i24;
        ColorSpace.Named unused;
        int i25 = Y3.h.bravo;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        G3.b bVar5 = this.alpha;
        charlie(vVar, options, nVar, bVar5);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i26 = iArr[0];
        int i27 = iArr[1];
        String str5 = options.outMimeType;
        if (i26 != -1 && i27 != -1) {
            z11 = z2;
        } else {
            z11 = false;
        }
        int charlie2 = vVar.charlie();
        switch (charlie2) {
            case 3:
            case 4:
                i10 = 180;
                break;
            case 5:
            case 6:
                i10 = 90;
                break;
            case 7:
            case 8:
                i10 = 270;
                break;
            default:
                i10 = 0;
                break;
        }
        switch (charlie2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z12 = true;
                break;
            default:
                z12 = false;
                break;
        }
        if (i4 == Integer.MIN_VALUE) {
            if (i10 != 90) {
                i11 = 270;
                if (i10 != 270) {
                    i12 = i26;
                }
            } else {
                i11 = 270;
            }
            i12 = i27;
        } else {
            i11 = 270;
            i12 = i4;
        }
        if (i5 == Integer.MIN_VALUE) {
            if (i10 != 90 && i10 != i11) {
                i13 = i27;
            } else {
                i13 = i26;
            }
        } else {
            i13 = i5;
        }
        ImageHeaderParser$ImageType india2 = vVar.india();
        String str6 = ", target density: ";
        boolean z17 = z11;
        if (i26 <= 0 || i27 <= 0) {
            i14 = i26;
            i15 = i12;
            str = ", density: ";
            bVar2 = bVar5;
            i16 = i27;
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + india2 + " with target [" + i15 + "x" + i13 + Constants.AES_SUFFIX);
            }
        } else {
            if (i10 == 90 || i10 == 270) {
                str3 = ", density: ";
                str4 = Constants.AES_SUFFIX;
                i19 = i27;
                i20 = i26;
            } else {
                str3 = ", density: ";
                str4 = Constants.AES_SUFFIX;
                i20 = i27;
                i19 = i26;
            }
            i15 = i12;
            float bravo2 = mVar.bravo(i19, i20, i15, i13);
            if (bravo2 > 0.0f) {
                int alpha = mVar.alpha(i19, i20, i15, i13);
                if (alpha != 0) {
                    int i28 = i10;
                    float f10 = i19;
                    int i29 = i19;
                    float f11 = i20;
                    int i30 = i29 / ((int) ((bravo2 * f10) + 0.5d));
                    int i31 = i20 / ((int) ((bravo2 * f11) + 0.5d));
                    if (alpha == 1) {
                        min = Math.max(i30, i31);
                    } else {
                        min = Math.min(i30, i31);
                    }
                    int i32 = Build.VERSION.SDK_INT;
                    if (i32 <= 23) {
                        i21 = i20;
                        if (juliet.contains(options.outMimeType)) {
                            i22 = 1;
                            options.inSampleSize = i22;
                            if (india2 != ImageHeaderParser$ImageType.JPEG) {
                                float min2 = Math.min(i22, 8);
                                floor = (int) Math.ceil(f10 / min2);
                                i23 = (int) Math.ceil(f11 / min2);
                                int i33 = i22 / 8;
                                if (i33 > 0) {
                                    floor /= i33;
                                    i23 /= i33;
                                }
                            } else {
                                if (india2 != ImageHeaderParser$ImageType.PNG && india2 != ImageHeaderParser$ImageType.PNG_A) {
                                    if (india2.isWebp()) {
                                        if (i32 >= 24) {
                                            float f12 = i22;
                                            floor = Math.round(f10 / f12);
                                            i23 = Math.round(f11 / f12);
                                        } else {
                                            float f13 = i22;
                                            floor = (int) Math.floor(f10 / f13);
                                            floor2 = Math.floor(f11 / f13);
                                        }
                                    } else if (i29 % i22 == 0 && i21 % i22 == 0) {
                                        floor = i29 / i22;
                                        i23 = i21 / i22;
                                    } else {
                                        options.inJustDecodeBounds = true;
                                        charlie(vVar, options, nVar, bVar5);
                                        options.inJustDecodeBounds = false;
                                        int[] iArr2 = {options.outWidth, options.outHeight};
                                        int i34 = iArr2[0];
                                        i23 = iArr2[1];
                                        floor = i34;
                                    }
                                } else {
                                    float f14 = i22;
                                    floor = (int) Math.floor(f10 / f14);
                                    floor2 = Math.floor(f11 / f14);
                                }
                                i23 = (int) floor2;
                            }
                            bravo = mVar.bravo(floor, i23, i15, i13);
                            if (bravo > 1.0d) {
                                d4 = bravo;
                            } else {
                                d4 = 1.0d / bravo;
                            }
                            bVar2 = bVar5;
                            options.inTargetDensity = (int) (((bravo / (r11 / r13)) * ((int) ((((int) Math.round(d4 * 2.147483647E9d)) * bravo) + 0.5d))) + 0.5d);
                            if (bravo > 1.0d) {
                                d9 = bravo;
                            } else {
                                d9 = 1.0d / bravo;
                            }
                            int round2 = (int) Math.round(d9 * 2.147483647E9d);
                            options.inDensity = round2;
                            i24 = options.inTargetDensity;
                            if (i24 <= 0 && round2 > 0 && i24 != round2) {
                                options.inScaled = true;
                            } else {
                                options.inTargetDensity = 0;
                                options.inDensity = 0;
                            }
                            if (!Log.isLoggable("Downsampler", 2)) {
                                i14 = i26;
                                i16 = i27;
                                StringBuilder hotel2 = av.q.hotel(i14, i16, "Calculate scaling, source: [", "x", "], degreesToRotate: ");
                                hotel2.append(i28);
                                hotel2.append(", target: [");
                                hotel2.append(i15);
                                hotel2.append("x");
                                hotel2.append(i13);
                                hotel2.append("], power of two scaled: [");
                                hotel2.append(floor);
                                hotel2.append("x");
                                hotel2.append(i23);
                                hotel2.append("], exact scale factor: ");
                                hotel2.append(bravo2);
                                hotel2.append(", power of 2 sample size: ");
                                hotel2.append(i22);
                                hotel2.append(", adjusted scale factor: ");
                                hotel2.append(bravo);
                                str6 = ", target density: ";
                                hotel2.append(str6);
                                hotel2.append(options.inTargetDensity);
                                str = str3;
                                hotel2.append(str);
                                hotel2.append(options.inDensity);
                                Log.v("Downsampler", hotel2.toString());
                            } else {
                                str = str3;
                                str6 = ", target density: ";
                                i14 = i26;
                                i16 = i27;
                            }
                        }
                    } else {
                        i21 = i20;
                    }
                    int max = Math.max(1, Integer.highestOneBit(min));
                    if (alpha == 1 && max < 1.0f / bravo2) {
                        max <<= 1;
                    }
                    i22 = max;
                    options.inSampleSize = i22;
                    if (india2 != ImageHeaderParser$ImageType.JPEG) {
                    }
                    bravo = mVar.bravo(floor, i23, i15, i13);
                    if (bravo > 1.0d) {
                    }
                    bVar2 = bVar5;
                    options.inTargetDensity = (int) (((bravo / (r11 / r13)) * ((int) ((((int) Math.round(d4 * 2.147483647E9d)) * bravo) + 0.5d))) + 0.5d);
                    if (bravo > 1.0d) {
                    }
                    int round22 = (int) Math.round(d9 * 2.147483647E9d);
                    options.inDensity = round22;
                    i24 = options.inTargetDensity;
                    if (i24 <= 0) {
                    }
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                    if (!Log.isLoggable("Downsampler", 2)) {
                    }
                } else {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
            } else {
                throw new IllegalArgumentException("Cannot scale with factor: " + bravo2 + " from: " + mVar + ", source: [" + i26 + "x" + i27 + "], target: [" + i15 + "x" + i13 + str4);
            }
        }
        boolean charlie3 = this.echo.charlie(i15, i13, z17, z12);
        if (charlie3) {
            config5 = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config5;
            options.inMutable = false;
        }
        if (charlie3) {
            i17 = i15;
            z14 = true;
        } else if (bVar != E3.b.alpha) {
            try {
                z13 = vVar.india().hasAlpha();
                i17 = i15;
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    i17 = i15;
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e);
                } else {
                    i17 = i15;
                }
                z13 = false;
            }
            if (z13) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options.inPreferredConfig = config;
            z14 = true;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        } else {
            i17 = i15;
            z14 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        int i35 = Build.VERSION.SDK_INT;
        if (i14 >= 0 && i16 >= 0 && z10) {
            bVar3 = bVar2;
            str2 = str6;
            round = i17;
        } else {
            int i36 = options.inTargetDensity;
            if (i36 > 0 && (i18 = options.inDensity) > 0 && i36 != i18) {
                z15 = z14;
            } else {
                z15 = false;
            }
            if (z15) {
                f5 = i36 / options.inDensity;
            } else {
                f5 = 1.0f;
            }
            int i37 = options.inSampleSize;
            float f15 = i37;
            int ceil = (int) Math.ceil(i14 / f15);
            bVar3 = bVar2;
            str2 = str6;
            int ceil2 = (int) Math.ceil(i16 / f15);
            round = Math.round(ceil * f5);
            int round3 = Math.round(ceil2 * f5);
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder hotel3 = av.q.hotel(round, round3, "Calculated target [", "x", "] for source [");
                hotel3.append(i14);
                hotel3.append("x");
                hotel3.append(i16);
                hotel3.append("], sampleSize: ");
                hotel3.append(i37);
                hotel3.append(", targetDensity: ");
                hotel3.append(options.inTargetDensity);
                hotel3.append(str);
                hotel3.append(options.inDensity);
                hotel3.append(", density multiplier: ");
                hotel3.append(f5);
                Log.v("Downsampler", hotel3.toString());
            }
            i13 = round3;
        }
        Bitmap bitmap = null;
        if (round > 0 && i13 > 0) {
            if (i35 >= 26) {
                Bitmap.Config config6 = options.inPreferredConfig;
                config4 = Bitmap.Config.HARDWARE;
                if (config6 != config4) {
                    config3 = options.outConfig;
                }
            } else {
                config3 = null;
            }
            if (config3 == null) {
                config3 = options.inPreferredConfig;
            }
            bVar4 = bVar3;
            options.inBitmap = bVar4.bravo(round, i13, config3);
            if (jVar != null) {
                if (i35 >= 28) {
                    if (jVar == E3.j.alpha) {
                        colorSpace3 = options.outColorSpace;
                        if (colorSpace3 != null) {
                            colorSpace4 = options.outColorSpace;
                            isWideGamut = colorSpace4.isWideGamut();
                            if (isWideGamut) {
                                z16 = true;
                                colorSpace2 = ColorSpace.get(!z16 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                                options.inPreferredColorSpace = colorSpace2;
                            }
                        }
                    }
                    z16 = false;
                    colorSpace2 = ColorSpace.get(!z16 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                    options.inPreferredColorSpace = colorSpace2;
                } else if (i35 >= 26) {
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    options.inPreferredColorSpace = colorSpace;
                }
            }
            charlie = charlie(vVar, options, nVar, bVar4);
            nVar.delta(bVar4, charlie);
            if (Log.isLoggable("Downsampler", 2)) {
                Log.v("Downsampler", "Decoded " + delta(charlie) + " from [" + i14 + "x" + i16 + "] " + str5 + " with inBitmap " + delta(options.inBitmap) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + str + options.inDensity + str2 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + Y3.h.alpha(elapsedRealtimeNanos));
            }
            if (charlie != null) {
                charlie.setDensity(this.bravo.densityDpi);
                switch (charlie2) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix = new Matrix();
                        switch (charlie2) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, charlie.getWidth(), charlie.getHeight());
                        matrix.mapRect(rectF);
                        int round4 = Math.round(rectF.width());
                        int round5 = Math.round(rectF.height());
                        if (charlie.getConfig() != null) {
                            config2 = charlie.getConfig();
                        } else {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        Bitmap hotel4 = bVar4.hotel(round4, round5, config2);
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        hotel4.setHasAlpha(charlie.hasAlpha());
                        y.alpha(charlie, hotel4, matrix);
                        bitmap = hotel4;
                        break;
                    default:
                        bitmap = charlie;
                        break;
                }
                if (!charlie.equals(bitmap)) {
                    bVar4.delta(charlie);
                }
            }
            return bitmap;
        }
        bVar4 = bVar3;
        if (jVar != null) {
        }
        charlie = charlie(vVar, options, nVar, bVar4);
        nVar.delta(bVar4, charlie);
        if (Log.isLoggable("Downsampler", 2)) {
        }
        if (charlie != null) {
        }
        return bitmap;
    }
}
