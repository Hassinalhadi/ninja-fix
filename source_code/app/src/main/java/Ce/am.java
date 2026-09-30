package Ce;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.az;
import pe.InterfaceC2336l;
import s6.G4;
import se.AbstractC2853c;
import ye.EnumC3424b;

/* loaded from: classes2.dex */
public final class am extends AbstractC2853c {

    /* renamed from: d, reason: collision with root package name */
    public final B9.ab f906d;
    public final ve.ae e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public am(B9.ab abVar, ve.ae javaTypeParameter, int i4, InterfaceC2336l interfaceC2336l) {
        super(r0.alpha, interfaceC2336l, new Be.c(abVar, javaTypeParameter, false), Ne.f.echo(javaTypeParameter.alpha.getName()), 1, false, i4, r0.mike);
        Intrinsics.echo(javaTypeParameter, "javaTypeParameter");
        Be.a aVar = (Be.a) abVar.purple;
        this.f906d = abVar;
        this.e = javaTypeParameter;
    }

    @Override // se.AbstractC2858h
    public final List Z(List bounds) {
        int collectionSizeOrDefault;
        Fe.e eVar;
        Intrinsics.echo(bounds, "bounds");
        B9.ab abVar = this.f906d;
        Fe.e eVar2 = ((Be.a) abVar.purple).romeo;
        eVar2.getClass();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bounds, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = bounds.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.y yVar = (kotlin.reflect.jvm.internal.impl.types.y) it.next();
            Fe.r predicate = Fe.r.alpha;
            Intrinsics.echo(yVar, "<this>");
            Intrinsics.echo(predicate, "predicate");
            if (az.delta(yVar, predicate, null)) {
                eVar = eVar2;
            } else {
                eVar = eVar2;
                kotlin.reflect.jvm.internal.impl.types.y bravo = eVar.bravo(new Fe.u((InterfaceC2336l) this, false, abVar, EnumC3424b.TYPE_PARAMETER_BOUNDS, false), yVar, CollectionsKt.emptyList(), null, false);
                if (bravo != null) {
                    yVar = bravo;
                }
            }
            arrayList.add(yVar);
            eVar2 = eVar;
        }
        return arrayList;
    }

    @Override // se.AbstractC2858h
    public final void a0(kotlin.reflect.jvm.internal.impl.types.y type) {
        Intrinsics.echo(type, "type");
    }

    @Override // se.AbstractC2858h
    public final List b0() {
        Type type;
        int collectionSizeOrDefault;
        Type[] bounds = this.e.alpha.getBounds();
        Intrinsics.delta(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type2 : bounds) {
            arrayList.add(new ve.s(type2));
        }
        ve.s sVar = (ve.s) CollectionsKt.m(arrayList);
        if (sVar != null) {
            type = sVar.alpha;
        } else {
            type = null;
        }
        Collection collection = arrayList;
        if (Intrinsics.areEqual(type, Object.class)) {
            collection = CollectionsKt.emptyList();
        }
        boolean isEmpty = collection.isEmpty();
        B9.ab abVar = this.f906d;
        if (!isEmpty) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList2.add(((J2.t) abVar.teal).amber((ve.s) it.next(), G4.delta(2, false, this, 3)));
            }
            return arrayList2;
        }
        return kotlin.collections.ab.juliet(kotlin.reflect.jvm.internal.impl.types.ab.alpha(((Be.a) abVar.purple).oscar.silver.echo(), ((Be.a) abVar.purple).oscar.silver.november()));
    }
}
