package m0;

import com.google.android.gms.internal.measurement.C1290a1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public final q0.z alpha;
    public boolean bravo;
    public boolean charlie;
    public boolean delta;
    public boolean echo;
    public final bv.ah foxtrot = new bv.ah();
    public final j golf = new j();
    public final bv.ad hotel = new bv.ad(10);

    public c(q0.z zVar) {
        this.alpha = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public final void alpha(long j5, List list, boolean z2) {
        int i4;
        i iVar;
        i iVar2;
        j jVar = this.golf;
        bv.ad adVar = this.hotel;
        adVar.alpha();
        int size = list.size();
        j jVar2 = jVar;
        boolean z10 = true;
        for (int i5 = 0; i5 < size; i5++) {
            T.r rVar = (T.r) list.get(i5);
            if (rVar.isAttached()) {
                rVar.setDetachedListener$ui_release(new Xa.f(22, this, rVar));
                if (z10) {
                    J.e eVar = jVar2.alpha;
                    ?? r14 = eVar.alpha;
                    int i10 = eVar.red;
                    int i11 = 0;
                    while (true) {
                        if (i11 < i10) {
                            iVar2 = r14[i11];
                            if (Intrinsics.areEqual(((i) iVar2).charlie, rVar)) {
                                break;
                            } else {
                                i11++;
                            }
                        } else {
                            iVar2 = 0;
                            break;
                        }
                    }
                    iVar = iVar2;
                    if (iVar != null) {
                        iVar.india = true;
                        iVar.delta.bravo(j5);
                        Object delta = adVar.delta(j5);
                        if (delta == null) {
                            delta = new bv.ah();
                            adVar.golf(j5, delta);
                        }
                        ((bv.ah) delta).golf(iVar);
                        jVar2 = iVar;
                    } else {
                        z10 = false;
                    }
                }
                iVar = new i(rVar);
                iVar.delta.bravo(j5);
                Object delta2 = adVar.delta(j5);
                if (delta2 == null) {
                    delta2 = new bv.ah();
                    adVar.golf(j5, delta2);
                }
                ((bv.ah) delta2).golf(iVar);
                jVar2.alpha.bravo(iVar);
                jVar2 = iVar;
            }
        }
        if (z2) {
            long[] jArr = adVar.bravo;
            Object[] objArr = adVar.charlie;
            long[] jArr2 = adVar.alpha;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j6 = jArr2[i12];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((255 & j6) < 128) {
                                int i16 = (i12 << 3) + i15;
                                long j7 = jArr[i16];
                                bv.ah ahVar = (bv.ah) objArr[i16];
                                J.e eVar2 = jVar.alpha;
                                i4 = i13;
                                Object[] objArr2 = eVar2.alpha;
                                int i17 = eVar2.red;
                                for (int i18 = 0; i18 < i17; i18++) {
                                    ((i) objArr2[i18]).foxtrot(j7, ahVar);
                                }
                            } else {
                                i4 = i13;
                            }
                            j6 >>= i4;
                            i15++;
                            i13 = i4;
                        }
                        if (i14 != i13) {
                            return;
                        }
                    }
                    if (i12 != length) {
                        i12++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean bravo(C1290a1 c1290a1, boolean z2) {
        j jVar = this.golf;
        if (!jVar.alpha((bv.u) c1290a1.bravo, this.alpha, c1290a1, z2)) {
            return false;
        }
        boolean z10 = true;
        this.bravo = true;
        J.e eVar = jVar.alpha;
        Object[] objArr = eVar.alpha;
        int i4 = eVar.red;
        boolean z11 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (!((i) objArr[i5]).echo(c1290a1, z2) && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        Object[] objArr2 = eVar.alpha;
        int i10 = eVar.red;
        boolean z12 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!((i) objArr2[i11]).delta(c1290a1) && !z12) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        jVar.bravo(c1290a1);
        if (!z12 && !z11) {
            z10 = false;
        }
        this.bravo = false;
        if (this.echo) {
            this.echo = false;
            bv.ah ahVar = this.foxtrot;
            int i12 = ahVar.bravo;
            for (int i13 = 0; i13 < i12; i13++) {
                delta((T.r) ahVar.bravo(i13));
            }
            ahVar.india();
        }
        if (this.charlie) {
            this.charlie = false;
            charlie();
        }
        if (this.delta) {
            this.delta = false;
            jVar.alpha.india();
        }
        return z10;
    }

    public final void charlie() {
        if (this.bravo) {
            this.charlie = true;
            return;
        }
        j jVar = this.golf;
        J.e eVar = jVar.alpha;
        Object[] objArr = eVar.alpha;
        int i4 = eVar.red;
        for (int i5 = 0; i5 < i4; i5++) {
            ((i) objArr[i5]).charlie();
        }
        if (this.delta) {
            this.delta = true;
        } else {
            jVar.alpha.india();
        }
    }

    public final void delta(T.r rVar) {
        if (this.bravo) {
            this.echo = true;
            this.foxtrot.golf(rVar);
            return;
        }
        j jVar = this.golf;
        bv.ah ahVar = jVar.bravo;
        ahVar.india();
        ahVar.golf(jVar);
        while (ahVar.echo()) {
            j jVar2 = (j) ahVar.kilo(ahVar.bravo - 1);
            int i4 = 0;
            while (true) {
                J.e eVar = jVar2.alpha;
                if (i4 < eVar.red) {
                    i iVar = (i) eVar.alpha[i4];
                    if (Intrinsics.areEqual(iVar.charlie, rVar)) {
                        jVar2.alpha.lima(iVar);
                        iVar.charlie();
                    } else {
                        ahVar.golf(iVar);
                        i4++;
                    }
                }
            }
        }
    }
}
