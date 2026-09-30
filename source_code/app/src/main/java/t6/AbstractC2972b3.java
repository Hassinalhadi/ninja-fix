package t6;

import B9.C0058p;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.InterfaceC2554n;
import x0.InterfaceC3278a;

/* renamed from: t6.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2972b3 {
    public static final Object alpha(InterfaceC2554n interfaceC2554n, Function0 function0, Pd.c cVar) {
        Object obj;
        C0058p c0058p;
        if (!interfaceC2554n.getNode().isAttached()) {
            return Unit.INSTANCE;
        }
        if (!interfaceC2554n.getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r parent$ui_release = interfaceC2554n.getNode().getParent$ui_release();
        s0.al golf = AbstractC2555o.golf(interfaceC2554n);
        loop0: while (true) {
            obj = null;
            if (golf == null) {
                break;
            }
            if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 524288) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 524288) != 0) {
                        T.r rVar = parent$ui_release;
                        J.e eVar = null;
                        while (rVar != null) {
                            if (rVar instanceof InterfaceC3278a) {
                                obj = rVar;
                                break loop0;
                            }
                            if ((rVar.getKindSet$ui_release() & 524288) != 0 && (rVar instanceof AbstractC2556p)) {
                                int i4 = 0;
                                for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                    if ((rVar2.getKindSet$ui_release() & 524288) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            rVar = rVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new J.e(new T.r[16]);
                                            }
                                            if (rVar != null) {
                                                eVar.bravo(rVar);
                                                rVar = null;
                                            }
                                            eVar.bravo(rVar2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            rVar = AbstractC2555o.bravo(eVar);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            golf = golf.victor();
            if (golf != null && (c0058p = golf.f13305x) != null) {
                parent$ui_release = (s0.g0) c0058p.golf;
            } else {
                parent$ui_release = null;
            }
        }
        InterfaceC3278a interfaceC3278a = (InterfaceC3278a) obj;
        if (interfaceC3278a == null) {
            return Unit.INSTANCE;
        }
        s0.L foxtrot = AbstractC2555o.foxtrot(interfaceC2554n);
        Object sierra = interfaceC3278a.sierra(foxtrot, new qa.j(11, function0, foxtrot), cVar);
        if (sierra == Od.a.alpha) {
            return sierra;
        }
        return Unit.INSTANCE;
    }

    public static final void bravo(Tf.u uVar, Tf.ah ahVar) {
        try {
            IOException iOException = null;
            for (Tf.ah ahVar2 : uVar.list(ahVar)) {
                try {
                    if (uVar.metadata(ahVar2).bravo) {
                        bravo(uVar, ahVar2);
                    }
                    uVar.delete(ahVar2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
