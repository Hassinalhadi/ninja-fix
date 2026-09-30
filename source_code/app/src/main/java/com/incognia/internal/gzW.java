package com.incognia.internal;

import av.av;
import g9.a;
import h9.ae;
import h9.ap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class gzW implements Gg {

    /* renamed from: W, reason: collision with root package name */
    public final MDG f10511W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f10512b;

    /* renamed from: f9, reason: collision with root package name */
    public final AK f10513f9;
    public int gmP;
    public D5f sVU = aNe.f10097b;

    public gzW(pl2 pl2Var, MDG mdg, AK ak) {
        this.f10512b = pl2Var;
        this.f10511W = mdg;
        this.f10513f9 = ak;
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.sVU = tOI.f11377b;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10512b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.sVU = b66.f10146b;
        njO.b(this, new a(15, this));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.sVU;
    }

    public static final void b(gzW gzw) {
        int collectionSizeOrDefault;
        gzw.gmP = 0;
        AK ak = gzw.f10513f9;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.alpha = CollectionsKt.emptyList();
        ak.f8350f9.W(new c0O(ak, objectRef));
        List list = (List) objectRef.alpha;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xK) it.next()).sVU);
        }
        gzw.b(arrayList, jsl.f10726b, null, false);
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        this.sVU = L4.f9041b;
        cj0.invoke();
    }

    public final void b(List list, rCM rcm, Function1 function1, boolean z2) {
        if (njO.b(this, new ap(list, function1, z2, this, rcm)) || function1 == null) {
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public static final void b(List list, Function1 function1, boolean z2, gzW gzw, rCM rcm) {
        int collectionSizeOrDefault;
        try {
            if (list.isEmpty()) {
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                XD xd2 = (XD) it.next();
                arrayList.add(new xK(null, xd2.gmP, xd2.f9904f9, xd2));
            }
            if (z2) {
                AK ak = gzw.f10513f9;
                ?? obj = new Object();
                ak.f10963b.b(new VZP(obj, ak));
                if (obj.alpha) {
                    ?? obj2 = new Object();
                    ak.f10963b.b(new VZP(obj2, ak));
                    if (obj2.alpha) {
                        ak.f10963b.W(new bFl(ak));
                        ak.f10963b.b(nc.f10960b);
                    }
                }
                ak.f8350f9.W(new tkE(arrayList, ak));
            }
            gzw.f10511W.b(list, rcm, new av(gzw, function1, arrayList, list));
            gzw.gmP++;
        } catch (Throwable unused) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
    }

    public static final void b(gzW gzw, Function1 function1, List list, List list2, boolean z2, List list3) {
        njO.b(gzw, new ae(function1, z2, gzw, list, list3, list2));
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public static final void b(Function1 function1, boolean z2, gzW gzw, List list, List list2, List list3) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z2));
        }
        gzw.gmP--;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (list2.contains(((xK) obj).f11788W)) {
                    arrayList.add(obj);
                }
            }
            AK ak = gzw.f10513f9;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                arrayList2.add(((xK) obj2).f11788W);
            }
            if (!arrayList2.isEmpty()) {
                ak.f10963b.b(new x(ak, arrayList2));
            }
            if (list2.size() == list3.size() && gzw.gmP == 0) {
                AK ak2 = gzw.f10513f9;
                ?? obj3 = new Object();
                ak2.f8350f9.b(new Ko(obj3));
                if (obj3.alpha) {
                    return;
                }
                AK ak3 = gzw.f10513f9;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.alpha = CollectionsKt.emptyList();
                ak3.f8350f9.W(new c0O(ak3, objectRef));
                List list4 = (List) objectRef.alpha;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((xK) it.next()).sVU);
                }
                gzw.b(arrayList3, jsl.f10726b, null, false);
            }
        }
    }
}
