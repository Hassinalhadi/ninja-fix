package a9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;

/* loaded from: classes2.dex */
public final class f extends am implements C {
    private static final f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        f fVar = new f();
        zzb = fVar;
        am.hotel(f.class, fVar);
    }

    public static e papa() {
        return (e) zzb.delta();
    }

    public static /* synthetic */ void quebec(f fVar, int i4) {
        fVar.zzd |= 1;
        fVar.zze = i4;
    }

    public static /* synthetic */ void romeo(f fVar, int i4) {
        fVar.zzd |= 2;
        fVar.zzf = i4;
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
                            this.zzg = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new ai(zzb);
                }
                return new f();
            }
            return new J(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    public final int november() {
        return this.zze;
    }

    public final int oscar() {
        return this.zzf;
    }
}
