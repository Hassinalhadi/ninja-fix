package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1367r0 extends AbstractC1392x1 {
    private static final C1367r0 zzb;
    private int zzd;
    private int zze;
    private G0 zzf;
    private G0 zzg;
    private boolean zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.r0, com.google.android.gms.internal.measurement.x1] */
    static {
        ?? abstractC1392x1 = new AbstractC1392x1();
        zzb = abstractC1392x1;
        AbstractC1392x1.juliet(C1367r0.class, abstractC1392x1);
    }

    public static C1364q0 oscar() {
        return (C1364q0) zzb.echo();
    }

    public static /* synthetic */ void romeo(C1367r0 c1367r0, int i4) {
        c1367r0.zzd |= 1;
        c1367r0.zze = i4;
    }

    public static /* synthetic */ void sierra(C1367r0 c1367r0, G0 g02) {
        c1367r0.zzf = g02;
        c1367r0.zzd |= 2;
    }

    public static /* synthetic */ void tango(C1367r0 c1367r0, boolean z2) {
        c1367r0.zzd |= 8;
        c1367r0.zzh = z2;
    }

    public static /* synthetic */ void uniform(C1367r0 c1367r0, G0 g02) {
        c1367r0.zzg = g02;
        c1367r0.zzd |= 4;
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
            return new W1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zze;
    }

    public final G0 papa() {
        G0 g02 = this.zzf;
        if (g02 == null) {
            return G0.sierra();
        }
        return g02;
    }

    public final G0 quebec() {
        G0 g02 = this.zzg;
        if (g02 == null) {
            return G0.sierra();
        }
        return g02;
    }

    public final boolean victor() {
        return this.zzh;
    }

    public final boolean whiskey() {
        return (this.zzd & 1) != 0;
    }

    public final boolean xray() {
        return (this.zzd & 8) != 0;
    }

    public final boolean yankee() {
        return (this.zzd & 4) != 0;
    }
}
