package androidx.compose.foundation.layout;

import com.airbnb.lottie.compose.LottieConstants;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class A extends C {
    public B purple;
    public boolean red;

    @Override // androidx.compose.foundation.layout.C
    public final long b(q0.ao aoVar, long j5) {
        int delta;
        if (this.purple == B.alpha) {
            delta = aoVar.jade(Q0.a.hotel(j5));
        } else {
            delta = aoVar.delta(Q0.a.hotel(j5));
        }
        if (delta < 0) {
            delta = 0;
        }
        if (delta < 0) {
            Q0.j.alpha("height must be >= 0");
        }
        return Q0.b.hotel(0, LottieConstants.IterateForever, delta, delta);
    }

    @Override // androidx.compose.foundation.layout.C
    public final boolean c() {
        return this.red;
    }

    @Override // androidx.compose.foundation.layout.C, s0.ab
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.purple == B.alpha) {
            return interfaceC2401t.jade(i4);
        }
        return interfaceC2401t.delta(i4);
    }

    @Override // androidx.compose.foundation.layout.C, s0.ab
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        if (this.purple == B.alpha) {
            return interfaceC2401t.jade(i4);
        }
        return interfaceC2401t.delta(i4);
    }
}
