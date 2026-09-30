package A2;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class t extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Pd.i red;
    public final /* synthetic */ V0.h silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Xd.l lVar, V0.h hVar, Nd.c cVar) {
        super(2, cVar);
        this.red = (Pd.i) lVar;
        this.silver = hVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        t tVar = new t(this.red, this.silver, cVar);
        tVar.purple = obj;
        return tVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        V0.h hVar = this.silver;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                vf.ab abVar = (vf.ab) this.purple;
                ?? r12 = this.red;
                this.alpha = 1;
                obj = r12.invoke(abVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            hVar.bravo(obj);
        } catch (CancellationException unused) {
            hVar.charlie();
        } catch (Throwable th) {
            hVar.delta(th);
        }
        return Unit.INSTANCE;
    }
}
