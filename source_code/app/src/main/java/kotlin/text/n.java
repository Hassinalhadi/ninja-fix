package kotlin.text;

import D0.an;
import F.G2;
import H0.v;
import P.d;
import a0.ao;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import h.AbstractC1797a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.n;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2743p6;

/* loaded from: classes2.dex */
public abstract class n {
    public static final void alpha(final String statusText, final long j5, final long j6, final an anVar, P.d dVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        final P.d dVar2;
        C0585q c0585q;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        T.p pVar = T.p.alpha;
        Intrinsics.echo(statusText, "statusText");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1528056174);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(statusText)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.foxtrot(j5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.foxtrot(j6)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.golf(anVar)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.india(dVar)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        if ((i4 & 196608) == 0) {
            if (c0585q2.golf(pVar)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        }
        if ((74899 & i5) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i5 & 1, z2)) {
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(V.golf(V.charlie(pVar, 1.0f), 56, 0.0f, 2), j5, ao.alpha), 16, 12);
            S alpha = Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q2, 54);
            long j7 = c0585q2.magenta;
            int i16 = (int) (j7 ^ (j7 >>> 32));
            I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(tango, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, alpha);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                ad.blue(i16, c0585q2, i16, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie);
            v vVar = v.f1409c;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            G2.bravo(statusText, new LayoutWeightElement(1.0f, true), j6, 0L, vVar, null, 0L, null, 0L, 2, false, 2, 0, null, anVar, c0585q2, (i5 & 14) | 196608 | (i5 & 896), ((i5 << 9) & 3670016) | 3120, 55256);
            c0585q = c0585q2;
            int i17 = (i5 >> 12) & 14;
            dVar2 = dVar;
            P0.indigo(i17, dVar2, c0585q, true);
        } else {
            dVar2 = dVar;
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: Mb.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    an anVar2 = anVar;
                    d dVar3 = dVar2;
                    n.alpha(statusText, j5, j6, anVar2, dVar3, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void bravo(StringBuilder sb2, Object obj, Function1 function1) {
        boolean z2;
        Intrinsics.echo(sb2, "<this>");
        if (function1 != null) {
            sb2.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null) {
            z2 = true;
        } else {
            z2 = obj instanceof CharSequence;
        }
        if (z2) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static String charlie(String str) {
        int i4;
        int i5;
        String str2;
        Intrinsics.echo(str, "<this>");
        List<String> lines = StringsKt__StringsKt.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : lines) {
            if (!StringsKt.gray((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.blue(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i4 < length) {
                    if (!AbstractC2743p6.delta(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 == -1) {
                i4 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i4));
        }
        Integer num = (Integer) CollectionsKt.red(arrayList2);
        if (num != null) {
            i5 = num.intValue();
        } else {
            i5 = 0;
        }
        int length2 = str.length();
        lines.size();
        int ivory = CollectionsKt.ivory(lines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : lines) {
            int i10 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str4 = (String) obj2;
            if ((i4 == 0 || i4 == ivory) && StringsKt.gray(str4)) {
                str2 = null;
            } else {
                str2 = StringsKt.blue(i5, str4);
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i4 = i10;
        }
        StringBuilder sb2 = new StringBuilder(length2);
        CollectionsKt.magenta(arrayList3, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r8 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String delta(String str) {
        Intrinsics.echo(str, "<this>");
        if (!StringsKt.gray("|")) {
            List<String> lines = StringsKt__StringsKt.lines(str);
            int length = str.length();
            lines.size();
            int ivory = CollectionsKt.ivory(lines);
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            for (Object obj : lines) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj;
                String str3 = null;
                if ((i4 != 0 && i4 != ivory) || !StringsKt.gray(str2)) {
                    int length2 = str2.length();
                    int i10 = 0;
                    while (true) {
                        if (i10 < length2) {
                            if (!AbstractC2743p6.delta(str2.charAt(i10))) {
                                break;
                            }
                            i10++;
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    if (i10 != -1 && r.papa(i10, str2, "|", false)) {
                        str3 = str2.substring("|".length() + i10);
                        Intrinsics.delta(str3, "substring(...)");
                    }
                }
                str2 = str3;
                if (str2 != null) {
                    arrayList.add(str2);
                }
                i4 = i5;
            }
            StringBuilder sb2 = new StringBuilder(length);
            CollectionsKt.magenta(arrayList, sb2, "\n", null, null, null, 124);
            return sb2.toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }
}
