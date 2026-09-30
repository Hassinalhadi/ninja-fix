package ja.burhanrashid52.photoeditor;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lja/burhanrashid52/photoeditor/BitmapUtil;", "", "()V", "createBitmapFromGLSurface", "Landroid/graphics/Bitmap;", "glSurfaceView", "Landroid/opengl/GLSurfaceView;", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "removeTransparency", "source", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BitmapUtil {

    @NotNull
    public static final BitmapUtil INSTANCE = new BitmapUtil();

    private BitmapUtil() {
    }

    @NotNull
    public final Bitmap createBitmapFromGLSurface(@NotNull GLSurfaceView glSurfaceView, @NotNull GL10 gl) throws OutOfMemoryError {
        Intrinsics.echo(glSurfaceView, "glSurfaceView");
        Intrinsics.echo(gl, "gl");
        int width = glSurfaceView.getWidth();
        int height = glSurfaceView.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        gl.glReadPixels(0, 0, width, height, 6408, 5121, wrap);
        for (int i5 = 0; i5 < height; i5++) {
            int i10 = i5 * width;
            int i11 = ((height - i5) - 1) * width;
            for (int i12 = 0; i12 < width; i12++) {
                int i13 = iArr[i10 + i12];
                iArr2[i11 + i12] = (i13 & (-16711936)) | ((i13 << 16) & 16711680) | ((i13 >> 16) & 255);
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr2, width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.delta(createBitmap, "createBitmap(bitmapSourc… Bitmap.Config.ARGB_8888)");
        return createBitmap;
    }

    @NotNull
    public final Bitmap removeTransparency(@NotNull Bitmap source) {
        Intrinsics.echo(source, "source");
        int width = source.getWidth();
        int height = source.getHeight();
        int[] iArr = new int[source.getHeight() * source.getWidth()];
        source.getPixels(iArr, 0, source.getWidth(), 0, 0, source.getWidth(), source.getHeight());
        int width2 = source.getWidth();
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i5 < width2) {
                int height2 = source.getHeight();
                for (int i10 = 0; i10 < height2; i10++) {
                    if (iArr[(source.getWidth() * i10) + i5] != 0) {
                        break loop0;
                    }
                }
                i5++;
            } else {
                i5 = 0;
                break;
            }
        }
        int height3 = source.getHeight();
        int i11 = 0;
        loop2: while (true) {
            if (i11 >= height3) {
                break;
            }
            int width3 = source.getWidth();
            for (int i12 = i5; i12 < width3; i12++) {
                if (iArr[(source.getWidth() * i11) + i12] != 0) {
                    i4 = i11;
                    break loop2;
                }
            }
            i11++;
        }
        int width4 = source.getWidth() - 1;
        if (i5 <= width4) {
            loop4: while (true) {
                int height4 = source.getHeight() - 1;
                if (i4 <= height4) {
                    while (iArr[(source.getWidth() * height4) + width4] == 0) {
                        if (height4 != i4) {
                            height4--;
                        }
                    }
                    width = width4;
                    break loop4;
                }
                if (width4 == i5) {
                    break;
                }
                width4--;
            }
        }
        int height5 = source.getHeight() - 1;
        if (i4 <= height5) {
            loop6: while (true) {
                int width5 = source.getWidth() - 1;
                if (i5 <= width5) {
                    while (iArr[(source.getWidth() * height5) + width5] == 0) {
                        if (width5 != i5) {
                            width5--;
                        }
                    }
                    height = height5;
                    break loop6;
                }
                if (height5 == i4) {
                    break;
                }
                height5--;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(source, i5, i4, width - i5, height - i4);
        Intrinsics.delta(createBitmap, "createBitmap(source, fir…- firstX, lastY - firstY)");
        return createBitmap;
    }
}
