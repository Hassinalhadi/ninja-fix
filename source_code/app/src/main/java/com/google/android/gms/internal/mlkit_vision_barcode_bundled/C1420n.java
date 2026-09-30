package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1420n extends am implements C {
    private static final C1420n zzb;
    private int zzd;
    private int zze;
    private av zzg;
    private byte zzh = 2;
    private as zzf = I.silver;

    static {
        C1420n c1420n = new C1420n();
        zzb = c1420n;
        am.hotel(C1420n.class, c1420n);
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
                    return new y0(4, zzb);
                }
                return new C1420n();
            }
            return new J(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C1406c.charlie, "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }

    public final as november() {
        return this.zzf;
    }

    public final int oscar() {
        int i4;
        int i5 = this.zze;
        if (i5 != 0) {
            i4 = 2;
            if (i5 != 1) {
                i4 = i5 != 2 ? 0 : 3;
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }
}
