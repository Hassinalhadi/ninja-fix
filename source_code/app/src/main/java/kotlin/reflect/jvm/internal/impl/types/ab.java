package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import t6.Z1;

/* loaded from: classes2.dex */
public final class ab {
    public static final /* synthetic */ int alpha = 0;

    static {
        int i4 = z.alpha;
    }

    public static final B alpha(ae lowerBound, ae upperBound) {
        Intrinsics.echo(lowerBound, "lowerBound");
        Intrinsics.echo(upperBound, "upperBound");
        if (Intrinsics.areEqual(lowerBound, upperBound)) {
            return lowerBound;
        }
        return new t(lowerBound, upperBound);
    }

    public static final ae bravo(al attributes, InterfaceC2330f descriptor, List arguments) {
        Intrinsics.echo(attributes, "attributes");
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(arguments, "arguments");
        ap tango = descriptor.tango();
        Intrinsics.delta(tango, "descriptor.typeConstructor");
        return charlie(arguments, attributes, tango, false);
    }

    public static ae charlie(List arguments, al attributes, ap constructor, boolean z2) {
        Xe.n alpha2;
        Xe.n foxtrot;
        Xe.n nVar;
        Intrinsics.echo(attributes, "attributes");
        Intrinsics.echo(constructor, "constructor");
        Intrinsics.echo(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z2 && constructor.kilo() != null) {
            InterfaceC2332h kilo = constructor.kilo();
            Intrinsics.checkNotNull(kilo);
            ae oscar = kilo.oscar();
            Intrinsics.delta(oscar, "constructor.declarationDescriptor!!.defaultType");
            return oscar;
        }
        InterfaceC2332h kilo2 = constructor.kilo();
        if (kilo2 instanceof pe.aq) {
            alpha2 = ((pe.aq) kilo2).oscar().olive();
        } else {
            if (kilo2 instanceof InterfaceC2330f) {
                Ue.e.india(Ue.e.juliet(kilo2));
                C1791f c1791f = C1791f.alpha;
                se.y yVar = null;
                if (arguments.isEmpty()) {
                    InterfaceC2330f interfaceC2330f = (InterfaceC2330f) kilo2;
                    Intrinsics.echo(interfaceC2330f, "<this>");
                    if (interfaceC2330f instanceof se.y) {
                        yVar = (se.y) interfaceC2330f;
                    }
                    if (yVar == null || (foxtrot = yVar.sierra(c1791f)) == null) {
                        alpha2 = interfaceC2330f.x();
                        Intrinsics.delta(alpha2, "this.unsubstitutedMemberScope");
                    }
                    nVar = foxtrot;
                } else {
                    InterfaceC2330f interfaceC2330f2 = (InterfaceC2330f) kilo2;
                    av foxtrot2 = aq.bravo.foxtrot(constructor, arguments);
                    Intrinsics.echo(interfaceC2330f2, "<this>");
                    if (interfaceC2330f2 instanceof se.y) {
                        yVar = (se.y) interfaceC2330f2;
                    }
                    if (yVar == null || (foxtrot = yVar.foxtrot(foxtrot2, c1791f)) == null) {
                        alpha2 = interfaceC2330f2.red(foxtrot2);
                        Intrinsics.delta(alpha2, "this.getMemberScope(\n   …ubstitution\n            )");
                    }
                    nVar = foxtrot;
                }
                return echo(attributes, constructor, arguments, z2, nVar, new aa(arguments, attributes, constructor, z2));
            }
            if (kilo2 instanceof ef.s) {
                String str = ((ef.s) kilo2).getName().alpha;
                Intrinsics.delta(str, "descriptor.name.toString()");
                alpha2 = hf.i.alpha(4, true, str);
            } else if (constructor instanceof x) {
                alpha2 = Z1.alpha(((x) constructor).bravo, "member scope for intersection type");
            } else {
                throw new IllegalStateException("Unsupported classifier: " + kilo2 + " for constructor: " + constructor);
            }
        }
        nVar = alpha2;
        return echo(attributes, constructor, arguments, z2, nVar, new aa(arguments, attributes, constructor, z2));
    }

    public static final ae delta(Xe.n memberScope, List arguments, al attributes, ap constructor, boolean z2) {
        Intrinsics.echo(attributes, "attributes");
        Intrinsics.echo(constructor, "constructor");
        Intrinsics.echo(arguments, "arguments");
        Intrinsics.echo(memberScope, "memberScope");
        af afVar = new af(constructor, arguments, z2, memberScope, new aa(memberScope, arguments, attributes, constructor, z2));
        if (attributes.isEmpty()) {
            return afVar;
        }
        return new ag(afVar, attributes);
    }

    public static final ae echo(al attributes, ap constructor, List arguments, boolean z2, Xe.n memberScope, Function1 function1) {
        Intrinsics.echo(attributes, "attributes");
        Intrinsics.echo(constructor, "constructor");
        Intrinsics.echo(arguments, "arguments");
        Intrinsics.echo(memberScope, "memberScope");
        af afVar = new af(constructor, arguments, z2, memberScope, function1);
        if (attributes.isEmpty()) {
            return afVar;
        }
        return new ag(afVar, attributes);
    }
}
