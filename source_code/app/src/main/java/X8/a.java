package X8;

import G6.q;
import O7.l;
import V5.k;
import V5.x;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import ao.d;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.material.internal.ab;
import com.google.mlkit.common.sdkinternal.h;
import com.google.mlkit.common.sdkinternal.p;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import t6.D2;
import t6.E2;
import t6.EnumC3085y2;
import t6.J2;
import t6.h4;
import t6.j4;

/* loaded from: classes2.dex */
public final class a implements h {
    public volatile Bitmap alpha;
    public volatile ByteBuffer bravo;
    public volatile l charlie;
    public final int delta;
    public final int echo;
    public final int foxtrot;
    public final int golf;
    public final Matrix hotel;

    public a(Bitmap bitmap, int i4) {
        x.hotel(bitmap);
        this.alpha = bitmap;
        this.delta = bitmap.getWidth();
        this.echo = bitmap.getHeight();
        bravo(i4);
        this.foxtrot = i4;
        this.golf = -1;
        this.hotel = null;
    }

    public static void bravo(int i4) {
        boolean z2 = true;
        if (i4 != 0 && i4 != 90 && i4 != 180 && i4 != 270) {
            z2 = false;
        }
        x.alpha("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z2);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [U7.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [t6.e4, java.lang.Object] */
    public static a charlie(Image image, int i4, Matrix matrix) {
        boolean z2;
        a aVar;
        int limit;
        h4 echo;
        long j5;
        EnumC3085y2 enumC3085y2;
        String alpha;
        boolean z10;
        Bitmap createBitmap;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        x.india(image, "Please provide a valid image");
        bravo(i4);
        if (image.getFormat() == 256 || image.getFormat() == 35) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.alpha("Only JPEG and YUV_420_888 are supported now", z2);
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            if (image.getFormat() == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            x.alpha("Only JPEG is supported now", z10);
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 != null && planes2.length == 1) {
                ByteBuffer buffer = planes2[0].getBuffer();
                buffer.rewind();
                int remaining = buffer.remaining();
                byte[] bArr = new byte[remaining];
                buffer.get(bArr);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
                int width = decodeByteArray.getWidth();
                int height = decodeByteArray.getHeight();
                if (i4 == 0) {
                    createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height);
                } else {
                    Matrix matrix2 = new Matrix();
                    matrix2.postRotate(i4);
                    createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height, matrix2, true);
                }
                aVar = new a(createBitmap, 0);
            } else {
                throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
            }
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            aVar = new a(image, image.getWidth(), image.getHeight(), i4, matrix);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int format = image.getFormat();
        int height2 = image.getHeight();
        int width2 = image.getWidth();
        synchronized (j4.class) {
            byte b2 = (byte) (((byte) 1) | 2);
            if (b2 == 3) {
                echo = j4.echo(new Object());
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b2 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        J2 j22 = J2.INPUT_IMAGE_CONSTRUCTION;
        echo.getClass();
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = echo.india;
        if (hashMap.get(j22) == null) {
            j5 = elapsedRealtime2;
        } else {
            j5 = elapsedRealtime2;
            if (elapsedRealtime3 - ((Long) hashMap.get(j22)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return aVar;
            }
        }
        hashMap.put(j22, Long.valueOf(elapsedRealtime3));
        ?? obj = new Object();
        if (format != -1) {
            if (format != 35) {
                if (format != 842094169) {
                    if (format != 16) {
                        if (format != 17) {
                            enumC3085y2 = EnumC3085y2.UNKNOWN_FORMAT;
                        } else {
                            enumC3085y2 = EnumC3085y2.NV21;
                        }
                    } else {
                        enumC3085y2 = EnumC3085y2.NV16;
                    }
                } else {
                    enumC3085y2 = EnumC3085y2.YV12;
                }
            } else {
                enumC3085y2 = EnumC3085y2.YUV_420_888;
            }
        } else {
            enumC3085y2 = EnumC3085y2.BITMAP;
        }
        obj.red = enumC3085y2;
        obj.purple = D2.ANDROID_MEDIA_IMAGE;
        obj.silver = Integer.valueOf(limit & LottieConstants.IterateForever);
        obj.white = Integer.valueOf(height2 & LottieConstants.IterateForever);
        obj.teal = Integer.valueOf(width2 & LottieConstants.IterateForever);
        obj.alpha = Long.valueOf(j5 & Long.MAX_VALUE);
        obj.yellow = Integer.valueOf(i4 & LottieConstants.IterateForever);
        E2 e22 = new E2(obj);
        com.bumptech.glide.load.engine.h hVar = new com.bumptech.glide.load.engine.h(12, false);
        hVar.silver = e22;
        ab abVar = new ab(hVar);
        q qVar = echo.echo;
        if (qVar.juliet()) {
            alpha = (String) qVar.hotel();
        } else {
            alpha = k.charlie.alpha(echo.golf);
        }
        p.alpha.execute(new d(echo, abVar, j22, alpha, 12, false));
        return aVar;
    }

    public final Image.Plane[] alpha() {
        if (this.charlie == null) {
            return null;
        }
        return ((Image) this.charlie.purple).getPlanes();
    }

    public a(Image image, int i4, int i5, int i10, Matrix matrix) {
        x.hotel(image);
        this.charlie = new l(16, image);
        this.delta = i4;
        this.echo = i5;
        bravo(i10);
        this.foxtrot = i10;
        this.golf = 35;
        this.hotel = matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(ByteBuffer byteBuffer, int i4, int i5, int i10, int i11) {
        boolean z2;
        if (i11 != 842094169) {
            if (i11 != 17) {
                z2 = false;
                x.bravo(z2);
                x.hotel(byteBuffer);
                this.bravo = byteBuffer;
                x.alpha("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i4 * i5);
                byteBuffer.rewind();
                this.delta = i4;
                this.echo = i5;
                bravo(i10);
                this.foxtrot = i10;
                this.golf = i11;
                this.hotel = null;
            }
            i11 = 17;
        }
        z2 = true;
        x.bravo(z2);
        x.hotel(byteBuffer);
        this.bravo = byteBuffer;
        x.alpha("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i4 * i5);
        byteBuffer.rewind();
        this.delta = i4;
        this.echo = i5;
        bravo(i10);
        this.foxtrot = i10;
        this.golf = i11;
        this.hotel = null;
    }
}
