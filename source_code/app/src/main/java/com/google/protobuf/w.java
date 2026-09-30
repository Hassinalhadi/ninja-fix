package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class w extends AbstractC1499b implements x, RandomAccess {
    public final List purple;

    static {
        new w();
    }

    public w(ArrayList arrayList) {
        super(true);
        this.purple = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        alpha();
        this.purple.add(i4, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1499b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.purple.size(), collection);
    }

    @Override // com.google.protobuf.x
    public final List charlie() {
        return Collections.unmodifiableList(this.purple);
    }

    @Override // com.google.protobuf.AbstractC1499b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        alpha();
        this.purple.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.x
    public final x echo() {
        if (this.alpha) {
            return new G(this);
        }
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        String str;
        List list = this.purple;
        Object obj = list.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C1502e) {
            C1502e c1502e = (C1502e) obj;
            c1502e.getClass();
            Charset charset = AbstractC1517u.alpha;
            if (c1502e.size() == 0) {
                str = "";
            } else {
                str = new String(c1502e.purple, c1502e.delta(), c1502e.size(), charset);
            }
            int delta = c1502e.delta();
            if (N.alpha.charlie(c1502e.purple, delta, c1502e.size() + delta) == 0) {
                list.set(i4, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, AbstractC1517u.alpha);
        az azVar = N.alpha;
        if (N.alpha.charlie(bArr, 0, bArr.length) == 0) {
            list.set(i4, str2);
        }
        return str2;
    }

    @Override // com.google.protobuf.InterfaceC1516t
    public final InterfaceC1516t golf(int i4) {
        List list = this.purple;
        if (i4 >= list.size()) {
            ArrayList arrayList = new ArrayList(i4);
            arrayList.addAll(list);
            return new w(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.x
    public final Object juliet(int i4) {
        return this.purple.get(i4);
    }

    @Override // com.google.protobuf.x
    public final void papa(C1502e c1502e) {
        alpha();
        this.purple.add(c1502e);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1499b, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        alpha();
        Object remove = this.purple.remove(i4);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof C1502e) {
            C1502e c1502e = (C1502e) remove;
            c1502e.getClass();
            Charset charset = AbstractC1517u.alpha;
            if (c1502e.size() == 0) {
                return "";
            }
            return new String(c1502e.purple, c1502e.delta(), c1502e.size(), charset);
        }
        return new String((byte[]) remove, AbstractC1517u.alpha);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        alpha();
        Object obj2 = this.purple.set(i4, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof C1502e) {
            C1502e c1502e = (C1502e) obj2;
            c1502e.getClass();
            Charset charset = AbstractC1517u.alpha;
            if (c1502e.size() == 0) {
                return "";
            }
            return new String(c1502e.purple, c1502e.delta(), c1502e.size(), charset);
        }
        return new String((byte[]) obj2, AbstractC1517u.alpha);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.purple.size();
    }

    public w() {
        super(false);
        this.purple = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractC1499b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        alpha();
        if (collection instanceof x) {
            collection = ((x) collection).charlie();
        }
        boolean addAll = this.purple.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public w(int i4) {
        this(new ArrayList(i4));
    }
}
