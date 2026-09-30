package t6;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class t4 extends p4 {
    public final transient s6.ao red;
    public final transient u4 silver;

    public t4(s6.ao aoVar, u4 u4Var) {
        this.red = aoVar;
        this.silver = u4Var;
    }

    @Override // t6.G3
    public final int alpha(Object[] objArr) {
        return this.silver.alpha(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.red.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.silver.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.red.getClass();
        return 1;
    }
}
