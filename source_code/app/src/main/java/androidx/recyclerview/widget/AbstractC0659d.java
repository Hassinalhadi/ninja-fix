package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0659d {
    public static ExecutorService bravo;
    public static final Object alpha = new Object();
    public static final C0673s charlie = new C0673s(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v26, types: [androidx.recyclerview.widget.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.recyclerview.widget.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [androidx.recyclerview.widget.z, java.lang.Object] */
    public static C0676v alpha(AbstractC0674t abstractC0674t) {
        int i4;
        C0680z c0680z;
        int i5;
        C0679y c0679y;
        C0675u c0675u;
        int i10;
        int i11;
        int i12;
        C0680z c0680z2;
        int i13;
        C0680z c0680z3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int oldListSize = abstractC0674t.getOldListSize();
        int newListSize = abstractC0674t.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ?? obj = new Object();
        int i24 = 0;
        obj.alpha = 0;
        obj.bravo = oldListSize;
        obj.charlie = 0;
        obj.delta = newListSize;
        arrayList2.add(obj);
        int i25 = oldListSize + newListSize;
        int i26 = 1;
        int i27 = (((i25 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i27];
        int i28 = i27 / 2;
        int[] iArr2 = new int[i27];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0679y c0679y2 = (C0679y) arrayList2.remove(arrayList2.size() - i26);
            if (c0679y2.bravo() >= i26 && c0679y2.alpha() >= i26) {
                int alpha2 = ((c0679y2.alpha() + c0679y2.bravo()) + i26) / 2;
                int i29 = i26 + i28;
                iArr[i29] = c0679y2.alpha;
                iArr2[i29] = c0679y2.bravo;
                int i30 = i24;
                while (i30 < alpha2) {
                    if (Math.abs(c0679y2.bravo() - c0679y2.alpha()) % 2 == i26) {
                        i10 = i26;
                    } else {
                        i10 = i24;
                    }
                    int bravo2 = c0679y2.bravo() - c0679y2.alpha();
                    int i31 = -i30;
                    int i32 = i31;
                    while (true) {
                        if (i32 <= i30) {
                            if (i32 != i31 && (i32 == i30 || iArr[i32 + 1 + i28] <= iArr[(i32 - 1) + i28])) {
                                i19 = iArr[(i32 - 1) + i28];
                                i20 = i19 + 1;
                            } else {
                                i19 = iArr[i32 + 1 + i28];
                                i20 = i19;
                            }
                            i4 = i28;
                            int i33 = ((i20 - c0679y2.alpha) + c0679y2.charlie) - i32;
                            if (i30 != 0 && i20 == i19) {
                                i21 = i20;
                                i22 = i33 - 1;
                            } else {
                                i21 = i20;
                                i22 = i33;
                            }
                            int i34 = i32;
                            int i35 = i33;
                            int i36 = i21;
                            i12 = alpha2;
                            while (i36 < c0679y2.bravo && i35 < c0679y2.delta && abstractC0674t.areItemsTheSame(i36, i35)) {
                                i36++;
                                i35++;
                            }
                            iArr[i34 + i4] = i36;
                            if (i10 != 0) {
                                int i37 = bravo2 - i34;
                                i23 = i10;
                                if (i37 >= i31 + 1 && i37 <= i30 - 1 && iArr2[i37 + i4] <= i36) {
                                    ?? obj2 = new Object();
                                    obj2.alpha = i19;
                                    obj2.bravo = i22;
                                    obj2.charlie = i36;
                                    obj2.delta = i35;
                                    i11 = 0;
                                    obj2.echo = false;
                                    c0680z2 = obj2;
                                    break;
                                }
                            } else {
                                i23 = i10;
                            }
                            i32 = i34 + 2;
                            i24 = 0;
                            i28 = i4;
                            alpha2 = i12;
                            i10 = i23;
                        } else {
                            i11 = i24;
                            i4 = i28;
                            i12 = alpha2;
                            c0680z2 = null;
                            break;
                        }
                    }
                    if (c0680z2 != null) {
                        c0680z = c0680z2;
                        break;
                    }
                    if ((c0679y2.bravo() - c0679y2.alpha()) % 2 == 0) {
                        i13 = 1;
                    } else {
                        i13 = i11;
                    }
                    int bravo3 = c0679y2.bravo() - c0679y2.alpha();
                    int i38 = i31;
                    while (true) {
                        if (i38 <= i30) {
                            if (i38 != i31 && (i38 == i30 || iArr2[i38 + 1 + i4] >= iArr2[(i38 - 1) + i4])) {
                                i14 = iArr2[(i38 - 1) + i4];
                                i15 = i14 - 1;
                            } else {
                                i14 = iArr2[i38 + 1 + i4];
                                i15 = i14;
                            }
                            int i39 = c0679y2.delta - ((c0679y2.bravo - i15) - i38);
                            if (i30 != 0 && i15 == i14) {
                                i16 = i39 + 1;
                            } else {
                                i16 = i39;
                            }
                            int i40 = i13;
                            while (i15 > c0679y2.alpha && i39 > c0679y2.charlie) {
                                i17 = bravo3;
                                if (!abstractC0674t.areItemsTheSame(i15 - 1, i39 - 1)) {
                                    break;
                                }
                                i15--;
                                i39--;
                                bravo3 = i17;
                            }
                            i17 = bravo3;
                            iArr2[i38 + i4] = i15;
                            if (i40 != 0 && (i18 = i17 - i38) >= i31 && i18 <= i30 && iArr[i18 + i4] >= i15) {
                                ?? obj3 = new Object();
                                obj3.alpha = i15;
                                obj3.bravo = i39;
                                obj3.charlie = i14;
                                obj3.delta = i16;
                                obj3.echo = true;
                                c0680z3 = obj3;
                                break;
                            }
                            i38 += 2;
                            i13 = i40;
                            bravo3 = i17;
                        } else {
                            c0680z3 = null;
                            break;
                        }
                    }
                    if (c0680z3 != null) {
                        c0680z = c0680z3;
                        break;
                    }
                    i30++;
                    i28 = i4;
                    alpha2 = i12;
                    i26 = 1;
                    i24 = 0;
                }
            }
            i4 = i28;
            c0680z = null;
            if (c0680z != null) {
                if (c0680z.alpha() > 0) {
                    int i41 = c0680z.delta;
                    int i42 = c0680z.bravo;
                    int i43 = i41 - i42;
                    int i44 = c0680z.charlie;
                    int i45 = c0680z.alpha;
                    int i46 = i44 - i45;
                    if (i43 != i46) {
                        if (c0680z.echo) {
                            c0675u = new C0675u(i45, i42, c0680z.alpha());
                        } else if (i43 > i46) {
                            c0675u = new C0675u(i45, i42 + 1, c0680z.alpha());
                        } else {
                            c0675u = new C0675u(i45 + 1, i42, c0680z.alpha());
                        }
                    } else {
                        c0675u = new C0675u(i45, i42, i46);
                    }
                    arrayList.add(c0675u);
                }
                if (arrayList3.isEmpty()) {
                    i5 = 1;
                    c0679y = new Object();
                } else {
                    i5 = 1;
                    c0679y = (C0679y) arrayList3.remove(arrayList3.size() - 1);
                }
                c0679y.alpha = c0679y2.alpha;
                c0679y.charlie = c0679y2.charlie;
                c0679y.bravo = c0680z.alpha;
                c0679y.delta = c0680z.bravo;
                arrayList2.add(c0679y);
                c0679y2.bravo = c0679y2.bravo;
                c0679y2.delta = c0679y2.delta;
                c0679y2.alpha = c0680z.charlie;
                c0679y2.charlie = c0680z.delta;
                arrayList2.add(c0679y2);
            } else {
                i5 = 1;
                arrayList3.add(c0679y2);
            }
            i28 = i4;
            i26 = i5;
            i24 = 0;
        }
        Collections.sort(arrayList, charlie);
        return new C0676v(abstractC0674t, arrayList, iArr, iArr2);
    }

    public static int bravo(b0 b0Var, K1.g gVar, View view, View view2, L l10, boolean z2) {
        if (l10.whiskey() != 0 && b0Var.bravo() != 0 && view != null && view2 != null) {
            if (!z2) {
                return Math.abs(L.gray(view) - L.gray(view2)) + 1;
            }
            return Math.min(gVar.lima(), gVar.bravo(view2) - gVar.echo(view));
        }
        return 0;
    }

    public static int charlie(b0 b0Var, K1.g gVar, View view, View view2, L l10, boolean z2, boolean z10) {
        int max;
        if (l10.whiskey() == 0 || b0Var.bravo() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(L.gray(view), L.gray(view2));
        int max2 = Math.max(L.gray(view), L.gray(view2));
        if (z10) {
            max = Math.max(0, (b0Var.bravo() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z2) {
            return max;
        }
        return Math.round((max * (Math.abs(gVar.bravo(view2) - gVar.echo(view)) / (Math.abs(L.gray(view) - L.gray(view2)) + 1))) + (gVar.kilo() - gVar.echo(view)));
    }

    public static int delta(b0 b0Var, K1.g gVar, View view, View view2, L l10, boolean z2) {
        if (l10.whiskey() != 0 && b0Var.bravo() != 0 && view != null && view2 != null) {
            if (!z2) {
                return b0Var.bravo();
            }
            return (int) (((gVar.bravo(view2) - gVar.echo(view)) / (Math.abs(L.gray(view) - L.gray(view2)) + 1)) * b0Var.bravo());
        }
        return 0;
    }
}
