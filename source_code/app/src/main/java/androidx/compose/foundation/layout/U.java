package androidx.compose.foundation.layout;

import h.AbstractC1797a;

/* loaded from: classes3.dex */
public final class U implements T {
    public static final U alpha = new Object();

    @Override // androidx.compose.foundation.layout.T
    public final T.s alpha(T.s sVar, float f5, boolean z2) {
        if (f5 <= 0.0d) {
            AbstractC1797a.alpha("invalid weight; must be greater than zero");
        }
        if (f5 > Float.MAX_VALUE) {
            f5 = Float.MAX_VALUE;
        }
        return sVar.then(new LayoutWeightElement(f5, z2));
    }
}
