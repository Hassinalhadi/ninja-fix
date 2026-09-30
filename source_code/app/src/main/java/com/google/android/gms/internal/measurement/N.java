package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class N extends AbstractC1392x1 {
    private static final N zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private D1 zzg = V1.teal;
    private boolean zzh;
    private T zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        N n5 = new N();
        zzb = n5;
        AbstractC1392x1.juliet(N.class, n5);
    }

    public static M papa() {
        return (M) zzb.echo();
    }

    public static /* synthetic */ void uniform(N n5, String str) {
        n5.zzd |= 2;
        n5.zzf = str;
    }

    public static void victor(N n5, int i4, P p4) {
        D1 d12 = n5.zzg;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            n5.zzg = d12.foxtrot(size + size);
        }
        n5.zzg.set(i4, p4);
    }

    public final boolean amber() {
        return (this.zzd & 1) != 0;
    }

    public final boolean azure() {
        return (this.zzd & 64) != 0;
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
                return new N();
            }
            return new W1(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", P.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zzg.size();
    }

    public final int oscar() {
        return this.zze;
    }

    public final P quebec(int i4) {
        return (P) this.zzg.get(i4);
    }

    public final T romeo() {
        T t5 = this.zzi;
        if (t5 == null) {
            return T.november();
        }
        return t5;
    }

    public final String sierra() {
        return this.zzf;
    }

    public final List tango() {
        return this.zzg;
    }

    public final boolean whiskey() {
        return this.zzj;
    }

    public final boolean xray() {
        return this.zzk;
    }

    public final boolean yankee() {
        return this.zzl;
    }

    public final boolean zulu() {
        return (this.zzd & 8) != 0;
    }
}
