package q6;

import java.util.Objects;
import s6.AbstractC2779t7;

/* loaded from: classes2.dex */
public final class t extends q {
    public static final t teal = new t(0, new Object[0]);
    public final transient Object[] red;
    public final transient int silver;

    public t(int i4, Object[] objArr) {
        this.red = objArr;
        this.silver = i4;
    }

    @Override // q6.q, q6.n
    public final int alpha(Object[] objArr) {
        Object[] objArr2 = this.red;
        int i4 = this.silver;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // q6.n
    public final int bravo() {
        return this.silver;
    }

    @Override // q6.n
    public final int delta() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC2779t7.charlie(i4, this.silver);
        Object obj = this.red[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // q6.n
    public final Object[] hotel() {
        return this.red;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
