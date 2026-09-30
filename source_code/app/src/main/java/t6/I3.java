package t6;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.InterfaceC2326b;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import s6.AbstractC2661g5;
import se.AbstractC2863m;

/* loaded from: classes2.dex */
public abstract class I3 {
    public static boolean alpha(InterfaceC2326b superDescriptor, InterfaceC2326b subDescriptor) {
        Intrinsics.echo(superDescriptor, "superDescriptor");
        Intrinsics.echo(subDescriptor, "subDescriptor");
        if ((subDescriptor instanceof Ae.f) && (superDescriptor instanceof InterfaceC2345u)) {
            Ae.f fVar = (Ae.f) subDescriptor;
            fVar.peach().size();
            InterfaceC2345u interfaceC2345u = (InterfaceC2345u) superDescriptor;
            interfaceC2345u.peach().size();
            List peach = fVar.alpha().peach();
            Intrinsics.delta(peach, "subDescriptor.original.valueParameters");
            List peach2 = interfaceC2345u.alpha().peach();
            Intrinsics.delta(peach2, "superDescriptor.original.valueParameters");
            Iterator it = CollectionsKt.H(peach, peach2).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                se.aq subParameter = (se.aq) pair.first;
                se.aq superParameter = (se.aq) pair.second;
                Intrinsics.delta(subParameter, "subParameter");
                boolean z2 = bravo((InterfaceC2345u) subDescriptor, subParameter) instanceof Ge.j;
                Intrinsics.delta(superParameter, "superParameter");
                if (z2 != (bravo(interfaceC2345u, superParameter) instanceof Ge.j)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((Ge.i) r4).india, "java/lang/Object") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0117, code lost:
    
        r6 = r7.getType();
        kotlin.jvm.internal.Intrinsics.delta(r6, "valueParameterDescriptor.type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0128, code lost:
    
        return s6.AbstractC2661g5.foxtrot(s6.O5.juliet(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0115, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(Ue.e.golf(r0), Ue.e.golf(r2)) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Ge.k bravo(InterfaceC2345u f5, se.aq aqVar) {
        InterfaceC2330f interfaceC2330f;
        Ge.j jVar;
        Ve.c cVar;
        InterfaceC2345u alpha;
        Intrinsics.echo(f5, "f");
        InterfaceC2330f interfaceC2330f2 = null;
        if (Intrinsics.areEqual(((AbstractC2863m) f5).getName().bravo(), "remove") && f5.peach().size() == 1 && !(Ue.e.kilo(f5).lima() instanceof Ae.c) && !AbstractC2120h.yankee(f5)) {
            List peach = f5.alpha().peach();
            Intrinsics.delta(peach, "f.original.valueParameters");
            kotlin.reflect.jvm.internal.impl.types.y type = ((se.aq) CollectionsKt.k(peach)).getType();
            Intrinsics.delta(type, "f.original.valueParameters.single().type");
            Ge.k foxtrot = AbstractC2661g5.foxtrot(type);
            if (foxtrot instanceof Ge.j) {
                jVar = (Ge.j) foxtrot;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                cVar = jVar.india;
            } else {
                cVar = null;
            }
            if (cVar == Ve.c.INT && (alpha = ye.h.alpha(f5)) != null) {
                List peach2 = alpha.alpha().peach();
                Intrinsics.delta(peach2, "overridden.original.valueParameters");
                kotlin.reflect.jvm.internal.impl.types.y type2 = ((se.aq) CollectionsKt.k(peach2)).getType();
                Intrinsics.delta(type2, "overridden.original.valueParameters.single().type");
                Ge.k foxtrot2 = AbstractC2661g5.foxtrot(type2);
                InterfaceC2335k lima = alpha.lima();
                Intrinsics.delta(lima, "overridden.containingDeclaration");
                if (Intrinsics.areEqual(Ue.e.hotel(lima), me.m.emerald.india())) {
                    if (foxtrot2 instanceof Ge.i) {
                    }
                }
            }
        }
        if (f5.peach().size() == 1) {
            InterfaceC2335k lima2 = f5.lima();
            if (lima2 instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) lima2;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null) {
                List peach3 = f5.peach();
                Intrinsics.delta(peach3, "f.valueParameters");
                InterfaceC2332h kilo = ((se.aq) CollectionsKt.k(peach3)).getType().green().kilo();
                if (kilo instanceof InterfaceC2330f) {
                    interfaceC2330f2 = (InterfaceC2330f) kilo;
                }
                if (interfaceC2330f2 != null) {
                    if (AbstractC2120h.sierra(interfaceC2330f) != null) {
                    }
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.types.y type3 = aqVar.getType();
        Intrinsics.delta(type3, "valueParameterDescriptor.type");
        return AbstractC2661g5.foxtrot(type3);
    }
}
