package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class U6T {

    /* renamed from: W, reason: collision with root package name */
    public final Map f9692W;

    /* renamed from: b, reason: collision with root package name */
    public final List f9693b;

    public U6T(List list, Map map) {
        this.f9693b = list;
        this.f9692W = map;
    }

    public final int b() {
        Map map = this.f9692W;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Ox) ((Map.Entry) it.next()).getKey()).b()));
        }
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            i5 |= ((Number) obj).intValue();
        }
        return i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U6T)) {
            return false;
        }
        U6T u6t = (U6T) obj;
        if (Intrinsics.areEqual(this.f9693b, u6t.f9693b) && Intrinsics.areEqual(this.f9692W, u6t.f9692W)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9692W.hashCode() + (this.f9693b.hashCode() * 31);
    }

    public final boolean b(Ox ox) {
        int b2 = ox.b();
        if ((b() & b2) != b2) {
            return false;
        }
        if (Intrinsics.areEqual((Boolean) this.f9692W.get(ox), Boolean.TRUE)) {
            return true;
        }
        Map map = this.f9692W;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Ox) ((Map.Entry) it.next()).getKey());
        }
        ArrayList arrayList2 = new ArrayList();
        wNN.b(arrayList2, arrayList, new ArrayList(), 0);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            List list = (List) obj;
            if (list != null) {
                Iterator it2 = list.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    i5 |= ((Ox) it2.next()).b();
                }
                if ((i5 & b2) == b2) {
                    Iterator it3 = list.iterator();
                    boolean z2 = true;
                    while (it3.hasNext()) {
                        z2 &= Intrinsics.areEqual(this.f9692W.get((Ox) it3.next()), Boolean.TRUE);
                    }
                    if (z2) {
                        arrayList3.add(obj);
                    }
                }
            }
        }
        return !arrayList3.isEmpty();
    }
}
