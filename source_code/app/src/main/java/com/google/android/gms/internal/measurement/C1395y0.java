package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1395y0 extends AbstractC1392x1 {
    private static final C1395y0 zzb;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private D1 zzj = V1.teal;

    static {
        C1395y0 c1395y0 = new C1395y0();
        zzb = c1395y0;
        AbstractC1392x1.juliet(C1395y0.class, c1395y0);
    }

    public static /* synthetic */ void amber(C1395y0 c1395y0) {
        c1395y0.zzd &= -3;
        c1395y0.zzf = zzb.zzf;
    }

    public static /* synthetic */ void azure(C1395y0 c1395y0, double d4) {
        c1395y0.zzd |= 16;
        c1395y0.zzi = d4;
    }

    public static /* synthetic */ void beige(C1395y0 c1395y0, long j5) {
        c1395y0.zzd |= 4;
        c1395y0.zzg = j5;
    }

    public static /* synthetic */ void black(C1395y0 c1395y0, String str) {
        str.getClass();
        c1395y0.zzd |= 1;
        c1395y0.zze = str;
    }

    public static /* synthetic */ void blue(C1395y0 c1395y0, String str) {
        str.getClass();
        c1395y0.zzd |= 2;
        c1395y0.zzf = str;
    }

    public static C1391x0 romeo() {
        return (C1391x0) zzb.echo();
    }

    public static void victor(C1395y0 c1395y0, ArrayList arrayList) {
        D1 d12 = c1395y0.zzj;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            c1395y0.zzj = d12.foxtrot(size + size);
        }
        AbstractC1340k1.bravo(arrayList, c1395y0.zzj);
    }

    public static void whiskey(C1395y0 c1395y0, C1395y0 c1395y02) {
        D1 d12 = c1395y0.zzj;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            c1395y0.zzj = d12.foxtrot(size + size);
        }
        c1395y0.zzj.add(c1395y02);
    }

    public static /* synthetic */ void xray(C1395y0 c1395y0) {
        c1395y0.zzd &= -17;
        c1395y0.zzi = 0.0d;
    }

    public static /* synthetic */ void yankee(C1395y0 c1395y0) {
        c1395y0.zzd &= -5;
        c1395y0.zzg = 0L;
    }

    public static void zulu(C1395y0 c1395y0) {
        c1395y0.zzj = V1.teal;
    }

    public final boolean bronze() {
        return (this.zzd & 16) != 0;
    }

    public final boolean coral() {
        return (this.zzd & 8) != 0;
    }

    public final boolean crimson() {
        return (this.zzd & 4) != 0;
    }

    public final boolean cyan() {
        return (this.zzd & 1) != 0;
    }

    public final boolean emerald() {
        return (this.zzd & 2) != 0;
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
                return new C1395y0();
            }
            return new W1(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C1395y0.class});
        }
        return (byte) 1;
    }

    public final double november() {
        return this.zzi;
    }

    public final float oscar() {
        return this.zzh;
    }

    public final int papa() {
        return this.zzj.size();
    }

    public final long quebec() {
        return this.zzg;
    }

    public final String sierra() {
        return this.zze;
    }

    public final String tango() {
        return this.zzf;
    }

    public final List uniform() {
        return this.zzj;
    }
}
