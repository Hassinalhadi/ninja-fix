package sc;

/* renamed from: sc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2846a {
    public final long alpha;
    public final long bravo;
    public final long charlie;
    public final EnumC2848c delta;

    public C2846a(long j5, long j6, long j7, EnumC2848c enumC2848c) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = j7;
        this.delta = enumC2848c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2846a)) {
            return false;
        }
        C2846a c2846a = (C2846a) obj;
        if (this.alpha == c2846a.alpha && this.bravo == c2846a.bravo && this.charlie == c2846a.charlie && this.delta == c2846a.delta) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        long j6 = this.bravo;
        int i4 = ((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.charlie;
        return this.delta.hashCode() + ((i4 + ((int) ((j7 >>> 32) ^ j7))) * 31);
    }

    public final String toString() {
        return "RepositionActionResponse(id=" + this.alpha + ", repositionRequestId=" + this.bravo + ", orderId=" + this.charlie + ", status=" + this.delta + ")";
    }
}
