package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1304d0 extends AbstractC1392x1 {
    private static final C1304d0 zzb;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C1304d0 c1304d0 = new C1304d0();
        zzb = c1304d0;
        AbstractC1392x1.juliet(C1304d0.class, c1304d0);
    }

    public static /* synthetic */ void papa(C1304d0 c1304d0, String str) {
        str.getClass();
        c1304d0.zzd |= 1;
        c1304d0.zze = str;
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
                return new C1304d0();
            }
            return new W1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zzh;
    }

    public final String oscar() {
        return this.zze;
    }

    public final boolean quebec() {
        return this.zzf;
    }

    public final boolean romeo() {
        return this.zzg;
    }

    public final boolean sierra() {
        return (this.zzd & 2) != 0;
    }

    public final boolean tango() {
        return (this.zzd & 4) != 0;
    }

    public final boolean uniform() {
        return (this.zzd & 8) != 0;
    }
}
