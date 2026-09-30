package a9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1422p;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1430y;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.an;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ar;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.as;
import com.google.mlkit.vision.barcode.common.Barcode;
import t6.AbstractC2982d3;
import x2.C3287h;

/* loaded from: classes2.dex */
public final class l extends am implements C {
    private static final l zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private AbstractC1431z zzf;
    private String zzg;
    private d zzh;
    private int zzi;
    private p zzj;
    private r zzk;
    private C1422p zzl;
    private g zzm;
    private j zzn;
    private i zzo;
    private t zzp;
    private o zzq;
    private q zzr;
    private m zzs;
    private as zzt;
    private ar zzu;
    private String zzv;
    private as zzw;
    private boolean zzx;
    private double zzy;
    private AbstractC1431z zzz;

    static {
        l lVar = new l();
        zzb = lVar;
        am.hotel(l.class, lVar);
    }

    public l() {
        C1430y c1430y = AbstractC1431z.purple;
        this.zzf = c1430y;
        this.zzg = "";
        I i4 = I.silver;
        this.zzt = i4;
        this.zzu = an.silver;
        this.zzv = "";
        this.zzw = i4;
        this.zzx = true;
        this.zzz = c1430y;
    }

    public static void azure(l lVar, int i4, f fVar) {
        int i5;
        as asVar = lVar.zzt;
        if (!((com.google.android.gms.internal.mlkit_vision_barcode_bundled.r) asVar).alpha) {
            int size = asVar.size();
            if (size == 0) {
                i5 = 10;
            } else {
                i5 = size + size;
            }
            lVar.zzt = asVar.foxtrot(i5);
        }
        lVar.zzt.set(i4, fVar);
    }

    public final as amber() {
        return this.zzt;
    }

    public final boolean beige() {
        if ((this.zzd & 4096) != 0) {
            return true;
        }
        return false;
    }

    public final boolean black() {
        if ((this.zzd & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean blue() {
        if ((this.zzd & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final boolean bronze() {
        if ((this.zzd & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean coral() {
        if ((this.zzd & 2048) != 0) {
            return true;
        }
        return false;
    }

    public final boolean crimson() {
        if ((this.zzd & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean cyan() {
        if ((this.zzd & Barcode.FORMAT_QR_CODE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean emerald() {
        if ((this.zzd & Barcode.FORMAT_UPC_E) != 0) {
            return true;
        }
        return false;
    }

    public final boolean fuchsia() {
        if ((this.zzd & 512) != 0) {
            return true;
        }
        return false;
    }

    public final int gold() {
        int alpha = C3287h.alpha(this.zze);
        if (alpha == 0) {
            return 1;
        }
        return alpha;
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
                            this.zzA = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new ai(zzb);
                }
                return new l();
            }
            return new J(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", h.delta, "zzf", "zzg", "zzi", h.echo, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", f.class, "zzv", "zzw", f.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        return Byte.valueOf(this.zzA);
    }

    public final int november() {
        int bravo = AbstractC2982d3.bravo(this.zzi);
        if (bravo == 0) {
            return 1;
        }
        return bravo;
    }

    public final int oscar() {
        return this.zzt.size();
    }

    public final C1422p papa() {
        C1422p c1422p = this.zzl;
        if (c1422p == null) {
            return C1422p.november();
        }
        return c1422p;
    }

    public final o quebec() {
        o oVar = this.zzq;
        if (oVar == null) {
            return o.papa();
        }
        return oVar;
    }

    public final p romeo() {
        p pVar = this.zzj;
        if (pVar == null) {
            return p.oscar();
        }
        return pVar;
    }

    public final q sierra() {
        q qVar = this.zzr;
        if (qVar == null) {
            return q.november();
        }
        return qVar;
    }

    public final r tango() {
        r rVar = this.zzk;
        if (rVar == null) {
            return r.november();
        }
        return rVar;
    }

    public final t uniform() {
        t tVar = this.zzp;
        if (tVar == null) {
            return t.papa();
        }
        return tVar;
    }

    public final g victor() {
        g gVar = this.zzm;
        if (gVar == null) {
            return g.november();
        }
        return gVar;
    }

    public final i whiskey() {
        i iVar = this.zzo;
        if (iVar == null) {
            return i.november();
        }
        return iVar;
    }

    public final j xray() {
        j jVar = this.zzn;
        if (jVar == null) {
            return j.november();
        }
        return jVar;
    }

    public final AbstractC1431z yankee() {
        return this.zzf;
    }

    public final String zulu() {
        return this.zzg;
    }
}
