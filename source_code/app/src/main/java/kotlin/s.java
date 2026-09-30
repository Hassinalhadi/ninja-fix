package kotlin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s implements Comparable {
    public final short alpha;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.golf(this.alpha & 65535, ((s) obj).alpha & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (this.alpha != ((s) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return String.valueOf(65535 & this.alpha);
    }
}
