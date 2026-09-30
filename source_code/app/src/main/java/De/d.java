package De;

import A0.p;
import Xe.n;
import hf.h;
import hf.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.aq;
import s6.G4;

/* loaded from: classes2.dex */
public final class d extends av {
    public static final a charlie = G4.delta(2, false, null, 5).bravo(3);
    public static final a delta = G4.delta(2, false, null, 5).bravo(2);
    public final gd.a bravo = new gd.a(new U8.a(2));

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final as delta(y yVar) {
        return new at(hotel(yVar, new a(2, false, false, null, 62)));
    }

    public final Pair golf(ae aeVar, InterfaceC2330f interfaceC2330f, a aVar) {
        int collectionSizeOrDefault;
        if (aeVar.green().getParameters().isEmpty()) {
            return new Pair(aeVar, Boolean.FALSE);
        }
        if (AbstractC2120h.xray(aeVar)) {
            as asVar = (as) aeVar.cyan().get(0);
            int alpha = asVar.alpha();
            y bravo = asVar.bravo();
            Intrinsics.delta(bravo, "componentTypeProjection.type");
            return new Pair(ab.charlie(kotlin.collections.ab.juliet(new at(alpha, hotel(bravo, aVar))), aeVar.gold(), aeVar.green(), aeVar.indigo()), Boolean.FALSE);
        }
        if (kotlin.reflect.jvm.internal.impl.types.c.india(aeVar)) {
            return new Pair(i.charlie(h.f12727g, aeVar.green().toString()), Boolean.FALSE);
        }
        n red = interfaceC2330f.red(this);
        Intrinsics.delta(red, "declaration.getMemberScope(this)");
        al gold = aeVar.gold();
        ap tango = interfaceC2330f.tango();
        Intrinsics.delta(tango, "declaration.typeConstructor");
        List<aq> parameters = interfaceC2330f.tango().getParameters();
        Intrinsics.delta(parameters, "declaration.typeConstructor.parameters");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (aq parameter : parameters) {
            Intrinsics.delta(parameter, "parameter");
            gd.a aVar2 = this.bravo;
            arrayList.add(U8.a.echo(parameter, aVar, aVar2, aVar2.echo(parameter, aVar)));
        }
        return new Pair(ab.echo(gold, tango, arrayList, aeVar.indigo(), red, new p(interfaceC2330f, this, aeVar, aVar)), Boolean.TRUE);
    }

    public final y hotel(y yVar, a aVar) {
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo instanceof aq) {
            aVar.getClass();
            return hotel(this.bravo.echo((aq) kilo, a.alpha(aVar, 0, true, null, null, 59)), aVar);
        }
        if (kilo instanceof InterfaceC2330f) {
            InterfaceC2332h kilo2 = kotlin.reflect.jvm.internal.impl.types.c.yankee(yVar).green().kilo();
            if (kilo2 instanceof InterfaceC2330f) {
                Pair golf = golf(kotlin.reflect.jvm.internal.impl.types.c.kilo(yVar), (InterfaceC2330f) kilo, charlie);
                ae aeVar = (ae) golf.first;
                boolean booleanValue = ((Boolean) golf.second).booleanValue();
                Pair golf2 = golf(kotlin.reflect.jvm.internal.impl.types.c.yankee(yVar), (InterfaceC2330f) kilo2, delta);
                ae aeVar2 = (ae) golf2.first;
                boolean booleanValue2 = ((Boolean) golf2.second).booleanValue();
                if (!booleanValue && !booleanValue2) {
                    return ab.alpha(aeVar, aeVar2);
                }
                return new f(aeVar, aeVar2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + kilo2 + "\" while for lower it's \"" + kilo + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + kilo).toString());
    }
}
