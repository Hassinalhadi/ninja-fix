package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1408d extends am implements C {
    private static final C1408d zzb;
    private int zzd;
    private E0 zzj;
    private z0 zzk;
    private byte zzl = 2;
    private String zze = "";
    private String zzf = "";
    private ar zzg = an.silver;
    private String zzh = "";
    private String zzi = "";

    static {
        C1408d c1408d = new C1408d();
        zzb = c1408d;
        am.hotel(C1408d.class, c1408d);
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
                            this.zzl = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new y0(2, zzb);
                }
                return new C1408d();
            }
            return new J(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C1406c.bravo, "zzh", "zzi", "zzk", "zzj"});
        }
        return Byte.valueOf(this.zzl);
    }
}
