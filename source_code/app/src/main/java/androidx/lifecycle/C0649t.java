package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3439i;

/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0649t extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ InterfaceC3439i red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649t(InterfaceC3439i interfaceC3439i, Nd.c cVar) {
        super(2, cVar);
        this.red = interfaceC3439i;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0649t c0649t = new C0649t(this.red, cVar);
        c0649t.purple = obj;
        return c0649t;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0649t) create((aw) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C0648s c0648s = new C0648s((aw) this.purple);
            this.alpha = 1;
            if (this.red.collect(c0648s, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
