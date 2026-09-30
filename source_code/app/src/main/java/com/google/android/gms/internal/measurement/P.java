package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class P extends AbstractC1392x1 {
    private static final P zzb;
    private int zzd;
    private W zze;
    private T zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        P p4 = new P();
        zzb = p4;
        AbstractC1392x1.juliet(P.class, p4);
    }

    public static P november() {
        return zzb;
    }

    public static /* synthetic */ void romeo(P p4, String str) {
        p4.zzd |= 8;
        p4.zzh = str;
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
                return new P();
            }
            return new W1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final T oscar() {
        T t5 = this.zzf;
        if (t5 == null) {
            return T.november();
        }
        return t5;
    }

    public final W papa() {
        W w4 = this.zze;
        if (w4 == null) {
            return W.oscar();
        }
        return w4;
    }

    public final String quebec() {
        return this.zzh;
    }

    public final boolean sierra() {
        return this.zzg;
    }

    public final boolean tango() {
        return (this.zzd & 4) != 0;
    }

    public final boolean uniform() {
        return (this.zzd & 2) != 0;
    }

    public final boolean victor() {
        return (this.zzd & 8) != 0;
    }

    public final boolean whiskey() {
        return (this.zzd & 1) != 0;
    }
}
