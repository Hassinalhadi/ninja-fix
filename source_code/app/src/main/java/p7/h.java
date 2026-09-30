package p7;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract class h extends AbstractC2287d implements Set {
    public static final /* synthetic */ int red = 0;
    public transient i purple;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            ((h) obj).getClass();
            ((j) obj).getClass();
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0) {
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
}
