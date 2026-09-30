package q7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1403a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;

/* renamed from: q7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2424i extends am implements C {
    private static final C2424i zzb;
    private int zzd;
    private C2422g zzj;
    private C1403a0 zzl;
    private String zze = "";
    private AbstractC1431z zzf = AbstractC1431z.purple;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        C2424i c2424i = new C2424i();
        zzb = c2424i;
        am.hotel(C2424i.class, c2424i);
    }

    public static C2423h november() {
        return (C2423h) zzb.delta();
    }

    public static /* synthetic */ void oscar(C2424i c2424i, C2422g c2422g) {
        c2424i.zzj = c2422g;
        c2424i.zzd |= 32;
    }

    public static /* synthetic */ void papa(C2424i c2424i, AbstractC1431z abstractC1431z) {
        abstractC1431z.getClass();
        c2424i.zzd |= 2;
        c2424i.zzf = abstractC1431z;
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
                return new C2424i();
            }
            return new J(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        return (byte) 1;
    }
}
