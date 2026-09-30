package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class G extends AbstractList implements x, RandomAccess {
    public final w alpha;

    public G(w wVar) {
        this.alpha = wVar;
    }

    @Override // com.google.protobuf.x
    public final List charlie() {
        return Collections.unmodifiableList(this.alpha.purple);
    }

    @Override // com.google.protobuf.x
    public final x echo() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return (String) this.alpha.get(i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, com.google.protobuf.F] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.alpha = this.alpha.iterator();
        return obj;
    }

    @Override // com.google.protobuf.x
    public final Object juliet(int i4) {
        return this.alpha.purple.get(i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, java.lang.Object, com.google.protobuf.E] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        ?? obj = new Object();
        obj.alpha = this.alpha.listIterator(i4);
        return obj;
    }

    @Override // com.google.protobuf.x
    public final void papa(C1502e c1502e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.alpha.purple.size();
    }
}
