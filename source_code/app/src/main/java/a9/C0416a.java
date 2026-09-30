package a9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1425t;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.H;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ac;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ai;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.am;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.as;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgr;
import java.io.IOException;

/* renamed from: a9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0416a extends am implements C {
    private static final C0416a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private as zze = I.silver;
    private String zzg = "";
    private AbstractC1431z zzh = AbstractC1431z.purple;

    static {
        C0416a c0416a = new C0416a();
        zzb = c0416a;
        am.hotel(C0416a.class, c0416a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.M] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.am] */
    public static C0416a november(byte[] bArr, ac acVar) {
        C0416a c0416a = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r22 = (am) c0416a.mike(4, null);
            try {
                ?? alpha = H.charlie.alpha(r22.getClass());
                alpha.echo(r22, bArr, 0, length, new C1425t(acVar));
                alpha.bravo(r22);
                c0416a = r22;
            } catch (zzer e) {
                throw e;
            } catch (zzgr e4) {
                throw e4.zza();
            } catch (IOException e5) {
                if (e5.getCause() instanceof zzer) {
                    throw ((zzer) e5.getCause());
                }
                throw new zzer(e5);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (c0416a != null && !am.juliet(c0416a, true)) {
            throw new zzgr(c0416a).zza();
        }
        return c0416a;
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
                            this.zzi = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new ai(zzb);
                }
                return new C0416a();
            }
            return new J(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", l.class, "zzf", h.bravo, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }

    public final as oscar() {
        return this.zze;
    }
}
