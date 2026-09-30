package androidx.compose.foundation.layout;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.layout.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0553t {
    public static final C0554u alpha = new C0554u(AbstractC0542h.charlie, T.d.f2062f);

    public static final C0554u alpha(InterfaceC0541g interfaceC0541g, T.i iVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if (Intrinsics.areEqual(interfaceC0541g, AbstractC0542h.charlie) && Intrinsics.areEqual(iVar, T.d.f2062f)) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            c0585q.purple(-1446569784);
            c0585q.quebec(false);
            return alpha;
        }
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.purple(-1446515937);
        boolean z10 = true;
        if ((((i4 & 14) ^ 6) > 4 && c0585q2.golf(interfaceC0541g)) || (i4 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i4 & 112) ^ 48) <= 32 || !c0585q2.golf(iVar)) && (i4 & 48) != 32) {
            z10 = false;
        }
        boolean z11 = z2 | z10;
        Object jade = c0585q2.jade();
        if (z11 || jade == C0580l.alpha) {
            jade = new C0554u(interfaceC0541g, iVar);
            c0585q2.f(jade);
        }
        C0554u c0554u = (C0554u) jade;
        c0585q2.quebec(false);
        return c0554u;
    }
}
