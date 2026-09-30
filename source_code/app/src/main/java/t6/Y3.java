package t6;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;

/* loaded from: classes2.dex */
public abstract class Y3 {
    public static final /* synthetic */ int alpha = 0;

    public static final void alpha(boolean z2, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1818896922);
        if (c0585q.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.india(lVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) == 18 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            AbstractC3022l3.alpha(z2, lVar, c0585q, i12 & 126);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Jb.ae(z2, lVar, i4);
        }
    }
}
