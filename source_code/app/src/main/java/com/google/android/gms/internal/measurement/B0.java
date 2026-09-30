package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class B0 extends AbstractC1392x1 {
    private static final B0 zzb;
    private int zzd;
    private D1 zze = V1.teal;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        B0 b02 = new B0();
        zzb = b02;
        AbstractC1392x1.juliet(B0.class, b02);
    }

    public static A0 oscar() {
        return (A0) zzb.echo();
    }

    public static A0 papa(B0 b02) {
        AbstractC1388w1 echo = zzb.echo();
        echo.charlie(b02);
        return (A0) echo;
    }

    public static /* synthetic */ void uniform(B0 b02, ArrayList arrayList) {
        b02.beige();
        AbstractC1340k1.bravo(arrayList, b02.zze);
    }

    public static /* synthetic */ void victor(B0 b02, D0 d02) {
        b02.beige();
        b02.zze.add(d02);
    }

    public static void whiskey(B0 b02) {
        b02.zze = V1.teal;
    }

    public static /* synthetic */ void xray(B0 b02, int i4, D0 d02) {
        b02.beige();
        b02.zze.set(i4, d02);
    }

    public static /* synthetic */ void yankee(B0 b02, String str) {
        str.getClass();
        b02.zzd |= 1;
        b02.zzf = str;
    }

    public static /* synthetic */ void zulu(B0 b02, String str) {
        str.getClass();
        b02.zzd |= 2;
        b02.zzg = str;
    }

    public final boolean amber() {
        return (this.zzd & 1) != 0;
    }

    public final boolean azure() {
        return (this.zzd & 2) != 0;
    }

    public final void beige() {
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
                return new B0();
            }
            return new W1(zzb, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzd", "zze", D0.class, "zzf", "zzg", "zzh", S.golf});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zze.size();
    }

    public final D0 quebec(int i4) {
        return (D0) this.zze.get(i4);
    }

    public final String romeo() {
        return this.zzf;
    }

    public final String sierra() {
        return this.zzg;
    }

    public final List tango() {
        return this.zze;
    }
}
