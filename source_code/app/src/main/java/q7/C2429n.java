package q7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1403a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;

/* renamed from: q7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2429n extends am implements C {
    private static final C2429n zzb;
    private int zzd;
    private C1403a0 zzf;
    private AbstractC1431z zze = AbstractC1431z.purple;
    private int zzg = 1;
    private float zzh = 0.75f;
    private boolean zzi = true;

    static {
        C2429n c2429n = new C2429n();
        zzb = c2429n;
        am.hotel(C2429n.class, c2429n);
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
                return new C2429n();
            }
            return new J(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
