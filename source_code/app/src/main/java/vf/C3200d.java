package vf;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3200d implements InterfaceC3205i {
    public final C3199c[] alpha;

    public C3200d(C3199c[] c3199cArr) {
        this.alpha = c3199cArr;
    }

    @Override // vf.InterfaceC3205i
    public final void alpha(Throwable th) {
        bravo();
    }

    public final void bravo() {
        for (C3199c c3199c : this.alpha) {
            aq aqVar = c3199c.white;
            if (aqVar != null) {
                aqVar.dispose();
            } else {
                Intrinsics.lima("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.alpha + ']';
    }
}
