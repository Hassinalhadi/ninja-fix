package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class V extends AbstractC1392x1 {
    private static final V zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private P zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        V v4 = new V();
        zzb = v4;
        AbstractC1392x1.juliet(V.class, v4);
    }

    public static U papa() {
        return (U) zzb.echo();
    }

    public static /* synthetic */ void romeo(V v4, String str) {
        v4.zzd |= 2;
        v4.zzf = str;
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
                return new V();
            }
            return new W1(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zze;
    }

    public final P oscar() {
        P p4 = this.zzg;
        if (p4 == null) {
            return P.november();
        }
        return p4;
    }

    public final String quebec() {
        return this.zzf;
    }

    public final boolean sierra() {
        return this.zzh;
    }

    public final boolean tango() {
        return this.zzi;
    }

    public final boolean uniform() {
        return this.zzj;
    }

    public final boolean victor() {
        return (this.zzd & 1) != 0;
    }

    public final boolean whiskey() {
        return (this.zzd & 32) != 0;
    }
}
