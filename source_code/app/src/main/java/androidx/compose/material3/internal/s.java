package androidx.compose.material3.internal;

import b.M;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class s implements d.aq {
    public final r alpha;
    public final /* synthetic */ t bravo;

    public s(t tVar) {
        this.bravo = tVar;
        this.alpha = new r(0, tVar);
    }

    @Override // d.aq
    public final Object alpha(d.am amVar, d.ai aiVar) {
        Object alpha = this.bravo.alpha(M.purple, new F2.m(this, amVar, (Nd.c) null), aiVar);
        if (alpha == Od.a.alpha) {
            return alpha;
        }
        return Unit.INSTANCE;
    }
}
