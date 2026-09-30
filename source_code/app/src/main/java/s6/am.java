package s6;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class am extends ag {
    public final transient ao red;
    public final transient an silver;

    public am(ao aoVar, an anVar) {
        this.red = aoVar;
        this.silver = anVar;
    }

    @Override // s6.aa
    public final int alpha(int i4, Object[] objArr) {
        return this.silver.alpha(i4, objArr);
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
        return 1;
    }
}
