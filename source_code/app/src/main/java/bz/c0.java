package bz;

import androidx.compose.runtime.t0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class c0 extends Pd.i implements Xd.l {
    public Ef.c alpha;
    public G3.a purple;
    public int red;
    public final /* synthetic */ G3.a silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(G3.a aVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = aVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c0(this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Ef.c cVar;
        G3.a aVar;
        Od.a aVar2 = Od.a.alpha;
        int i4 = this.red;
        if (i4 != 0) {
            if (i4 == 1) {
                aVar = this.purple;
                cVar = this.alpha;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            G3.a aVar3 = this.silver;
            F f5 = (F) aVar3;
            f5.getClass();
            ((S.x) e0.bravo.getValue()).delta(f5, e0.alpha, f5.yellow);
            cVar = f5.f3440c;
            this.alpha = cVar;
            this.purple = aVar3;
            this.red = 1;
            if (cVar.delta(this) == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
        }
        try {
            ((F) aVar).silver = ((t0) ((F) aVar).purple).getValue();
            C3207k c3207k = ((F) aVar).f3439b;
            if (c3207k != null) {
                Result.Companion companion = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(((t0) ((F) aVar).purple).getValue()));
            }
            ((F) aVar).f3439b = null;
            cVar.foxtrot(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            cVar.foxtrot(null);
            throw th;
        }
    }
}
