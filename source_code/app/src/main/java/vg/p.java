package vg;

import okhttp3.Call;

/* loaded from: classes2.dex */
public final class p extends s {
    public final f delta;

    public p(ap apVar, Call.Factory factory, m mVar, f fVar) {
        super(apVar, factory, mVar);
        this.delta = fVar;
    }

    @Override // vg.s
    public final Object bravo(y yVar, Object[] objArr) {
        return this.delta.adapt(yVar);
    }
}
