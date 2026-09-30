package Ec;

import i.C1868q;
import i.C1874w;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1874w purple;

    public /* synthetic */ f(C1874w c1874w, int i4) {
        this.alpha = i4;
        this.purple = c1874w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4;
        int i5;
        int i10;
        int i11;
        boolean z2;
        switch (this.alpha) {
            case 0:
                C1874w c1874w = this.purple;
                C1868q c1868q = (C1868q) CollectionsKt.olive(c1874w.golf().kilo);
                boolean z10 = false;
                if (c1868q != null) {
                    i4 = c1868q.alpha;
                } else {
                    i4 = 0;
                }
                int i12 = c1874w.golf().november;
                if (i4 >= i12 - 3 && i12 > 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 1:
                C1874w c1874w2 = this.purple;
                C1868q c1868q2 = (C1868q) CollectionsKt.olive(c1874w2.golf().kilo);
                boolean z11 = false;
                if (c1868q2 != null) {
                    i5 = c1868q2.alpha;
                } else {
                    i5 = 0;
                }
                int i13 = c1874w2.golf().november;
                if (i5 >= i13 - 3 && i13 > 0) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 2:
                C1874w c1874w3 = this.purple;
                C1868q c1868q3 = (C1868q) CollectionsKt.olive(c1874w3.golf().kilo);
                boolean z12 = false;
                if (c1868q3 != null) {
                    i10 = c1868q3.alpha;
                } else {
                    i10 = 0;
                }
                int i14 = c1874w3.golf().november;
                if (i10 >= i14 - 3 && i14 > 0) {
                    z12 = true;
                }
                return Boolean.valueOf(z12);
            case 3:
                C1868q c1868q4 = (C1868q) CollectionsKt.olive(this.purple.golf().kilo);
                if (c1868q4 != null) {
                    i11 = c1868q4.alpha;
                } else {
                    i11 = -1;
                }
                return Integer.valueOf(i11);
            default:
                C1874w c1874w4 = this.purple;
                if (c1874w4.golf().november > 0 && !c1874w4.delta()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
