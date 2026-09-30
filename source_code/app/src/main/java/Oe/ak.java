package Oe;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class ak extends AbstractList implements RandomAccess, s {
    public final r alpha;

    public ak(r rVar) {
        this.alpha = rVar;
    }

    @Override // Oe.s
    public final void beige(u uVar) {
        throw new UnsupportedOperationException();
    }

    @Override // Oe.s
    public final List charlie() {
        return Collections.unmodifiableList(this.alpha.alpha);
    }

    @Override // Oe.s
    public final ak echo() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return (String) this.alpha.get(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        aj ajVar = new aj();
        ajVar.purple = this.alpha.iterator();
        return ajVar;
    }

    @Override // Oe.s
    public final e j(int i4) {
        return this.alpha.j(i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, Oe.ai, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        ?? obj = new Object();
        obj.alpha = this.alpha.listIterator(i4);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.alpha.size();
    }
}
