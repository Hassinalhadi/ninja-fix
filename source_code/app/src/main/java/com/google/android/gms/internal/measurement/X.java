package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class X extends AbstractC1392x1 {
    private static final X zzb;
    private int zzd;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.X, com.google.android.gms.internal.measurement.x1] */
    static {
        ?? abstractC1392x1 = new AbstractC1392x1();
        zzb = abstractC1392x1;
        AbstractC1392x1.juliet(X.class, abstractC1392x1);
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
                return new AbstractC1392x1();
            }
            return new W1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", S.echo, "zzf", S.delta});
        }
        return (byte) 1;
    }

    public final int november() {
        int i4;
        int i5 = this.zzf;
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

    public final int oscar() {
        int bravo = T0.bravo(this.zze);
        if (bravo == 0) {
            return 1;
        }
        return bravo;
    }
}
