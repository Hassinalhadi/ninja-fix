package F;

import bz.C0778c;
import gf.InterfaceC1787b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class S0 extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S0(ae.p pVar, Function0 function0, Object obj, Q0.n nVar, int i4) {
        super(0);
        this.alpha = i4;
        this.red = pVar;
        this.purple = function0;
        this.silver = obj;
        this.teal = nVar;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                C0103e2 c0103e2 = (C0103e2) this.red;
                EnumC0107f2 enumC0107f2 = (EnumC0107f2) ((androidx.compose.runtime.t0) ((androidx.compose.runtime.ax) c0103e2.bravo.golf)).getValue();
                EnumC0107f2 enumC0107f22 = EnumC0107f2.purple;
                vf.ab abVar = (vf.ab) this.silver;
                if (enumC0107f2 == enumC0107f22) {
                    androidx.compose.material3.internal.ad delta = c0103e2.bravo.delta();
                    if (delta.alpha.containsKey(EnumC0107f2.red)) {
                        vf.ad.zulu(abVar, null, null, new O0((C0778c) this.teal, null), 3);
                        vf.ad.zulu(abVar, null, null, new P0(c0103e2, null), 3);
                        return Unit.INSTANCE;
                    }
                }
                vf.ad.zulu(abVar, null, null, new Q0(c0103e2, null), 3).crimson(new R0((Function0) this.purple, 0));
                return Unit.INSTANCE;
            case 1:
                ((M0) this.red).bravo((Function0) this.purple, (C0126k1) this.silver, (Q0.n) this.teal);
                return Unit.INSTANCE;
            case 2:
                ((U0.v) this.red).charlie((Function0) this.purple, (U0.t) this.silver, (Q0.n) this.teal);
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.types.e.lima((kotlin.reflect.jvm.internal.impl.types.ao) this.red, ((InterfaceC1787b) this.silver).amber((p000if.d) this.teal), (p000if.d) this.purple));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S0(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        super(0);
        this.alpha = i4;
        this.red = obj;
        this.silver = obj2;
        this.teal = obj3;
        this.purple = obj4;
    }
}
