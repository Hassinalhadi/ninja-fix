package q0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ay extends T.r implements s0.aa {
    public Function1 alpha;
    public long purple;

    @Override // s0.aa
    public final /* synthetic */ void foxtrot(z zVar) {
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return true;
    }

    @Override // s0.aa
    public final void kilo(long j5) {
        if (!Q0.m.alpha(this.purple, j5)) {
            this.alpha.invoke(new Q0.m(j5));
            this.purple = j5;
        }
    }
}
