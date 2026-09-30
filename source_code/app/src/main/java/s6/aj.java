package s6;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class aj extends af {
    public static final aj teal = new aj(0, new Object[0]);
    public final transient Object[] red;
    public final transient int silver;

    public aj(int i4, Object[] objArr) {
        this.red = objArr;
        this.silver = i4;
    }

    @Override // s6.af, s6.aa
    public final int alpha(int i4, Object[] objArr) {
        Object[] objArr2 = this.red;
        int i5 = this.silver;
        System.arraycopy(objArr2, 0, objArr, i4, i5);
        return i4 + i5;
    }

    @Override // s6.aa
    public final int bravo() {
        return this.silver;
    }

    @Override // s6.aa
    public final int delta() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        t6.ae.bravo(i4, this.silver);
        Object obj = this.red[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // s6.aa
    public final Object[] hotel() {
        return this.red;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
