package androidx.compose.foundation.layout;

import com.airbnb.lottie.compose.LottieConstants;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class D extends C {
    public B purple;
    public boolean red;

    @Override // androidx.compose.foundation.layout.C
    public final long b(q0.ao aoVar, long j5) {
        int romeo;
        if (this.purple == B.alpha) {
            romeo = aoVar.lima(Q0.a.golf(j5));
        } else {
            romeo = aoVar.romeo(Q0.a.golf(j5));
        }
        if (romeo < 0) {
            romeo = 0;
        }
        if (romeo < 0) {
            Q0.j.alpha("width must be >= 0");
        }
        return Q0.b.hotel(romeo, romeo, 0, LottieConstants.IterateForever);
    }

    @Override // androidx.compose.foundation.layout.C
    public final boolean c() {
        return this.red;
    }

    @Override // androidx.compose.foundation.layout.C, s0.ab
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.purple == B.alpha) {
            return interfaceC2401t.lima(i4);
        }
        return interfaceC2401t.romeo(i4);
    }

    @Override // androidx.compose.foundation.layout.C, s0.ab
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.purple == B.alpha) {
            return interfaceC2401t.lima(i4);
        }
        return interfaceC2401t.romeo(i4);
    }
}
