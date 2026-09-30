package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class O0 extends AbstractC1392x1 {
    private static final O0 zzb;
    private int zzd;
    private String zze = "";
    private D1 zzf = V1.teal;

    static {
        O0 o02 = new O0();
        zzb = o02;
        AbstractC1392x1.juliet(O0.class, o02);
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
                return new O0();
            }
            return new W1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", Q0.class});
        }
        return (byte) 1;
    }

    public final String november() {
        return this.zze;
    }

    public final D1 oscar() {
        return this.zzf;
    }
}
