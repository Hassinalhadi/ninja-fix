package b;

import f.C1670g;
import f.C1671h;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: b.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0700o extends Pd.i implements Xd.l {
    public final /* synthetic */ AbstractC0701p alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0700o(AbstractC0701p abstractC0701p, Nd.c cVar) {
        super(2, cVar);
        this.alpha = abstractC0701p;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0700o(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0700o) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AbstractC0701p abstractC0701p = this.alpha;
        C1670g c1670g = abstractC0701p.f3313h;
        if (c1670g != null) {
            C1671h c1671h = new C1671h(c1670g);
            InterfaceC1673j interfaceC1673j = abstractC0701p.red;
            if (interfaceC1673j != null) {
                vf.ad.zulu(abstractC0701p.getCoroutineScope(), null, null, new C0688c(interfaceC1673j, c1671h, null), 3);
            }
            abstractC0701p.f3313h = null;
        }
        return Unit.INSTANCE;
    }
}
