package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class I extends Pd.i implements Xd.l {
    public Ef.a alpha;
    public Pd.i purple;
    public int red;
    public final /* synthetic */ Ef.c silver;
    public final /* synthetic */ Pd.i teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(Ef.c cVar, Xd.l lVar, Nd.c cVar2) {
        super(2, cVar2);
        this.silver = cVar;
        this.teal = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new I(this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r7.delta(r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [Xd.l] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Ef.a] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ef.c cVar;
        ?? r12;
        Ef.a aVar;
        Throwable th;
        Od.a aVar2 = Od.a.alpha;
        int i4 = this.red;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        aVar = this.alpha;
                        try {
                            ResultKt.alpha(obj);
                            ((Ef.c) aVar).foxtrot(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            ((Ef.c) aVar).foxtrot(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Xd.l lVar = (Xd.l) this.purple;
                ?? r32 = this.alpha;
                ResultKt.alpha(obj);
                cVar = r32;
                r12 = lVar;
            } else {
                ResultKt.alpha(obj);
                cVar = this.silver;
                this.alpha = cVar;
                Pd.i iVar = this.teal;
                this.purple = iVar;
                this.red = 1;
                r12 = iVar;
            }
            H h4 = new H(r12, null);
            this.alpha = cVar;
            this.purple = null;
            this.red = 2;
            if (vf.ad.mike(h4, this) != aVar2) {
                aVar = cVar;
                ((Ef.c) aVar).foxtrot(null);
                return Unit.INSTANCE;
            }
            return aVar2;
        } catch (Throwable th3) {
            aVar = cVar;
            th = th3;
            ((Ef.c) aVar).foxtrot(null);
            throw th;
        }
    }
}
