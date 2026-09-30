package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ac extends S.ae {
    public static final Object hotel = new Object();
    public long charlie;
    public int delta;
    public bv.ag echo;
    public Object foxtrot;
    public int golf;

    public ac(long j5) {
        super(j5);
        bv.ag agVar = bv.aq.alpha;
        Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.echo = agVar;
        this.foxtrot = hotel;
    }

    @Override // S.ae
    public final void alpha(S.ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        ac acVar = (ac) aeVar;
        this.echo = acVar.echo;
        this.foxtrot = acVar.foxtrot;
        this.golf = acVar.golf;
    }

    @Override // S.ae
    public final S.ae bravo(long j5) {
        return new ac(j5);
    }

    public final boolean charlie(ad adVar, S.g gVar) {
        boolean z2;
        boolean z10;
        Object obj = S.n.charlie;
        synchronized (obj) {
            z2 = true;
            if (this.charlie == gVar.golf()) {
                if (this.delta == gVar.hotel()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        if (this.foxtrot == hotel || (z10 && this.golf != delta(adVar, gVar))) {
            z2 = false;
        }
        if (z2 && z10) {
            synchronized (obj) {
                this.charlie = gVar.golf();
                this.delta = gVar.hotel();
            }
            return z2;
        }
        return z2;
    }

    public final int delta(ad adVar, S.g gVar) {
        bv.ag agVar;
        boolean z2;
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        S.ae juliet;
        synchronized (S.n.charlie) {
            agVar = this.echo;
        }
        int i13 = 1;
        if (agVar.echo != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i14 = 7;
        if (!z2) {
            return 7;
        }
        J.e oscar = C0564b.oscar();
        Object[] objArr = oscar.alpha;
        int i15 = oscar.red;
        for (int i16 = 0; i16 < i15; i16++) {
            ((S.v) objArr[i16]).bravo();
        }
        try {
            Object[] objArr2 = agVar.bravo;
            int[] iArr = agVar.charlie;
            long[] jArr = agVar.alpha;
            int length = jArr.length - 2;
            if (length >= 0) {
                i10 = 7;
                int i17 = 0;
                while (true) {
                    long j5 = jArr[i17];
                    if ((((~j5) << i14) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        i11 = i14;
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j5 & 255) < 128) {
                                int i21 = (i17 << 3) + i20;
                                i12 = i18;
                                S.ac acVar = (S.ac) objArr2[i21];
                                if (iArr[i21] == i13) {
                                    if (acVar instanceof ad) {
                                        ad adVar2 = (ad) acVar;
                                        i4 = 0;
                                        try {
                                            juliet = adVar2.juliet((ac) S.n.juliet(adVar2.silver, gVar), gVar, false, adVar2.purple);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = oscar.alpha;
                                            int i22 = oscar.red;
                                            for (int i23 = i4; i23 < i22; i23++) {
                                                ((S.v) objArr3[i23]).alpha();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i4 = 0;
                                        juliet = S.n.juliet(acVar.hotel(), gVar);
                                    }
                                    int identityHashCode = ((i10 * 31) + System.identityHashCode(juliet)) * 31;
                                    long j6 = juliet.alpha;
                                    i10 = identityHashCode + ((int) (j6 ^ (j6 >>> 32)));
                                    j5 >>= i12;
                                    i20++;
                                    i18 = i12;
                                    i13 = 1;
                                }
                            } else {
                                i12 = i18;
                            }
                            j5 >>= i12;
                            i20++;
                            i18 = i12;
                            i13 = 1;
                        }
                        i5 = 0;
                        if (i19 != i18) {
                            break;
                        }
                    } else {
                        i11 = i14;
                        i5 = 0;
                    }
                    if (i17 != length) {
                        i17++;
                        i14 = i11;
                        i13 = 1;
                    } else {
                        i14 = i10;
                        break;
                    }
                }
            } else {
                i5 = 0;
            }
            i10 = i14;
            Object[] objArr4 = oscar.alpha;
            int i24 = oscar.red;
            for (int i25 = i5; i25 < i24; i25++) {
                ((S.v) objArr4[i25]).alpha();
            }
            return i10;
        } catch (Throwable th2) {
            th = th2;
            i4 = 0;
        }
    }
}
