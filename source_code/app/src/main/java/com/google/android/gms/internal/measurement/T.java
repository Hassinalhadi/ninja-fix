package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class T extends AbstractC1392x1 {
    private static final T zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        T t5 = new T();
        zzb = t5;
        AbstractC1392x1.juliet(T.class, t5);
    }

    public static T november() {
        return zzb;
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
                return new T();
            }
            return new W1(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", S.bravo, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String oscar() {
        return this.zzg;
    }

    public final String papa() {
        return this.zzi;
    }

    public final String quebec() {
        return this.zzh;
    }

    public final boolean romeo() {
        return this.zzf;
    }

    public final boolean sierra() {
        return (this.zzd & 1) != 0;
    }

    public final boolean tango() {
        return (this.zzd & 4) != 0;
    }

    public final boolean uniform() {
        return (this.zzd & 2) != 0;
    }

    public final boolean victor() {
        return (this.zzd & 16) != 0;
    }

    public final boolean whiskey() {
        return (this.zzd & 8) != 0;
    }

    public final int xray() {
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
