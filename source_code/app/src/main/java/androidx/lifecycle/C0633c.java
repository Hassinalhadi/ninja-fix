package androidx.lifecycle;

import Yb.C0312j0;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0633c extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ av.ao red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0633c(av.ao aoVar, Nd.c cVar) {
        super(2, cVar);
        this.red = aoVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0633c c0633c = new C0633c(this.red, cVar);
        c0633c.purple = obj;
        return c0633c;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0633c) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        av.ao aoVar = this.red;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            aw awVar = new aw((C0639i) aoVar.alpha, ((vf.ab) this.purple).charlie());
            C0649t c0649t = (C0649t) aoVar.purple;
            this.alpha = 1;
            if (c0649t.invoke(awVar, this) == aVar) {
                return aVar;
            }
        }
        ((C0312j0) aoVar.silver).invoke();
        return Unit.INSTANCE;
    }
}
