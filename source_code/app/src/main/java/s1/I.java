package s1;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class I {
    public H alpha;

    public I(int i4, Interpolator interpolator, long j5) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.alpha = new G(E.golf(i4, interpolator, j5));
        } else {
            this.alpha = new H(i4, interpolator, j5);
        }
    }
}
