package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* loaded from: classes2.dex */
public final class P implements Map.Entry, Comparable {
    public final Comparable alpha;
    public Object purple;
    public final /* synthetic */ O red;

    public P(O o5, Comparable comparable, Object obj) {
        this.red = o5;
        this.alpha = comparable;
        this.purple = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.alpha.compareTo(((P) obj).alpha);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.alpha;
                if (comparable == null) {
                    if (key != null) {
                        equals = false;
                    } else {
                        equals = true;
                    }
                } else {
                    equals = comparable.equals(key);
                }
                if (equals) {
                    Object obj2 = this.purple;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        if (value != null) {
                            equals2 = false;
                        } else {
                            equals2 = true;
                        }
                    } else {
                        equals2 = obj2.equals(value);
                    }
                    if (equals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.alpha;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.purple;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Comparable comparable = this.alpha;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.purple;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return i4 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.red.golf();
        Object obj2 = this.purple;
        this.purple = obj;
        return obj2;
    }

    public final String toString() {
        return ao.ad.amber(String.valueOf(this.alpha), "=", String.valueOf(this.purple));
    }
}
