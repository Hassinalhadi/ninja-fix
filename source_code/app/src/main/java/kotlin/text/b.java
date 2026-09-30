package kotlin.text;

import fe.C1713e;
import fe.C1715g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes2.dex */
public final class b implements Iterator, Yd.a {
    public int alpha = -1;
    public int purple;
    public int red;
    public C1715g silver;
    public int teal;
    public final /* synthetic */ c white;

    public b(c cVar) {
        this.white = cVar;
        cVar.getClass();
        int delta = J4.delta(0, 0, cVar.alpha.length());
        this.purple = delta;
        this.red = delta;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [fe.g, fe.e] */
    /* JADX WARN: Type inference failed for: r0v8, types: [fe.g, fe.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha() {
        int i4 = this.red;
        int i5 = 0;
        if (i4 < 0) {
            this.alpha = 0;
            this.silver = null;
            return;
        }
        c cVar = this.white;
        int i10 = cVar.bravo;
        if (i10 > 0) {
            int i11 = this.teal + 1;
            this.teal = i11;
        }
        if (i4 <= cVar.alpha.length()) {
            Pair pair = (Pair) cVar.charlie.invoke(cVar.alpha, Integer.valueOf(this.red));
            if (pair == null) {
                this.silver = new C1713e(this.purple, StringsKt.cyan(cVar.alpha), 1);
                this.red = -1;
            } else {
                int intValue = ((Number) pair.first).intValue();
                int intValue2 = ((Number) pair.second).intValue();
                this.silver = J4.hotel(this.purple, intValue);
                int i12 = intValue + intValue2;
                this.purple = i12;
                if (intValue2 == 0) {
                    i5 = 1;
                }
                this.red = i12 + i5;
            }
            this.alpha = 1;
        }
        this.silver = new C1713e(this.purple, StringsKt.cyan(cVar.alpha), 1);
        this.red = -1;
        this.alpha = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.alpha == -1) {
            alpha();
        }
        if (this.alpha == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.alpha == -1) {
            alpha();
        }
        if (this.alpha != 0) {
            C1715g c1715g = this.silver;
            Intrinsics.charlie(c1715g, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.silver = null;
            this.alpha = -1;
            return c1715g;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
