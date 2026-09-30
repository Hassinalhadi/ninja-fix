package Wf;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class v {
    public final Set alpha;
    public final String bravo;
    public final long charlie;
    public final long delta;

    public v(Set set, String str, long j5, long j6) {
        this.alpha = set;
        this.bravo = str;
        this.charlie = j5;
        this.delta = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Intrinsics.areEqual(this.alpha, vVar.alpha) && Intrinsics.areEqual(this.bravo, vVar.bravo) && this.charlie == vVar.charlie && this.delta == vVar.delta) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int sierra = AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo);
        long j5 = this.charlie;
        long j6 = this.delta;
        return ((sierra + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "ResourceItem(qualifiers=" + this.alpha + ", path=" + this.bravo + ", offset=" + this.charlie + ", size=" + this.delta + ")";
    }
}
