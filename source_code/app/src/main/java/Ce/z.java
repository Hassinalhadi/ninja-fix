package Ce;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import of.AbstractC2262q;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class z extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ad purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(ad adVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = adVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                Xe.f kindFilter = Xe.f.mike;
                Xe.n.alpha.getClass();
                Xe.k nameFilter = Xe.l.bravo;
                ad adVar = this.purple;
                adVar.getClass();
                Intrinsics.echo(kindFilter, "kindFilter");
                Intrinsics.echo(nameFilter, "nameFilter");
                EnumC3339b enumC3339b = EnumC3339b.silver;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (kindFilter.alpha(Xe.f.lima)) {
                    for (Ne.f fVar : adVar.hotel(kindFilter, nameFilter)) {
                        nameFilter.invoke(fVar);
                        AbstractC2262q.alpha(linkedHashSet, adVar.golf(fVar, enumC3339b));
                    }
                }
                boolean alpha = kindFilter.alpha(Xe.f.india);
                List list = kindFilter.alpha;
                if (alpha && !list.contains(Xe.b.alpha)) {
                    for (Ne.f fVar2 : adVar.india(kindFilter, nameFilter)) {
                        nameFilter.invoke(fVar2);
                        linkedHashSet.addAll(adVar.charlie(fVar2, enumC3339b));
                    }
                }
                if (kindFilter.alpha(Xe.f.juliet) && !list.contains(Xe.b.alpha)) {
                    for (Ne.f fVar3 : adVar.oscar(kindFilter)) {
                        nameFilter.invoke(fVar3);
                        linkedHashSet.addAll(adVar.foxtrot(fVar3, enumC3339b));
                    }
                }
                return CollectionsKt.z(linkedHashSet);
            case 1:
                return this.purple.hotel(Xe.f.oscar, null);
            case 2:
                return this.purple.kilo();
            case 3:
                return this.purple.india(Xe.f.papa, null);
            case 4:
                return this.purple.oscar(Xe.f.quebec);
            default:
                ((Be.a) this.purple.bravo.purple).hotel.getClass();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ad adVar, ve.w wVar, Ae.g gVar) {
        super(0);
        this.alpha = 5;
        this.purple = adVar;
    }
}
