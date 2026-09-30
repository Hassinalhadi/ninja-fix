package Nf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aq implements Map.Entry, Yd.a {
    public final Object alpha;
    public final Object purple;

    public aq(Object obj, Object obj2) {
        this.alpha = obj;
        this.purple = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        if (Intrinsics.areEqual(this.alpha, aqVar.alpha) && Intrinsics.areEqual(this.purple, aqVar.purple)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
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
        Object obj = this.alpha;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i5 = hashCode * 31;
        Object obj2 = this.purple;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i5 + i4;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.alpha + ", value=" + this.purple + ')';
    }
}
