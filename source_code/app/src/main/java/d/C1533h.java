package d;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1533h extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C1535i red;
    public final /* synthetic */ R0 silver;
    public final /* synthetic */ InterfaceC1523c teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1533h(C1535i c1535i, R0 r02, InterfaceC1523c interfaceC1523c, Nd.c cVar) {
        super(2, cVar);
        this.red = c1535i;
        this.silver = r02;
        this.teal = interfaceC1523c;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1533h c1533h = new C1533h(this.red, this.silver, this.teal, cVar);
        c1533h.purple = obj;
        return c1533h;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1533h) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C1535i c1535i = this.red;
        try {
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    vf.I sierra = vf.ad.sierra(((vf.ab) this.purple).charlie());
                    c1535i.f12002b = true;
                    C1548o0 c1548o0 = c1535i.purple;
                    b.M m4 = b.M.alpha;
                    C1531g c1531g = new C1531g(this.silver, c1535i, this.teal, sierra, null);
                    this.alpha = 1;
                    if (c1548o0.foxtrot(m4, c1531g, this) == aVar) {
                        return aVar;
                    }
                }
                c1535i.silver.bravo();
                c1535i.f12002b = false;
                c1535i.silver.alpha(null);
                c1535i.white = false;
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            c1535i.f12002b = false;
            c1535i.silver.alpha(null);
            c1535i.white = false;
            throw th;
        }
    }
}
