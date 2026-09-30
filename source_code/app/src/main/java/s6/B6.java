package s6;

import Xd.l;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import cb.C0837b;
import cb.C0840e;
import cb.C0841f;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.C1726f;
import java.util.Iterator;
import java.util.List;
import kb.AbstractC2030f;
import kb.C2027c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ob.C2211d;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.B6;

/* loaded from: classes2.dex */
public abstract class B6 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void alpha(final List cabinets, final String str, final List items, final boolean z2, final C1726f c1726f, final long j5, final T.s sVar, final C0841f c0841f, final Xd.l lVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z10;
        boolean z11;
        char c3;
        Function0 function0;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C1726f cabinetIcon = c1726f;
        int i20 = 1;
        Intrinsics.echo(cabinets, "cabinets");
        Intrinsics.echo(items, "items");
        Intrinsics.echo(cabinetIcon, "cabinetIcon");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1487633985);
        if ((i4 & 6) == 0) {
            if (c0585q.india(cabinets)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i5 = i19 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i5 |= i18;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(items)) {
                i17 = Barcode.FORMAT_QR_CODE;
            } else {
                i17 = 128;
            }
            i5 |= i17;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.hotel(z2)) {
                i16 = 2048;
            } else {
                i16 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i16;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.golf(cabinetIcon)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = 8192;
            }
            i5 |= i15;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.foxtrot(j5)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i5 |= i14;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.golf(sVar)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((12582912 & i4) == 0) {
            if (c0585q.india(c0841f)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        if ((100663296 & i4) == 0) {
            if (c0585q.india(lVar)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i5 |= i11;
        }
        int i21 = i5;
        if ((i21 & 38347923) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i21 & 1, z10)) {
            float f5 = 1.0f;
            if (c0841f != null) {
                c0585q.purple(-1662810253);
                AbstractC2030f.alpha(c0841f, androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), z2, lVar, c0585q, ((i21 >> 21) & 14) | ((i21 >> 3) & 896) | ((i21 >> 15) & 7168));
                c0585q = c0585q;
                c0585q.quebec(false);
            } else if (!cabinets.isEmpty()) {
                c0585q.purple(-1662504035);
                Iterator it = cabinets.iterator();
                while (it.hasNext()) {
                    AbstractC2617b6.bravo((C0840e) it.next(), androidx.compose.foundation.layout.V.charlie(sVar, f5), z2, cabinetIcon, lVar, c0585q, ((i21 >> 3) & 8064) | ((i21 >> 6) & 3670016));
                    f5 = f5;
                    cabinetIcon = c1726f;
                }
                c0585q.quebec(false);
            } else if (str != null) {
                c0585q.purple(-1662086062);
                AbstractC2617b6.bravo(new C0840e(str, items), androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), z2, c1726f, lVar, c0585q, ((i21 >> 3) & 8064) | ((i21 >> 6) & 3670016));
                c0585q.quebec(false);
            } else {
                Xd.l lVar2 = lVar;
                if (!items.isEmpty()) {
                    c0585q.purple(-1661697043);
                    T.s bravo = t6.X3.bravo(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), t6.X3.alpha(c0585q), false);
                    C0537c c0537c = AbstractC0542h.alpha;
                    androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(C2211d.mike), T.d.f2061d, c0585q, 54);
                    int romeo = C0564b.romeo(c0585q);
                    androidx.compose.runtime.I mike = c0585q.mike();
                    T.s charlie = T.a.charlie(bravo, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                        ao.ad.blue(romeo, c0585q, romeo, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    c0585q.purple(1971355356);
                    Iterator it2 = items.iterator();
                    while (it2.hasNext()) {
                        C0837b c0837b = (C0837b) it2.next();
                        String str2 = c0837b.alpha;
                        if (z2 && c0837b.echo != null && lVar2 != null) {
                            c0585q.purple(-434670415);
                            c3 = 0;
                            if ((i21 & 234881024) == 67108864) {
                                i10 = i20;
                            } else {
                                i10 = 0;
                            }
                            int i22 = i10 | (c0585q.golf(c0837b) ? 1 : 0);
                            Object jade = c0585q.jade();
                            if (i22 != 0 || jade == C0580l.alpha) {
                                jade = new C2027c(lVar2, c0837b, i20);
                                c0585q.f(jade);
                            }
                            function0 = (Function0) jade;
                            z11 = false;
                            c0585q.quebec(false);
                        } else {
                            z11 = false;
                            c3 = 0;
                            c0585q.purple(-434563435);
                            c0585q.quebec(false);
                            function0 = null;
                        }
                        C0585q c0585q2 = c0585q;
                        Y4.alpha(str2, null, null, c0837b.charlie, c0837b.bravo, c0837b.delta, z2, function0, j5, j5, c0585q2, ((i21 << 9) & 238551040) | ((i21 << 12) & 1879048192));
                        lVar2 = lVar;
                        it2 = it2;
                        i20 = i20;
                        c0585q = c0585q2;
                    }
                    A0.z.papa(c0585q, false, i20, false);
                } else {
                    c0585q.purple(-1665509919);
                    c0585q.quebec(false);
                }
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: mb.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    C0841f c0841f2 = c0841f;
                    l lVar3 = lVar;
                    B6.alpha(cabinets, str, items, z2, c1726f, j5, sVar, c0841f2, lVar3, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void bravo(int i4, int i5) {
        if (i4 >= 0 && i4 < i5) {
        } else {
            throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, i5, ", size: "));
        }
    }

    public static final void charlie(int i4, int i5) {
        if (i4 >= 0 && i4 <= i5) {
        } else {
            throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, i5, ", size: "));
        }
    }

    public static final void delta(int i4, int i5, int i10) {
        if (i4 >= 0 && i5 <= i10) {
            if (i4 <= i5) {
            } else {
                throw new IllegalArgumentException(A0.z.juliet("fromIndex: ", i4, i5, " > toIndex: "));
            }
        } else {
            StringBuilder hotel = av.q.hotel(i4, i5, "fromIndex: ", ", toIndex: ", ", size: ");
            hotel.append(i10);
            throw new IndexOutOfBoundsException(hotel.toString());
        }
    }
}
