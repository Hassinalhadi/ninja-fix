package r8;

import android.app.Activity;
import android.util.SparseIntArray;
import av.ah;
import com.google.android.gms.measurement.internal.r;
import java.util.HashMap;
import u8.C3146a;
import v8.C3178c;

/* loaded from: classes2.dex */
public final class f {
    public static final C3146a echo = C3146a.delta();
    public final Activity alpha;
    public final ah bravo;
    public final HashMap charlie;
    public boolean delta;

    public f(Activity activity) {
        ah ahVar = new ah(29);
        HashMap hashMap = new HashMap();
        this.delta = false;
        this.alpha = activity;
        this.bravo = ahVar;
        this.charlie = hashMap;
    }

    public final B8.e alpha() {
        boolean z2 = this.delta;
        C3146a c3146a = echo;
        if (!z2) {
            c3146a.alpha("No recording has been started.");
            return new B8.e();
        }
        SparseIntArray[] delta = ((r) this.bravo.purple).delta();
        if (delta == null) {
            c3146a.alpha("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new B8.e();
        }
        SparseIntArray sparseIntArray = delta[0];
        if (sparseIntArray == null) {
            c3146a.alpha("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new B8.e();
        }
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
            int keyAt = sparseIntArray.keyAt(i11);
            int valueAt = sparseIntArray.valueAt(i11);
            i4 += valueAt;
            if (keyAt > 700) {
                i10 += valueAt;
            }
            if (keyAt > 16) {
                i5 += valueAt;
            }
        }
        return new B8.e(new C3178c(i4, i5, i10));
    }
}
