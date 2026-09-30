package y;

import g.AbstractC1720c;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.C5;
import t0.C2896N;
import t0.C2916h;
import t0.InterfaceC2897O;

/* loaded from: classes3.dex */
public final class ax extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C3344D purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(C3344D c3344d, Nd.c cVar) {
        super(2, cVar);
        this.purple = c3344d;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ax(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ax) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C3344D c3344d = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            if (D0.am.charlie(c3344d.oscar().bravo)) {
                return Unit.INSTANCE;
            }
            InterfaceC2897O interfaceC2897O = c3344d.hotel;
            if (interfaceC2897O != null) {
                C2896N alpha = AbstractC1720c.alpha(C5.foxtrot(c3344d.oscar()));
                this.alpha = 1;
                if (((C2916h) interfaceC2897O).alpha(alpha) == aVar) {
                    return aVar;
                }
            }
        }
        D0.g hotel = C5.hotel(c3344d.oscar(), c3344d.oscar().alpha.purple.length());
        D0.g golf = C5.golf(c3344d.oscar(), c3344d.oscar().alpha.purple.length());
        D0.d dVar = new D0.d(hotel);
        dVar.alpha(golf);
        D0.g foxtrot = dVar.foxtrot();
        int foxtrot2 = D0.am.foxtrot(c3344d.oscar().bravo);
        I0.aa golf2 = C3344D.golf(foxtrot, D0.ae.bravo(foxtrot2, foxtrot2));
        c3344d.charlie.invoke(golf2);
        c3344d.whiskey = new D0.am(golf2.bravo);
        c3344d.romeo(n.am.alpha);
        c3344d.alpha.echo = true;
        return Unit.INSTANCE;
    }
}
