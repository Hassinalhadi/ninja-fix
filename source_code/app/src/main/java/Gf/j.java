package Gf;

import kotlin.jvm.internal.Intrinsics;
import s6.H5;

/* loaded from: classes2.dex */
public abstract class j {
    public static final String alpha(a aVar, long j5) {
        if (j5 == 0) {
            return "";
        }
        g gVar = aVar.alpha;
        if (gVar != null) {
            if (gVar.bravo() >= j5) {
                int i4 = gVar.bravo;
                String bravo = H5.bravo(gVar.alpha, i4, Math.min(gVar.charlie, ((int) j5) + i4));
                aVar.india(j5);
                return bravo;
            }
            byte[] delta = k.delta(aVar, (int) j5);
            return H5.bravo(delta, 0, delta.length);
        }
        throw new IllegalStateException("Unreacheable");
    }

    public static final String bravo(i iVar) {
        Intrinsics.echo(iVar, "<this>");
        iVar.request(Long.MAX_VALUE);
        return alpha(iVar.delta(), iVar.delta().red);
    }
}
