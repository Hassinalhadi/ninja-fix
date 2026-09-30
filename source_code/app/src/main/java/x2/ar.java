package x2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import t6.AbstractC2992f3;

/* loaded from: classes3.dex */
public class ar extends AbstractC2992f3 {
    public static boolean delta = true;
    public static boolean echo = true;
    public static boolean foxtrot = true;
    public static boolean golf = true;

    @Override // t6.AbstractC2992f3
    public void charlie(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.charlie(view, i4);
        } else if (golf) {
            try {
                aq.alpha(view, i4);
            } catch (NoSuchMethodError unused) {
                golf = false;
            }
        }
    }

    public void echo(View view, int i4, int i5, int i10, int i11) {
        if (foxtrot) {
            try {
                ap.alpha(view, i4, i5, i10, i11);
            } catch (NoSuchMethodError unused) {
                foxtrot = false;
            }
        }
    }

    public void foxtrot(View view, Matrix matrix) {
        if (delta) {
            try {
                ao.bravo(view, matrix);
            } catch (NoSuchMethodError unused) {
                delta = false;
            }
        }
    }

    public void golf(View view, Matrix matrix) {
        if (echo) {
            try {
                ao.charlie(view, matrix);
            } catch (NoSuchMethodError unused) {
                echo = false;
            }
        }
    }
}
