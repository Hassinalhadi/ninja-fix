package p7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class j extends h {
    public static final Object[] white;
    public static final j yellow;
    public final transient Object[] silver;
    public final transient Object[] teal;

    static {
        Object[] objArr = new Object[0];
        white = objArr;
        yellow = new j(objArr, objArr);
    }

    public j(Object[] objArr, Object[] objArr2) {
        this.silver = objArr;
        this.teal = objArr2;
    }

    @Override // p7.AbstractC2287d
    public final int alpha(Object[] objArr) {
        System.arraycopy(this.silver, 0, objArr, 0, 0);
        return 0;
    }

    @Override // p7.AbstractC2287d
    public final int bravo() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            int length = this.teal.length;
            return false;
        }
        return false;
    }

    @Override // p7.AbstractC2287d
    public final int delta() {
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // p7.AbstractC2287d
    public final Object[] hotel() {
        return this.silver;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i iVar = this.purple;
        if (iVar == null) {
            C2288e c2288e = g.purple;
            iVar = i.silver;
            this.purple = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
