package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class z0 extends aj {
    private static final z0 zzd;
    private byte zze;

    static {
        z0 z0Var = new z0();
        zzd = z0Var;
        am.hotel(z0.class, z0Var);
    }

    public z0() {
        this.zzb = ae.charlie;
        this.zze = (byte) 2;
    }

    public static z0 november() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.am
    public final Object mike(int i4, am amVar) {
        byte b2;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (amVar == null) {
                                b2 = 0;
                            } else {
                                b2 = 1;
                            }
                            this.zze = b2;
                            return null;
                        }
                        return zzd;
                    }
                    return new y0(0, zzd);
                }
                return new z0();
            }
            return new J(zzd, "\u0003\u0000", null);
        }
        return Byte.valueOf(this.zze);
    }
}
