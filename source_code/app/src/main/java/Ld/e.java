package Ld;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements Map.Entry, Yd.d {
    public final g alpha;
    public final int purple;
    public final int red;

    public e(g map, int i4) {
        Intrinsics.echo(map, "map");
        this.alpha = map;
        this.purple = i4;
        this.red = map.f1832a;
    }

    public final void alpha() {
        if (this.alpha.f1832a == this.red) {
        } else {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        alpha();
        return this.alpha.alpha[this.purple];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        alpha();
        Object[] objArr = this.alpha.purple;
        Intrinsics.checkNotNull(objArr);
        return objArr[this.purple];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i4;
        Object key = getKey();
        int i5 = 0;
        if (key != null) {
            i4 = key.hashCode();
        } else {
            i4 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i5 = value.hashCode();
        }
        return i4 ^ i5;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        alpha();
        g gVar = this.alpha;
        gVar.charlie();
        Object[] objArr = gVar.purple;
        if (objArr == null) {
            int length = gVar.alpha.length;
            if (length >= 0) {
                objArr = new Object[length];
                gVar.purple = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        int i4 = this.purple;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
