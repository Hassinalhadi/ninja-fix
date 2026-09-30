package a9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;

/* loaded from: classes2.dex */
public final class o extends am implements C {
    private static final o zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private n zzj;
    private n zzk;

    static {
        o oVar = new o();
        zzb = oVar;
        am.hotel(o.class, oVar);
    }

    public static o papa() {
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
                return new o();
            }
            return new J(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final n november() {
        n nVar = this.zzk;
        if (nVar == null) {
            return n.tango();
        }
        return nVar;
    }

    public final n oscar() {
        n nVar = this.zzj;
        if (nVar == null) {
            return n.tango();
        }
        return nVar;
    }

    public final String quebec() {
        return this.zzf;
    }

    public final String romeo() {
        return this.zzg;
    }

    public final String sierra() {
        return this.zzh;
    }

    public final String tango() {
        return this.zzi;
    }

    public final String uniform() {
        return this.zze;
    }
}
