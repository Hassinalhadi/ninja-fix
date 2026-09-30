package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

/* loaded from: classes3.dex */
public final class s {
    public final bv.al alpha;
    public as bravo;
    public final bv.am charlie;
    public final ArrayList delta;
    public final ArrayList echo;
    public final ArrayList foxtrot;
    public final ArrayList golf;
    public final ArrayList hotel;
    public final T.s india;

    public s() {
        long[] jArr = bv.au.alpha;
        this.alpha = new bv.al();
        bv.am amVar = bv.av.alpha;
        this.charlie = new bv.am();
        this.delta = new ArrayList();
        this.echo = new ArrayList();
        this.foxtrot = new ArrayList();
        this.golf = new ArrayList();
        this.hotel = new ArrayList();
        this.india = new F(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
            public final s alpha;

            {
                this.alpha = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.q, T.r] */
            @Override // s0.F
            public final T.r create() {
                ?? rVar = new T.r();
                rVar.alpha = this.alpha;
                return rVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && Intrinsics.areEqual(this.alpha, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).alpha);
            }

            public final int hashCode() {
                return this.alpha.hashCode();
            }

            @Override // s0.F
            public final void inspectableProperties(C2915g0 c2915g0) {
                c2915g0.alpha = "DisplayingDisappearingItemsElement";
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.alpha + ')';
            }

            @Override // s0.F
            public final void update(T.r rVar) {
                q qVar = (q) rVar;
                s sVar = qVar.alpha;
                s sVar2 = this.alpha;
                if (!Intrinsics.areEqual(sVar, sVar2) && qVar.getNode().isAttached()) {
                    s sVar3 = qVar.alpha;
                    sVar3.delta();
                    sVar3.bravo = null;
                    sVar2.getClass();
                    qVar.alpha = sVar2;
                }
            }
        };
    }

    public static int echo(int[] iArr, aa aaVar) {
        int india = aaVar.india();
        int charlie = aaVar.charlie() + india;
        int i4 = 0;
        while (india < charlie) {
            int bravo = aaVar.bravo() + iArr[india];
            iArr[india] = bravo;
            i4 = Math.max(i4, bravo);
            india++;
        }
        return i4;
    }

    public final void alpha(int i4, Object obj) {
        ao.ad.cyan(this.alpha.golf(obj));
    }

    public final long bravo() {
        ArrayList arrayList = this.hotel;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        ao.ad.cyan(arrayList.get(0));
        throw null;
    }

    public final void charlie(int i4, int i5, ArrayList arrayList, as asVar, G3.a aVar, boolean z2, int i10, boolean z10, int i11, int i12) {
        boolean z11;
        ArrayList arrayList2;
        Throwable th;
        as asVar2 = this.bravo;
        this.bravo = asVar;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            aa aaVar = (aa) arrayList.get(i13);
            int alpha = aaVar.alpha();
            for (int i14 = 0; i14 < alpha; i14++) {
                aaVar.delta(i14);
            }
        }
        bv.al alVar = this.alpha;
        if (alVar.india()) {
            delta();
            return;
        }
        if (!z2 && z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        Object[] objArr = alVar.bravo;
        long[] jArr = alVar.alpha;
        int length = jArr.length - 2;
        bv.am amVar = this.charlie;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j5 = jArr[i15];
                int i16 = i15;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    long j6 = j5;
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j6 & 255) < 128) {
                            amVar.alpha(objArr[(i16 << 3) + i18]);
                        }
                        j6 >>= 8;
                    }
                    if (i17 != 8) {
                        break;
                    }
                }
                if (i16 == length) {
                    break;
                } else {
                    i15 = i16 + 1;
                }
            }
        }
        int size2 = arrayList.size();
        for (int i19 = 0; i19 < size2; i19++) {
            aa aaVar2 = (aa) arrayList.get(i19);
            amVar.lima(aaVar2.getKey());
            int alpha2 = aaVar2.alpha();
            for (int i20 = 0; i20 < alpha2; i20++) {
                aaVar2.delta(i20);
            }
            ao.ad.cyan(this.alpha.kilo(aaVar2.getKey()));
        }
        int[] iArr = new int[i10];
        ArrayList arrayList3 = this.echo;
        ArrayList arrayList4 = this.delta;
        if (z11 && asVar2 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    kotlin.collections.p.romeo(arrayList4, new r(asVar2, 2));
                }
                if (arrayList4.size() <= 0) {
                    ArraysKt.crimson(0, iArr);
                } else {
                    aa aaVar3 = (aa) arrayList4.get(0);
                    echo(iArr, aaVar3);
                    Object golf = alVar.golf(aaVar3.getKey());
                    Intrinsics.checkNotNull(golf);
                    ao.ad.cyan(golf);
                    aaVar3.hotel(0);
                    throw null;
                }
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    kotlin.collections.p.romeo(arrayList3, new r(asVar2, 0));
                }
                if (arrayList3.size() <= 0) {
                    ArraysKt.crimson(0, iArr);
                } else {
                    aa aaVar4 = (aa) arrayList3.get(0);
                    echo(iArr, aaVar4);
                    Object golf2 = alVar.golf(aaVar4.getKey());
                    Intrinsics.checkNotNull(golf2);
                    ao.ad.cyan(golf2);
                    aaVar4.hotel(0);
                    throw null;
                }
            }
        }
        Object[] objArr2 = amVar.bravo;
        long[] jArr2 = amVar.alpha;
        int length2 = jArr2.length - 2;
        ArrayList arrayList5 = this.golf;
        ArrayList arrayList6 = this.foxtrot;
        if (length2 >= 0) {
            th = null;
            int i21 = 0;
            while (true) {
                long j7 = jArr2[i21];
                arrayList2 = arrayList3;
                long[] jArr3 = jArr2;
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j7 & 255) < 128) {
                            ao.ad.cyan(alVar.golf(objArr2[(i21 << 3) + i23]));
                        }
                        j7 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length2) {
                    break;
                }
                i21++;
                arrayList3 = arrayList2;
                jArr2 = jArr3;
            }
        } else {
            arrayList2 = arrayList3;
            th = null;
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 1) {
                kotlin.collections.p.romeo(arrayList6, new r(asVar, 3));
            }
            if (arrayList6.size() > 0) {
                aa aaVar5 = (aa) arrayList6.get(0);
                Object golf3 = alVar.golf(aaVar5.getKey());
                Intrinsics.checkNotNull(golf3);
                ao.ad.cyan(golf3);
                echo(iArr, aaVar5);
                if (z2) {
                    ((aa) CollectionsKt.gold(arrayList)).hotel(0);
                    throw th;
                }
                throw th;
            }
            ArraysKt.crimson(0, iArr);
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                kotlin.collections.p.romeo(arrayList5, new r(asVar, 1));
            }
            if (arrayList5.size() > 0) {
                aa aaVar6 = (aa) arrayList5.get(0);
                Object golf4 = alVar.golf(aaVar6.getKey());
                Intrinsics.checkNotNull(golf4);
                ao.ad.cyan(golf4);
                echo(iArr, aaVar6);
                if (z2) {
                    ((aa) CollectionsKt.ochre(arrayList)).hotel(0);
                    throw th;
                }
                throw th;
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList5);
        arrayList4.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList5.clear();
        amVar.bravo();
    }

    public final void delta() {
        bv.al alVar = this.alpha;
        if (alVar.juliet()) {
            Object[] objArr = alVar.charlie;
            long[] jArr = alVar.alpha;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j5 = jArr[i4];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i10 = 0; i10 < i5; i10++) {
                            if ((255 & j5) >= 128) {
                                j5 >>= 8;
                            } else {
                                ao.ad.cyan(objArr[(i4 << 3) + i10]);
                                throw null;
                            }
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            alVar.alpha();
        }
    }
}
