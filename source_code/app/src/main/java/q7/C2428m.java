package q7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;

/* renamed from: q7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2428m extends am implements C {
    private static final C2428m zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [q7.m, com.google.android.gms.internal.mlkit_vision_barcode_bundled.am] */
    static {
        ?? amVar = new am();
        zzb = amVar;
        am.hotel(C2428m.class, amVar);
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
                return new am();
            }
            return new J(zzb, "\u0001\u0000", null);
        }
        return (byte) 1;
    }
}
