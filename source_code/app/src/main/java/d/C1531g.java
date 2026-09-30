package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1531g extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ R0 red;
    public final /* synthetic */ C1535i silver;
    public final /* synthetic */ InterfaceC1523c teal;
    public final /* synthetic */ vf.I white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531g(R0 r02, C1535i c1535i, InterfaceC1523c interfaceC1523c, vf.I i4, Nd.c cVar) {
        super(2, cVar);
        this.red = r02;
        this.silver = c1535i;
        this.teal = interfaceC1523c;
        this.white = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1531g c1531g = new C1531g(this.red, this.silver, this.teal, this.white, cVar);
        c1531g.purple = obj;
        return c1531g;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1531g) create((C1542l0) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C1542l0 c1542l0 = (C1542l0) this.purple;
            C1535i c1535i = this.silver;
            InterfaceC1523c interfaceC1523c = this.teal;
            float b2 = C1535i.b(c1535i, interfaceC1523c);
            R0 r02 = this.red;
            r02.echo = b2;
            Cb.ac acVar = new Cb.ac(c1535i, r02, this.white, c1542l0);
            Ac.l lVar = new Ac.l(c1535i, r02, interfaceC1523c, 11);
            this.alpha = 1;
            if (r02.alpha(acVar, lVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
