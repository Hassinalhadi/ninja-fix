package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class av extends am implements C {
    private static final av zzb;
    private int zzd;
    private as zzf;
    private as zzg;
    private as zzh;
    private z0 zzi;
    private av zzj;
    private E0 zzk;
    private byte zzl = 2;
    private String zze = "";

    static {
        av avVar = new av();
        zzb = avVar;
        am.hotel(av.class, avVar);
        z0 november = z0.november();
        Y y10 = Y.purple;
        if (november != null) {
        } else {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    public av() {
        I i4 = I.silver;
        this.zzf = i4;
        this.zzg = i4;
        this.zzh = i4;
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
                    return new y0(7, zzb);
                }
                return new av();
            }
            return new J(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", o0.class, "zzh", o0.class, "zzg", A0.class, "zzi", "zze", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
