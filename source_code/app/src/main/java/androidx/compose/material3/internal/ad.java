package androidx.compose.material3.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ad {
    public final Object alpha;

    public ad(Map map) {
        this.alpha = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Object alpha(float f5) {
        Object next;
        Iterator it = this.alpha.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f5 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f5 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Object bravo(float f5, boolean z2) {
        Object next;
        float f10;
        float f11;
        Iterator it = this.alpha.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                if (z2) {
                    f10 = floatValue - f5;
                } else {
                    f10 = f5 - floatValue;
                }
                if (f10 < 0.0f) {
                    f10 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (z2) {
                        f11 = floatValue2 - f5;
                    } else {
                        f11 = f5 - floatValue2;
                    }
                    if (f11 < 0.0f) {
                        f11 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f10, f11) > 0) {
                        next = next2;
                        f10 = f11;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final float charlie(Object obj) {
        Float f5 = (Float) this.alpha.get(obj);
        if (f5 != null) {
            return f5.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        return Intrinsics.areEqual(this.alpha, ((ad) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.alpha + ')';
    }
}
