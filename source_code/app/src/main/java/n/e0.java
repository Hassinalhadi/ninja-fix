package n;

/* loaded from: classes3.dex */
public final class e0 {
    public final D0.ak alpha;
    public q0.z bravo = null;
    public q0.z charlie;

    public e0(D0.ak akVar, q0.z zVar) {
        this.alpha = akVar;
        this.charlie = zVar;
    }

    public final long alpha(long j5) {
        Z.c cVar;
        q0.z zVar = this.bravo;
        Z.c cVar2 = Z.c.echo;
        if (zVar != null) {
            if (zVar.india()) {
                q0.z zVar2 = this.charlie;
                if (zVar2 != null) {
                    cVar = zVar2.sierra(zVar, true);
                } else {
                    cVar = null;
                }
            } else {
                cVar = cVar2;
            }
            if (cVar != null) {
                cVar2 = cVar;
            }
        }
        int i4 = (int) (j5 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i4);
        float f5 = cVar2.alpha;
        if (intBitsToFloat >= f5) {
            float intBitsToFloat2 = Float.intBitsToFloat(i4);
            f5 = cVar2.charlie;
            if (intBitsToFloat2 <= f5) {
                f5 = Float.intBitsToFloat(i4);
            }
        }
        int i5 = (int) (j5 & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i5);
        float f10 = cVar2.bravo;
        if (intBitsToFloat3 >= f10) {
            float intBitsToFloat4 = Float.intBitsToFloat(i5);
            f10 = cVar2.delta;
            if (intBitsToFloat4 <= f10) {
                f10 = Float.intBitsToFloat(i5);
            }
        }
        return (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    public final int bravo(long j5, boolean z2) {
        if (z2) {
            j5 = alpha(j5);
        }
        return this.alpha.bravo.golf(delta(j5));
    }

    public final boolean charlie(long j5) {
        long delta = delta(alpha(j5));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & delta));
        D0.ak akVar = this.alpha;
        int echo = akVar.bravo.echo(intBitsToFloat);
        int i4 = (int) (delta >> 32);
        if (Float.intBitsToFloat(i4) >= akVar.delta(echo) && Float.intBitsToFloat(i4) <= akVar.echo(echo)) {
            return true;
        }
        return false;
    }

    public final long delta(long j5) {
        q0.z zVar;
        q0.z zVar2 = this.bravo;
        if (zVar2 != null) {
            q0.z zVar3 = null;
            if (!zVar2.india()) {
                zVar2 = null;
            }
            if (zVar2 != null && (zVar = this.charlie) != null) {
                if (zVar.india()) {
                    zVar3 = zVar;
                }
                if (zVar3 != null) {
                    return zVar2.oscar(zVar3, j5);
                }
                return j5;
            }
            return j5;
        }
        return j5;
    }

    public final long echo(long j5) {
        q0.z zVar;
        q0.z zVar2 = this.bravo;
        if (zVar2 != null) {
            q0.z zVar3 = null;
            if (!zVar2.india()) {
                zVar2 = null;
            }
            if (zVar2 != null && (zVar = this.charlie) != null) {
                if (zVar.india()) {
                    zVar3 = zVar;
                }
                if (zVar3 != null) {
                    return zVar3.oscar(zVar2, j5);
                }
                return j5;
            }
            return j5;
        }
        return j5;
    }
}
