package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1383v0 extends AbstractC1392x1 {
    private static final C1383v0 zzb;
    private int zzd;
    private D1 zze = V1.teal;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C1383v0 c1383v0 = new C1383v0();
        zzb = c1383v0;
        AbstractC1392x1.juliet(C1383v0.class, c1383v0);
    }

    public static /* synthetic */ void amber(C1383v0 c1383v0, int i4, C1395y0 c1395y0) {
        c1383v0.coral();
        c1383v0.zze.set(i4, c1395y0);
    }

    public static /* synthetic */ void azure(long j5, C1383v0 c1383v0) {
        c1383v0.zzd |= 4;
        c1383v0.zzh = j5;
    }

    public static /* synthetic */ void beige(long j5, C1383v0 c1383v0) {
        c1383v0.zzd |= 2;
        c1383v0.zzg = j5;
    }

    public static C1379u0 romeo() {
        return (C1379u0) zzb.echo();
    }

    public static /* synthetic */ void victor(C1383v0 c1383v0, Iterable iterable) {
        c1383v0.coral();
        AbstractC1340k1.bravo(iterable, c1383v0.zze);
    }

    public static /* synthetic */ void whiskey(C1383v0 c1383v0, C1395y0 c1395y0) {
        c1395y0.getClass();
        c1383v0.coral();
        c1383v0.zze.add(c1395y0);
    }

    public static void xray(C1383v0 c1383v0) {
        c1383v0.zze = V1.teal;
    }

    public static /* synthetic */ void yankee(C1383v0 c1383v0, int i4) {
        c1383v0.coral();
        c1383v0.zze.remove(i4);
    }

    public static /* synthetic */ void zulu(C1383v0 c1383v0, String str) {
        str.getClass();
        c1383v0.zzd |= 1;
        c1383v0.zzf = str;
    }

    public final boolean black() {
        return (this.zzd & 8) != 0;
    }

    public final boolean blue() {
        return (this.zzd & 4) != 0;
    }

    public final boolean bronze() {
        return (this.zzd & 2) != 0;
    }

    public final void coral() {
        D1 d12 = this.zze;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            this.zze = d12.foxtrot(size + size);
        }
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
                return new C1383v0();
            }
            return new W1(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", C1395y0.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zzi;
    }

    public final int oscar() {
        return this.zze.size();
    }

    public final long papa() {
        return this.zzh;
    }

    public final long quebec() {
        return this.zzg;
    }

    public final C1395y0 sierra(int i4) {
        return (C1395y0) this.zze.get(i4);
    }

    public final String tango() {
        return this.zzf;
    }

    public final List uniform() {
        return this.zze;
    }
}
