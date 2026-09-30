package q7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.as;

/* renamed from: q7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2427l extends am implements C {
    private static final C2427l zzb;
    private as zzd;
    private as zze;

    static {
        C2427l c2427l = new C2427l();
        zzb = c2427l;
        am.hotel(C2427l.class, c2427l);
    }

    public C2427l() {
        I i4 = I.silver;
        this.zzd = i4;
        this.zze = i4;
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
                return new C2427l();
            }
            return new J(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", C2426k.class, "zze", C2426k.class});
        }
        return (byte) 1;
    }
}
