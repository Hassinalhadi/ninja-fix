package n;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.internal.measurement.C1290a1;
import d.O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s0.AbstractC2555o;
import s6.AbstractC2683j0;
import y.C3344D;
import y.C3360ad;

/* loaded from: classes3.dex */
public final class r implements PointerInputEventHandler {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ r(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(m0.u uVar, Nd.c cVar) {
        switch (this.alpha) {
            case 0:
                Object delta = O0.delta(uVar, new Ec.a(2, (androidx.compose.runtime.ax) this.purple, (Function1) this.red), cVar);
                if (delta != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return delta;
            case 1:
                Object mike = vf.ad.mike(new aj(uVar, (K) this.purple, (C3344D) this.red, null), cVar);
                if (mike != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return mike;
            default:
                m0.ah ahVar = (m0.ah) uVar;
                ahVar.getClass();
                Object bravo = AbstractC2683j0.bravo(uVar, new C3360ad((C1290a1) this.purple, new B0.a(AbstractC2555o.golf(ahVar).f13300s), (K) this.red, null), cVar);
                if (bravo != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return bravo;
        }
    }
}
