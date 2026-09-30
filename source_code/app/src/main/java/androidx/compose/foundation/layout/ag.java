package androidx.compose.foundation.layout;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class ag {
    public int alpha;
    public long bravo;
    public int charlie;
    public Object delta;

    public ag(ao aoVar, long j5, int i4, int i5) {
        this.delta = aoVar;
        this.bravo = j5;
        this.alpha = i4;
        this.charlie = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ae alpha(af afVar, boolean z2, int i4, int i5, int i10, int i11) {
        ae aeVar;
        q0.ao aoVar;
        bv.k kVar;
        AbstractC2367C abstractC2367C;
        if (afVar.bravo) {
            ao aoVar2 = (ao) this.delta;
            aoVar2.getClass();
            int[] iArr = an.$EnumSwitchMapping$0;
            ak akVar = ak.alpha;
            boolean z10 = true;
            int i12 = iArr[1];
            if (i12 != 1 && i12 != 2) {
                if (i12 != 3 && i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z2) {
                    aoVar = aoVar2.alpha;
                    kVar = aoVar2.echo;
                    abstractC2367C = aoVar2.bravo;
                } else {
                    if (i4 >= -1 && i5 >= 0) {
                        aoVar = aoVar2.charlie;
                    } else {
                        aoVar = null;
                    }
                    kVar = aoVar2.foxtrot;
                    abstractC2367C = aoVar2.delta;
                }
                if (aoVar != null) {
                    Intrinsics.checkNotNull(kVar);
                    aeVar = new ae(aoVar, abstractC2367C, kVar.alpha);
                    if (aeVar != null) {
                        if (i4 < 0 || (i11 != 0 && (i10 - ((int) (aeVar.charlie >> 32)) < 0 || i11 >= Integer.MAX_VALUE))) {
                            z10 = false;
                        }
                        aeVar.delta = z10;
                        return aeVar;
                    }
                }
            }
            aeVar = null;
            if (aeVar != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r12 >> 32))) < 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public af bravo(boolean z2, int i4, long j5, bv.k kVar, int i5, int i10, int i11, boolean z10, boolean z11) {
        long j6;
        int i12;
        bv.k alpha;
        int i13 = i10 + i11;
        if (kVar == null) {
            return new af(true, true);
        }
        ao aoVar = (ao) this.delta;
        aoVar.getClass();
        ak akVar = ak.alpha;
        ak akVar2 = ak.alpha;
        if (i5 < Integer.MAX_VALUE) {
            int i14 = (int) (j5 & 4294967295L);
            long j7 = kVar.alpha;
            if (i14 - ((int) (j7 & 4294967295L)) >= 0) {
                int i15 = this.alpha;
                int i16 = this.charlie;
                long j10 = this.bravo;
                if (i4 == 0) {
                    j6 = 4294967295L;
                } else {
                    if (i4 >= Integer.MAX_VALUE) {
                        j6 = 4294967295L;
                        i12 = i13;
                    } else {
                        j6 = 4294967295L;
                        i12 = i13;
                    }
                    if (z10) {
                        return new af(true, true);
                    }
                    return new af(true, bravo(z2, 0, bv.k.alpha(Q0.a.hotel(j10), (((int) (j5 & j6)) - i16) - i11), new bv.k(bv.k.alpha(((int) (j7 >> 32)) - i15, (int) (j7 & j6))), i5 + 1, i12, 0, true, false).bravo);
                }
                int i17 = (int) (j7 & j6);
                int max = Math.max(i11, i17) + i10;
                if (z11) {
                    alpha = null;
                } else {
                    alpha = aoVar.alpha(i5, max, z2);
                }
                bv.k kVar2 = alpha;
                if (kVar2 != null && (i4 + 1 >= Integer.MAX_VALUE || ((((int) (j5 >> 32)) - ((int) (j7 >> 32))) - i15) - ((int) (kVar2.alpha >> 32)) < 0)) {
                    if (z11) {
                        return new af(true, true);
                    }
                    boolean z12 = bravo(false, 0, bv.k.alpha(Q0.a.hotel(j10), (((int) (j5 & j6)) - i16) - Math.max(i11, i17)), kVar2, i5 + 1, max, 0, true, true).bravo;
                    return new af(z12, z12);
                }
                return new af(false, false);
            }
        }
        return new af(true, true);
    }
}
