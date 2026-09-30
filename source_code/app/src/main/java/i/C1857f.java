package i;

import d.K;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1857f implements androidx.compose.foundation.lazy.layout.o {
    public final C1874w alpha;

    public C1857f(C1874w c1874w) {
        this.alpha = c1874w;
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final int alpha() {
        return Math.min(getItemCount() - 1, ((C1868q) CollectionsKt.ochre(this.alpha.golf().kilo)).alpha);
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final int bravo() {
        long golf;
        int i4;
        C1874w c1874w = this.alpha;
        if (c1874w.golf().kilo.isEmpty()) {
            return 0;
        }
        C1867p golf2 = c1874w.golf();
        if (golf2.oscar == K.alpha) {
            golf = golf2.golf() & 4294967295L;
        } else {
            golf = golf2.golf() >> 32;
        }
        int i5 = (int) golf;
        C1867p golf3 = c1874w.golf();
        List list = golf3.kilo;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((C1868q) list.get(i11)).mike;
        }
        int size2 = (i10 / list.size()) + golf3.quebec;
        if (size2 == 0 || (i4 = i5 / size2) < 1) {
            return 1;
        }
        return i4;
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final boolean charlie() {
        return !this.alpha.golf().kilo.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final int delta() {
        return Math.max(0, this.alpha.echo.alpha());
    }

    @Override // androidx.compose.foundation.lazy.layout.o
    public final int getItemCount() {
        return this.alpha.golf().november;
    }
}
