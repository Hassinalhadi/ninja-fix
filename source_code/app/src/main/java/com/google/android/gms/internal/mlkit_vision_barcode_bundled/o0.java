package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class o0 extends am implements C {
    private static final o0 zzb;
    private int zzd;
    private as zzf;
    private int zzg;
    private D0 zzh;
    private B0 zzi;
    private z0 zzj;
    private int zzk;
    private as zzl;
    private byte zzm = 2;
    private int zze = 17;

    static {
        o0 o0Var = new o0();
        zzb = o0Var;
        am.hotel(o0.class, o0Var);
    }

    public o0() {
        I i4 = I.silver;
        this.zzf = i4;
        this.zzl = i4;
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
                            this.zzm = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new y0(8, zzb);
                }
                return new o0();
            }
            return new J(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", C1406c.india, "zzf", C1408d.class, "zzg", "zzh", "zzi", "zzk", "zzl", C1410e.class, "zzj"});
        }
        return Byte.valueOf(this.zzm);
    }
}
