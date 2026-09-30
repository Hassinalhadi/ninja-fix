package Tf;

import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class ag extends kotlin.collections.e implements RandomAccess {
    public final n[] alpha;
    public final int[] purple;

    public ag(n[] nVarArr, int[] iArr) {
        this.alpha = nVarArr;
        this.purple = iArr;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        return this.alpha.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        return super.contains((n) obj);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return this.alpha[i4];
    }

    @Override // kotlin.collections.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        return super.indexOf((n) obj);
    }

    @Override // kotlin.collections.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof n)) {
            return -1;
        }
        return super.lastIndexOf((n) obj);
    }
}
