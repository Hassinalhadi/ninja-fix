package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class D0 extends am implements C {
    private static final D0 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private z0 zzg;
    private byte zzh = 2;

    static {
        D0 d02 = new D0();
        zzb = d02;
        am.hotel(D0.class, d02);
        z0 november = z0.november();
        Y y10 = Y.purple;
        if (november != null) {
        } else {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
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
                            this.zzh = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new ai(zzb);
                }
                return new D0();
            }
            return new J(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}
