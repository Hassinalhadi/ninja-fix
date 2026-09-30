package s6;

import ge.InterfaceC1773e;
import he.AbstractC1850a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2332h;

/* renamed from: s6.a5 */
/* loaded from: classes2.dex */
public abstract class AbstractC2607a5 {
    public static final je.N alpha(InterfaceC1773e interfaceC1773e, List arguments, boolean z2, List annotations) {
        je.aa aaVar;
        InterfaceC2332h descriptor;
        kotlin.reflect.jvm.internal.impl.types.al alVar;
        int collectionSizeOrDefault;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        int i4;
        Object ajVar;
        Intrinsics.echo(interfaceC1773e, "<this>");
        Intrinsics.echo(arguments, "arguments");
        Intrinsics.echo(annotations, "annotations");
        if (interfaceC1773e instanceof je.aa) {
            aaVar = (je.aa) interfaceC1773e;
        } else {
            aaVar = null;
        }
        if (aaVar != null && (descriptor = aaVar.getDescriptor()) != null) {
            kotlin.reflect.jvm.internal.impl.types.ap tango = descriptor.tango();
            Intrinsics.delta(tango, "descriptor.typeConstructor");
            List parameters = tango.getParameters();
            Intrinsics.delta(parameters, "typeConstructor.parameters");
            if (parameters.size() == arguments.size()) {
                if (annotations.isEmpty()) {
                    kotlin.reflect.jvm.internal.impl.types.al.purple.getClass();
                    alVar = kotlin.reflect.jvm.internal.impl.types.al.red;
                } else {
                    kotlin.reflect.jvm.internal.impl.types.al.purple.getClass();
                    alVar = kotlin.reflect.jvm.internal.impl.types.al.red;
                }
                List parameters2 = tango.getParameters();
                Intrinsics.delta(parameters2, "typeConstructor.parameters");
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                int i5 = 0;
                for (Object obj : arguments) {
                    int i10 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ge.z zVar = (ge.z) obj;
                    je.N n5 = (je.N) zVar.bravo;
                    if (n5 != null) {
                        yVar = n5.alpha;
                    } else {
                        yVar = null;
                    }
                    ge.aa aaVar2 = zVar.alpha;
                    if (aaVar2 == null) {
                        i4 = -1;
                    } else {
                        i4 = AbstractC1850a.$EnumSwitchMapping$0[aaVar2.ordinal()];
                    }
                    if (i4 != -1) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    Intrinsics.checkNotNull(yVar);
                                    ajVar = new kotlin.reflect.jvm.internal.impl.types.at(3, yVar);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                Intrinsics.checkNotNull(yVar);
                                ajVar = new kotlin.reflect.jvm.internal.impl.types.at(2, yVar);
                            }
                        } else {
                            Intrinsics.checkNotNull(yVar);
                            ajVar = new kotlin.reflect.jvm.internal.impl.types.at(1, yVar);
                        }
                    } else {
                        Object obj2 = parameters2.get(i5);
                        Intrinsics.delta(obj2, "parameters[index]");
                        ajVar = new kotlin.reflect.jvm.internal.impl.types.aj((pe.aq) obj2);
                    }
                    arrayList.add(ajVar);
                    i5 = i10;
                }
                return new je.N(kotlin.reflect.jvm.internal.impl.types.ab.charlie(arrayList, alVar, tango, z2), null);
            }
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        throw new je.Q("Cannot create type for an unsupported classifier: " + interfaceC1773e + " (" + interfaceC1773e.getClass() + ')');
    }

    public static final Ge.o bravo(Ie.ag proto, Ke.e nameResolver, G6.j jVar, boolean z2, boolean z10, boolean z11) {
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Oe.n propertySignature = Le.k.delta;
        Intrinsics.delta(propertySignature, "propertySignature");
        Le.e eVar = (Le.e) AbstractC2617b6.charlie(proto, propertySignature);
        if (eVar != null) {
            if (z2) {
                Oe.h hVar = Me.h.alpha;
                Me.d bravo = Me.h.bravo(proto, nameResolver, jVar, z11);
                if (bravo != null) {
                    return AbstractC2634d5.foxtrot(bravo);
                }
            } else if (z10 && (eVar.purple & 2) == 2) {
                Le.c cVar = eVar.silver;
                Intrinsics.delta(cVar, "signature.syntheticMethod");
                return new Ge.o(nameResolver.getString(cVar.red).concat(nameResolver.getString(cVar.silver)));
            }
        }
        return null;
    }

    public static /* synthetic */ Ge.o charlie(Ie.ag agVar, Ke.e eVar, G6.j jVar, int i4) {
        boolean z2;
        boolean z10;
        if ((i4 & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i4 & 16) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        return bravo(agVar, eVar, jVar, z2, z10, true);
    }
}
