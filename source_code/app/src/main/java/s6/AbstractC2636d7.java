package s6;

/* renamed from: s6.d7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2636d7 {
    public static final /* synthetic */ int alpha = 0;

    public static final void alpha(long j5, long j6) {
        Q0.q[] qVarArr = Q0.p.bravo;
        if ((j5 & 1095216660480L) == 0 || (1095216660480L & j6) == 0) {
            Q0.j.alpha("Cannot perform operation for Unspecified type.");
        }
        if (!Q0.q.alpha(Q0.p.bravo(j5), Q0.p.bravo(j6))) {
            Q0.j.alpha("Cannot perform operation for " + ((Object) Q0.q.bravo(Q0.p.bravo(j5))) + " and " + ((Object) Q0.q.bravo(Q0.p.bravo(j6))));
        }
    }

    public static final long bravo(double d4) {
        return delta((float) d4, 4294967296L);
    }

    public static final long charlie(int i4) {
        return delta(i4, 4294967296L);
    }

    public static final long delta(float f5, long j5) {
        long floatToRawIntBits = j5 | (Float.floatToRawIntBits(f5) & 4294967295L);
        Q0.q[] qVarArr = Q0.p.bravo;
        return floatToRawIntBits;
    }
}
