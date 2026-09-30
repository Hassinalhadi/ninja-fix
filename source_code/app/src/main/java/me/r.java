package me;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.az;
import pe.InterfaceC2321ad;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import se.ab;

/* loaded from: classes2.dex */
public abstract class r {
    public static final Set alpha;
    public static final HashMap bravo;
    public static final HashMap charlie;
    public static final LinkedHashSet delta;

    static {
        q[] values = q.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (q qVar : values) {
            arrayList.add(qVar.purple);
        }
        alpha = CollectionsKt.D(arrayList);
        p[] values2 = p.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (p pVar : values2) {
            arrayList2.add(pVar.alpha);
        }
        CollectionsKt.D(arrayList2);
        bravo = new HashMap();
        charlie = new HashMap();
        y.whiskey(new HashMap(y.quebec(4)), new Pair[]{new Pair(p.UBYTEARRAY, Ne.f.echo("ubyteArrayOf")), new Pair(p.USHORTARRAY, Ne.f.echo("ushortArrayOf")), new Pair(p.UINTARRAY, Ne.f.echo("uintArrayOf")), new Pair(p.ULONGARRAY, Ne.f.echo("ulongArrayOf"))});
        q[] values3 = q.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (q qVar2 : values3) {
            linkedHashSet.add(qVar2.red.india());
        }
        delta = linkedHashSet;
        for (q qVar3 : q.values()) {
            HashMap hashMap = bravo;
            Ne.b bVar = qVar3.red;
            Ne.b bVar2 = qVar3.alpha;
            hashMap.put(bVar, bVar2);
            charlie.put(bVar2, qVar3.red);
        }
    }

    public static final boolean alpha(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        InterfaceC2332h kilo;
        if (!az.mike(yVar) && (kilo = yVar.green().kilo()) != null) {
            InterfaceC2335k lima = kilo.lima();
            if ((lima instanceof InterfaceC2321ad) && Intrinsics.areEqual(((ab) ((InterfaceC2321ad) lima)).teal, n.juliet) && alpha.contains(kilo.getName())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
