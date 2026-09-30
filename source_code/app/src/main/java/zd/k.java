package zd;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k implements Map.Entry, Yd.d {
    public final Object alpha;
    public Object purple;

    public k(Object obj, Object obj2) {
        this.alpha = obj;
        this.purple = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.areEqual(entry.getKey(), this.alpha) && Intrinsics.areEqual(entry.getValue(), this.purple)) {
                return true;
            }
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
        Object obj = this.alpha;
        Intrinsics.checkNotNull(obj);
        int hashCode = obj.hashCode() + 527;
        Object obj2 = this.purple;
        Intrinsics.checkNotNull(obj2);
        return obj2.hashCode() + hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.purple = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.alpha);
        sb2.append('=');
        sb2.append(this.purple);
        return sb2.toString();
    }
}
