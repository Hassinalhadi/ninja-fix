package x2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import b7.C0726h;

/* loaded from: classes3.dex */
public abstract class al {
    public static final ar alpha;
    public static final C0726h bravo;

    /* JADX WARN: Type inference failed for: r0v1, types: [x2.ar, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [x2.ar, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            alpha = new Object();
        } else {
            alpha = new Object();
        }
        bravo = new C0726h(Float.class, "translationAlpha", 12);
        new C0726h(Rect.class, "clipBounds", 13);
    }

    public static void alpha(View view, int i4, int i5, int i10, int i11) {
        alpha.echo(view, i4, i5, i10, i11);
    }

    public static void bravo(View view, int i4) {
        alpha.charlie(view, i4);
    }
}
