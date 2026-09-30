package xf;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class n extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ u red;
    public final /* synthetic */ Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, Object obj, Nd.c cVar) {
        super(2, cVar);
        this.red = uVar;
        this.silver = obj;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        n nVar = new n(this.red, this.silver, cVar);
        nVar.purple = obj;
        return nVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        Object jVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                u uVar = this.red;
                Object obj2 = this.silver;
                Result.Companion companion = Result.INSTANCE;
                this.alpha = 1;
                if (uVar.bravo(this, obj2) == aVar) {
                    return aVar;
                }
            }
            m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof kotlin.k)) {
            jVar = Unit.INSTANCE;
        } else {
            jVar = new j(Result.m207exceptionOrNullimpl(m206constructorimpl));
        }
        return new l(jVar);
    }
}
