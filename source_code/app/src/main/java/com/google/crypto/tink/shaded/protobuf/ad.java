package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class ad extends AbstractC1484b implements ae, RandomAccess {
    public final ArrayList purple;

    static {
        new ad(10).alpha = false;
    }

    public ad(int i4) {
        this(new ArrayList(i4));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        alpha();
        this.purple.add(i4, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1484b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.purple.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ae
    public final List charlie() {
        return Collections.unmodifiableList(this.purple);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1484b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        alpha();
        this.purple.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ae
    public final ae echo() {
        if (this.alpha) {
            return new H(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        String str;
        ArrayList arrayList = this.purple;
        Object obj = arrayList.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1490h) {
            AbstractC1490h abstractC1490h = (AbstractC1490h) obj;
            abstractC1490h.getClass();
            Charset charset = ab.alpha;
            if (abstractC1490h.size() == 0) {
                str = "";
            } else {
                C1489g c1489g = (C1489g) abstractC1490h;
                str = new String(c1489g.silver, c1489g.lima(), c1489g.size(), charset);
            }
            C1489g c1489g2 = (C1489g) abstractC1490h;
            int lima = c1489g2.lima();
            if (O.alpha.victor(c1489g2.silver, lima, c1489g2.size() + lima)) {
                arrayList.set(i4, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, ab.alpha);
        ap apVar = O.alpha;
        if (O.alpha.victor(bArr, 0, bArr.length)) {
            arrayList.set(i4, str2);
        }
        return str2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.aa
    public final aa golf(int i4) {
        ArrayList arrayList = this.purple;
        if (i4 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i4);
            arrayList2.addAll(arrayList);
            return new ad(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ae
    public final Object juliet(int i4) {
        return this.purple.get(i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ae
    public final void pink(C1489g c1489g) {
        alpha();
        this.purple.add(c1489g);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        alpha();
        Object remove = this.purple.remove(i4);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC1490h) {
            AbstractC1490h abstractC1490h = (AbstractC1490h) remove;
            abstractC1490h.getClass();
            Charset charset = ab.alpha;
            if (abstractC1490h.size() == 0) {
                return "";
            }
            C1489g c1489g = (C1489g) abstractC1490h;
            return new String(c1489g.silver, c1489g.lima(), c1489g.size(), charset);
        }
        return new String((byte[]) remove, ab.alpha);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        alpha();
        Object obj2 = this.purple.set(i4, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC1490h) {
            AbstractC1490h abstractC1490h = (AbstractC1490h) obj2;
            abstractC1490h.getClass();
            Charset charset = ab.alpha;
            if (abstractC1490h.size() == 0) {
                return "";
            }
            C1489g c1489g = (C1489g) abstractC1490h;
            return new String(c1489g.silver, c1489g.lima(), c1489g.size(), charset);
        }
        return new String((byte[]) obj2, ab.alpha);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.purple.size();
    }

    public ad(ArrayList arrayList) {
        this.purple = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1484b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        alpha();
        if (collection instanceof ae) {
            collection = ((ae) collection).charlie();
        }
        boolean addAll = this.purple.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
