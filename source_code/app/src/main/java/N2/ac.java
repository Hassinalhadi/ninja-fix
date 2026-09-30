package N2;

import androidx.compose.foundation.layout.C0552s;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import q0.InterfaceC2392k;
import yf.N;

/* loaded from: classes3.dex */
public final class ac implements Xd.m {
    public final /* synthetic */ Y2.i alpha;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ n red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ T.f teal;
    public final /* synthetic */ InterfaceC2392k white;

    public ac(Y2.i iVar, P.d dVar, n nVar, String str, T.f fVar, InterfaceC2392k interfaceC2392k) {
        this.alpha = iVar;
        this.purple = dVar;
        this.red = nVar;
        this.silver = str;
        this.teal = fVar;
        this.white = interfaceC2392k;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4;
        C0552s c0552s = (C0552s) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            if (((C0585q) interfaceC0581m).golf(c0552s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            intValue |= i4;
        }
        if ((intValue & 91) == 18) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        v vVar = (v) this.alpha;
        Q0.a aVar = new Q0.a(c0552s.bravo);
        N n5 = vVar.alpha;
        n5.getClass();
        n5.juliet(null, aVar);
        this.purple.invoke(new aa(c0552s, this.red, this.silver, this.teal, this.white), interfaceC0581m, 0);
        return Unit.INSTANCE;
    }
}
