package je;

import ef.InterfaceC1654b;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import oe.C2230a;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import s6.AbstractC2617b6;
import s6.AbstractC2661g5;
import se.AbstractC2863m;
import t6.K3;

/* loaded from: classes2.dex */
public abstract class Y {
    public static final Ne.b alpha = Ne.b.juliet(new Ne.c("java.lang.Void"));

    /* JADX WARN: Multi-variable type inference failed */
    public static C1971j alpha(InterfaceC2345u interfaceC2345u) {
        String bravo = K3.bravo(interfaceC2345u);
        if (bravo == null) {
            if (interfaceC2345u instanceof se.ai) {
                String bravo2 = Ue.e.kilo(interfaceC2345u).getName().bravo();
                Intrinsics.delta(bravo2, "descriptor.propertyIfAccessor.name.asString()");
                bravo = ye.aa.alpha(bravo2);
            } else if (interfaceC2345u instanceof se.aj) {
                String bravo3 = Ue.e.kilo(interfaceC2345u).getName().bravo();
                Intrinsics.delta(bravo3, "descriptor.propertyIfAccessor.name.asString()");
                bravo = ye.aa.bravo(bravo3);
            } else {
                bravo = ((AbstractC2863m) interfaceC2345u).getName().bravo();
                Intrinsics.delta(bravo, "descriptor.name.asString()");
            }
        }
        return new C1971j(new Me.e(bravo, AbstractC2661g5.delta(interfaceC2345u, 1)));
    }

    public static V bravo(pe.al possiblyOverriddenProperty) {
        ue.f fVar;
        ve.u uVar;
        pe.an anVar;
        ue.f fVar2;
        ve.u uVar2;
        ve.z zVar;
        Intrinsics.echo(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        pe.al alpha2 = ((pe.al) Qe.e.tango(possiblyOverriddenProperty)).alpha();
        Intrinsics.delta(alpha2, "unwrapFakeOverride(possi…rriddenProperty).original");
        Method method = null;
        C1971j c1971j = null;
        if (alpha2 instanceof ef.q) {
            ef.q qVar = (ef.q) alpha2;
            Oe.n propertySignature = Le.k.delta;
            Intrinsics.delta(propertySignature, "propertySignature");
            Ie.ag agVar = qVar.f12599t;
            Le.e eVar = (Le.e) AbstractC2617b6.charlie(agVar, propertySignature);
            if (eVar != null) {
                return new C1974m(alpha2, agVar, eVar, qVar.f12600u, qVar.f12601v);
            }
        } else if (alpha2 instanceof Ae.g) {
            pe.an echo = ((Ae.g) alpha2).echo();
            if (echo instanceof ue.f) {
                fVar = (ue.f) echo;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                uVar = fVar.alpha;
            } else {
                uVar = null;
            }
            if (uVar instanceof ve.w) {
                return new C1972k(((ve.w) uVar).alpha);
            }
            if (uVar instanceof ve.z) {
                Method method2 = ((ve.z) uVar).alpha;
                se.aj charlie = alpha2.charlie();
                if (charlie != null) {
                    anVar = charlie.echo();
                } else {
                    anVar = null;
                }
                if (anVar instanceof ue.f) {
                    fVar2 = (ue.f) anVar;
                } else {
                    fVar2 = null;
                }
                if (fVar2 != null) {
                    uVar2 = fVar2.alpha;
                } else {
                    uVar2 = null;
                }
                if (uVar2 instanceof ve.z) {
                    zVar = (ve.z) uVar2;
                } else {
                    zVar = null;
                }
                if (zVar != null) {
                    method = zVar.alpha;
                }
                return new C1973l(method2, method);
            }
            throw new Q("Incorrect resolution sequence for Java field " + alpha2 + " (source = " + uVar + ')');
        }
        se.ai bravo = alpha2.bravo();
        Intrinsics.checkNotNull(bravo);
        C1971j alpha3 = alpha(bravo);
        se.aj charlie2 = alpha2.charlie();
        if (charlie2 != null) {
            c1971j = alpha(charlie2);
        }
        return new C1975n(alpha3, c1971j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static V charlie(InterfaceC2345u possiblySubstitutedFunction) {
        ue.f fVar;
        ue.f fVar2;
        ve.u uVar;
        Method method;
        Intrinsics.echo(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC2345u alpha2 = ((InterfaceC2345u) Qe.e.tango(possiblySubstitutedFunction)).alpha();
        Intrinsics.delta(alpha2, "unwrapFakeOverride(possi…titutedFunction).original");
        if (alpha2 instanceof InterfaceC1654b) {
            InterfaceC1654b interfaceC1654b = (InterfaceC1654b) alpha2;
            Oe.v beige = interfaceC1654b.beige();
            if (beige instanceof Ie.y) {
                Oe.h hVar = Me.h.alpha;
                Me.e charlie = Me.h.charlie((Ie.y) beige, interfaceC1654b.plum(), interfaceC1654b.magenta());
                if (charlie != null) {
                    return new C1971j(charlie);
                }
            }
            if (beige instanceof Ie.l) {
                Oe.h hVar2 = Me.h.alpha;
                Me.e alpha3 = Me.h.alpha((Ie.l) beige, interfaceC1654b.plum(), interfaceC1654b.magenta());
                if (alpha3 != null) {
                    InterfaceC2335k lima = possiblySubstitutedFunction.lima();
                    Intrinsics.delta(lima, "possiblySubstitutedFunction.containingDeclaration");
                    if (Qe.g.bravo(lima)) {
                        return new C1971j(alpha3);
                    }
                    return new C1970i(alpha3);
                }
            }
            return alpha(alpha2);
        }
        Object obj = null;
        ve.z zVar = null;
        if (alpha2 instanceof Ae.f) {
            pe.an echo = ((Ae.f) alpha2).echo();
            if (echo instanceof ue.f) {
                fVar2 = (ue.f) echo;
            } else {
                fVar2 = null;
            }
            if (fVar2 != null) {
                uVar = fVar2.alpha;
            } else {
                uVar = null;
            }
            if (uVar instanceof ve.z) {
                zVar = (ve.z) uVar;
            }
            if (zVar != null && (method = zVar.alpha) != null) {
                return new C1969h(method);
            }
            throw new Q("Incorrect resolution sequence for Java method " + alpha2);
        }
        if (alpha2 instanceof Ae.b) {
            pe.an echo2 = ((Ae.b) alpha2).echo();
            if (echo2 instanceof ue.f) {
                fVar = (ue.f) echo2;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                obj = fVar.alpha;
            }
            if (obj instanceof ve.t) {
                return new C1968g(((ve.t) obj).alpha);
            }
            if (obj instanceof ve.q) {
                ve.q qVar = (ve.q) obj;
                if (qVar.alpha.isAnnotation()) {
                    return new C1967f(qVar.alpha);
                }
            }
            throw new Q("Incorrect resolution sequence for Java constructor " + alpha2 + " (" + obj + ')');
        }
        AbstractC2863m abstractC2863m = (AbstractC2863m) alpha2;
        if ((abstractC2863m.getName().equals(me.n.charlie) && Qe.l.november(alpha2)) || ((abstractC2863m.getName().equals(me.n.alpha) && Qe.l.november(alpha2)) || (Intrinsics.areEqual(abstractC2863m.getName(), C2230a.echo) && alpha2.peach().isEmpty()))) {
            return alpha(alpha2);
        }
        throw new Q("Unknown origin of " + alpha2 + " (" + alpha2.getClass() + ')');
    }
}
