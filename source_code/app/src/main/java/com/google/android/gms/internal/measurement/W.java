package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class W extends AbstractC1392x1 {
    private static final W zzb;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private D1 zzh = V1.teal;

    static {
        W w4 = new W();
        zzb = w4;
        AbstractC1392x1.juliet(W.class, w4);
    }

    public static W oscar() {
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
                return new W();
            }
            return new W1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", S.charlie, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int november() {
        return this.zzh.size();
    }

    public final String papa() {
        return this.zzf;
    }

    public final D1 quebec() {
        return this.zzh;
    }

    public final boolean romeo() {
        return this.zzg;
    }

    public final boolean sierra() {
        return (this.zzd & 4) != 0;
    }

    public final boolean tango() {
        return (this.zzd & 2) != 0;
    }

    public final boolean uniform() {
        return (this.zzd & 1) != 0;
    }

    public final int victor() {
        int i4;
        switch (this.zze) {
            case 0:
                i4 = 1;
                break;
            case 1:
                i4 = 2;
                break;
            case 2:
                i4 = 3;
                break;
            case 3:
                i4 = 4;
                break;
            case 4:
                i4 = 5;
                break;
            case 5:
                i4 = 6;
                break;
            case 6:
                i4 = 7;
                break;
            default:
                i4 = 0;
                break;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }
}
