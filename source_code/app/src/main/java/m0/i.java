package m0;

import com.google.android.gms.internal.measurement.C1290a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.L;
import s0.b0;

/* loaded from: classes3.dex */
public final class i extends j {
    public final T.r charlie;
    public final Fe.c delta;
    public final bv.u echo;
    public L foxtrot;
    public k golf;
    public boolean hotel;
    public boolean india;
    public boolean juliet;

    public i(T.r rVar) {
        this.charlie = rVar;
        Fe.c cVar = new Fe.c(12, false);
        cVar.red = new long[2];
        this.delta = cVar;
        this.echo = new bv.u(2);
        this.india = true;
        this.juliet = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T.r] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36, types: [T.r] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [J.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [J.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // m0.j
    public final boolean alpha(bv.u uVar, q0.z zVar, C1290a1 c1290a1, boolean z2) {
        bv.u uVar2;
        Fe.c cVar;
        Object obj;
        boolean z10;
        boolean z11;
        k kVar;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i4;
        int i5;
        boolean z16;
        int i10;
        boolean z17;
        int i11;
        q0.z zVar2 = zVar;
        boolean alpha = super.alpha(uVar, zVar, c1290a1, z2);
        AbstractC2556p abstractC2556p = this.charlie;
        boolean z18 = true;
        if (abstractC2556p.isAttached()) {
            ?? r82 = 0;
            while (abstractC2556p != 0) {
                if (abstractC2556p instanceof b0) {
                    this.foxtrot = AbstractC2555o.echo((b0) abstractC2556p, 16);
                } else if ((abstractC2556p.getKindSet$ui_release() & 16) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                    T.r rVar = abstractC2556p.purple;
                    int i12 = 0;
                    abstractC2556p = abstractC2556p;
                    r82 = r82;
                    while (rVar != null) {
                        if ((rVar.getKindSet$ui_release() & 16) != 0) {
                            i12++;
                            r82 = r82;
                            if (i12 == 1) {
                                abstractC2556p = rVar;
                            } else {
                                if (r82 == 0) {
                                    r82 = new J.e(new T.r[16]);
                                }
                                if (abstractC2556p != 0) {
                                    r82.bravo(abstractC2556p);
                                    abstractC2556p = 0;
                                }
                                r82.bravo(rVar);
                            }
                        }
                        rVar = rVar.getChild$ui_release();
                        abstractC2556p = abstractC2556p;
                        r82 = r82;
                    }
                    if (i12 == 1) {
                    }
                }
                abstractC2556p = AbstractC2555o.bravo(r82);
            }
            if (this.foxtrot != null) {
                int juliet = uVar.juliet();
                int i13 = 0;
                while (true) {
                    uVar2 = this.echo;
                    cVar = this.delta;
                    if (i13 >= juliet) {
                        break;
                    }
                    long golf = uVar.golf(i13);
                    r rVar2 = (r) uVar.kilo(i13);
                    if (cVar.echo(golf)) {
                        boolean z19 = z18;
                        long j5 = rVar2.golf;
                        if ((((j5 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            long j6 = rVar2.charlie;
                            if ((((j6 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                z17 = z19;
                                List list = rVar2.kilo;
                                if (list == null) {
                                    list = CollectionsKt.emptyList();
                                }
                                ArrayList arrayList = new ArrayList(list.size());
                                List list2 = rVar2.kilo;
                                if (list2 == null) {
                                    list2 = CollectionsKt.emptyList();
                                }
                                z16 = alpha;
                                int size = list2.size();
                                i10 = juliet;
                                int i14 = 0;
                                while (i14 < size) {
                                    int i15 = size;
                                    b bVar = (b) list2.get(i14);
                                    long j7 = golf;
                                    long j10 = bVar.bravo;
                                    if ((((j10 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                        i11 = i14;
                                        L l10 = this.foxtrot;
                                        Intrinsics.checkNotNull(l10);
                                        arrayList.add(new b(bVar.alpha, l10.J(zVar2, j10), bVar.charlie));
                                    } else {
                                        i11 = i14;
                                    }
                                    i14 = i11 + 1;
                                    size = i15;
                                    golf = j7;
                                }
                                long j11 = golf;
                                L l11 = this.foxtrot;
                                Intrinsics.checkNotNull(l11);
                                long J4 = l11.J(zVar2, j5);
                                L l12 = this.foxtrot;
                                Intrinsics.checkNotNull(l12);
                                r rVar3 = new r(rVar2.alpha, rVar2.bravo, l12.J(zVar2, j6), rVar2.delta, rVar2.echo, rVar2.foxtrot, J4, rVar2.hotel, rVar2.india, arrayList, rVar2.juliet, rVar2.lima);
                                r rVar4 = rVar2.oscar;
                                if (rVar4 == null) {
                                    rVar4 = rVar2;
                                }
                                rVar3.oscar = rVar4;
                                r rVar5 = rVar2.oscar;
                                if (rVar5 != null) {
                                    rVar2 = rVar5;
                                }
                                rVar3.oscar = rVar2;
                                uVar2.hotel(j11, rVar3);
                            }
                        }
                        z16 = alpha;
                        i10 = juliet;
                        z17 = z19;
                    } else {
                        z16 = alpha;
                        i10 = juliet;
                        z17 = z18;
                    }
                    i13++;
                    zVar2 = zVar;
                    z18 = z17;
                    alpha = z16;
                    juliet = i10;
                }
                boolean z20 = alpha;
                boolean z21 = z18;
                if (uVar2.juliet() == 0) {
                    cVar.purple = 0;
                    this.alpha.india();
                    return z21;
                }
                int i16 = cVar.purple;
                while (true) {
                    i16--;
                    if (-1 >= i16) {
                        break;
                    }
                    if (uVar.foxtrot(((long[]) cVar.red)[i16]) < 0 && i16 < (i5 = cVar.purple)) {
                        int i17 = i5 - 1;
                        int i18 = i16;
                        while (i18 < i17) {
                            long[] jArr = (long[]) cVar.red;
                            int i19 = i18 + 1;
                            jArr[i18] = jArr[i19];
                            i18 = i19;
                        }
                        cVar.purple--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(uVar2.juliet());
                int juliet2 = uVar2.juliet();
                for (int i20 = 0; i20 < juliet2; i20++) {
                    arrayList2.add(uVar2.kilo(i20));
                }
                k kVar2 = new k(arrayList2, c1290a1);
                int size2 = arrayList2.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size2) {
                        obj = arrayList2.get(i21);
                        if (c1290a1.bravo(((r) obj).alpha)) {
                            break;
                        }
                        i21++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                r rVar6 = (r) obj;
                if (rVar6 != null) {
                    boolean z22 = rVar6.delta;
                    if (!z2) {
                        z10 = false;
                        this.india = false;
                    } else {
                        z10 = false;
                        if (!this.india && (z22 || rVar6.hotel)) {
                            L l13 = this.foxtrot;
                            Intrinsics.checkNotNull(l13);
                            long j12 = l13.red;
                            long j13 = rVar6.charlie;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
                            int i22 = (int) (j12 >> 32);
                            int i23 = (int) (j12 & 4294967295L);
                            if (intBitsToFloat < 0.0f) {
                                z12 = z21;
                            } else {
                                z12 = false;
                            }
                            if (intBitsToFloat > i22) {
                                z13 = z21;
                            } else {
                                z13 = false;
                            }
                            boolean z23 = z13 | z12;
                            if (intBitsToFloat2 < 0.0f) {
                                z14 = z21;
                            } else {
                                z14 = false;
                            }
                            boolean z24 = z23 | z14;
                            if (intBitsToFloat2 > i23) {
                                z15 = z21;
                            } else {
                                z15 = false;
                            }
                            this.india = !(z15 | z24);
                        }
                    }
                    boolean z25 = this.india;
                    boolean z26 = this.hotel;
                    int i24 = 5;
                    if (z25 != z26 && ((i4 = kVar2.echo) == 3 || i4 == 4 || i4 == 5)) {
                        if (z25) {
                            i24 = 4;
                        }
                        kVar2.echo = i24;
                    } else {
                        int i25 = kVar2.echo;
                        if (i25 == 4 && z26 && !this.juliet) {
                            kVar2.echo = 3;
                        } else if (i25 == 5 && z25 && z22) {
                            kVar2.echo = 3;
                        }
                    }
                } else {
                    z10 = false;
                }
                if (!z20 && kVar2.echo == 3 && (kVar = this.golf) != null) {
                    ?? r12 = kVar.alpha;
                    int size3 = r12.size();
                    ?? r5 = kVar2.alpha;
                    if (size3 == r5.size()) {
                        int size4 = r5.size();
                        for (?? r62 = z10; r62 < size4; r62++) {
                            if (Z.b.bravo(((r) r12.get(r62)).charlie, ((r) r5.get(r62)).charlie)) {
                            }
                        }
                        z11 = z10;
                        this.golf = kVar2;
                        return z11;
                    }
                }
                z11 = z21;
                this.golf = kVar2;
                return z11;
            }
        }
        return true;
    }

    @Override // m0.j
    public final void bravo(C1290a1 c1290a1) {
        super.bravo(c1290a1);
        k kVar = this.golf;
        if (kVar == null) {
            return;
        }
        this.hotel = this.india;
        List list = kVar.alpha;
        int size = list.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            r rVar = (r) list.get(i4);
            boolean z10 = rVar.delta;
            long j5 = rVar.alpha;
            boolean bravo = c1290a1.bravo(j5);
            boolean z11 = this.india;
            if ((!z10 && !bravo) || (!z10 && !z11)) {
                this.delta.juliet(j5);
            }
        }
        this.india = false;
        if (kVar.echo == 5) {
            z2 = true;
        }
        this.juliet = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T.r] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [T.r] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [J.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [J.e] */
    public final void charlie() {
        J.e eVar = this.alpha;
        Object[] objArr = eVar.alpha;
        int i4 = eVar.red;
        for (int i5 = 0; i5 < i4; i5++) {
            ((i) objArr[i5]).charlie();
        }
        AbstractC2556p abstractC2556p = this.charlie;
        ?? r32 = 0;
        while (abstractC2556p != 0) {
            if (abstractC2556p instanceof b0) {
                ((b0) abstractC2556p).xray();
            } else if ((abstractC2556p.getKindSet$ui_release() & 16) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                T.r rVar = abstractC2556p.purple;
                int i10 = 0;
                abstractC2556p = abstractC2556p;
                r32 = r32;
                while (rVar != null) {
                    if ((rVar.getKindSet$ui_release() & 16) != 0) {
                        i10++;
                        r32 = r32;
                        if (i10 == 1) {
                            abstractC2556p = rVar;
                        } else {
                            if (r32 == 0) {
                                r32 = new J.e(new T.r[16]);
                            }
                            if (abstractC2556p != 0) {
                                r32.bravo(abstractC2556p);
                                abstractC2556p = 0;
                            }
                            r32.bravo(rVar);
                        }
                    }
                    rVar = rVar.getChild$ui_release();
                    abstractC2556p = abstractC2556p;
                    r32 = r32;
                }
                if (i10 == 1) {
                }
            }
            abstractC2556p = AbstractC2555o.bravo(r32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [T.r] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean delta(C1290a1 c1290a1) {
        boolean z2;
        bv.u uVar = this.echo;
        boolean z10 = false;
        z10 = false;
        if (uVar.juliet() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            T.r rVar = this.charlie;
            if (rVar.isAttached()) {
                k kVar = this.golf;
                Intrinsics.checkNotNull(kVar);
                L l10 = this.foxtrot;
                Intrinsics.checkNotNull(l10);
                long j5 = l10.red;
                AbstractC2556p abstractC2556p = rVar;
                ?? r92 = 0;
                while (abstractC2556p != 0) {
                    if (abstractC2556p instanceof b0) {
                        ((b0) abstractC2556p).fuchsia(kVar, l.red, j5);
                    } else if ((abstractC2556p.getKindSet$ui_release() & 16) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                        T.r rVar2 = abstractC2556p.purple;
                        int i4 = 0;
                        abstractC2556p = abstractC2556p;
                        r92 = r92;
                        while (rVar2 != null) {
                            if ((rVar2.getKindSet$ui_release() & 16) != 0) {
                                i4++;
                                r92 = r92;
                                if (i4 == 1) {
                                    abstractC2556p = rVar2;
                                } else {
                                    if (r92 == 0) {
                                        r92 = new J.e(new T.r[16]);
                                    }
                                    if (abstractC2556p != 0) {
                                        r92.bravo(abstractC2556p);
                                        abstractC2556p = 0;
                                    }
                                    r92.bravo(rVar2);
                                }
                            }
                            rVar2 = rVar2.getChild$ui_release();
                            abstractC2556p = abstractC2556p;
                            r92 = r92;
                        }
                        if (i4 == 1) {
                        }
                    }
                    abstractC2556p = AbstractC2555o.bravo(r92);
                }
                if (rVar.isAttached()) {
                    J.e eVar = this.alpha;
                    Object[] objArr = eVar.alpha;
                    int i5 = eVar.red;
                    for (int i10 = 0; i10 < i5; i10++) {
                        ((i) objArr[i10]).delta(c1290a1);
                    }
                }
                z10 = true;
            }
        }
        bravo(c1290a1);
        uVar.bravo();
        this.foxtrot = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T.r] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T.r] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T.r] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [J.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [J.e] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [T.r] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [J.e] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [J.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean echo(C1290a1 c1290a1, boolean z2) {
        boolean z10;
        if (this.echo.juliet() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            AbstractC2556p abstractC2556p = this.charlie;
            if (abstractC2556p.isAttached()) {
                k kVar = this.golf;
                Intrinsics.checkNotNull(kVar);
                L l10 = this.foxtrot;
                Intrinsics.checkNotNull(l10);
                long j5 = l10.red;
                AbstractC2556p abstractC2556p2 = abstractC2556p;
                ?? r82 = 0;
                while (abstractC2556p2 != 0) {
                    if (abstractC2556p2 instanceof b0) {
                        ((b0) abstractC2556p2).fuchsia(kVar, l.alpha, j5);
                    } else if ((abstractC2556p2.getKindSet$ui_release() & 16) != 0 && (abstractC2556p2 instanceof AbstractC2556p)) {
                        T.r rVar = abstractC2556p2.purple;
                        int i4 = 0;
                        abstractC2556p2 = abstractC2556p2;
                        r82 = r82;
                        while (rVar != null) {
                            if ((rVar.getKindSet$ui_release() & 16) != 0) {
                                i4++;
                                r82 = r82;
                                if (i4 == 1) {
                                    abstractC2556p2 = rVar;
                                } else {
                                    if (r82 == 0) {
                                        r82 = new J.e(new T.r[16]);
                                    }
                                    if (abstractC2556p2 != 0) {
                                        r82.bravo(abstractC2556p2);
                                        abstractC2556p2 = 0;
                                    }
                                    r82.bravo(rVar);
                                }
                            }
                            rVar = rVar.getChild$ui_release();
                            abstractC2556p2 = abstractC2556p2;
                            r82 = r82;
                        }
                        if (i4 == 1) {
                        }
                    }
                    abstractC2556p2 = AbstractC2555o.bravo(r82);
                }
                if (abstractC2556p.isAttached()) {
                    J.e eVar = this.alpha;
                    Object[] objArr = eVar.alpha;
                    int i5 = eVar.red;
                    for (int i10 = 0; i10 < i5; i10++) {
                        i iVar = (i) objArr[i10];
                        Intrinsics.checkNotNull(this.foxtrot);
                        iVar.echo(c1290a1, z2);
                    }
                }
                if (abstractC2556p.isAttached()) {
                    ?? r14 = 0;
                    while (abstractC2556p != 0) {
                        if (abstractC2556p instanceof b0) {
                            ((b0) abstractC2556p).fuchsia(kVar, l.purple, j5);
                        } else if ((abstractC2556p.getKindSet$ui_release() & 16) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                            T.r rVar2 = abstractC2556p.purple;
                            int i11 = 0;
                            abstractC2556p = abstractC2556p;
                            r14 = r14;
                            while (rVar2 != null) {
                                if ((rVar2.getKindSet$ui_release() & 16) != 0) {
                                    i11++;
                                    r14 = r14;
                                    if (i11 == 1) {
                                        abstractC2556p = rVar2;
                                    } else {
                                        if (r14 == 0) {
                                            r14 = new J.e(new T.r[16]);
                                        }
                                        if (abstractC2556p != 0) {
                                            r14.bravo(abstractC2556p);
                                            abstractC2556p = 0;
                                        }
                                        r14.bravo(rVar2);
                                    }
                                }
                                rVar2 = rVar2.getChild$ui_release();
                                abstractC2556p = abstractC2556p;
                                r14 = r14;
                            }
                            if (i11 == 1) {
                            }
                        }
                        abstractC2556p = AbstractC2555o.bravo(r14);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void foxtrot(long j5, bv.ah ahVar) {
        Fe.c cVar = this.delta;
        if (cVar.echo(j5) && ahVar.charlie(this) < 0) {
            cVar.juliet(j5);
            this.echo.india(j5);
        }
        J.e eVar = this.alpha;
        Object[] objArr = eVar.alpha;
        int i4 = eVar.red;
        for (int i5 = 0; i5 < i4; i5++) {
            ((i) objArr[i5]).foxtrot(j5, ahVar);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.charlie + ", children=" + this.alpha + ", pointerIds=" + this.delta + ')';
    }
}
