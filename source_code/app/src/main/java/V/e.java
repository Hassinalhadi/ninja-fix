package V;

import kotlin.jvm.internal.Intrinsics;
import s1.C2576i;

/* loaded from: classes3.dex */
public final class e {
    public final int alpha;
    public final long bravo;
    public final f charlie;
    public final C2576i delta;

    public e(int i4, long j5, f fVar, C2576i c2576i) {
        this.alpha = i4;
        this.bravo = j5;
        this.charlie = fVar;
        this.delta = c2576i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.alpha == eVar.alpha && this.bravo == eVar.bravo && this.charlie == eVar.charlie && Intrinsics.areEqual(this.delta, eVar.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = this.alpha * 31;
        long j5 = this.bravo;
        int hashCode2 = (this.charlie.hashCode() + ((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31)) * 31;
        C2576i c2576i = this.delta;
        if (c2576i == null) {
            hashCode = 0;
        } else {
            hashCode = c2576i.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.alpha + ", timestamp=" + this.bravo + ", type=" + this.charlie + ", structureCompat=" + this.delta + ')';
    }
}
