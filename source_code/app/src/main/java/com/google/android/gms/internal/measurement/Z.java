package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class Z extends AbstractC1392x1 {
    private static final Z zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        Z z2 = new Z();
        zzb = z2;
        AbstractC1392x1.juliet(Z.class, z2);
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
                return new Z();
            }
            return new W1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String november() {
        return this.zze;
    }
}
