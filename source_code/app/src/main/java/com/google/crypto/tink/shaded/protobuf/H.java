package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class H extends AbstractList implements ae, RandomAccess {
    public final ad alpha;

    public H(ad adVar) {
        this.alpha = adVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ae
    public final List charlie() {
        return Collections.unmodifiableList(this.alpha.purple);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ae
    public final ae echo() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return (String) this.alpha.get(i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, com.google.crypto.tink.shaded.protobuf.G] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.alpha = this.alpha.iterator();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ae
    public final Object juliet(int i4) {
        return this.alpha.purple.get(i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, com.google.crypto.tink.shaded.protobuf.F, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        ?? obj = new Object();
        obj.alpha = this.alpha.listIterator(i4);
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ae
    public final void pink(C1489g c1489g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.alpha.size();
    }
}
