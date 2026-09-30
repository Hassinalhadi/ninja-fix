package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class K0 extends AbstractC1392x1 {
    private static final K0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.K0, com.google.android.gms.internal.measurement.x1] */
    static {
        ?? abstractC1392x1 = new AbstractC1392x1();
        zzb = abstractC1392x1;
        AbstractC1392x1.juliet(K0.class, abstractC1392x1);
    }

    public static J0 november() {
        return (J0) zzb.echo();
    }

    public static K0 papa() {
        return zzb;
    }

    public static void quebec(K0 k02, int i4) {
        k02.zzf = ao.ad.quebec(i4);
        k02.zzd |= 2;
    }

    public static /* synthetic */ void tango(K0 k02, int i4) {
        k02.zzg = i4 - 1;
        k02.zzd |= 4;
    }

    public static /* synthetic */ void uniform(K0 k02, int i4) {
        k02.zze = i4 - 1;
        k02.zzd |= 1;
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
            return new W1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", S.kilo, "zzf", S.india, "zzg", S.juliet});
        }
        return (byte) 1;
    }

    public final int oscar() {
        int echo = ao.ad.echo(this.zzf);
        if (echo == 0) {
            return 1;
        }
        return echo;
    }

    public final int romeo() {
        int i4;
        int i5 = this.zzg;
        if (i5 != 0) {
            i4 = 2;
            if (i5 != 1) {
                int i10 = 3;
                if (i5 != 2) {
                    i4 = 4;
                    if (i5 != 3) {
                        i10 = 5;
                        if (i5 != 4) {
                            i4 = i5 != 5 ? 0 : 6;
                        }
                    }
                }
                i4 = i10;
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final int sierra() {
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
