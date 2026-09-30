package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0676v {
    public final ArrayList alpha;
    public final int[] bravo;
    public final int[] charlie;
    public final AbstractC0674t delta;
    public final int echo;
    public final int foxtrot;
    public final boolean golf;

    public C0676v(AbstractC0674t abstractC0674t, ArrayList arrayList, int[] iArr, int[] iArr2) {
        C0675u c0675u;
        int[] iArr3;
        int[] iArr4;
        AbstractC0674t abstractC0674t2;
        int i4;
        C0675u c0675u2;
        int i5;
        int i10;
        int i11;
        this.alpha = arrayList;
        this.bravo = iArr;
        this.charlie = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.delta = abstractC0674t;
        int oldListSize = abstractC0674t.getOldListSize();
        this.echo = oldListSize;
        int newListSize = abstractC0674t.getNewListSize();
        this.foxtrot = newListSize;
        this.golf = true;
        if (arrayList.isEmpty()) {
            c0675u = null;
        } else {
            c0675u = (C0675u) arrayList.get(0);
        }
        if (c0675u == null || c0675u.alpha != 0 || c0675u.bravo != 0) {
            arrayList.add(0, new C0675u(0, 0, 0));
        }
        arrayList.add(new C0675u(oldListSize, newListSize, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iArr3 = this.charlie;
            iArr4 = this.bravo;
            abstractC0674t2 = this.delta;
            if (!hasNext) {
                break;
            }
            C0675u c0675u3 = (C0675u) it.next();
            for (int i12 = 0; i12 < c0675u3.charlie; i12++) {
                int i13 = c0675u3.alpha + i12;
                int i14 = c0675u3.bravo + i12;
                if (abstractC0674t2.areContentsTheSame(i13, i14)) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                iArr4[i13] = (i14 << 4) | i11;
                iArr3[i14] = (i13 << 4) | i11;
            }
        }
        if (this.golf) {
            Iterator it2 = arrayList.iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                C0675u c0675u4 = (C0675u) it2.next();
                while (true) {
                    i4 = c0675u4.alpha;
                    if (i15 < i4) {
                        if (iArr4[i15] == 0) {
                            int size = arrayList.size();
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                if (i16 < size) {
                                    c0675u2 = (C0675u) arrayList.get(i16);
                                    while (true) {
                                        i5 = c0675u2.bravo;
                                        if (i17 < i5) {
                                            if (iArr3[i17] == 0 && abstractC0674t2.areItemsTheSame(i15, i17)) {
                                                if (abstractC0674t2.areContentsTheSame(i15, i17)) {
                                                    i10 = 8;
                                                } else {
                                                    i10 = 4;
                                                }
                                                iArr4[i15] = (i17 << 4) | i10;
                                                iArr3[i17] = i10 | (i15 << 4);
                                            } else {
                                                i17++;
                                            }
                                        }
                                    }
                                }
                                i17 = c0675u2.charlie + i5;
                                i16++;
                            }
                        }
                        i15++;
                    }
                }
                i15 = c0675u4.charlie + i4;
            }
        }
    }

    public static C0678x bravo(ArrayDeque arrayDeque, int i4, boolean z2) {
        C0678x c0678x;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (it.hasNext()) {
                c0678x = (C0678x) it.next();
                if (c0678x.alpha == i4 && c0678x.charlie == z2) {
                    it.remove();
                    break;
                }
            } else {
                c0678x = null;
                break;
            }
        }
        while (it.hasNext()) {
            C0678x c0678x2 = (C0678x) it.next();
            if (z2) {
                c0678x2.bravo--;
            } else {
                c0678x2.bravo++;
            }
        }
        return c0678x;
    }

    public final void alpha(ar arVar) {
        C0664i c0664i;
        int[] iArr;
        AbstractC0674t abstractC0674t;
        int i4;
        int i5;
        ArrayList arrayList;
        C0676v c0676v = this;
        if (arVar instanceof C0664i) {
            c0664i = (C0664i) arVar;
        } else {
            c0664i = new C0664i(arVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = c0676v.alpha;
        boolean z2 = true;
        int size = arrayList2.size() - 1;
        int i10 = c0676v.echo;
        int i11 = c0676v.foxtrot;
        int i12 = i10;
        while (size >= 0) {
            C0675u c0675u = (C0675u) arrayList2.get(size);
            int i13 = c0675u.alpha;
            int i14 = c0675u.charlie;
            int i15 = i13 + i14;
            int i16 = c0675u.bravo;
            int i17 = i16 + i14;
            while (true) {
                iArr = c0676v.bravo;
                abstractC0674t = c0676v.delta;
                boolean z10 = z2;
                i4 = 0;
                if (i12 <= i15) {
                    break;
                }
                i12--;
                int i18 = iArr[i12];
                if ((i18 & 12) != 0) {
                    arrayList = arrayList2;
                    int i19 = i18 >> 4;
                    C0678x bravo = bravo(arrayDeque, i19, false);
                    if (bravo != null) {
                        int i20 = (i10 - bravo.bravo) - 1;
                        c0664i.onMoved(i12, i20);
                        if ((i18 & 4) != 0) {
                            c0664i.onChanged(i20, z10 ? 1 : 0, abstractC0674t.getChangePayload(i12, i19));
                        }
                    } else {
                        arrayDeque.add(new C0678x(i12, (i10 - i12) - (z10 ? 1 : 0), z10));
                    }
                } else {
                    arrayList = arrayList2;
                    c0664i.onRemoved(i12, z10 ? 1 : 0);
                    i10--;
                }
                arrayList2 = arrayList;
                z2 = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i11 > i17) {
                i11--;
                int i21 = c0676v.charlie[i11];
                if ((i21 & 12) != 0) {
                    int i22 = i21 >> 4;
                    C0678x bravo2 = bravo(arrayDeque, i22, true);
                    if (bravo2 == null) {
                        arrayDeque.add(new C0678x(i11, i10 - i12, false));
                        i5 = 0;
                    } else {
                        i5 = 0;
                        c0664i.onMoved((i10 - bravo2.bravo) - 1, i12);
                        if ((i21 & 4) != 0) {
                            c0664i.onChanged(i12, 1, abstractC0674t.getChangePayload(i22, i11));
                        }
                    }
                } else {
                    i5 = i4;
                    c0664i.onInserted(i12, 1);
                    i10++;
                }
                c0676v = this;
                i4 = i5;
            }
            i12 = c0675u.alpha;
            int i23 = i12;
            int i24 = i16;
            while (i4 < i14) {
                if ((iArr[i23] & 15) == 2) {
                    c0664i.onChanged(i23, 1, abstractC0674t.getChangePayload(i23, i24));
                }
                i23++;
                i24++;
                i4++;
            }
            size--;
            c0676v = this;
            z2 = true;
            i11 = i16;
            arrayList2 = arrayList3;
        }
        c0664i.alpha();
    }
}
