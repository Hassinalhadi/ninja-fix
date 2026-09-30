package com.google.common.collect;

import java.util.Iterator;
import s6.W;

/* loaded from: classes2.dex */
public final class n extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f8274b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f8275c;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f8276a;
    public final transient Object[] silver;
    public final transient int teal;
    public final transient Object[] white;
    public final transient int yellow;

    static {
        Object[] objArr = new Object[0];
        f8274b = objArr;
        f8275c = new n(0, 0, 0, objArr, objArr);
    }

    public n(int i4, int i5, int i10, Object[] objArr, Object[] objArr2) {
        this.silver = objArr;
        this.teal = i4;
        this.white = objArr2;
        this.yellow = i5;
        this.f8276a = i10;
    }

    @Override // com.google.common.collect.a
    public final int alpha(Object[] objArr) {
        Object[] objArr2 = this.silver;
        int i4 = this.f8276a;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // com.google.common.collect.a
    public final Object[] bravo() {
        return this.silver;
    }

    @Override // com.google.common.collect.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.white;
            if (objArr.length != 0) {
                int alpha = W.alpha(obj.hashCode());
                while (true) {
                    int i4 = alpha & this.yellow;
                    Object obj2 = objArr[i4];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    alpha = i4 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.a
    public final int delta() {
        return this.f8276a;
    }

    @Override // com.google.common.collect.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.teal;
    }

    @Override // com.google.common.collect.a
    public final int hotel() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return india().listIterator(0);
    }

    @Override // com.google.common.collect.f
    public final d mike() {
        return d.india(this.f8276a, this.silver);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8276a;
    }
}
