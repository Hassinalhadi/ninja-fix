package ld;

import Xd.l;
import io.ktor.utils.io.ak;
import io.ktor.utils.io.t;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import pd.AbstractC2304b;
import vf.ab;

/* renamed from: ld.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2071g extends Pd.i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Pd.i red;
    public final /* synthetic */ AbstractC2304b silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2071g(l lVar, AbstractC2304b abstractC2304b, Nd.c cVar) {
        super(2, cVar);
        this.red = (Pd.i) lVar;
        this.silver = abstractC2304b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C2071g c2071g = new C2071g(this.red, this.silver, cVar);
        c2071g.purple = obj;
        return c2071g;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2071g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        AbstractC2304b abstractC2304b = this.silver;
        try {
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    Result.m206constructorimpl(new Long(((Number) obj).longValue()));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            ab abVar = (ab) this.purple;
            ?? r12 = this.red;
            Result.Companion companion3 = Result.INSTANCE;
            this.purple = abVar;
            this.alpha = 1;
            if (r12.invoke(abstractC2304b, this) == aVar) {
                return aVar;
            }
        }
        Result.m206constructorimpl(Unit.INSTANCE);
        t delta = abstractC2304b.delta();
        this.purple = null;
        this.alpha = 2;
        obj = ak.foxtrot(delta, Long.MAX_VALUE, this);
    }
}
