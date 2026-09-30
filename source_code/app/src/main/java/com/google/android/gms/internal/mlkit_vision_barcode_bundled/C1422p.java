package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1422p extends am implements C {
    private static final C1422p zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C1422p c1422p = new C1422p();
        zzb = c1422p;
        am.hotel(C1422p.class, c1422p);
    }

    public static C1422p november() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.am
    public final Object mike(int i4, am amVar) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new y0(6, zzb);
                }
                return new C1422p();
            }
            return new J(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C1406c.delta, "zzf"});
        }
        return (byte) 1;
    }

    public final String oscar() {
        return this.zzf;
    }

    public final int papa() {
        int i4;
        int i5 = this.zze;
        if (i5 != 0) {
            i4 = 2;
            if (i5 != 1) {
                if (i5 != 2) {
                    i4 = 4;
                    if (i5 != 3) {
                        i4 = i5 != 4 ? 0 : 5;
                    }
                } else {
                    i4 = 3;
                }
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
