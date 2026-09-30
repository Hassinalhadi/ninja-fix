package r6;

import java.util.Objects;
import t6.AbstractC2998h;

/* loaded from: classes2.dex */
public final class g extends AbstractC2496d {
    public static final g teal = new g(0, new Object[0]);
    public final transient Object[] red;
    public final transient int silver;

    public g(int i4, Object[] objArr) {
        this.red = objArr;
        this.silver = i4;
    }

    @Override // r6.AbstractC2496d, r6.AbstractC2493a
    public final int alpha(Object[] objArr) {
        Object[] objArr2 = this.red;
        int i4 = this.silver;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // r6.AbstractC2493a
    public final int bravo() {
        return this.silver;
    }

    @Override // r6.AbstractC2493a
    public final int delta() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC2998h.foxtrot(i4, this.silver);
        Object obj = this.red[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // r6.AbstractC2493a
    public final Object[] hotel() {
        return this.red;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
