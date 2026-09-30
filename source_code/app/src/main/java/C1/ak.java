package C1;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import vf.C3213q;

/* loaded from: classes3.dex */
public final class ak extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ap red;
    public final /* synthetic */ Pd.i silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ak(ap apVar, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = apVar;
        this.silver = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ak akVar = new ak(this.red, this.silver, cVar);
        akVar.purple = obj;
        return akVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ak) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        xf.j jVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        vf.ab abVar = (vf.ab) this.purple;
        C3213q bravo = vf.ad.bravo();
        ap apVar = this.red;
        as asVar = new as(this.silver, bravo, apVar.hotel.echo(), abVar.charlie());
        J2.i iVar = apVar.lima;
        Object mike = ((xf.e) iVar.red).mike(asVar);
        Throwable th = null;
        if (mike instanceof xf.j) {
            xf.k kVar = (xf.k) mike;
            if (kVar instanceof xf.j) {
                jVar = (xf.j) kVar;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                th = jVar.alpha;
            }
            if (th == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
            throw th;
        }
        if (!(mike instanceof xf.k)) {
            if (((AtomicInteger) ((Aa.m) iVar.silver).purple).getAndIncrement() == 0) {
                vf.ad.zulu((vf.ab) iVar.alpha, null, null, new aw(iVar, null), 3);
            }
            this.alpha = 1;
            Object tango = bravo.tango(this);
            if (tango == aVar) {
                return aVar;
            }
            return tango;
        }
        throw new IllegalStateException("Check failed.");
    }
}
