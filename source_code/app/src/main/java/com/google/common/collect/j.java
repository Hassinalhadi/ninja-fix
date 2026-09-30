package com.google.common.collect;

import java.util.Map;

/* loaded from: classes2.dex */
public final class j extends f {
    public final transient m silver;
    public final transient Object[] teal;
    public final transient int white;

    public j(m mVar, Object[] objArr, int i4) {
        this.silver = mVar;
        this.teal = objArr;
        this.white = i4;
    }

    @Override // com.google.common.collect.a
    public final int alpha(Object[] objArr) {
        return india().alpha(objArr);
    }

    @Override // com.google.common.collect.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.silver.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.f
    public final d mike() {
        return new i(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: november, reason: merged with bridge method [inline-methods] */
    public final p iterator() {
        return india().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.white;
    }
}
