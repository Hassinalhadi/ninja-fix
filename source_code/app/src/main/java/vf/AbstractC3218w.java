package vf;

import kotlin.jvm.internal.Ref;

/* renamed from: vf.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3218w {
    public static final Nd.h alpha(Nd.h hVar, Nd.h hVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.fold(bool, new ud.f(2))).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, new ud.f(2))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.alpha = hVar2;
        Nd.i iVar = Nd.i.alpha;
        Nd.h hVar3 = (Nd.h) hVar.fold(iVar, new ud.f(3));
        if (booleanValue2) {
            objectRef.alpha = ((Nd.h) objectRef.alpha).fold(iVar, new ud.f(4));
        }
        return hVar3.plus((Nd.h) objectRef.alpha);
    }

    public static final Nd.h bravo(ab abVar, Nd.h hVar) {
        Nd.h alpha = alpha(abVar.charlie(), hVar, true);
        Cf.e eVar = ao.alpha;
        if (alpha != eVar && alpha.get(Nd.d.alpha) == null) {
            return alpha.plus(eVar);
        }
        return alpha;
    }

    public static final h0 charlie(Nd.c cVar, Nd.h hVar, Object obj) {
        h0 h0Var = null;
        if ((cVar instanceof Pd.d) && hVar.get(i0.alpha) != null) {
            Pd.d dVar = (Pd.d) cVar;
            while (true) {
                if ((dVar instanceof ak) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof h0) {
                    h0Var = (h0) dVar;
                    break;
                }
            }
            if (h0Var != null) {
                h0Var.f(hVar, obj);
            }
        }
        return h0Var;
    }
}
