package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class E0 extends AbstractC1392x1 {
    private static final E0 zzb;
    private int zzd;
    private int zze = 1;
    private D1 zzf = V1.teal;

    static {
        E0 e02 = new E0();
        zzb = e02;
        AbstractC1392x1.juliet(E0.class, e02);
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
                return new E0();
            }
            return new W1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzd", "zze", S.hotel, "zzf", C1387w0.class});
        }
        return (byte) 1;
    }
}
