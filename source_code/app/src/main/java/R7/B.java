package R7;

/* loaded from: classes2.dex */
public final class B extends f0 {
    public final Double alpha;
    public final int bravo;
    public final boolean charlie;
    public final int delta;
    public final long echo;
    public final long foxtrot;

    public B(Double d4, int i4, boolean z2, int i5, long j5, long j6) {
        this.alpha = d4;
        this.bravo = i4;
        this.charlie = z2;
        this.delta = i5;
        this.echo = j5;
        this.foxtrot = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            Double d4 = this.alpha;
            if (d4 != null ? d4.equals(((B) f0Var).alpha) : ((B) f0Var).alpha == null) {
                if (this.bravo == ((B) f0Var).bravo) {
                    B b2 = (B) f0Var;
                    if (this.charlie == b2.charlie && this.delta == b2.delta && this.echo == b2.echo && this.foxtrot == b2.foxtrot) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4;
        Double d4 = this.alpha;
        if (d4 == null) {
            hashCode = 0;
        } else {
            hashCode = d4.hashCode();
        }
        int i5 = (((hashCode ^ 1000003) * 1000003) ^ this.bravo) * 1000003;
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (((i5 ^ i4) * 1000003) ^ this.delta) * 1000003;
        long j5 = this.echo;
        long j6 = this.foxtrot;
        return ((i10 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.alpha);
        sb2.append(", batteryVelocity=");
        sb2.append(this.bravo);
        sb2.append(", proximityOn=");
        sb2.append(this.charlie);
        sb2.append(", orientation=");
        sb2.append(this.delta);
        sb2.append(", ramUsed=");
        sb2.append(this.echo);
        sb2.append(", diskUsed=");
        return Q0.c.mike(this.foxtrot, "}", sb2);
    }
}
