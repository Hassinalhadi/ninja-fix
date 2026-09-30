package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class Q0 extends AbstractC1392x1 {
    private static final Q0 zzb;
    private int zzd;
    private int zze;
    private D1 zzf = V1.teal;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        Q0 q02 = new Q0();
        zzb = q02;
        AbstractC1392x1.juliet(Q0.class, q02);
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
                return new Q0();
            }
            return new W1(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", S.lima, "zzf", Q0.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double november() {
        return this.zzj;
    }

    public final String oscar() {
        return this.zzg;
    }

    public final String papa() {
        return this.zzh;
    }

    public final D1 quebec() {
        return this.zzf;
    }

    public final boolean romeo() {
        return this.zzi;
    }

    public final boolean sierra() {
        return (this.zzd & 8) != 0;
    }

    public final boolean tango() {
        return (this.zzd & 16) != 0;
    }

    public final boolean uniform() {
        return (this.zzd & 4) != 0;
    }

    public final int victor() {
        int i4;
        int i5 = this.zze;
        if (i5 != 0) {
            i4 = 2;
            if (i5 != 1) {
                if (i5 != 2) {
                    i4 = 4;
                    if (i5 != 3) {
                        i4 = i5 != 4 ? 0 : 5;
                    }
                } else {
                    i4 = 3;
                }
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }
}
