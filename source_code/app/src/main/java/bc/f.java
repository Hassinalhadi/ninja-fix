package bc;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import ao.ad;
import s6.T7;

/* loaded from: classes3.dex */
public abstract class f {
    public static final RectF alpha = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix alpha(RectF rectF, RectF rectF2, int i4, boolean z2) {
        Matrix matrix = new Matrix();
        RectF rectF3 = alpha;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i4);
        if (z2) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean bravo(int i4) {
        if (i4 != 90 && i4 != 270) {
            if (i4 != 0 && i4 != 180) {
                throw new IllegalArgumentException(ad.zulu(i4, "Invalid rotation degrees: "));
            }
            return false;
        }
        return true;
    }

    public static boolean charlie(Size size, boolean z2, Size size2) {
        float width;
        float width2;
        if (z2) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        float width3 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        if (width >= (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f) && width3 >= width2) {
            return true;
        }
        return false;
    }

    public static Size delta(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size echo(Size size, int i4) {
        boolean z2;
        if (i4 % 90 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.bravo("Invalid rotation degrees: " + i4, z2);
        if (bravo(foxtrot(i4))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public static int foxtrot(int i4) {
        return ((i4 % 360) + 360) % 360;
    }
}
