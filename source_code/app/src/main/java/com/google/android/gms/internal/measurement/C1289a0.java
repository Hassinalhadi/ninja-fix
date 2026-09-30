package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1289a0 extends AbstractC1392x1 {
    private static final C1289a0 zzb;
    private int zzd;
    private D1 zze;
    private D1 zzf;
    private D1 zzg;
    private boolean zzh;
    private D1 zzi;

    static {
        C1289a0 c1289a0 = new C1289a0();
        zzb = c1289a0;
        AbstractC1392x1.juliet(C1289a0.class, c1289a0);
    }

    public C1289a0() {
        V1 v1 = V1.teal;
        this.zze = v1;
        this.zzf = v1;
        this.zzg = v1;
        this.zzi = v1;
    }

    public static C1289a0 november() {
        return zzb;
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
                return new C1289a0();
            }
            return new W1(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzd", "zze", X.class, "zzf", Y.class, "zzg", Z.class, "zzh", "zzi", X.class});
        }
        return (byte) 1;
    }

    public final D1 oscar() {
        return this.zzg;
    }

    public final D1 papa() {
        return this.zze;
    }

    public final D1 quebec() {
        return this.zzf;
    }

    public final List romeo() {
        return this.zzi;
    }

    public final boolean sierra() {
        return this.zzh;
    }

    public final boolean tango() {
        return (this.zzd & 1) != 0;
    }
}
