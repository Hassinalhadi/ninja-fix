package j;

import d.K;
import java.util.List;
import kotlin.collections.CollectionsKt;
import s6.AbstractC2804w5;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1921d implements androidx.compose.foundation.lazy.layout.o {
    public final t alpha;

    public C1921d(t tVar) {
        this.alpha = tVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final int alpha() {
        return ((m) CollectionsKt.ochre(this.alpha.golf().mike)).alpha;
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final int bravo() {
        long golf;
        boolean z2;
        int i4;
        boolean z10;
        long j5;
        t tVar = this.alpha;
        int i5 = 0;
        if (tVar.golf().mike.isEmpty()) {
            return 0;
        }
        l golf2 = tVar.golf();
        K k6 = golf2.quebec;
        K k10 = K.alpha;
        if (k6 == k10) {
            golf = golf2.golf() & 4294967295L;
        } else {
            golf = golf2.golf() >> 32;
        }
        int i10 = (int) golf;
        l golf3 = tVar.golf();
        if (golf3.quebec == k10) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            List list = golf3.mike;
            if (i11 >= list.size()) {
                break;
            }
            int bravo = AbstractC2804w5.bravo(z2, golf3, i11);
            if (bravo == -1) {
                i11++;
            } else {
                int i14 = i5;
                while (i11 < list.size() && AbstractC2804w5.bravo(z2, golf3, i11) == bravo) {
                    if (z2) {
                        z10 = z2;
                        j5 = ((m) list.get(i11)).november & 4294967295L;
                    } else {
                        z10 = z2;
                        j5 = ((m) list.get(i11)).november >> 32;
                    }
                    i14 = Math.max(i14, (int) j5);
                    i11++;
                    z2 = z10;
                }
                i12 += i14;
                i13++;
                z2 = z2;
                i5 = 0;
            }
        }
        int i15 = (i12 / i13) + golf3.sierra;
        if (i15 == 0 || (i4 = i10 / i15) < 1) {
            return 1;
        }
        return i4;
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final boolean charlie() {
        return !this.alpha.golf().mike.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final int delta() {
        return this.alpha.delta.alpha();
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final int getItemCount() {
        return this.alpha.golf().papa;
    }
}
