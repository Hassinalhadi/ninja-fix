package j;

import kotlin.jvm.functions.Function1;

/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1922e implements androidx.compose.foundation.lazy.layout.p {
    public final Xd.l alpha;
    public final Cb.m bravo;
    public final P.d charlie;

    public C1922e(Xd.l lVar, Cb.m mVar, P.d dVar) {
        this.alpha = lVar;
        this.bravo = mVar;
        this.charlie = dVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.p
    public final Function1 getKey() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.p
    public final Function1 getType() {
        return this.bravo;
    }
}
