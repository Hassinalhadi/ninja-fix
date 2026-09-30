package A0;

import bx.C0769g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import s0.al;

/* loaded from: classes3.dex */
public abstract class ag {
    public static final Comparator[] alpha;
    public static final w bravo;

    static {
        f fVar;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i4 = 0; i4 < 2; i4++) {
            if (i4 == 0) {
                fVar = f.red;
            } else {
                fVar = f.purple;
            }
            s0.af afVar = al.f13273J;
            comparatorArr[i4] = new af(1, new af(fVar));
        }
        alpha = comparatorArr;
        bravo = w.f16o;
    }

    public static final void alpha(s sVar, ArrayList arrayList, C0769g c0769g, C0769g c0769g2, bv.aa aaVar) {
        k kVar = sVar.delta;
        Object golf = kVar.alpha.golf(x.mike);
        if (golf == null) {
            l.teal.getClass();
            golf = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) golf).booleanValue();
        if ((booleanValue || ((Boolean) c0769g2.invoke(sVar)).booleanValue()) && ((Boolean) c0769g.invoke(sVar)).booleanValue()) {
            arrayList.add(sVar);
        }
        if (booleanValue) {
            aaVar.hotel(sVar.golf, bravo(sVar, c0769g, c0769g2, s.juliet(7, sVar)));
            return;
        }
        List juliet = s.juliet(7, sVar);
        int size = juliet.size();
        for (int i4 = 0; i4 < size; i4++) {
            alpha((s) juliet.get(i4), arrayList, c0769g, c0769g2, aaVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8 A[LOOP:1: B:11:0x0044->B:29:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff A[EDGE_INSN: B:30:0x00ff->B:31:0x00ff BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00f8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList bravo(s sVar, C0769g c0769g, C0769g c0769g2, List list) {
        char c3;
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        bv.aa aaVar = bv.o.alpha;
        bv.aa aaVar2 = new bv.aa();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            alpha((s) list.get(i14), arrayList, c0769g, c0769g2, aaVar2);
        }
        if (sVar.charlie.f13299r == Q0.n.purple) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int ivory = CollectionsKt.ivory(arrayList);
        if (ivory >= 0) {
            int i15 = 0;
            while (true) {
                s sVar2 = (s) arrayList.get(i15);
                if (i15 != 0) {
                    Z.c hotel = sVar2.hotel();
                    Z.c hotel2 = sVar2.hotel();
                    float f5 = hotel.bravo;
                    float f10 = hotel2.delta;
                    if (f5 >= f10) {
                        i11 = i13;
                    } else {
                        i11 = 0;
                    }
                    int ivory2 = CollectionsKt.ivory(arrayList2);
                    if (ivory2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            Z.c cVar = (Z.c) ((Pair) arrayList2.get(i16)).getFirst();
                            i4 = 0;
                            float f11 = cVar.bravo;
                            i5 = i13;
                            float f12 = cVar.delta;
                            if (f11 >= f12) {
                                i12 = i5;
                            } else {
                                i12 = 0;
                            }
                            if (i11 == 0 && i12 == 0 && Math.max(f5, f11) < Math.min(f10, f12)) {
                                arrayList2.set(i16, new Pair(new Z.c(Math.max(cVar.alpha, 0.0f), Math.max(cVar.bravo, f5), Math.min(cVar.charlie, Float.POSITIVE_INFINITY), Math.min(f12, f10)), ((Pair) arrayList2.get(i16)).getSecond()));
                                ((List) ((Pair) arrayList2.get(i16)).getSecond()).add(sVar2);
                                i10 = i5;
                                break;
                            }
                            if (i16 == ivory2) {
                                break;
                            }
                            i16++;
                            i13 = i5;
                        }
                        Z.c hotel3 = sVar2.hotel();
                        i10 = i5;
                        s[] sVarArr = new s[i10];
                        sVarArr[i4] = sVar2;
                        arrayList2.add(new Pair(hotel3, CollectionsKt.white(sVarArr)));
                        if (i15 != ivory) {
                            break;
                        }
                        i15 += i10;
                        i13 = i10;
                    }
                }
                i5 = i13;
                i4 = 0;
                Z.c hotel32 = sVar2.hotel();
                i10 = i5;
                s[] sVarArr2 = new s[i10];
                sVarArr2[i4] = sVar2;
                arrayList2.add(new Pair(hotel32, CollectionsKt.white(sVarArr2)));
                if (i15 != ivory) {
                }
            }
        } else {
            i4 = 0;
        }
        kotlin.collections.p.romeo(arrayList2, f.silver);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = alpha[c3 ^ 1];
        int size2 = arrayList2.size();
        for (int i17 = i4; i17 < size2; i17++) {
            Pair pair = (Pair) arrayList2.get(i17);
            kotlin.collections.p.romeo((List) pair.getSecond(), comparator);
            arrayList3.addAll((Collection) pair.getSecond());
        }
        int i18 = i4;
        kotlin.collections.p.romeo(arrayList3, new ae(i18, bravo));
        while (i18 <= CollectionsKt.ivory(arrayList3)) {
            List list2 = (List) aaVar2.bravo(((s) arrayList3.get(i18)).golf);
            if (list2 != null) {
                if (!((Boolean) c0769g2.invoke(arrayList3.get(i18))).booleanValue()) {
                    arrayList3.remove(i18);
                } else {
                    i18++;
                }
                arrayList3.addAll(i18, list2);
                i18 += list2.size();
            } else {
                i18++;
            }
        }
        return arrayList3;
    }
}
