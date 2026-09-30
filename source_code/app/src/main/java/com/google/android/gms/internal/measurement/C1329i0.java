package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1329i0 extends AbstractC1392x1 {
    private static final C1329i0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C1329i0 c1329i0 = new C1329i0();
        zzb = c1329i0;
        AbstractC1392x1.juliet(C1329i0.class, c1329i0);
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
                return new C1329i0();
            }
            return new W1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
