package p6;

import java.util.Objects;
import s6.AbstractC2681i7;

/* loaded from: classes2.dex */
public final class w extends v {
    public static final w teal = new w(0, new Object[0]);
    public final transient Object[] red;
    public final transient int silver;

    public w(int i4, Object[] objArr) {
        this.red = objArr;
        this.silver = i4;
    }

    @Override // p6.s
    public final Object[] alpha() {
        return this.red;
    }

    @Override // p6.s
    public final int bravo() {
        return 0;
    }

    @Override // p6.s
    public final int delta() {
        return this.silver;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC2681i7.bravo(i4, this.silver);
        Object obj = this.red[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p6.s
    public final boolean hotel() {
        return false;
    }

    @Override // p6.v, p6.s
    public final int india(Object[] objArr) {
        Object[] objArr2 = this.red;
        int i4 = this.silver;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
