package androidx.compose.foundation.layout;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class Q {
    public static final S alpha = new S(AbstractC0542h.alpha, T.d.f2060c);

    public static final S alpha(InterfaceC0539e interfaceC0539e, T.j jVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if (Intrinsics.areEqual(interfaceC0539e, AbstractC0542h.alpha) && Intrinsics.areEqual(jVar, T.d.f2060c)) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            c0585q.purple(-1073795767);
            c0585q.quebec(false);
            return alpha;
        }
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.purple(-1073744896);
        boolean z10 = true;
        if ((((i4 & 14) ^ 6) > 4 && c0585q2.golf(interfaceC0539e)) || (i4 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((((i4 & 112) ^ 48) <= 32 || !c0585q2.golf(jVar)) && (i4 & 48) != 32) {
            z10 = false;
        }
        boolean z11 = z2 | z10;
        Object jade = c0585q2.jade();
        if (z11 || jade == C0580l.alpha) {
            jade = new S(interfaceC0539e, jVar);
            c0585q2.f(jade);
        }
        S s3 = (S) jade;
        c0585q2.quebec(false);
        return s3;
    }
}
