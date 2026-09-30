package lf;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.B;
import me.AbstractC2120h;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import s6.O5;
import se.AbstractC2863m;
import se.aq;

/* loaded from: classes2.dex */
public final class t extends Lambda implements Function1 {
    public static final t alpha = new Lambda(1);

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r9.g() == null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z2;
        InterfaceC2330f interfaceC2330f;
        kotlin.reflect.jvm.internal.impl.types.ae oscar;
        B lima;
        kotlin.reflect.jvm.internal.impl.types.y returnType;
        InterfaceC2345u $receiver = (InterfaceC2345u) obj;
        Intrinsics.echo($receiver, "$this$$receiver");
        List list = v.bravo;
        InterfaceC2335k containingDeclaration = $receiver.lima();
        Intrinsics.delta(containingDeclaration, "containingDeclaration");
        if (containingDeclaration instanceof InterfaceC2330f) {
            Ne.f fVar = AbstractC2120h.echo;
            if (AbstractC2120h.bravo((InterfaceC2330f) containingDeclaration, me.m.alpha)) {
                z2 = true;
                if (!z2) {
                    Collection overriddenDescriptors = $receiver.mike();
                    Intrinsics.delta(overriddenDescriptors, "overriddenDescriptors");
                    Collection collection = overriddenDescriptors;
                    if (!collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            InterfaceC2335k lima2 = ((InterfaceC2345u) it.next()).lima();
                            Intrinsics.delta(lima2, "it.containingDeclaration");
                            if (lima2 instanceof InterfaceC2330f) {
                                Ne.f fVar2 = AbstractC2120h.echo;
                                if (AbstractC2120h.bravo((InterfaceC2330f) lima2, me.m.alpha)) {
                                    return null;
                                }
                            }
                        }
                    }
                    InterfaceC2335k lima3 = $receiver.lima();
                    if (lima3 instanceof InterfaceC2330f) {
                        interfaceC2330f = (InterfaceC2330f) lima3;
                    } else {
                        interfaceC2330f = null;
                    }
                    if (interfaceC2330f != null) {
                        if (!Qe.g.echo(interfaceC2330f)) {
                            interfaceC2330f = null;
                        }
                        if (interfaceC2330f != null && (oscar = interfaceC2330f.oscar()) != null && (lima = O5.lima(oscar)) != null && (returnType = $receiver.getReturnType()) != null && Intrinsics.areEqual(((AbstractC2863m) $receiver).getName(), w.delta)) {
                            Ne.f fVar3 = AbstractC2120h.echo;
                            if ((AbstractC2120h.amber(returnType, me.m.hotel) || AbstractC2120h.black(returnType)) && $receiver.peach().size() == 1) {
                                kotlin.reflect.jvm.internal.impl.types.y type = ((aq) $receiver.peach().get(0)).getType();
                                Intrinsics.delta(type, "valueParameters[0].type");
                                if (Intrinsics.areEqual(O5.lima(type), lima)) {
                                    if ($receiver.l().isEmpty()) {
                                    }
                                }
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
                    InterfaceC2335k containingDeclaration2 = $receiver.lima();
                    Intrinsics.delta(containingDeclaration2, "containingDeclaration");
                    if (Qe.g.echo(containingDeclaration2)) {
                        Pe.t tVar = Pe.o.bravo;
                        InterfaceC2335k lima4 = $receiver.lima();
                        Intrinsics.charlie(lima4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        kotlin.reflect.jvm.internal.impl.types.ae oscar2 = ((InterfaceC2330f) lima4).oscar();
                        Intrinsics.delta(oscar2, "containingDeclaration as…ssDescriptor).defaultType");
                        sb2.append(" or define ''equals(other: " + tVar.orange(O5.lima(oscar2)) + "): Boolean''");
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
                    return sb3;
                }
                return null;
            }
        }
        z2 = false;
        if (!z2) {
        }
        return null;
    }
}
