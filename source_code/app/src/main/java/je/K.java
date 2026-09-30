package je;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import me.C2116d;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import se.C2868r;

/* loaded from: classes2.dex */
public final class K extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ L purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(L l10, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = l10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (s6.C6.alpha((pe.InterfaceC2330f) r10) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r2 != false) goto L21;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String concat;
        Class<?> enclosingClass;
        boolean D10;
        boolean z2 = false;
        L l10 = this.purple;
        int i4 = 3;
        switch (this.alpha) {
            case 0:
                af afVar = l10.white;
                afVar.getClass();
                String name = l10.yellow;
                Intrinsics.echo(name, "name");
                String signature = l10.f12890a;
                Intrinsics.echo(signature, "signature");
                kotlin.text.k delta = af.alpha.delta(signature);
                if (delta != null) {
                    String str = new MatchResult.Destructured(delta).getMatch().getGroupValues().get(1);
                    pe.al sierra = afVar.sierra(Integer.parseInt(str));
                    if (sierra == null) {
                        StringBuilder victor = Q0.c.victor("Local property #", str, " not found in ");
                        victor.append(afVar.golf());
                        throw new Q(victor.toString());
                    }
                    return sierra;
                }
                Collection victor2 = afVar.victor(Ne.f.echo(name));
                ArrayList arrayList = new ArrayList();
                for (Object obj : victor2) {
                    if (Intrinsics.areEqual(Y.bravo((pe.al) obj).foxtrot(), signature)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (arrayList.size() != 1) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            C2339o visibility = ((pe.al) next).getVisibility();
                            Object obj2 = linkedHashMap.get(visibility);
                            if (obj2 == null) {
                                obj2 = new ArrayList();
                                linkedHashMap.put(visibility, obj2);
                            }
                            ((List) obj2).add(next);
                        }
                        Collection values = kotlin.collections.y.beige(linkedHashMap, new A0.af(i4, ad.alpha)).values();
                        Intrinsics.delta(values, "properties\n             …\n                }.values");
                        List list = (List) CollectionsKt.navy(values);
                        if (list.size() == 1) {
                            return (pe.al) CollectionsKt.gold(list);
                        }
                        String maroon = CollectionsKt.maroon(afVar.victor(Ne.f.echo(name)), "\n", null, null, C1963b.e, 30);
                        StringBuilder india = av.q.india("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                        india.append(afVar);
                        india.append(':');
                        if (maroon.length() == 0) {
                            concat = " no members found";
                        } else {
                            concat = "\n".concat(maroon);
                        }
                        india.append(concat);
                        throw new Q(india.toString());
                    }
                    return (pe.al) CollectionsKt.k(arrayList);
                }
                StringBuilder india2 = av.q.india("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                india2.append(afVar);
                throw new Q(india2.toString());
            default:
                Ne.b bVar = Y.alpha;
                V bravo = Y.bravo(l10.tango());
                if (bravo instanceof C1974m) {
                    C1974m c1974m = (C1974m) bravo;
                    Oe.h hVar = Me.h.alpha;
                    Ie.ag agVar = c1974m.red;
                    Me.d bravo2 = Me.h.bravo(agVar, c1974m.teal, c1974m.white, true);
                    if (bravo2 == null) {
                        return null;
                    }
                    pe.al alVar = c1974m.purple;
                    if (alVar.november() != 2) {
                        InterfaceC2335k lima = alVar.lima();
                        if (lima != null) {
                            if (Qe.e.lima(lima)) {
                                InterfaceC2335k lima2 = lima.lima();
                                if (Qe.e.november(lima2, 1) || Qe.e.november(lima2, 3)) {
                                    LinkedHashSet linkedHashSet = C2116d.alpha;
                                    break;
                                }
                            }
                            if (Qe.e.lima(alVar.lima())) {
                                C2868r k6 = alVar.k();
                                if (k6 != null && k6.getAnnotations().D(ye.aa.alpha)) {
                                    D10 = true;
                                    break;
                                } else {
                                    D10 = alVar.getAnnotations().D(ye.aa.alpha);
                                    break;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                        }
                    }
                    af afVar2 = l10.white;
                    if (!z2 && !Me.h.delta(agVar)) {
                        InterfaceC2335k lima3 = alVar.lima();
                        if (lima3 instanceof InterfaceC2330f) {
                            enclosingClass = a0.juliet((InterfaceC2330f) lima3);
                        } else {
                            enclosingClass = afVar2.golf();
                        }
                    } else {
                        enclosingClass = afVar2.golf().getEnclosingClass();
                    }
                    if (enclosingClass == null) {
                        return null;
                    }
                    try {
                        return enclosingClass.getDeclaredField(bravo2.bravo);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                if (bravo instanceof C1972k) {
                    return ((C1972k) bravo).purple;
                }
                if ((bravo instanceof C1973l) || (bravo instanceof C1975n)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
