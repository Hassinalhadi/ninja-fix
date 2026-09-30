package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class P0 extends AbstractC1392x1 {
    private static final P0 zzb;
    private int zzd;
    private D1 zze = V1.teal;
    private N0 zzf;

    static {
        P0 p02 = new P0();
        zzb = p02;
        AbstractC1392x1.juliet(P0.class, p02);
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
                return new P0();
            }
            return new W1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", Q0.class, "zzf"});
        }
        return (byte) 1;
    }

    public final N0 november() {
        N0 n02 = this.zzf;
        if (n02 == null) {
            return N0.oscar();
        }
        return n02;
    }

    public final D1 oscar() {
        return this.zze;
    }
}
