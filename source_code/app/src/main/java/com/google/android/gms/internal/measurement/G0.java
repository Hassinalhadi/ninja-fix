package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class G0 extends AbstractC1392x1 {
    private static final G0 zzb;
    private C1 zzd;
    private C1 zze;
    private D1 zzf;
    private D1 zzg;

    static {
        G0 g02 = new G0();
        zzb = g02;
        AbstractC1392x1.juliet(G0.class, g02);
    }

    public G0() {
        I1 i12 = I1.teal;
        this.zzd = i12;
        this.zze = i12;
        V1 v1 = V1.teal;
        this.zzf = v1;
        this.zzg = v1;
    }

    public static void amber(G0 g02, List list) {
        RandomAccess randomAccess = g02.zzd;
        if (!((AbstractC1345l1) randomAccess).alpha) {
            I1 i12 = (I1) randomAccess;
            int i4 = i12.red;
            g02.zzd = i12.foxtrot(i4 + i4);
        }
        AbstractC1340k1.bravo(list, g02.zzd);
    }

    public static void azure(G0 g02) {
        g02.zzf = V1.teal;
    }

    public static void beige(G0 g02) {
        g02.zze = I1.teal;
    }

    public static void black(G0 g02) {
        g02.zzg = V1.teal;
    }

    public static void blue(G0 g02) {
        g02.zzd = I1.teal;
    }

    public static F0 romeo() {
        return (F0) zzb.echo();
    }

    public static G0 sierra() {
        return zzb;
    }

    public static void xray(G0 g02, ArrayList arrayList) {
        D1 d12 = g02.zzf;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            g02.zzf = d12.foxtrot(size + size);
        }
        AbstractC1340k1.bravo(arrayList, g02.zzf);
    }

    public static void yankee(G0 g02, List list) {
        RandomAccess randomAccess = g02.zze;
        if (!((AbstractC1345l1) randomAccess).alpha) {
            I1 i12 = (I1) randomAccess;
            int i4 = i12.red;
            g02.zze = i12.foxtrot(i4 + i4);
        }
        AbstractC1340k1.bravo(list, g02.zze);
    }

    public static void zulu(G0 g02, List list) {
        D1 d12 = g02.zzg;
        if (!((AbstractC1345l1) d12).alpha) {
            int size = d12.size();
            g02.zzg = d12.foxtrot(size + size);
        }
        AbstractC1340k1.bravo(list, g02.zzg);
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
                return new G0();
            }
            return new W1(zzb, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", C1375t0.class, "zzg", I0.class});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zzf.size();
    }

    public final int oscar() {
        return ((I1) this.zze).size();
    }

    public final int papa() {
        return this.zzg.size();
    }

    public final int quebec() {
        return ((I1) this.zzd).size();
    }

    public final List tango() {
        return this.zzf;
    }

    public final List uniform() {
        return this.zze;
    }

    public final List victor() {
        return this.zzg;
    }

    public final C1 whiskey() {
        return this.zzd;
    }
}
