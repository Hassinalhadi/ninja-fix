package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class L extends AbstractC1392x1 {
    private static final L zzb;
    private int zzd;
    private int zze;
    private D1 zzf;
    private D1 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        L l10 = new L();
        zzb = l10;
        AbstractC1392x1.juliet(L.class, l10);
    }

    public L() {
        V1 v1 = V1.teal;
        this.zzf = v1;
        this.zzg = v1;
    }

    public static void uniform(L l10, int i4, N n5) {
        D1 d12 = l10.zzg;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            l10.zzg = d12.foxtrot(size + size);
        }
        l10.zzg.set(i4, n5);
    }

    public static void victor(L l10, int i4, V v4) {
        D1 d12 = l10.zzf;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            l10.zzf = d12.foxtrot(size + size);
        }
        l10.zzf.set(i4, v4);
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
                return new L();
            }
            return new W1(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", V.class, "zzg", N.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zze;
    }

    public final int oscar() {
        return this.zzg.size();
    }

    public final int papa() {
        return this.zzf.size();
    }

    public final N quebec(int i4) {
        return (N) this.zzg.get(i4);
    }

    public final V romeo(int i4) {
        return (V) this.zzf.get(i4);
    }

    public final List sierra() {
        return this.zzg;
    }

    public final List tango() {
        return this.zzf;
    }

    public final boolean whiskey() {
        return (this.zzd & 1) != 0;
    }
}
