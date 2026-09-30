package r6;

import java.util.Set;

/* renamed from: r6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2498f extends AbstractC2493a implements Set {
    public transient AbstractC2496d purple;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i4;
        int i5 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i5 += i4;
        }
        return i5;
    }
}
