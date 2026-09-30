package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class M0 extends AbstractC1392x1 {
    private static final M0 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        M0 m02 = new M0();
        zzb = m02;
        AbstractC1392x1.juliet(M0.class, m02);
    }

    public static /* synthetic */ void amber(M0 m02, long j5) {
        m02.zzd |= 1;
        m02.zze = j5;
    }

    public static /* synthetic */ void azure(M0 m02, String str) {
        str.getClass();
        m02.zzd |= 4;
        m02.zzg = str;
    }

    public static L0 romeo() {
        return (L0) zzb.echo();
    }

    public static /* synthetic */ void uniform(M0 m02) {
        m02.zzd &= -33;
        m02.zzj = 0.0d;
    }

    public static /* synthetic */ void victor(M0 m02) {
        m02.zzd &= -9;
        m02.zzh = 0L;
    }

    public static /* synthetic */ void whiskey(M0 m02) {
        m02.zzd &= -5;
        m02.zzg = zzb.zzg;
    }

    public static /* synthetic */ void xray(M0 m02, double d4) {
        m02.zzd |= 32;
        m02.zzj = d4;
    }

    public static /* synthetic */ void yankee(M0 m02, long j5) {
        m02.zzd |= 8;
        m02.zzh = j5;
    }

    public static /* synthetic */ void zulu(M0 m02, String str) {
        str.getClass();
        m02.zzd |= 2;
        m02.zzf = str;
    }

    public final boolean beige() {
        return (this.zzd & 32) != 0;
    }

    public final boolean black() {
        return (this.zzd & 16) != 0;
    }

    public final boolean blue() {
        return (this.zzd & 8) != 0;
    }

    public final boolean bronze() {
        return (this.zzd & 1) != 0;
    }

    public final boolean coral() {
        return (this.zzd & 4) != 0;
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
                return new M0();
            }
            return new W1(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double november() {
        return this.zzj;
    }

    public final float oscar() {
        return this.zzi;
    }

    public final long papa() {
        return this.zzh;
    }

    public final long quebec() {
        return this.zze;
    }

    public final String sierra() {
        return this.zzf;
    }

    public final String tango() {
        return this.zzg;
    }
}
