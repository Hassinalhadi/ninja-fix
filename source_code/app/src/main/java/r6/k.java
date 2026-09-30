package r6;

import java.util.Objects;
import t6.AbstractC2998h;

/* loaded from: classes2.dex */
public final class k extends AbstractC2496d {
    public final transient Object[] red;
    public final transient int silver;
    public final transient int teal;

    public k(int i4, Object[] objArr, int i5) {
        this.red = objArr;
        this.silver = i4;
        this.teal = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC2998h.foxtrot(i4, this.teal);
        Object obj = this.red[i4 + i4 + this.silver];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.teal;
    }
}
