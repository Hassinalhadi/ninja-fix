package y1;

import android.graphics.Rect;
import com.google.android.gms.measurement.internal.C1471u;
import java.util.Comparator;
import t1.C2952d;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3389b implements Comparator {
    public final Rect alpha = new Rect();
    public final Rect purple = new Rect();
    public final boolean red;
    public final C1471u silver;

    public C3389b(boolean z2, C1471u c1471u) {
        this.red = z2;
        this.silver = c1471u;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.silver.getClass();
        Rect rect = this.alpha;
        ((C2952d) obj).foxtrot(rect);
        Rect rect2 = this.purple;
        ((C2952d) obj2).foxtrot(rect2);
        int i4 = rect.top;
        int i5 = rect2.top;
        if (i4 >= i5) {
            if (i4 <= i5) {
                int i10 = rect.left;
                int i11 = rect2.left;
                boolean z2 = this.red;
                if (i10 < i11) {
                    if (!z2) {
                        return -1;
                    }
                    return 1;
                }
                if (i10 > i11) {
                    if (z2) {
                        return -1;
                    }
                    return 1;
                }
                int i12 = rect.bottom;
                int i13 = rect2.bottom;
                if (i12 >= i13) {
                    if (i12 <= i13) {
                        int i14 = rect.right;
                        int i15 = rect2.right;
                        if (i14 < i15) {
                            if (!z2) {
                                return -1;
                            }
                            return 1;
                        }
                        if (i14 > i15) {
                            if (z2) {
                                return -1;
                            }
                            return 1;
                        }
                        return 0;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
        return -1;
    }
}
