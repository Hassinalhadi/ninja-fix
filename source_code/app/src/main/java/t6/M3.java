package t6;

import a0.C0366t;
import android.hardware.camera2.CameraCharacteristics;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import bz.AbstractC0779d;
import bz.C0778c;
import bz.C0788m;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.C1667d;
import f.C1670g;
import f.C1676m;
import f.InterfaceC1672i;
import f.InterfaceC1673j;
import i.C1853b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m.AbstractC2088a;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import z.AbstractC3447a;

/* loaded from: classes2.dex */
public abstract class M3 {
    /* JADX WARN: Removed duplicated region for block: B:151:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(Function0 function0, T.s sVar, boolean z2, z.k kVar, AbstractC2088a abstractC2088a, b.ab abVar, z.h hVar, androidx.compose.foundation.layout.L l10, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        z.k kVar2;
        int i13;
        b.ab abVar2;
        int i14;
        boolean z11;
        C0585q c0585q;
        boolean z12;
        z.k kVar3;
        androidx.compose.runtime.Q uniform;
        long j5;
        long j6;
        long j7;
        float f5;
        InterfaceC1673j interfaceC1673j;
        long j10;
        boolean z13;
        boolean z14;
        z.k kVar4;
        C0788m c0788m;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1084573925);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(function0)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i10 = i21 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i10 |= i20;
        }
        int i22 = i5 & 4;
        if (i22 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            z10 = z2;
            if (c0585q2.hotel(z10)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i5 & 8) == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                if (c0585q2.golf(null)) {
                    i12 = 2048;
                } else {
                    i12 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i12;
            }
            if ((i4 & 24576) != 0) {
                if ((i5 & 16) == 0) {
                    kVar2 = kVar;
                    if (c0585q2.golf(kVar2)) {
                        i19 = Http2.INITIAL_MAX_FRAME_SIZE;
                        i10 |= i19;
                    }
                } else {
                    kVar2 = kVar;
                }
                i19 = 8192;
                i10 |= i19;
            } else {
                kVar2 = kVar;
            }
            if ((i4 & 196608) == 0) {
                if (c0585q2.golf(abstractC2088a)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i10 |= i18;
            }
            i13 = i5 & 64;
            if (i13 == 0) {
                i10 |= 1572864;
                abVar2 = abVar;
            } else {
                abVar2 = abVar;
                if ((i4 & 1572864) == 0) {
                    if (c0585q2.golf(abVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i10 |= i14;
                }
            }
            if ((i4 & 12582912) == 0) {
                if (c0585q2.golf(hVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i10 |= i17;
            }
            if ((i4 & 100663296) == 0) {
                if (c0585q2.golf(l10)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i10 |= i16;
            }
            if ((i4 & 805306368) == 0) {
                if (c0585q2.india(dVar)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i10 |= i15;
            }
            boolean z15 = true;
            if ((i10 & 306783379) == 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!c0585q2.magenta(i10 & 1, z11)) {
                c0585q2.orange();
                if ((i4 & 1) != 0 && !c0585q2.beige()) {
                    c0585q2.ochre();
                    if ((i5 & 16) != 0) {
                        i10 &= -57345;
                    }
                } else {
                    if (i22 != 0) {
                        z10 = true;
                    }
                    if ((i5 & 16) != 0) {
                        i10 &= -57345;
                        kVar2 = AbstractC3447a.bravo(0.0f, 0.0f, c0585q2, 196608, 31);
                    }
                    if (i13 != 0) {
                        abVar2 = null;
                    }
                }
                c0585q2.romeo();
                androidx.compose.runtime.as asVar = C0580l.alpha;
                c0585q2.purple(497772480);
                Object jade = c0585q2.jade();
                if (jade == asVar) {
                    jade = ao.ad.xray(c0585q2);
                }
                InterfaceC1673j interfaceC1673j2 = (InterfaceC1673j) jade;
                c0585q2.quebec(false);
                int i23 = i10 >> 6;
                hVar.getClass();
                c0585q2.purple(-2133647540);
                if (z10) {
                    j5 = hVar.bravo;
                } else {
                    j5 = hVar.delta;
                }
                androidx.compose.runtime.ax black = C0564b.black(new C0366t(j5), c0585q2);
                c0585q2.quebec(false);
                Object jade2 = c0585q2.jade();
                if (jade2 == asVar) {
                    jade2 = new y.ar(2);
                    c0585q2.f(jade2);
                }
                T.s bravo = A0.o.bravo(sVar, false, (Function1) jade2);
                c0585q2.purple(-655254499);
                if (z10) {
                    j6 = hVar.alpha;
                } else {
                    j6 = hVar.charlie;
                }
                androidx.compose.runtime.ax black2 = C0564b.black(new C0366t(j6), c0585q2);
                c0585q2.quebec(false);
                long j11 = ((C0366t) black2.getValue()).alpha;
                b.ab abVar3 = abVar2;
                long bravo2 = C0366t.bravo(1.0f, ((C0366t) black.getValue()).alpha);
                if (kVar2 == null) {
                    c0585q2.purple(498179137);
                    c0585q2.quebec(false);
                    interfaceC1673j = interfaceC1673j2;
                    j7 = bravo2;
                    z14 = z10;
                    kVar4 = kVar2;
                    j10 = j11;
                    c0788m = null;
                } else {
                    c0585q2.purple(1401543616);
                    c0585q2.purple(-1588756907);
                    Object jade3 = c0585q2.jade();
                    if (jade3 == asVar) {
                        jade3 = new SnapshotStateList();
                        c0585q2.f(jade3);
                    }
                    SnapshotStateList snapshotStateList = (SnapshotStateList) jade3;
                    boolean golf = c0585q2.golf(interfaceC1673j2);
                    j7 = bravo2;
                    Object jade4 = c0585q2.jade();
                    if (golf || jade4 == asVar) {
                        jade4 = new z.i(interfaceC1673j2, snapshotStateList, null);
                        c0585q2.f(jade4);
                    }
                    C0564b.foxtrot((Xd.l) jade4, c0585q2, interfaceC1673j2);
                    InterfaceC1672i interfaceC1672i = (InterfaceC1672i) CollectionsKt.olive(snapshotStateList);
                    if (!z10) {
                        f5 = kVar2.charlie;
                    } else if (interfaceC1672i instanceof C1676m) {
                        f5 = kVar2.bravo;
                    } else if (interfaceC1672i instanceof C1670g) {
                        f5 = kVar2.delta;
                    } else if (interfaceC1672i instanceof C1667d) {
                        f5 = kVar2.echo;
                    } else {
                        f5 = kVar2.alpha;
                    }
                    Object jade5 = c0585q2.jade();
                    if (jade5 == asVar) {
                        interfaceC1673j = interfaceC1673j2;
                        j10 = j11;
                        jade5 = new C0778c(new Q0.g(f5), AbstractC0779d.lima, null, 12);
                        c0585q2.f(jade5);
                    } else {
                        interfaceC1673j = interfaceC1673j2;
                        j10 = j11;
                    }
                    C0778c c0778c = (C0778c) jade5;
                    Q0.g gVar = new Q0.g(f5);
                    boolean india = c0585q2.india(c0778c) | c0585q2.delta(f5);
                    if ((((i23 & 14) ^ 6) > 4 && c0585q2.hotel(z10)) || (i23 & 6) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z16 = india | z13;
                    if ((((i23 & 896) ^ 384) <= 256 || !c0585q2.golf(kVar2)) && (i23 & 384) != 256) {
                        z15 = false;
                    }
                    boolean india2 = z16 | z15 | c0585q2.india(interfaceC1672i);
                    Object jade6 = c0585q2.jade();
                    if (!india2 && jade6 != asVar) {
                        z14 = z10;
                        kVar4 = kVar2;
                    } else {
                        z14 = z10;
                        kVar4 = kVar2;
                        jade6 = new z.j(c0778c, f5, z14, kVar4, interfaceC1672i, null);
                        c0585q2.f(jade6);
                    }
                    C0564b.foxtrot((Xd.l) jade6, c0585q2, gVar);
                    c0788m = c0778c.charlie;
                    c0585q2.quebec(false);
                    c0585q2.quebec(false);
                }
                if (c0788m != null) {
                    f10 = ((Q0.g) ((androidx.compose.runtime.t0) c0788m.purple).getValue()).alpha;
                } else {
                    f10 = 0;
                }
                c0585q = c0585q2;
                long j12 = j10;
                P3.bravo(f10, (i10 & 14) | 805306368 | (i10 & 896) | (i23 & 7168) | (3670016 & i10), 0, j12, j7, P.e.echo(-20345758, new P0.c(black, l10, dVar, 2), c0585q2), bravo, abstractC2088a, c0585q, abVar3, interfaceC1673j, function0, z14);
                abVar2 = abVar3;
                z12 = z14;
                kVar3 = kVar4;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                z12 = z10;
                kVar3 = kVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C1853b(function0, sVar, z12, kVar3, abstractC2088a, abVar2, hVar, l10, dVar, i4, i5);
                return;
            }
            return;
        }
        z10 = z2;
        if ((i5 & 8) == 0) {
        }
        if ((i4 & 24576) != 0) {
        }
        if ((i4 & 196608) == 0) {
        }
        i13 = i5 & 64;
        if (i13 == 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        boolean z152 = true;
        if ((i10 & 306783379) == 306783378) {
        }
        if (!c0585q2.magenta(i10 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(Function0 function0, T.s sVar, z.k kVar, C2093f c2093f, b.ab abVar, z.h hVar, androidx.compose.foundation.layout.M m4, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        z.k kVar2;
        InterfaceC0581m interfaceC0581m2;
        z.h hVar2;
        androidx.compose.foundation.layout.M m5;
        if ((i5 & 16) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        if ((i5 & 128) != 0) {
            interfaceC0581m2 = interfaceC0581m;
            hVar2 = AbstractC3447a.charlie(0L, interfaceC0581m2, 7);
        } else {
            interfaceC0581m2 = interfaceC0581m;
            hVar2 = hVar;
        }
        if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
            m5 = AbstractC3447a.alpha;
        } else {
            m5 = m4;
        }
        alpha(function0, sVar, true, kVar2, c2093f, abVar, hVar2, m5, dVar, interfaceC0581m2, i4 & 2147483646, 0);
    }

    public static final void charlie(Function0 function0, T.s sVar, z.h hVar, androidx.compose.foundation.layout.M m4, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        if ((i5 & 2) != 0) {
            sVar = T.p.alpha;
        }
        T.s sVar2 = sVar;
        C2093f c2093f = ((z.ac) ((C0585q) interfaceC0581m).kilo(z.ad.alpha)).alpha;
        if ((i5 & 128) != 0) {
            hVar = AbstractC3447a.delta(0L, interfaceC0581m, 7);
        }
        z.h hVar2 = hVar;
        if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
            m4 = AbstractC3447a.delta;
        }
        alpha(function0, sVar2, true, null, c2093f, null, hVar2, m4, dVar, interfaceC0581m, i4 & 2147483646, 0);
    }

    public static String delta(androidx.camera.camera2.internal.compat.q qVar, Integer num, List list) {
        if (num != null && list.contains(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO) && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) qVar.bravo(ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO).alpha(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) qVar.bravo("1").alpha(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
        }
        return null;
    }
}
