package s6;

import k0.AbstractC1994a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class P5 {
    public static final long alpha(int i4) {
        long j5 = (i4 << 32) | (0 & 4294967295L);
        int i5 = AbstractC1994a.papa;
        return j5;
    }

    public static final J2.j bravo(J2.p pVar) {
        Intrinsics.echo(pVar, "<this>");
        return new J2.j(pVar.alpha, pVar.tango);
    }
}
