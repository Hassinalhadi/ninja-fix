package F;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class H implements q0.ap {
    public static final H bravo = new H(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ H(int i4) {
        this.alpha = i4;
    }

    public static final void charlie(ArrayList arrayList, kotlin.jvm.internal.s sVar, q0.ar arVar, ArrayList arrayList2, ArrayList arrayList3, kotlin.jvm.internal.s sVar2, ArrayList arrayList4, kotlin.jvm.internal.s sVar3, kotlin.jvm.internal.s sVar4) {
        float f5 = AbstractC0128l.delta;
        if (!arrayList.isEmpty()) {
            sVar.alpha = arVar.ochre(f5) + sVar.alpha;
        }
        arrayList.add(0, CollectionsKt.z(arrayList2));
        arrayList3.add(Integer.valueOf(sVar2.alpha));
        arrayList4.add(Integer.valueOf(sVar.alpha));
        sVar.alpha += sVar2.alpha;
        sVar3.alpha = Math.max(sVar3.alpha, sVar4.alpha);
        arrayList2.clear();
        sVar4.alpha = 0;
        sVar2.alpha = 0;
    }

    @Override // q0.ap
    public final /* synthetic */ int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int i5 = this.alpha;
        return AbstractC2327c.mike(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int i5 = this.alpha;
        return AbstractC2327c.juliet(this, interfaceC2402u, list, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.jvm.internal.s, java.lang.Object] */
    @Override // q0.ap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        AbstractC2367C abstractC2367C;
        Object obj;
        AbstractC2367C abstractC2367C2;
        int i4;
        int i5;
        Object obj2;
        long j6;
        int i10;
        int i11;
        kotlin.jvm.internal.s sVar;
        kotlin.jvm.internal.s sVar2;
        q0.ar arVar2;
        ArrayList arrayList;
        AbstractC2367C abstractC2367C3;
        ArrayList arrayList2;
        long j7 = j5;
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        switch (this.alpha) {
            case 0:
                int size = list.size();
                int i12 = 0;
                while (true) {
                    abstractC2367C = null;
                    if (i12 < size) {
                        obj = list.get(i12);
                        if (!Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj), "leadingIcon")) {
                            i12++;
                        }
                    } else {
                        obj = null;
                    }
                }
                q0.ao aoVar = (q0.ao) obj;
                if (aoVar != null) {
                    abstractC2367C2 = aoVar.victor(Q0.a.alpha(j5, 0, 0, 0, 0, 10));
                } else {
                    abstractC2367C2 = null;
                }
                float f5 = androidx.compose.material3.internal.at.bravo;
                if (abstractC2367C2 != null) {
                    i4 = abstractC2367C2.alpha;
                } else {
                    i4 = 0;
                }
                if (abstractC2367C2 != null) {
                    i5 = abstractC2367C2.purple;
                } else {
                    i5 = 0;
                }
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size2) {
                        obj2 = list.get(i13);
                        if (!Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj2), "trailingIcon")) {
                            i13++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                q0.ao aoVar2 = (q0.ao) obj2;
                if (aoVar2 != null) {
                    j6 = j5;
                    abstractC2367C = aoVar2.victor(Q0.a.alpha(j6, 0, 0, 0, 0, 10));
                } else {
                    j6 = j5;
                }
                if (abstractC2367C != null) {
                    i10 = abstractC2367C.alpha;
                } else {
                    i10 = 0;
                }
                if (abstractC2367C != null) {
                    i11 = abstractC2367C.purple;
                } else {
                    i11 = 0;
                }
                int size3 = list.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    q0.ao aoVar3 = (q0.ao) list.get(i14);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha(aoVar3), "label")) {
                        AbstractC2367C victor = aoVar3.victor(Q0.b.juliet(-(i4 + i10), 0, 2, j6));
                        int i15 = i4 + victor.alpha + i10;
                        int max = Math.max(i5, Math.max(victor.purple, i11));
                        return arVar.papa(i15, max, tVar, new G(abstractC2367C2, i5, max, victor, i4, abstractC2367C, i11));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ?? obj3 = new Object();
                ?? obj4 = new Object();
                ArrayList arrayList6 = new ArrayList();
                int i16 = 0;
                ?? obj5 = new Object();
                ?? obj6 = new Object();
                int size4 = list.size();
                while (i16 < size4) {
                    ArrayList arrayList7 = arrayList3;
                    AbstractC2367C victor2 = ((q0.ao) list.get(i16)).victor(j7);
                    boolean isEmpty = arrayList6.isEmpty();
                    float f10 = AbstractC0128l.charlie;
                    if (!isEmpty) {
                        if (arVar.ochre(f10) + obj5.alpha + victor2.alpha <= Q0.a.hotel(j5)) {
                            abstractC2367C3 = victor2;
                        } else {
                            float f11 = AbstractC0128l.alpha;
                            abstractC2367C3 = victor2;
                            arrayList2 = arrayList7;
                            charlie(arrayList2, obj4, arVar, arrayList6, arrayList4, obj6, arrayList5, obj3, obj5);
                            ArrayList arrayList8 = arrayList2;
                            if (arrayList6.isEmpty()) {
                                obj5.alpha = arVar.ochre(f10) + obj5.alpha;
                            }
                            arrayList6.add(abstractC2367C3);
                            obj5.alpha += abstractC2367C3.alpha;
                            obj6.alpha = Math.max(obj6.alpha, abstractC2367C3.purple);
                            i16++;
                            j7 = j5;
                            arrayList3 = arrayList8;
                        }
                    } else {
                        abstractC2367C3 = victor2;
                    }
                    arrayList2 = arrayList7;
                    ArrayList arrayList82 = arrayList2;
                    if (arrayList6.isEmpty()) {
                    }
                    arrayList6.add(abstractC2367C3);
                    obj5.alpha += abstractC2367C3.alpha;
                    obj6.alpha = Math.max(obj6.alpha, abstractC2367C3.purple);
                    i16++;
                    j7 = j5;
                    arrayList3 = arrayList82;
                }
                ArrayList arrayList9 = arrayList3;
                if (!arrayList6.isEmpty()) {
                    float f12 = AbstractC0128l.alpha;
                    arrayList = arrayList9;
                    charlie(arrayList, obj4, arVar, arrayList6, arrayList4, obj6, arrayList5, obj3, obj5);
                    sVar = obj4;
                    sVar2 = obj3;
                    arVar2 = arVar;
                } else {
                    sVar = obj4;
                    sVar2 = obj3;
                    arVar2 = arVar;
                    arrayList = arrayList9;
                }
                int max2 = Math.max(sVar2.alpha, Q0.a.juliet(j5));
                int max3 = Math.max(sVar.alpha, Q0.a.india(j5));
                float f13 = AbstractC0128l.alpha;
                return arVar2.papa(max2, max3, tVar, new C0108g(arrayList, arVar2, max2, arrayList5));
        }
    }

    @Override // q0.ap
    public final /* synthetic */ int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int i5 = this.alpha;
        return AbstractC2327c.golf(this, interfaceC2402u, list, i4);
    }

    @Override // q0.ap
    public final /* synthetic */ int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        int i5 = this.alpha;
        return AbstractC2327c.delta(this, interfaceC2402u, list, i4);
    }
}
