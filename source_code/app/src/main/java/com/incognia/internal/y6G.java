package com.incognia.internal;

import fe.C1715g;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.text.Regex;
import s6.J4;

/* loaded from: classes2.dex */
public final class y6G implements G1 {

    /* renamed from: W, reason: collision with root package name */
    public final List f11834W;

    /* renamed from: b, reason: collision with root package name */
    public final String f11835b;

    /* renamed from: f9, reason: collision with root package name */
    public final boolean f11836f9;

    public y6G(String str, List list, boolean z2) {
        this.f11835b = str;
        this.f11834W = list;
        this.f11836f9 = z2;
        new YUF(new Pc());
    }

    @Override // com.incognia.internal.G1
    public final String b() {
        return this.f11835b;
    }

    @Override // com.incognia.internal.G1
    public final void b(FM4 fm4) {
        List list;
        String str;
        int collectionSizeOrDefault;
        int i4;
        if (this.f11836f9 && (list = this.f11834W) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                MM mm = (MM) obj;
                if (mm.f9113J != null && (str = mm.PqK) != null && new Regex("^([0-9A-Fa-f]{1,2}[:-]){5}([0-9A-Fa-f]{1,2})$").echo(str)) {
                    char[] charArray = mm.PqK.toCharArray();
                    ArrayList arrayList2 = new ArrayList();
                    for (char c3 : charArray) {
                        if (c3 != ':' && c3 != '-') {
                            arrayList2.add(Character.valueOf(c3));
                        }
                    }
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        arrayList3.add(Integer.valueOf(Character.digit(((Character) obj2).charValue(), 16)));
                    }
                    int[] y10 = CollectionsKt.y(arrayList3);
                    if (ArraysKt.bronze(y10).size() < 3) {
                        continue;
                    } else {
                        boolean z2 = true;
                        int[] iArr = new int[y10.length - 1];
                        C1715g hotel = J4.hotel(1, y10.length);
                        int i10 = hotel.red;
                        int i11 = hotel.alpha;
                        int i12 = hotel.purple;
                        if (i10 <= 0 ? i11 < i12 : i11 > i12) {
                            z2 = false;
                        }
                        if (!z2) {
                            i11 = i12;
                        }
                        while (z2) {
                            if (i11 != i12) {
                                i4 = i11 + i10;
                            } else {
                                if (!z2) {
                                    throw new NoSuchElementException();
                                }
                                z2 = false;
                                i4 = i11;
                            }
                            int i13 = i11 - 1;
                            iArr[i13] = y10[i11] - y10[i13];
                            i11 = i4;
                        }
                        if (ArraysKt.bronze(iArr).size() >= 3 && (mm.sVU || mm.f9116b >= -89)) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
            fm4.f8686b8 = arrayList;
            return;
        }
        fm4.f8686b8 = this.f11834W;
    }
}
