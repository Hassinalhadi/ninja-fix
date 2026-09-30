package q7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.as;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r;

/* renamed from: q7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2422g extends am implements C {
    private static final C2422g zzb;
    private as zzd = I.silver;

    static {
        C2422g c2422g = new C2422g();
        zzb = c2422g;
        am.hotel(C2422g.class, c2422g);
    }

    public static C2421f november() {
        return (C2421f) zzb.delta();
    }

    public static void oscar(C2422g c2422g, C2420e c2420e) {
        int i4;
        as asVar = c2422g.zzd;
        if (!((r) asVar).alpha) {
            int size = asVar.size();
            if (size == 0) {
                i4 = 10;
            } else {
                i4 = size + size;
            }
            c2422g.zzd = asVar.foxtrot(i4);
        }
        c2422g.zzd.add(c2420e);
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
                return new C2422g();
            }
            return new J(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2420e.class});
        }
        return (byte) 1;
    }
}
