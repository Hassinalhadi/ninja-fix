package a9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1420n;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1421o;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1422p;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.as;

/* loaded from: classes2.dex */
public final class p extends am implements C {
    private static final p zzb;
    private int zzd;
    private C1421o zze;
    private as zzh;
    private as zzi;
    private as zzj;
    private as zzk;
    private String zzl;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        p pVar = new p();
        zzb = pVar;
        am.hotel(p.class, pVar);
    }

    public p() {
        I i4 = I.silver;
        this.zzh = i4;
        this.zzi = i4;
        this.zzj = i4;
        this.zzk = i4;
        this.zzl = "";
    }

    public static p oscar() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.am
    public final Object mike(int i4, am amVar) {
        byte b2 = 1;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (amVar == null) {
                                b2 = 0;
                            }
                            this.zzm = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new ai(zzb);
                }
                return new p();
            }
            return new J(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C1422p.class, "zzi", r.class, "zzj", "zzk", C1420n.class, "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }

    public final C1421o november() {
        C1421o c1421o = this.zze;
        if (c1421o == null) {
            return C1421o.november();
        }
        return c1421o;
    }

    public final String papa() {
        return this.zzf;
    }

    public final String quebec() {
        return this.zzg;
    }

    public final as romeo() {
        return this.zzk;
    }

    public final as sierra() {
        return this.zzi;
    }

    public final as tango() {
        return this.zzh;
    }

    public final as uniform() {
        return this.zzj;
    }
}
