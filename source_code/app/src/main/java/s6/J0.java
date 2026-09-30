package s6;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import f.C1669f;
import f.InterfaceC1673j;

/* loaded from: classes2.dex */
public abstract class J0 {
    public static final /* synthetic */ int alpha = 0;

    public static final androidx.compose.runtime.ax alpha(InterfaceC1673j interfaceC1673j, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (jade == asVar) {
            jade = C0564b.zulu(Boolean.FALSE);
            c0585q.f(jade);
        }
        androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
        if ((((i4 & 14) ^ 6) > 4 && c0585q.golf(interfaceC1673j)) || (i4 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object jade2 = c0585q.jade();
        if (z2 || jade2 == asVar) {
            jade2 = new C1669f(interfaceC1673j, axVar, null);
            c0585q.f(jade2);
        }
        C0564b.foxtrot((Xd.l) jade2, c0585q, interfaceC1673j);
        return axVar;
    }
}
