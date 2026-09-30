package a9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;

/* loaded from: classes2.dex */
public final class r extends am implements C {
    private static final r zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        r rVar = new r();
        zzb = rVar;
        am.hotel(r.class, rVar);
    }

    public static r november() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.am
    public final Object mike(int i4, am amVar) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ai(zzb);
                }
                return new r();
            }
            return new J(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", h.foxtrot, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String oscar() {
        return this.zzf;
    }

    public final String papa() {
        return this.zzh;
    }

    public final String quebec() {
        return this.zzg;
    }

    public final int romeo() {
        int i4;
        int i5 = this.zze;
        if (i5 != 0) {
            i4 = 2;
            if (i5 != 1) {
                i4 = i5 != 2 ? 0 : 3;
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
