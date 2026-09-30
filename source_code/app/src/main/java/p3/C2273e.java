package p3;

/* renamed from: p3.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2273e {
    public final long alpha;
    public final long bravo;
    public final int charlie;
    public final long delta;
    public final float echo;
    public final boolean foxtrot;
    public final long golf;
    public final float hotel;
    public final boolean india;
    public final long juliet;
    public final float kilo;
    public final long lima;
    public final boolean mike;

    public C2273e(long j5, long j6, int i4, long j7, float f5, boolean z2, long j10, float f10, boolean z10, long j11, float f11, long j12, boolean z11) {
        this.alpha = j5;
        this.bravo = j6;
        this.charlie = i4;
        this.delta = j7;
        this.echo = f5;
        this.foxtrot = z2;
        this.golf = j10;
        this.hotel = f10;
        this.india = z10;
        this.juliet = j11;
        this.kilo = f11;
        this.lima = j12;
        this.mike = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2273e)) {
            return false;
        }
        C2273e c2273e = (C2273e) obj;
        if (this.alpha == c2273e.alpha && this.bravo == c2273e.bravo && this.charlie == c2273e.charlie && this.delta == c2273e.delta && Float.compare(this.echo, c2273e.echo) == 0 && this.foxtrot == c2273e.foxtrot && this.golf == c2273e.golf && Float.compare(this.hotel, c2273e.hotel) == 0 && this.india == c2273e.india && this.juliet == c2273e.juliet && Float.compare(this.kilo, c2273e.kilo) == 0 && this.lima == c2273e.lima && this.mike == c2273e.mike) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        long j5 = this.alpha;
        long j6 = this.bravo;
        int i10 = ((((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.charlie) * 31;
        long j7 = this.delta;
        int sierra = ao.ad.sierra(this.echo, (i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31, 31);
        int i11 = 1237;
        if (this.foxtrot) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = (sierra + i4) * 31;
        long j10 = this.golf;
        int sierra2 = ao.ad.sierra(this.hotel, (i12 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31);
        if (this.india) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i13 = (sierra2 + i5) * 31;
        long j11 = this.juliet;
        int sierra3 = ao.ad.sierra(this.kilo, (i13 + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31);
        long j12 = this.lima;
        int i14 = (sierra3 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        if (this.mike) {
            i11 = 1231;
        }
        return i14 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationControllerRuntimeConfig(stuckThresholdMs=");
        sb2.append(this.alpha);
        sb2.append(", stuckFallbackMaxAgeMs=");
        sb2.append(this.bravo);
        sb2.append(", maxStuckRecoveryAttempts=");
        sb2.append(this.charlie);
        sb2.append(", coldStartMaxAgeMs=");
        sb2.append(this.delta);
        sb2.append(", coldStartMaxAccuracyMeters=");
        sb2.append(this.echo);
        sb2.append(", sendValidationEnabled=");
        sb2.append(this.foxtrot);
        sb2.append(", forceSendMaxAgeMs=");
        sb2.append(this.golf);
        sb2.append(", forceSendMaxAccuracyMeters=");
        sb2.append(this.hotel);
        sb2.append(", compareWithLastSentEnabled=");
        sb2.append(this.india);
        sb2.append(", compareMaxAgeVsLastSentMs=");
        sb2.append(this.juliet);
        sb2.append(", compareMaxDistanceFromLastSentM=");
        sb2.append(this.kilo);
        sb2.append(", forceSendFreshTimeoutMs=");
        sb2.append(this.lima);
        sb2.append(", implausibleJumpGuardEnabled=");
        return Q0.c.romeo(sb2, this.mike, ")");
    }
}
