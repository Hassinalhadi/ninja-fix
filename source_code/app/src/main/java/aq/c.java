package aq;

import java.util.Map;

/* loaded from: classes3.dex */
public final class c implements Map.Entry {
    public final Object alpha;
    public final Object purple;
    public c red;
    public c silver;

    public c(Object obj, Object obj2) {
        this.alpha = obj;
        this.purple = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.alpha.equals(cVar.alpha) && this.purple.equals(cVar.purple)) {
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
        return this.alpha.hashCode() ^ this.purple.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.alpha + "=" + this.purple;
    }
}
