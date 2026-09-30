package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1314f0 extends AbstractC1392x1 {
    private static final C1314f0 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private D1 zzh;
    private D1 zzi;
    private D1 zzj;
    private String zzk;
    private boolean zzl;
    private D1 zzm;
    private D1 zzn;
    private String zzo;
    private String zzp;
    private C1289a0 zzq;
    private C1324h0 zzr;
    private C1339k0 zzs;
    private C1329i0 zzt;
    private C1319g0 zzu;

    static {
        C1314f0 c1314f0 = new C1314f0();
        zzb = c1314f0;
        AbstractC1392x1.juliet(C1314f0.class, c1314f0);
    }

    public C1314f0() {
        V1 v1 = V1.teal;
        this.zzh = v1;
        this.zzi = v1;
        this.zzj = v1;
        this.zzk = "";
        this.zzm = v1;
        this.zzn = v1;
        this.zzo = "";
        this.zzp = "";
    }

    public static void azure(C1314f0 c1314f0) {
        c1314f0.zzj = V1.teal;
    }

    public static void beige(C1314f0 c1314f0) {
        c1314f0.zzm = V1.teal;
    }

    public static void black(C1314f0 c1314f0, int i4, C1304d0 c1304d0) {
        D1 d12 = c1314f0.zzi;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            c1314f0.zzi = d12.foxtrot(size + size);
        }
        c1314f0.zzi.set(i4, c1304d0);
    }

    public static C1309e0 sierra() {
        return (C1309e0) zzb.echo();
    }

    public static C1314f0 tango() {
        return zzb;
    }

    public final List amber() {
        return this.zzh;
    }

    public final boolean blue() {
        return (this.zzd & 128) != 0;
    }

    public final boolean bronze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean coral() {
        return (this.zzd & 512) != 0;
    }

    public final boolean crimson() {
        return (this.zzd & 1) != 0;
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
                return new C1314f0();
            }
            return new W1(zzb, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C1334j0.class, "zzi", C1304d0.class, "zzj", L.class, "zzk", "zzl", "zzm", P0.class, "zzn", C1294b0.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zzm.size();
    }

    public final int oscar() {
        return this.zzi.size();
    }

    public final long papa() {
        return this.zze;
    }

    public final C1289a0 quebec() {
        C1289a0 c1289a0 = this.zzq;
        if (c1289a0 == null) {
            return C1289a0.november();
        }
        return c1289a0;
    }

    public final C1304d0 romeo(int i4) {
        return (C1304d0) this.zzi.get(i4);
    }

    public final C1339k0 uniform() {
        C1339k0 c1339k0 = this.zzs;
        if (c1339k0 == null) {
            return C1339k0.oscar();
        }
        return c1339k0;
    }

    public final String victor() {
        return this.zzf;
    }

    public final String whiskey() {
        return this.zzo;
    }

    public final D1 xray() {
        return this.zzj;
    }

    public final D1 yankee() {
        return this.zzn;
    }

    public final D1 zulu() {
        return this.zzm;
    }
}
