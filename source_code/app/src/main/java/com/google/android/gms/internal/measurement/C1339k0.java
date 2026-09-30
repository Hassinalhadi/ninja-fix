package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1339k0 extends AbstractC1392x1 {
    private static final C1339k0 zzb;
    private int zzd;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        C1339k0 c1339k0 = new C1339k0();
        zzb = c1339k0;
        AbstractC1392x1.juliet(C1339k0.class, c1339k0);
    }

    public static C1339k0 oscar() {
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
                return new C1339k0();
            }
            return new W1(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zzh;
    }

    public final String papa() {
        return this.zzf;
    }

    public final String quebec() {
        return this.zzi;
    }

    public final String romeo() {
        return this.zze;
    }
}
