package ld;

import Xd.l;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import pd.AbstractC2304b;
import vf.ab;

/* renamed from: ld.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2070f extends Pd.i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Pd.i red;
    public final /* synthetic */ AbstractC2304b silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2070f(l lVar, AbstractC2304b abstractC2304b, Nd.c cVar) {
        super(2, cVar);
        this.red = (Pd.i) lVar;
        this.silver = abstractC2304b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C2070f c2070f = new C2070f(this.red, this.silver, cVar);
        c2070f.purple = obj;
        return c2070f;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2070f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
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
                ?? r5 = this.red;
                AbstractC2304b abstractC2304b = this.silver;
                Result.Companion companion = Result.INSTANCE;
                this.alpha = 1;
                if (r5.invoke(abstractC2304b, this) == aVar) {
                    return aVar;
                }
            }
            m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        return new Result(m206constructorimpl);
    }
}
