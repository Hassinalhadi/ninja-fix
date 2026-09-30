package vf;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* loaded from: classes2.dex */
public final class Z extends Af.q {
    public final /* synthetic */ int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(Nd.h hVar, Nd.c cVar, int i4) {
        super(cVar, hVar);
        this.teal = i4;
    }

    @Override // vf.P
    public final boolean zulu(Throwable th) {
        switch (this.teal) {
            case 0:
                return false;
            default:
                if (th instanceof ChildCancelledException) {
                    return true;
                }
                return victor(th);
        }
    }
}
