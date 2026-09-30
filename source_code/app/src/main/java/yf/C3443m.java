package yf;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: yf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3443m extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ s purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3443m(s sVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = sVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3443m(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3443m) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            this.alpha = 1;
            Object collect = this.purple.collect(zf.x.alpha, this);
            if (collect != aVar) {
                collect = Unit.INSTANCE;
            }
            if (collect == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
