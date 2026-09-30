package g3;

/* loaded from: classes3.dex */
public final class ab {
    public long alpha;
    public double bravo;
    public double charlie;
    public long delta;
    public long echo;
    public long foxtrot;
    public boolean golf;
    public long hotel;
    public long india;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ab) {
                ab abVar = (ab) obj;
                if (this.alpha != abVar.alpha || Double.compare(this.bravo, abVar.bravo) != 0 || Double.compare(this.charlie, abVar.charlie) != 0 || this.delta != abVar.delta || this.echo != abVar.echo || this.foxtrot != abVar.foxtrot || this.golf != abVar.golf || this.hotel != abVar.hotel || this.india != abVar.india) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        long j5 = this.alpha;
        long doubleToLongBits = Double.doubleToLongBits(this.bravo);
        int i5 = ((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.charlie);
        int i10 = (i5 + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        long j6 = this.delta;
        int i11 = (i10 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.echo;
        int i12 = (i11 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j10 = this.foxtrot;
        int i13 = (i12 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        if (this.golf) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        long j11 = this.hotel;
        int i14 = (((i13 + i4) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.india;
        return i14 + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        long j5 = this.alpha;
        double d4 = this.bravo;
        double d9 = this.charlie;
        long j6 = this.delta;
        long j7 = this.echo;
        long j10 = this.foxtrot;
        boolean z2 = this.golf;
        long j11 = this.hotel;
        long j12 = this.india;
        StringBuilder uniform = Q0.c.uniform("SendState(lastSentAt=", j5, ", lastSentLat=");
        uniform.append(d4);
        uniform.append(", lastSentLng=");
        uniform.append(d9);
        uniform.append(", lastHeartbeatSentAt=");
        uniform.append(j6);
        Q0.c.amber(uniform, ", lastPedestrianSentAt=", j7, ", lowSpeedStartMs=");
        uniform.append(j10);
        uniform.append(", isPedestrianMode=");
        uniform.append(z2);
        Q0.c.amber(uniform, ", lastReqChangeAt=", j11, ", stationaryStartMs=");
        return Q0.c.mike(j12, ")", uniform);
    }
}
