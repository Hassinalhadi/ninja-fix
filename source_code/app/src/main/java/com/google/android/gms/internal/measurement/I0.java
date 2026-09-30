package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class I0 extends AbstractC1392x1 {
    private static final I0 zzb;
    private int zzd;
    private int zze;
    private C1 zzf = I1.teal;

    static {
        I0 i02 = new I0();
        zzb = i02;
        AbstractC1392x1.juliet(I0.class, i02);
    }

    public static H0 quebec() {
        return (H0) zzb.echo();
    }

    public static void sierra(I0 i02, List list) {
        RandomAccess randomAccess = i02.zzf;
        if (!((AbstractC1345l1) randomAccess).alpha) {
            I1 i12 = (I1) randomAccess;
            int i4 = i12.red;
            i02.zzf = i12.foxtrot(i4 + i4);
        }
        AbstractC1340k1.bravo(list, i02.zzf);
    }

    public static /* synthetic */ void tango(I0 i02, int i4) {
        i02.zzd |= 1;
        i02.zze = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1392x1
    public final Object mike(int i4) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new AbstractC1388w1(zzb);
                }
                return new I0();
            }
            return new W1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int november() {
        return ((I1) this.zzf).size();
    }

    public final int oscar() {
        return this.zze;
    }

    public final long papa(int i4) {
        return ((I1) this.zzf).bravo(i4);
    }

    public final List romeo() {
        return this.zzf;
    }

    public final boolean uniform() {
        return (this.zzd & 1) != 0;
    }
}
