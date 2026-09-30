package q7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;

/* renamed from: q7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2426k extends am implements C {
    private static final C2426k zzb;
    private int zzd = 0;
    private Object zze;

    static {
        C2426k c2426k = new C2426k();
        zzb = c2426k;
        am.hotel(C2426k.class, c2426k);
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
                return new C2426k();
            }
            return new J(zzb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzd", C2428m.class, o.class, C2429n.class});
        }
        return (byte) 1;
    }
}
