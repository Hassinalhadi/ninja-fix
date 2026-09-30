package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1348m0 extends AbstractC1392x1 {
    private static final C1348m0 zzb;
    private int zzd;
    private long zzh;
    private long zzl;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C1348m0 c1348m0 = new C1348m0();
        zzb = c1348m0;
        AbstractC1392x1.juliet(C1348m0.class, c1348m0);
    }

    public static /* synthetic */ void bronze(C1348m0 c1348m0) {
        c1348m0.zzd &= -5;
        c1348m0.zzg = zzb.zzg;
    }

    public static /* synthetic */ void coral(C1348m0 c1348m0) {
        c1348m0.zzd &= -3;
        c1348m0.zzf = zzb.zzf;
    }

    public static /* synthetic */ void crimson(C1348m0 c1348m0) {
        c1348m0.zzd &= -2;
        c1348m0.zze = zzb.zze;
    }

    public static /* synthetic */ void cyan(C1348m0 c1348m0) {
        c1348m0.zzd &= -65;
        c1348m0.zzk = zzb.zzk;
    }

    public static /* synthetic */ void emerald(C1348m0 c1348m0) {
        c1348m0.zzd &= -33;
        c1348m0.zzj = zzb.zzj;
    }

    public static /* synthetic */ void fuchsia(C1348m0 c1348m0) {
        c1348m0.zzd &= -17;
        c1348m0.zzi = zzb.zzi;
    }

    public static /* synthetic */ void gold(C1348m0 c1348m0, String str) {
        c1348m0.zzd |= 4;
        c1348m0.zzg = str;
    }

    public static /* synthetic */ void gray(C1348m0 c1348m0, String str) {
        c1348m0.zzd |= 2;
        c1348m0.zzf = str;
    }

    public static /* synthetic */ void green(C1348m0 c1348m0, String str) {
        c1348m0.zzd |= 1;
        c1348m0.zze = str;
    }

    public static /* synthetic */ void indigo(C1348m0 c1348m0, long j5) {
        c1348m0.zzd |= 8;
        c1348m0.zzh = j5;
    }

    public static /* synthetic */ void ivory(C1348m0 c1348m0, long j5) {
        c1348m0.zzd |= 128;
        c1348m0.zzl = j5;
    }

    public static /* synthetic */ void jade(C1348m0 c1348m0, String str) {
        c1348m0.zzd |= 64;
        c1348m0.zzk = str;
    }

    public static /* synthetic */ void lavender(C1348m0 c1348m0, String str) {
        c1348m0.zzd |= 32;
        c1348m0.zzj = str;
    }

    public static /* synthetic */ void lime(C1348m0 c1348m0, String str) {
        c1348m0.zzd |= 16;
        c1348m0.zzi = str;
    }

    public static C1344l0 xray() {
        return (C1344l0) zzb.echo();
    }

    public static C1348m0 yankee() {
        return zzb;
    }

    public final String amber() {
        return this.zzf;
    }

    public final String azure() {
        return this.zze;
    }

    public final String beige() {
        return this.zzk;
    }

    public final String black() {
        return this.zzj;
    }

    public final String blue() {
        return this.zzi;
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
                return new C1348m0();
            }
            return new W1(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final boolean november() {
        return (this.zzd & 4) != 0;
    }

    public final boolean oscar() {
        return (this.zzd & 2) != 0;
    }

    public final boolean papa() {
        return (this.zzd & 1) != 0;
    }

    public final boolean quebec() {
        return (this.zzd & 8) != 0;
    }

    public final boolean romeo() {
        return (this.zzd & 128) != 0;
    }

    public final boolean sierra() {
        return (this.zzd & 64) != 0;
    }

    public final boolean tango() {
        return (this.zzd & 32) != 0;
    }

    public final boolean uniform() {
        return (this.zzd & 16) != 0;
    }

    public final long victor() {
        return this.zzh;
    }

    public final long whiskey() {
        return this.zzl;
    }

    public final String zulu() {
        return this.zzg;
    }
}
