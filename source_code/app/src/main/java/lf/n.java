package lf;

import com.google.android.gms.measurement.internal.C1469t;
import gf.InterfaceC1789d;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.aj;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.az;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import pe.InterfaceC2349y;
import s6.AbstractC2823y6;
import se.aq;

/* loaded from: classes2.dex */
public final class n implements InterfaceC2079e {
    public static final n bravo = new n(0);
    public static final n charlie = new n(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ n(int i4) {
        this.alpha = i4;
    }

    @Override // lf.InterfaceC2079e
    public final String alpha() {
        switch (this.alpha) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }

    @Override // lf.InterfaceC2079e
    public final boolean bravo(Ae.f fVar) {
        kotlin.reflect.jvm.internal.impl.types.ae bravo2;
        switch (this.alpha) {
            case 0:
                aq secondParameter = (aq) fVar.peach().get(1);
                C1469t c1469t = me.l.delta;
                Intrinsics.delta(secondParameter, "secondParameter");
                InterfaceC2349y juliet = Ue.e.juliet(secondParameter);
                c1469t.getClass();
                InterfaceC2330f delta = AbstractC2347w.delta(juliet, me.m.jade);
                if (delta == null) {
                    bravo2 = null;
                } else {
                    al.purple.getClass();
                    al alVar = al.red;
                    List parameters = delta.tango().getParameters();
                    Intrinsics.delta(parameters, "kPropertyClass.typeConstructor.parameters");
                    Object k6 = CollectionsKt.k(parameters);
                    Intrinsics.delta(k6, "kPropertyClass.typeConstructor.parameters.single()");
                    bravo2 = kotlin.reflect.jvm.internal.impl.types.ab.bravo(alVar, delta, kotlin.collections.ab.juliet(new aj((pe.aq) k6)));
                }
                if (bravo2 == null) {
                    return false;
                }
                kotlin.reflect.jvm.internal.impl.types.y type = secondParameter.getType();
                Intrinsics.delta(type, "secondParameter.type");
                return InterfaceC1789d.alpha.bravo(bravo2, az.hotel(type, false));
            default:
                List<aq> peach = fVar.peach();
                Intrinsics.delta(peach, "functionDescriptor.valueParameters");
                if (!peach.isEmpty()) {
                    for (aq it : peach) {
                        Intrinsics.delta(it, "it");
                        if (Ue.e.alpha(it) || it.f13747c != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // lf.InterfaceC2079e
    public final String charlie(Ae.f fVar) {
        switch (this.alpha) {
            case 0:
                return AbstractC2823y6.alpha(this, fVar);
            default:
                return AbstractC2823y6.alpha(this, fVar);
        }
    }
}
