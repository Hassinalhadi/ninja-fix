package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/z;", "Lcom/fingerprintjs/android/fpjs_pro_internal/i3;", "Lcom/fingerprintjs/android/fpjs_pro_internal/e1;", "bravo", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1284z extends i3<C1203e1> {
    public static final Set charlie = kotlin.collections.ab.oscar("processor");
    public static final Set delta = ArraysKt.g(new String[]{"bogomips", "cpu mhz"});
    public static int echo;
    public final C1203e1 alpha;

    public C1284z(C1203e1 c1203e1) {
        super(null);
        int collectionSizeOrDefault;
        List list = (List) C1203e1.alpha(new Object[]{c1203e1}, P.setPivotYN16904(), P.setPivotYN16904(), -537911860, 537911860, P.setPivotYN16904(), P.setPivotYN16904());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!charlie.contains(((String) ((Pair) obj).getFirst()).toLowerCase(Locale.ROOT))) {
                arrayList.add(obj);
            }
        }
        List<List> list2 = (List) C1203e1.alpha(new Object[]{c1203e1}, P.setPivotYN16904(), P.setPivotYN16904(), 1257476661, -1257476659, P.setPivotYN16904(), P.setPivotYN16904());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (List list3 : list2) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list3) {
                if (!delta.contains(((String) ((Pair) obj2).getFirst()).toLowerCase(Locale.ROOT))) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2.add(arrayList3);
        }
        C1203e1 c1203e12 = new C1203e1(arrayList, arrayList2);
        C1203e1.foxtrot = (C1203e1.echo + 117) % 128;
        this.alpha = c1203e12;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.i3
    public final Object alpha() {
        int i4 = echo;
        echo = ((((i4 & 109) + (i4 | 109)) % 128) + 99) % 128;
        return this.alpha;
    }
}
