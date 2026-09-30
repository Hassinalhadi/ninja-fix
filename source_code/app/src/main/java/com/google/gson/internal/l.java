package com.google.gson.internal;

import java.util.Map;

/* loaded from: classes2.dex */
public final class l implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public Object f8315a;
    public l alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f8316b;
    public l purple;
    public l red;
    public l silver;
    public l teal;
    public final Object white;
    public final boolean yellow;

    public l(boolean z2) {
        this.white = null;
        this.yellow = z2;
        this.teal = this;
        this.silver = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.white;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f8315a;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.white;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8315a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Object obj = this.white;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f8315a;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i4 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.yellow) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f8315a;
        this.f8315a = obj;
        return obj2;
    }

    public final String toString() {
        return this.white + "=" + this.f8315a;
    }

    public l(boolean z2, l lVar, Object obj, l lVar2, l lVar3) {
        this.alpha = lVar;
        this.white = obj;
        this.yellow = z2;
        this.f8316b = 1;
        this.silver = lVar2;
        this.teal = lVar3;
        lVar3.silver = this;
        lVar2.teal = this;
    }
}
