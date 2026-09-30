package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.runtime.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0569d0 implements vf.ab, InterfaceC0563a0 {
    public static final C0574g silver = new Object();
    public final Nd.h alpha;
    public final C0569d0 purple = this;
    public volatile Nd.h red;

    public C0569d0(Nd.h hVar) {
        this.alpha = hVar;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void alpha() {
        echo();
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void bravo() {
        echo();
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        Nd.h hVar;
        Nd.h hVar2;
        Nd.h hVar3 = this.red;
        if (hVar3 == null || hVar3 == silver) {
            androidx.compose.runtime.tooling.c cVar = (androidx.compose.runtime.tooling.c) this.alpha.get(androidx.compose.runtime.tooling.c.purple);
            if (cVar != null) {
                hVar = new C0567c0(cVar, this);
            } else {
                hVar = Nd.i.alpha;
            }
            synchronized (this.purple) {
                try {
                    Nd.h hVar4 = this.red;
                    if (hVar4 == null) {
                        Nd.h hVar5 = this.alpha;
                        hVar2 = hVar5.plus(new vf.J((vf.I) hVar5.get(vf.H.alpha))).plus(Nd.i.alpha).plus(hVar);
                    } else if (hVar4 == silver) {
                        Nd.h hVar6 = this.alpha;
                        vf.J j5 = new vf.J((vf.I) hVar6.get(vf.H.alpha));
                        j5.victor(new ForgottenCoroutineScopeException());
                        hVar2 = hVar6.plus(j5).plus(Nd.i.alpha).plus(hVar);
                    } else {
                        hVar2 = hVar4;
                    }
                    this.red = hVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar3 = hVar2;
        }
        Intrinsics.checkNotNull(hVar3);
        return hVar3;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void delta() {
    }

    public final void echo() {
        synchronized (this.purple) {
            try {
                Nd.h hVar = this.red;
                if (hVar == null) {
                    this.red = silver;
                } else {
                    vf.ad.juliet(hVar, new ForgottenCoroutineScopeException());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
