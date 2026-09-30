package a0;

import kotlin.jvm.internal.Intrinsics;
import t6.L2;

/* loaded from: classes3.dex */
public final class aj extends ao {
    public final Z.d echo;
    public final C0354h foxtrot;

    public aj(Z.d dVar) {
        C0354h c0354h;
        this.echo = dVar;
        if (!L2.india(dVar)) {
            c0354h = AbstractC0358l.alpha();
            Q0.c.juliet(c0354h, dVar);
        } else {
            c0354h = null;
        }
        this.foxtrot = c0354h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        if (Intrinsics.areEqual(this.echo, ((aj) obj).echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.echo.hashCode();
    }

    @Override // a0.ao
    public final Z.c oscar() {
        Z.d dVar = this.echo;
        return new Z.c(dVar.alpha, dVar.bravo, dVar.charlie, dVar.delta);
    }
}
