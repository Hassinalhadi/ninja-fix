package Ce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pf.AbstractC2360j;
import pf.C2355e;
import pf.C2356f;

/* loaded from: classes2.dex */
public final class a implements c {
    public final ve.q alpha;
    public final Lambda bravo;
    public final A0.p charlie;
    public final LinkedHashMap delta;
    public final LinkedHashMap echo;
    public final LinkedHashMap foxtrot;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public a(ve.q jClass, Function1 memberFilter) {
        int collectionSizeOrDefault;
        Intrinsics.echo(jClass, "jClass");
        Intrinsics.echo(memberFilter, "memberFilter");
        this.alpha = jClass;
        this.bravo = (Lambda) memberFilter;
        A0.p pVar = new A0.p(5, this);
        this.charlie = pVar;
        C2356f golf = AbstractC2360j.golf(CollectionsKt.beige(jClass.delta()), pVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2355e c2355e = new C2355e(golf);
        while (c2355e.hasNext()) {
            Object next = c2355e.next();
            Ne.f charlie = ((ve.z) next).charlie();
            Object obj = linkedHashMap.get(charlie);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(charlie, obj);
            }
            ((List) obj).add(next);
        }
        this.delta = linkedHashMap;
        C2356f golf2 = AbstractC2360j.golf(CollectionsKt.beige(this.alpha.bravo()), this.bravo);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C2355e c2355e2 = new C2355e(golf2);
        while (c2355e2.hasNext()) {
            Object next2 = c2355e2.next();
            linkedHashMap2.put(((ve.w) next2).charlie(), next2);
        }
        this.echo = linkedHashMap2;
        ArrayList echo = this.alpha.echo();
        ?? r5 = this.bravo;
        ArrayList arrayList = new ArrayList();
        Iterator it = echo.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) r5.invoke(next3)).booleanValue()) {
                arrayList.add(next3);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(quebec < 16 ? 16 : quebec);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((ve.ac) next4).charlie(), next4);
        }
        this.foxtrot = linkedHashMap3;
    }

    @Override // Ce.c
    public final Set alpha() {
        C2356f golf = AbstractC2360j.golf(CollectionsKt.beige(this.alpha.delta()), this.charlie);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C2355e c2355e = new C2355e(golf);
        while (c2355e.hasNext()) {
            linkedHashSet.add(((ve.z) c2355e.next()).charlie());
        }
        return linkedHashSet;
    }

    @Override // Ce.c
    public final List bravo(Ne.f name) {
        Intrinsics.echo(name, "name");
        List list = (List) this.delta.get(name);
        if (list != null) {
            return list;
        }
        return CollectionsKt.emptyList();
    }

    @Override // Ce.c
    public final ve.ac charlie(Ne.f name) {
        Intrinsics.echo(name, "name");
        return (ve.ac) this.foxtrot.get(name);
    }

    @Override // Ce.c
    public final Set delta() {
        return this.foxtrot.keySet();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // Ce.c
    public final Set echo() {
        C2356f golf = AbstractC2360j.golf(CollectionsKt.beige(this.alpha.bravo()), this.bravo);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C2355e c2355e = new C2355e(golf);
        while (c2355e.hasNext()) {
            linkedHashSet.add(((ve.w) c2355e.next()).charlie());
        }
        return linkedHashSet;
    }

    @Override // Ce.c
    public final ve.w foxtrot(Ne.f name) {
        Intrinsics.echo(name, "name");
        return (ve.w) this.echo.get(name);
    }
}
