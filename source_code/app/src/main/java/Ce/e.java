package Ce;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import oe.C2234e;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import t6.AbstractC3062u;
import ve.AbstractC3192d;
import ve.C3193e;

/* loaded from: classes2.dex */
public final class e extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ f purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair;
        switch (this.alpha) {
            case 0:
                f fVar = this.purple;
                ArrayList bravo = fVar.bravo.bravo();
                ArrayList arrayList = new ArrayList();
                Iterator it = bravo.iterator();
                while (it.hasNext()) {
                    Ee.a aVar = (Ee.a) it.next();
                    Ne.f fVar2 = ((ve.f) aVar).alpha;
                    if (fVar2 == null) {
                        fVar2 = ye.ab.bravo;
                    }
                    Se.g charlie = fVar.charlie(aVar);
                    if (charlie != null) {
                        pair = new Pair(fVar2, charlie);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return kotlin.collections.y.yankee(arrayList);
            case 1:
                return AbstractC3192d.alpha(AbstractC3062u.bravo(AbstractC3062u.alpha(this.purple.bravo.alpha))).bravo();
            default:
                f fVar3 = this.purple;
                Ne.c alpha = fVar3.alpha();
                C3193e c3193e = fVar3.bravo;
                if (alpha == null) {
                    return hf.i.charlie(hf.h.f12744x, c3193e.toString());
                }
                B9.ab abVar = fVar3.alpha;
                InterfaceC2330f bravo2 = C2234e.bravo(alpha, ((Be.a) abVar.purple).oscar.silver);
                if (bravo2 == null) {
                    ve.q qVar = new ve.q(AbstractC3062u.bravo(AbstractC3062u.alpha(c3193e.alpha)));
                    Be.a aVar2 = (Be.a) abVar.purple;
                    D8.c cVar = aVar2.kilo;
                    cVar.getClass();
                    O7.j jVar = (O7.j) cVar.purple;
                    if (jVar != null) {
                        bravo2 = jVar.kilo(qVar);
                        if (bravo2 == null) {
                            bravo2 = AbstractC2347w.foxtrot(aVar2.oscar, Ne.b.juliet(alpha), (J2.i) aVar2.delta.charlie().lima);
                        }
                    } else {
                        Intrinsics.lima("resolver");
                        throw null;
                    }
                }
                return bravo2.oscar();
        }
    }
}
