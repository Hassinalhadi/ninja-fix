package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1375t0 extends AbstractC1392x1 {
    private static final C1375t0 zzb;
    private int zzd;
    private int zze;
    private long zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.t0, com.google.android.gms.internal.measurement.x1] */
    static {
        ?? abstractC1392x1 = new AbstractC1392x1();
        zzb = abstractC1392x1;
        AbstractC1392x1.juliet(C1375t0.class, abstractC1392x1);
    }

    public static C1371s0 papa() {
        return (C1371s0) zzb.echo();
    }

    public static /* synthetic */ void quebec(C1375t0 c1375t0, long j5) {
        c1375t0.zzd |= 2;
        c1375t0.zzf = j5;
    }

    public static /* synthetic */ void romeo(C1375t0 c1375t0, int i4) {
        c1375t0.zzd |= 1;
        c1375t0.zze = i4;
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
            return new W1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zze;
    }

    public final long oscar() {
        return this.zzf;
    }

    public final boolean sierra() {
        return (this.zzd & 2) != 0;
    }

    public final boolean tango() {
        return (this.zzd & 1) != 0;
    }
}
