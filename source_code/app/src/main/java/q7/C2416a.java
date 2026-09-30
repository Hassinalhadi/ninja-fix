package q7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;

/* renamed from: q7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2416a extends am implements C {
    private static final C2416a zzb;
    private int zzd;
    private C2424i zze;
    private C2418c zzf;
    private C2427l zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.am, q7.a] */
    static {
        ?? amVar = new am();
        zzb = amVar;
        am.hotel(C2416a.class, amVar);
    }

    public static C2425j november() {
        return (C2425j) zzb.delta();
    }

    public static /* synthetic */ void oscar(C2416a c2416a, C2424i c2424i) {
        c2416a.zze = c2424i;
        c2416a.zzd |= 1;
    }

    public static /* synthetic */ void papa(C2416a c2416a, C2418c c2418c) {
        c2416a.zzf = c2418c;
        c2416a.zzd |= 2;
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
            return new J(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
