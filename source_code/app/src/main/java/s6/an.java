package s6;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class an extends af {
    public final transient Object[] red;
    public final transient int silver;
    public final transient int teal = 1;

    public an(int i4, Object[] objArr) {
        this.red = objArr;
        this.silver = i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        t6.ae.bravo(i4, this.teal);
        Object obj = this.red[i4 + i4 + this.silver];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.teal;
    }
}
