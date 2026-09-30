package b;

import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: b.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0699n extends Pd.i implements Xd.l {
    public final /* synthetic */ AbstractC0701p alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0699n(AbstractC0701p abstractC0701p, Nd.c cVar) {
        super(2, cVar);
        this.alpha = abstractC0701p;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0699n(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0699n) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, f.g] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AbstractC0701p abstractC0701p = this.alpha;
        if (abstractC0701p.f3313h == null) {
            ?? obj2 = new Object();
            InterfaceC1673j interfaceC1673j = abstractC0701p.red;
            if (interfaceC1673j != null) {
                vf.ad.zulu(abstractC0701p.getCoroutineScope(), null, null, new C0687b(interfaceC1673j, obj2, null), 3);
            }
            abstractC0701p.f3313h = obj2;
        }
        return Unit.INSTANCE;
    }
}
