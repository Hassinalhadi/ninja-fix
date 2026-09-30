package androidx.compose.foundation.lazy.layout;

import g.AbstractC1719b;

/* loaded from: classes3.dex */
public final class g {
    public final int alpha;
    public final int bravo;
    public final p charlie;

    public g(int i4, int i5, p pVar) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = pVar;
        if (i4 < 0) {
            AbstractC1719b.alpha("startIndex should be >= 0");
        }
        if (i5 > 0) {
            return;
        }
        AbstractC1719b.alpha("size should be > 0");
    }
}
