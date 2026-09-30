package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public abstract class ImageProcessingUtil {
    public static int alpha;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void alpha(ar arVar) {
        if (!delta(arVar)) {
            AbstractC3066u3.charlie("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int bravo = arVar.bravo();
        int alpha2 = arVar.alpha();
        int d4 = arVar.lima()[0].d();
        int d9 = arVar.lima()[1].d();
        int d10 = arVar.lima()[2].d();
        int c3 = arVar.lima()[0].c();
        int c4 = arVar.lima()[1].c();
        if (nativeShiftPixel(arVar.lima()[0].a(), d4, arVar.lima()[1].a(), d9, arVar.lima()[2].a(), d10, c3, c4, bravo, alpha2, c3, c4, c4) != 0) {
            AbstractC3066u3.charlie("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static aj bravo(ar arVar, androidx.camera.core.impl.ar arVar2, ByteBuffer byteBuffer, int i4, boolean z2) {
        int i5;
        int i10;
        int i11;
        if (!delta(arVar)) {
            AbstractC3066u3.charlie("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i4 != 0 && i4 != 90 && i4 != 180 && i4 != 270) {
            AbstractC3066u3.charlie("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface romeo = arVar2.romeo();
        int bravo = arVar.bravo();
        int alpha2 = arVar.alpha();
        int d4 = arVar.lima()[0].d();
        int d9 = arVar.lima()[1].d();
        int d10 = arVar.lima()[2].d();
        int c3 = arVar.lima()[0].c();
        int c4 = arVar.lima()[1].c();
        if (z2) {
            i5 = c3;
        } else {
            i5 = 0;
        }
        if (z2) {
            i10 = c4;
        } else {
            i10 = 0;
        }
        if (z2) {
            i11 = c4;
        } else {
            i11 = 0;
        }
        if (nativeConvertAndroid420ToABGR(arVar.lima()[0].a(), d4, arVar.lima()[1].a(), d9, arVar.lima()[2].a(), d10, c3, c4, romeo, byteBuffer, bravo, alpha2, i5, i10, i11, i4) != 0) {
            AbstractC3066u3.charlie("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            AbstractC3066u3.bravo("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + alpha);
            alpha = alpha + 1;
        }
        ar foxtrot = arVar2.foxtrot();
        if (foxtrot == null) {
            AbstractC3066u3.charlie("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        aj ajVar = new aj(foxtrot);
        ajVar.charlie(new aq(foxtrot, arVar, 0));
        return ajVar;
    }

    public static void charlie(Bitmap bitmap, ByteBuffer byteBuffer, int i4) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i4, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean delta(ar arVar) {
        if (arVar.getFormat() == 35 && arVar.lima().length == 3) {
            return true;
        }
        return false;
    }

    public static aj echo(ar arVar, androidx.camera.core.impl.ar arVar2, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i4) {
        String str;
        if (!delta(arVar)) {
            AbstractC3066u3.charlie("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (i4 != 0 && i4 != 90 && i4 != 180 && i4 != 270) {
            AbstractC3066u3.charlie("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i4 > 0) {
            int bravo = arVar.bravo();
            int alpha2 = arVar.alpha();
            int d4 = arVar.lima()[0].d();
            int d9 = arVar.lima()[1].d();
            int d10 = arVar.lima()[2].d();
            int c3 = arVar.lima()[1].c();
            Image dequeueInputImage = imageWriter.dequeueInputImage();
            if (dequeueInputImage != null) {
                if (nativeRotateYUV(arVar.lima()[0].a(), d4, arVar.lima()[1].a(), d9, arVar.lima()[2].a(), d10, c3, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), dequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, bravo, alpha2, i4) != 0) {
                    str = "ImageProcessingUtil";
                    AbstractC3066u3.charlie(str, "rotate YUV failure");
                    return null;
                }
                imageWriter.queueInputImage(dequeueInputImage);
                ar foxtrot = arVar2.foxtrot();
                if (foxtrot == null) {
                    AbstractC3066u3.charlie("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                    return null;
                }
                aj ajVar = new aj(foxtrot);
                ajVar.charlie(new aq(foxtrot, arVar, 1));
                return ajVar;
            }
        }
        str = "ImageProcessingUtil";
        AbstractC3066u3.charlie(str, "rotate YUV failure");
        return null;
    }

    public static void foxtrot(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            AbstractC3066u3.charlie("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i10, int i11, int i12, Surface surface, ByteBuffer byteBuffer4, int i13, int i14, int i15, int i16, int i17, int i18);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i4, int i5, int i10, int i11, boolean z2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i10, int i11, ByteBuffer byteBuffer4, int i12, int i13, ByteBuffer byteBuffer5, int i14, int i15, ByteBuffer byteBuffer6, int i16, int i17, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i18, int i19, int i20);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i4, ByteBuffer byteBuffer2, int i5, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
