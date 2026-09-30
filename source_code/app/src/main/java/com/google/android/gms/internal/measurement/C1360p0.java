package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1360p0 extends AbstractC1392x1 {
    private static final C1360p0 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.p0, com.google.android.gms.internal.measurement.x1] */
    static {
        ?? abstractC1392x1 = new AbstractC1392x1();
        zzb = abstractC1392x1;
        AbstractC1392x1.juliet(C1360p0.class, abstractC1392x1);
    }

    public static C1356o0 november() {
        return (C1356o0) zzb.echo();
    }

    public static C1360p0 oscar() {
        return zzb;
    }

    public static /* synthetic */ void papa(C1360p0 c1360p0, boolean z2) {
        c1360p0.zzd |= 32;
        c1360p0.zzj = z2;
    }

    public static /* synthetic */ void quebec(C1360p0 c1360p0, boolean z2) {
        c1360p0.zzd |= 16;
        c1360p0.zzi = z2;
    }

    public static /* synthetic */ void romeo(C1360p0 c1360p0, boolean z2) {
        c1360p0.zzd |= 1;
        c1360p0.zze = z2;
    }

    public static /* synthetic */ void sierra(C1360p0 c1360p0, boolean z2) {
        c1360p0.zzd |= 64;
        c1360p0.zzk = z2;
    }

    public static /* synthetic */ void tango(C1360p0 c1360p0, boolean z2) {
        c1360p0.zzd |= 2;
        c1360p0.zzf = z2;
    }

    public static /* synthetic */ void uniform(C1360p0 c1360p0, boolean z2) {
        c1360p0.zzd |= 4;
        c1360p0.zzg = z2;
    }

    public static /* synthetic */ void victor(C1360p0 c1360p0, boolean z2) {
        c1360p0.zzd |= 8;
        c1360p0.zzh = z2;
    }

    public final boolean amber() {
        return this.zzf;
    }

    public final boolean azure() {
        return this.zzg;
    }

    public final boolean beige() {
        return this.zzh;
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
            return new W1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final boolean whiskey() {
        return this.zzj;
    }

    public final boolean xray() {
        return this.zzi;
    }

    public final boolean yankee() {
        return this.zze;
    }

    public final boolean zulu() {
        return this.zzk;
    }
}
