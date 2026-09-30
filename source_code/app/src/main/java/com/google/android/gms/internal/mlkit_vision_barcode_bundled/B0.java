package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class B0 extends am implements C {
    private static final B0 zzb;
    private int zzd;
    private z0 zzj;
    private byte zzk = 2;
    private ar zze = an.silver;
    private aq zzf = ag.silver;
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        B0 b02 = new B0();
        zzb = b02;
        am.hotel(B0.class, b02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.am
    public final Object mike(int i4, am amVar) {
        byte b2 = 1;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (amVar == null) {
                                b2 = 0;
                            }
                            this.zzk = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new ai(zzb);
                }
                return new B0();
            }
            return new J(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
