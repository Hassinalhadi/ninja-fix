package K;

import java.util.List;
import s6.B6;

/* loaded from: classes3.dex */
public final class a extends kotlin.collections.e {
    public final L.c alpha;
    public final int purple;
    public final int red;

    public a(L.c cVar, int i4, int i5) {
        this.alpha = cVar;
        this.purple = i4;
        B6.delta(i4, i5, cVar.alpha());
        this.red = i5 - i4;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        return this.red;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        B6.bravo(i4, this.red);
        return this.alpha.get(this.purple + i4);
    }

    @Override // kotlin.collections.e, java.util.List
    public final List subList(int i4, int i5) {
        B6.delta(i4, i5, this.red);
        int i10 = this.purple;
        return new a(this.alpha, i4 + i10, i10 + i5);
    }
}
