package Lb;

import kotlin.ResultKt;
import kotlin.Unit;
import t0.InterfaceC2937r0;

/* renamed from: Lb.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0240x extends Pd.i implements Xd.l {
    public final /* synthetic */ String alpha;
    public final /* synthetic */ Y.s purple;
    public final /* synthetic */ InterfaceC2937r0 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240x(String str, Y.s sVar, InterfaceC2937r0 interfaceC2937r0, Nd.c cVar) {
        super(2, cVar);
        this.alpha = str;
        this.purple = sVar;
        this.red = interfaceC2937r0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0240x(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0240x) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (this.alpha.length() == 0) {
            Y.s.bravo(this.purple);
            InterfaceC2937r0 interfaceC2937r0 = this.red;
            if (interfaceC2937r0 != null) {
                ((t0.U) interfaceC2937r0).bravo();
            }
        }
        return Unit.INSTANCE;
    }
}
