package vg;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;

/* loaded from: classes2.dex */
public final class q extends s {
    public final f delta;
    public final boolean echo;

    public q(ap apVar, Call.Factory factory, m mVar, f fVar, boolean z2) {
        super(apVar, factory, mVar);
        this.delta = fVar;
        this.echo = z2;
    }

    @Override // vg.s
    public final Object bravo(y yVar, Object[] objArr) {
        d dVar = (d) this.delta.adapt(yVar);
        Nd.c cVar = (Nd.c) objArr[objArr.length - 1];
        try {
            if (this.echo) {
                Intrinsics.charlie(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
                return A.charlie(dVar, cVar);
            }
            return A.bravo(dVar, cVar);
        } catch (LinkageError e) {
            throw e;
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (VirtualMachineError e5) {
            throw e5;
        } catch (Throwable th) {
            A.romeo(cVar, th);
            return Od.a.alpha;
        }
    }
}
