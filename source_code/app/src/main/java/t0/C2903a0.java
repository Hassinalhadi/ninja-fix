package t0;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: t0.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2903a0 extends Pd.i implements Xd.l {
    public xf.t alpha;
    public xf.b purple;
    public int red;
    public final /* synthetic */ xf.e silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2903a0(xf.e eVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = eVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2903a0(this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2903a0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x005b, B:19:0x0027, B:23:0x005e, B:26:0x0062, B:27:0x0063, B:34:0x0021, B:12:0x004b, B:14:0x0051), top: B:2:0x0006, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [xf.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xf.e eVar;
        xf.b bVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        CancellationException cancellationException = null;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    bVar = this.purple;
                    ?? r4 = this.alpha;
                    ResultKt.alpha(obj);
                    eVar = r4;
                    if (((Boolean) obj).booleanValue()) {
                        boolean z2 = false;
                        AbstractC2905b0.bravo.set(false);
                        synchronized (S.n.charlie) {
                            bv.am amVar = S.n.juliet.hotel;
                            if (amVar != null && amVar.hotel()) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            S.n.alpha();
                        }
                        this.alpha = eVar;
                        this.purple = bVar;
                        this.red = 1;
                        obj = bVar.charlie(this);
                        eVar = eVar;
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            eVar.foxtrot(null);
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                eVar = this.silver;
                bVar = new xf.b(eVar);
                this.alpha = eVar;
                this.purple = bVar;
                this.red = 1;
                obj = bVar.charlie(this);
                eVar = eVar;
                if (obj == aVar) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (th instanceof CancellationException) {
                    cancellationException = th;
                }
                if (cancellationException == null) {
                    cancellationException = vf.ad.alpha("Channel was consumed, consumer had failed", th);
                }
                eVar.foxtrot(cancellationException);
                throw th2;
            }
        }
    }
}
