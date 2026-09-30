package N9;

import android.content.Context;
import dagger.hilt.android.qualifiers.ApplicationContext;
import e3.InterfaceC1628b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q3.C2407a;
import q3.C2408b;
import q3.C2409c;
import s6.AbstractC2832z6;
import u3.InterfaceC3143f;
import vf.ad;
import vf.ao;

/* loaded from: classes2.dex */
public final class f {
    public static final f alpha = new Object();

    @NotNull
    public final q3.e provideFeatureFlagBackend(@ApplicationContext @NotNull Context context) {
        Intrinsics.echo(context, "context");
        return new l(new j(), new p(context), a.kilo);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, q3.f] */
    @NotNull
    public final q3.f provideFeatureFlagOverrides(@ApplicationContext @NotNull Context context) {
        Intrinsics.echo(context, "context");
        return new Object();
    }

    @NotNull
    public final q3.g provideFeatureFlagProvider(@NotNull q3.e backend, @NotNull q3.f overrides) {
        Intrinsics.echo(backend, "backend");
        Intrinsics.echo(overrides, "overrides");
        return new i(backend, overrides, a.lima, ad.charlie(AbstractC2832z6.charlie(ad.foxtrot(), ao.alpha)));
    }

    @NotNull
    public final InterfaceC1628b provideFirebaseRemoteConfigManager(@NotNull q3.g provider) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.echo(provider, "provider");
        List list = a.lima;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C2407a) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        int i4 = 16;
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((C2407a) next).alpha, next);
        }
        List list2 = a.lima;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof C2409c) {
                arrayList2.add(obj2);
            }
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        int quebec2 = y.quebec(collectionSizeOrDefault2);
        if (quebec2 >= 16) {
            i4 = quebec2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i4);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            linkedHashMap2.put(((C2409c) next2).alpha, next2);
        }
        return new d(linkedHashMap, provider, linkedHashMap2);
    }

    @NotNull
    public final InterfaceC3143f provideRemoteConfigProvider(@NotNull q3.g provider) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.echo(provider, "provider");
        List list = a.lima;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C2407a) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        int i4 = 16;
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((C2407a) next).alpha, next);
        }
        List list2 = a.lima;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof C2408b) {
                arrayList2.add(obj2);
            }
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        int quebec2 = y.quebec(collectionSizeOrDefault2);
        if (quebec2 >= 16) {
            i4 = quebec2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i4);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            linkedHashMap2.put(((C2408b) next2).alpha, next2);
        }
        return new e(linkedHashMap, provider, linkedHashMap2);
    }
}
