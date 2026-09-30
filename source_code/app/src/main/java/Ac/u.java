package Ac;

import F.AbstractC0127k2;
import a0.ao;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;

/* loaded from: classes2.dex */
public abstract class u {
    public static final long alpha = ao.delta(4280468830L);
    public static final long bravo = ao.delta(4293983732L);
    public static final long charlie = ao.delta(4294538006L);
    public static final long delta = ao.delta(4294965229L);

    public static final void alpha(String str, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        long j5;
        long j6;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-378870993);
        if (c0585q.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4;
        if ((i12 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            boolean areEqual = Intrinsics.areEqual(str, "CURRENTLY_ACTIVE");
            if (areEqual) {
                j5 = bravo;
            } else {
                j5 = delta;
            }
            if (areEqual) {
                j6 = alpha;
            } else {
                j6 = charlie;
            }
            if (areEqual) {
                i10 = 977204309;
                i11 = R.string.filter_active;
            } else {
                i10 = 977205712;
                i11 = R.string.upcoming;
            }
            AbstractC0127k2.alpha(null, AbstractC2094g.bravo(100), j5, 0L, 0.0f, 0.0f, null, P.e.echo(560332276, new t(Q0.c.oscar(c0585q, i10, i11, c0585q, false), j6), c0585q), c0585q, 12582912, 121);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new i(str, i4, 1);
        }
    }
}
