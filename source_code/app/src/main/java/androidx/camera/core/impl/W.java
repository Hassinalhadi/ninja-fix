package androidx.camera.core.impl;

import s6.T7;

/* loaded from: classes3.dex */
public final class W implements androidx.camera.core.C {
    public final long bravo;
    public final androidx.camera.core.C charlie;

    public W(long j5, androidx.camera.core.C c3) {
        boolean z2;
        if (j5 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.bravo("Timeout must be non-negative.", z2);
        this.bravo = j5;
        this.charlie = c3;
    }

    @Override // androidx.camera.core.C
    public final long alpha() {
        return this.bravo;
    }

    @Override // androidx.camera.core.C
    public final androidx.camera.core.B bravo(C5.b bVar) {
        androidx.camera.core.B bravo = this.charlie.bravo(bVar);
        long j5 = this.bravo;
        if (j5 > 0) {
            if (bVar.bravo >= j5 - bravo.alpha) {
                return androidx.camera.core.B.delta;
            }
        }
        return bravo;
    }
}
