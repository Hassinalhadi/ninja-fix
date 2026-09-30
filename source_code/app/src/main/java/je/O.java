package je;

import ef.InterfaceC1662j;
import ef.InterfaceC1663k;
import g.C1718a;
import ge.InterfaceC1772d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import t6.AbstractC3062u;
import ue.C3158b;

/* loaded from: classes2.dex */
public final class O implements ge.x, aa {
    public static final /* synthetic */ ge.v[] silver;
    public final pe.aq alpha;
    public final T purple;
    public final P red;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        silver = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(O.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public O(P p4, pe.aq descriptor) {
        InterfaceC1663k interfaceC1663k;
        Ge.g gVar;
        C3158b c3158b;
        Class cls;
        C1986z c1986z;
        Object quebec;
        Intrinsics.echo(descriptor, "descriptor");
        this.alpha = descriptor;
        this.purple = V.kilo(null, new ab(4, this));
        if (p4 == null) {
            InterfaceC2335k lima = descriptor.lima();
            Intrinsics.delta(lima, "descriptor.containingDeclaration");
            if (lima instanceof InterfaceC2330f) {
                quebec = alpha((InterfaceC2330f) lima);
            } else if (lima instanceof InterfaceC2328d) {
                InterfaceC2335k lima2 = ((InterfaceC2328d) lima).lima();
                Intrinsics.delta(lima2, "declaration.containingDeclaration");
                if (lima2 instanceof InterfaceC2330f) {
                    c1986z = alpha((InterfaceC2330f) lima2);
                } else {
                    if (lima instanceof InterfaceC1663k) {
                        interfaceC1663k = (InterfaceC1663k) lima;
                    } else {
                        interfaceC1663k = null;
                    }
                    if (interfaceC1663k != null) {
                        InterfaceC1662j teal = interfaceC1663k.teal();
                        if (teal instanceof Ge.g) {
                            gVar = (Ge.g) teal;
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            c3158b = gVar.red;
                        } else {
                            c3158b = null;
                        }
                        C3158b c3158b2 = c3158b instanceof C3158b ? c3158b : null;
                        if (c3158b2 != null && (cls = c3158b2.alpha) != null) {
                            c1986z = (C1986z) AbstractC3062u.echo(cls);
                        } else {
                            throw new Q("Container of deserialized member is not resolved: " + interfaceC1663k);
                        }
                    } else {
                        throw new Q("Non-class callable descriptor must be deserialized: " + lima);
                    }
                }
                quebec = lima.quebec(new C1718a(c1986z), Unit.INSTANCE);
            } else {
                throw new Q("Unknown type parameter container: " + lima);
            }
            Intrinsics.delta(quebec, "when (val declaration = … $declaration\")\n        }");
            p4 = (P) quebec;
        }
        this.red = p4;
    }

    public static C1986z alpha(InterfaceC2330f interfaceC2330f) {
        InterfaceC1772d interfaceC1772d;
        Class juliet = a0.juliet(interfaceC2330f);
        if (juliet != null) {
            interfaceC1772d = AbstractC3062u.echo(juliet);
        } else {
            interfaceC1772d = null;
        }
        C1986z c1986z = (C1986z) interfaceC1772d;
        if (c1986z != null) {
            return c1986z;
        }
        throw new Q("Type parameter container is not resolved: " + interfaceC2330f.lima());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O) {
            O o5 = (O) obj;
            if (Intrinsics.areEqual(this.red, o5.red) && Intrinsics.areEqual(getName(), o5.getName())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // je.aa
    public final InterfaceC2332h getDescriptor() {
        return this.alpha;
    }

    @Override // ge.x
    public final String getName() {
        String bravo = this.alpha.getName().bravo();
        Intrinsics.delta(bravo, "descriptor.name.asString()");
        return bravo;
    }

    @Override // ge.x
    public final List getUpperBounds() {
        ge.v vVar = silver[0];
        Object invoke = this.purple.invoke();
        Intrinsics.delta(invoke, "<get-upperBounds>(...)");
        return (List) invoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.red.hashCode() * 31);
    }

    public final String toString() {
        ge.aa aaVar;
        StringBuilder sb2 = new StringBuilder();
        int mike = av.q.mike(this.alpha.fuchsia());
        if (mike != 0) {
            if (mike != 1) {
                if (mike == 2) {
                    aaVar = ge.aa.red;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                aaVar = ge.aa.purple;
            }
        } else {
            aaVar = ge.aa.alpha;
        }
        int ordinal = aaVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    sb2.append("out ");
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                sb2.append("in ");
            }
        }
        sb2.append(getName());
        return sb2.toString();
    }
}
