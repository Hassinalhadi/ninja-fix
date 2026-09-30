package Ec;

import F.AbstractC0122j1;
import a0.C0366t;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;

/* loaded from: classes2.dex */
public abstract class s {
    public static final long alpha;

    static {
        a0.ao.delta(4292617766L);
        alpha = a0.ao.delta(4294898418L);
    }

    public static final void alpha(String str, Function0 onDismiss, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        int i10;
        int i11;
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1360743347);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i4 | i11;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(onDismiss)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i5 & 1, z2)) {
            float f5 = 20;
            c0585q = c0585q2;
            AbstractC0122j1.alpha(onDismiss, null, AbstractC0122j1.foxtrot(true, c0585q2, 6, 2), 0.0f, AbstractC2094g.delta(f5, f5), C0366t.echo, 0L, 0.0f, 0L, null, null, null, P.e.echo(-2138867786, new q(str, onDismiss), c0585q2), c0585q, ((i5 >> 3) & 14) | 196608, 4042);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new r(i4, 0, str, onDismiss);
        }
    }
}
