package q7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1430y;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;

/* renamed from: q7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2418c extends am implements C {
    private static final C2418c zzb;
    private int zzd;
    private String zze = "";
    private AbstractC1431z zzf;
    private String zzg;
    private AbstractC1431z zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        C2418c c2418c = new C2418c();
        zzb = c2418c;
        am.hotel(C2418c.class, c2418c);
    }

    public C2418c() {
        C1430y c1430y = AbstractC1431z.purple;
        this.zzf = c1430y;
        this.zzg = "";
        this.zzh = c1430y;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static C2417b november() {
        return (C2417b) zzb.delta();
    }

    public static /* synthetic */ void oscar(C2418c c2418c, AbstractC1431z abstractC1431z) {
        abstractC1431z.getClass();
        c2418c.zzd |= 2;
        c2418c.zzf = abstractC1431z;
    }

    public static /* synthetic */ void papa(C2418c c2418c, AbstractC1431z abstractC1431z) {
        abstractC1431z.getClass();
        c2418c.zzd |= 8;
        c2418c.zzh = abstractC1431z;
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
                return new C2418c();
            }
            return new J(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
