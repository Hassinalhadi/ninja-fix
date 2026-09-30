package t6;

import android.hardware.camera2.CameraDevice;
import gf.AbstractC1792g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import s6.AbstractC2661g5;
import s6.AbstractC2680i6;
import s6.AbstractC2779t7;
import ye.AbstractC3427e;

/* loaded from: classes2.dex */
public abstract class K3 {
    public static CameraDevice.StateCallback alpha(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new CameraDevice.StateCallback();
        }
        if (arrayList.size() == 1) {
            return (CameraDevice.StateCallback) arrayList.get(0);
        }
        return new av.ac(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map, java.lang.Object] */
    public static final String bravo(InterfaceC2345u callableMemberDescriptor) {
        InterfaceC2328d interfaceC2328d;
        Ne.f fVar;
        Ne.f fVar2;
        Intrinsics.echo(callableMemberDescriptor, "callableMemberDescriptor");
        if (AbstractC2120h.yankee(callableMemberDescriptor)) {
            interfaceC2328d = charlie(callableMemberDescriptor);
        } else {
            interfaceC2328d = null;
        }
        if (interfaceC2328d != null) {
            InterfaceC2328d kilo = Ue.e.kilo(interfaceC2328d);
            if (kilo instanceof pe.al) {
                AbstractC2120h.yankee(kilo);
                InterfaceC2328d bravo = Ue.e.bravo(Ue.e.kilo(kilo), ye.j.alpha);
                if (bravo != null && (fVar2 = (Ne.f) ye.i.alpha.get(Ue.e.golf(bravo))) != null) {
                    return fVar2.bravo();
                }
            } else if (kilo instanceof se.ak) {
                int i4 = AbstractC3427e.lima;
                LinkedHashMap linkedHashMap = ye.am.india;
                String echo = AbstractC2661g5.echo((se.ak) kilo);
                if (echo == null) {
                    fVar = null;
                } else {
                    fVar = (Ne.f) linkedHashMap.get(echo);
                }
                if (fVar != null) {
                    return fVar.bravo();
                }
            }
        }
        return null;
    }

    public static final InterfaceC2328d charlie(InterfaceC2328d interfaceC2328d) {
        boolean z2;
        Intrinsics.echo(interfaceC2328d, "<this>");
        if (ye.am.juliet.contains(interfaceC2328d.getName()) || ye.i.delta.contains(Ue.e.kilo(interfaceC2328d).getName())) {
            if (interfaceC2328d instanceof pe.al) {
                z2 = true;
            } else {
                z2 = interfaceC2328d instanceof pe.ak;
            }
            if (z2) {
                return Ue.e.bravo(interfaceC2328d, ye.ag.alpha);
            }
            if (interfaceC2328d instanceof se.ak) {
                return Ue.e.bravo(interfaceC2328d, ye.ah.alpha);
            }
            return null;
        }
        return null;
    }

    public static final InterfaceC2328d delta(InterfaceC2328d interfaceC2328d) {
        Intrinsics.echo(interfaceC2328d, "<this>");
        InterfaceC2328d charlie = charlie(interfaceC2328d);
        if (charlie != null) {
            return charlie;
        }
        int i4 = ye.h.lima;
        Ne.f name = interfaceC2328d.getName();
        Intrinsics.delta(name, "name");
        if (!ye.h.bravo(name)) {
            return null;
        }
        return Ue.e.bravo(interfaceC2328d, ye.ai.alpha);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
    
        if (r6 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0150, code lost:
    
        return !me.AbstractC2120h.yankee(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean echo(InterfaceC2330f interfaceC2330f, InterfaceC2328d specialCallableDescriptor) {
        boolean z2;
        Intrinsics.echo(interfaceC2330f, "<this>");
        Intrinsics.echo(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC2335k lima = specialCallableDescriptor.lima();
        Intrinsics.charlie(lima, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        kotlin.reflect.jvm.internal.impl.types.ae oscar = ((InterfaceC2330f) lima).oscar();
        Intrinsics.delta(oscar, "specialCallableDescripto…ssDescriptor).defaultType");
        InterfaceC2330f juliet = Qe.e.juliet(interfaceC2330f);
        while (juliet != null) {
            if (!(juliet instanceof Ae.c)) {
                kotlin.reflect.jvm.internal.impl.types.ae oscar2 = juliet.oscar();
                if (oscar2 != null) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    kotlin.reflect.jvm.internal.impl.types.B b2 = null;
                    arrayDeque.add(new gf.n(oscar2, null));
                    kotlin.reflect.jvm.internal.impl.types.ap green = oscar.green();
                    while (true) {
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        gf.n nVar = (gf.n) arrayDeque.poll();
                        kotlin.reflect.jvm.internal.impl.types.y yVar = nVar.alpha;
                        kotlin.reflect.jvm.internal.impl.types.ap green2 = yVar.green();
                        if (green2 != null) {
                            if (green != null) {
                                if (green2.equals(green)) {
                                    boolean indigo = yVar.indigo();
                                    for (gf.n nVar2 = nVar.bravo; nVar2 != null; nVar2 = nVar2.bravo) {
                                        kotlin.reflect.jvm.internal.impl.types.y yVar2 = nVar2.alpha;
                                        List cyan = yVar2.cyan();
                                        if (cyan != null) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        kotlin.reflect.jvm.internal.impl.types.e eVar = kotlin.reflect.jvm.internal.impl.types.aq.bravo;
                                        if (!z2 || !cyan.isEmpty()) {
                                            Iterator it = cyan.iterator();
                                            while (it.hasNext()) {
                                                if (((kotlin.reflect.jvm.internal.impl.types.as) it.next()).alpha() != 1) {
                                                    yVar = (kotlin.reflect.jvm.internal.impl.types.y) AbstractC2680i6.alpha(new kotlin.reflect.jvm.internal.impl.types.ax(AbstractC2779t7.bravo(eVar.foxtrot(yVar2.green(), yVar2.cyan()))).golf(1, yVar)).bravo;
                                                    break;
                                                }
                                            }
                                        }
                                        yVar = new kotlin.reflect.jvm.internal.impl.types.ax(eVar.foxtrot(yVar2.green(), yVar2.cyan())).golf(1, yVar);
                                        if (!indigo && !yVar2.indigo()) {
                                            indigo = false;
                                        } else {
                                            indigo = true;
                                        }
                                    }
                                    kotlin.reflect.jvm.internal.impl.types.ap green3 = yVar.green();
                                    if (green3 != null) {
                                        if (green3.equals(green)) {
                                            b2 = kotlin.reflect.jvm.internal.impl.types.az.hotel(yVar, indigo);
                                        } else {
                                            throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + AbstractC1792g.november(green3) + ", \n\nsupertype: " + AbstractC1792g.november(green) + " \n" + green3.equals(green));
                                        }
                                    } else {
                                        AbstractC1792g.alpha(3);
                                        throw null;
                                    }
                                } else {
                                    for (kotlin.reflect.jvm.internal.impl.types.y immediateSupertype : green2.lima()) {
                                        Intrinsics.delta(immediateSupertype, "immediateSupertype");
                                        arrayDeque.add(new gf.n(immediateSupertype, nVar));
                                    }
                                }
                            } else {
                                AbstractC1792g.alpha(4);
                                throw null;
                            }
                        } else {
                            AbstractC1792g.alpha(3);
                            throw null;
                        }
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
            }
            juliet = Qe.e.juliet(juliet);
        }
        return false;
    }
}
