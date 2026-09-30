package q7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ag;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.aq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: q7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2420e extends am implements C {
    private static final C2420e zzb;
    private int zzd;
    private aq zze;
    private aq zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C2420e c2420e = new C2420e();
        zzb = c2420e;
        am.hotel(C2420e.class, c2420e);
    }

    public C2420e() {
        ag agVar = ag.silver;
        this.zze = agVar;
        this.zzf = agVar;
    }

    public static C2419d november() {
        return (C2419d) zzb.delta();
    }

    public static /* synthetic */ void oscar(C2420e c2420e, int i4) {
        c2420e.zzd |= 2;
        c2420e.zzh = i4;
    }

    public static void papa(C2420e c2420e, float f5) {
        int i4;
        RandomAccess randomAccess = c2420e.zze;
        if (!((r) randomAccess).alpha) {
            ag agVar = (ag) randomAccess;
            int i5 = agVar.red;
            if (i5 == 0) {
                i4 = 10;
            } else {
                i4 = i5 + i5;
            }
            if (i4 >= i5) {
                c2420e.zze = new ag(Arrays.copyOf(agVar.purple, i4), agVar.red, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((ag) c2420e.zze).bravo(f5);
    }

    public static void quebec(C2420e c2420e, float f5) {
        int i4;
        RandomAccess randomAccess = c2420e.zzf;
        if (!((r) randomAccess).alpha) {
            ag agVar = (ag) randomAccess;
            int i5 = agVar.red;
            if (i5 == 0) {
                i4 = 10;
            } else {
                i4 = i5 + i5;
            }
            if (i4 >= i5) {
                c2420e.zzf = new ag(Arrays.copyOf(agVar.purple, i4), agVar.red, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((ag) c2420e.zzf).bravo(f5);
    }

    public static /* synthetic */ void romeo(C2420e c2420e, int i4) {
        c2420e.zzd |= 1;
        c2420e.zzg = i4;
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
                return new C2420e();
            }
            return new J(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
