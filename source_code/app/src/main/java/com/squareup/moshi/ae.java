package com.squareup.moshi;

import java.util.Map;

/* loaded from: classes2.dex */
public final class ae implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public Object f11958a;
    public ae alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f11959b;
    public ae purple;
    public ae red;
    public ae silver;
    public ae teal;
    public final Object white;
    public final int yellow;

    public ae() {
        this.white = null;
        this.yellow = -1;
        this.teal = this;
        this.silver = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.white;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f11958a;
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
        return this.f11958a;
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
        Object obj2 = this.f11958a;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i4 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f11958a;
        this.f11958a = obj;
        return obj2;
    }

    public final String toString() {
        return this.white + "=" + this.f11958a;
    }

    public ae(ae aeVar, Object obj, int i4, ae aeVar2, ae aeVar3) {
        this.alpha = aeVar;
        this.white = obj;
        this.yellow = i4;
        this.f11959b = 1;
        this.silver = aeVar2;
        this.teal = aeVar3;
        aeVar3.silver = this;
        aeVar2.teal = this;
    }
}
