package W;

import s0.AbstractC2555o;
import s0.C2563x;

/* loaded from: classes3.dex */
public abstract class h {
    public static final boolean alpha(g gVar, long j5) {
        if (gVar.getNode().isAttached()) {
            C2563x c2563x = (C2563x) AbstractC2555o.golf(gVar).f13305x.echo;
            if (c2563x.india()) {
                long gray = c2563x.gray(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (gray >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (gray & 4294967295L));
                long j6 = gVar.red;
                float f5 = ((int) (j6 >> 32)) + intBitsToFloat;
                float f10 = ((int) (j6 & 4294967295L)) + intBitsToFloat2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
                if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f5) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j5 & 4294967295L));
                    if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f10) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
