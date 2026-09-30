package s6;

import a0.C0352f;
import android.graphics.Bitmap;
import f0.C1679a;

/* loaded from: classes2.dex */
public abstract class K0 {
    public static final /* synthetic */ int alpha = 0;

    public static C1679a alpha(C0352f c0352f, int i4) {
        Bitmap bitmap = c0352f.alpha;
        C1679a c1679a = new C1679a(c0352f, (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L));
        c1679a.silver = i4;
        return c1679a;
    }
}
