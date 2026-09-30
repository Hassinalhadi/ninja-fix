package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;

/* loaded from: classes3.dex */
public final class aj {
    public final J.e alpha = new J.e(new ag[16]);
    public final androidx.compose.runtime.ax bravo = C0564b.zulu(Boolean.FALSE);
    public long charlie = Long.MIN_VALUE;
    public final androidx.compose.runtime.ax delta = C0564b.zulu(Boolean.TRUE);

    public final void alpha(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-318043801);
        if (c0585q.india(this)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(null);
                c0585q.f(jade);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
            if (!((Boolean) ((t0) this.delta).getValue()).booleanValue() && !((Boolean) ((t0) this.bravo).getValue()).booleanValue()) {
                c0585q.purple(-143396709);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-144783432);
                boolean india = c0585q.india(this);
                Object jade2 = c0585q.jade();
                if (india || jade2 == asVar) {
                    jade2 = new ai(axVar, this, null);
                    c0585q.f(jade2);
                }
                C0564b.foxtrot((Xd.l) jade2, c0585q, this);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new af(this, i4, 0);
        }
    }
}
