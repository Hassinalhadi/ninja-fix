package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class N0 extends AbstractC1392x1 {
    private static final N0 zzb;
    private D1 zzd = V1.teal;

    static {
        N0 n02 = new N0();
        zzb = n02;
        AbstractC1392x1.juliet(N0.class, n02);
    }

    public static N0 oscar() {
        return zzb;
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
                return new N0();
            }
            return new W1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", O0.class});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zzd.size();
    }

    public final D1 papa() {
        return this.zzd;
    }
}
