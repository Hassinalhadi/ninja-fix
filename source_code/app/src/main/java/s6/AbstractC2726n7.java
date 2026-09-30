package s6;

import a0.C0366t;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import pb.C2299a;

/* renamed from: s6.n7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2726n7 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(String text, Function0 onClick, boolean z2, T.s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        T.s sVar2;
        int i13;
        int i14;
        P.d dVar2;
        int i15;
        boolean z11;
        C0585q c0585q;
        boolean z12;
        T.s sVar3;
        P.d dVar3;
        androidx.compose.runtime.Q uniform;
        boolean z13;
        T.s sVar4;
        P.d dVar4;
        int i16;
        int i17;
        int i18 = 1;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1736017515);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(text)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(onClick)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        int i19 = i5 & 4;
        if (i19 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            z10 = z2;
            if (c0585q2.hotel(z10)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            i12 = i5 & 8;
            if (i12 == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                sVar2 = sVar;
                if (c0585q2.golf(sVar2)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
                i14 = i5 & 16;
                if (i14 != 0) {
                    i10 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    dVar2 = dVar;
                    if (c0585q2.india(dVar2)) {
                        i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i15 = 8192;
                    }
                    i10 |= i15;
                    if ((i10 & 9363) == 9362) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!c0585q2.magenta(i10 & 1, z11)) {
                        if (i19 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i12 != 0) {
                            sVar4 = T.p.alpha;
                        } else {
                            sVar4 = sVar2;
                        }
                        if (i14 != 0) {
                            dVar4 = null;
                        } else {
                            dVar4 = dVar2;
                        }
                        T.s charlie = androidx.compose.foundation.layout.V.charlie(androidx.compose.foundation.layout.V.echo(sVar4, 52), 1.0f);
                        androidx.compose.foundation.layout.M m4 = F.al.alpha;
                        long j5 = ((F.O) c0585q2.kilo(F.Q.alpha)).alpha;
                        c0585q = c0585q2;
                        long j6 = Db.c.yankee;
                        long j7 = C0366t.echo;
                        P.d dVar5 = dVar4;
                        F.K1.bravo(onClick, charlie, z13, Db.a.bravo, F.al.alpha(j5, j7, j6, C0366t.bravo(0.6f, j7), c0585q, 0), null, null, null, P.e.echo(-773253541, new Pa.e(dVar4, i18, text), c0585q), c0585q, ((i10 >> 3) & 14) | 805309440 | (i10 & 896), 480);
                        z12 = z13;
                        dVar3 = dVar5;
                        sVar3 = sVar4;
                    } else {
                        c0585q = c0585q2;
                        c0585q.ochre();
                        z12 = z10;
                        sVar3 = sVar2;
                        dVar3 = dVar2;
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new C2299a(text, onClick, z12, sVar3, dVar3, i4, i5, 0);
                        return;
                    }
                    return;
                }
                dVar2 = dVar;
                if ((i10 & 9363) == 9362) {
                }
                if (!c0585q2.magenta(i10 & 1, z11)) {
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            sVar2 = sVar;
            i14 = i5 & 16;
            if (i14 != 0) {
            }
            dVar2 = dVar;
            if ((i10 & 9363) == 9362) {
            }
            if (!c0585q2.magenta(i10 & 1, z11)) {
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        z10 = z2;
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        sVar2 = sVar;
        i14 = i5 & 16;
        if (i14 != 0) {
        }
        dVar2 = dVar;
        if ((i10 & 9363) == 9362) {
        }
        if (!c0585q2.magenta(i10 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public abstract Method bravo(Class cls, Field field);

    public abstract Constructor charlie(Class cls);

    public abstract String[] delta(Class cls);

    public abstract boolean echo(Class cls);
}
