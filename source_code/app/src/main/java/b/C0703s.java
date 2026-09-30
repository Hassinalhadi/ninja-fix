package b;

import Yb.C0331t0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d.J0;
import d.O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n.C2125E;
import r.C2478b;
import s0.AbstractC2555o;
import s6.AbstractC2683j0;
import t.C2880f;
import v.C3162a;
import v.C3163b;

/* renamed from: b.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0703s implements PointerInputEventHandler {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ C0703s(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.internal.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [d.ac] */
    /* JADX WARN: Type inference failed for: r7v3, types: [d.ac] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(m0.u uVar, Nd.c cVar) {
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                Object bravo = AbstractC2683j0.bravo(uVar, new r((C0704t) obj, null), cVar);
                if (bravo != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return bravo;
            case 1:
                ai aiVar = (ai) obj;
                boolean z2 = aiVar.f3307a;
                ah ahVar = new ah(aiVar, null);
                Ya.c cVar2 = new Ya.c(16, aiVar);
                d.ak akVar = O0.alpha;
                Object mike = vf.ad.mike(new J0(uVar, ahVar, null, null, cVar2, null), cVar);
                Od.a aVar = Od.a.alpha;
                if (mike != aVar) {
                    mike = Unit.INSTANCE;
                }
                if (mike != aVar) {
                    return Unit.INSTANCE;
                }
                return mike;
            case 2:
                bn.g gVar = new bn.g();
                ?? obj2 = new Object();
                obj2.alpha = AbstractC2555o.foxtrot((d.aj) obj).tango(0L);
                final d.aj ajVar = (d.aj) obj;
                final int i4 = 0;
                final int i5 = 1;
                Object mike2 = vf.ad.mike(new d.ad(uVar, ajVar, new Ec.af(8, ajVar, gVar), new Cb.ac(gVar, uVar, ajVar, 15), new Function0() { // from class: d.ac
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                xf.e eVar = ajVar.yellow;
                                if (eVar != null) {
                                    eVar.mike(r.alpha);
                                }
                                return Unit.INSTANCE;
                            default:
                                return Boolean.valueOf(!ajVar.l());
                        }
                    }
                }, new Function0() { // from class: d.ac
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                xf.e eVar = ajVar.yellow;
                                if (eVar != null) {
                                    eVar.mike(r.alpha);
                                }
                                return Unit.INSTANCE;
                            default:
                                return Boolean.valueOf(!ajVar.l());
                        }
                    }
                }, new Ac.n(ajVar, (Object) obj2, gVar, 10), null), cVar);
                if (mike2 != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return mike2;
            case 3:
                Object bravo2 = AbstractC2683j0.bravo(uVar, new C2478b(new C0331t0(1, (C2880f) obj, C2880f.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 18), null), cVar);
                Od.a aVar2 = Od.a.alpha;
                if (bravo2 != aVar2) {
                    bravo2 = Unit.INSTANCE;
                }
                if (bravo2 != aVar2) {
                    return Unit.INSTANCE;
                }
                return bravo2;
            case 4:
                Object bravo3 = AbstractC2683j0.bravo(uVar, new C3162a((C3163b) obj, null), cVar);
                if (bravo3 != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return bravo3;
            case 5:
                Object b2 = ((m0.ah) uVar).b(new y.af((Function1) obj, null), cVar);
                if (b2 != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return b2;
            default:
                Object mike3 = vf.ad.mike(new C2125E(uVar, (n.K) obj, null), cVar);
                Od.a aVar3 = Od.a.alpha;
                if (mike3 != aVar3) {
                    mike3 = Unit.INSTANCE;
                }
                if (mike3 != aVar3) {
                    return Unit.INSTANCE;
                }
                return mike3;
        }
    }
}
