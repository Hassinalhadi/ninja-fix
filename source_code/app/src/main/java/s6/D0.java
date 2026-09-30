package s6;

import F.AbstractC0141o0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import g0.C1726f;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2208a;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.D0;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class D0 {
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0123, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r14.jade(), java.lang.Integer.valueOf(r15)) == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final int i4, final Function0 onViewAssetsClick, final T.s sVar, C1726f c1726f, float f5, long j5, InterfaceC0581m interfaceC0581m, final int i5) {
        int i10;
        int i11;
        boolean z2;
        final C1726f c1726f2;
        final float f10;
        final long j6;
        long j7;
        C1726f c1726f3;
        float f11;
        float f12;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(onViewAssetsClick, "onViewAssetsClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-515674694);
        if ((i5 & 6) == 0) {
            i10 = i4;
            if (c0585q.echo(i10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i5;
        } else {
            i10 = i4;
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.india(onViewAssetsClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i5 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i5 & 3072) == 0) {
            i11 |= Barcode.FORMAT_UPC_E;
        }
        int i15 = i11 | 14376960;
        if ((4793491 & i15) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i15 & 1, z2)) {
            c0585q.orange();
            int i16 = i5 & 1;
            T.p pVar = T.p.alpha;
            if (i16 != 0 && !c0585q.beige()) {
                c0585q.ochre();
                c1726f3 = c1726f;
                f11 = f5;
                j7 = j5;
            } else {
                C1726f bravo = Y.bravo();
                float f13 = AbstractC2208a.charlie;
                j7 = AbstractC2208a.bravo;
                c1726f3 = bravo;
                f11 = f13;
            }
            c0585q.romeo();
            C2093f bravo2 = AbstractC2094g.bravo(AbstractC2208a.delta);
            c0585q.purple(-1642125195);
            String alpha = AbstractC3086y3.alpha(R.string.assets_with_you_count, new Object[]{Integer.valueOf(i10)}, c0585q);
            c0585q.quebec(false);
            c0585q.purple(-1642122114);
            String bravo3 = AbstractC3086y3.bravo(c0585q, R.string.view_assets);
            c0585q.quebec(false);
            T.s sierra = AbstractC0538d.sierra(t6.R3.charlie(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), bravo2), AbstractC2208a.alpha, a0.ao.alpha), f11, j7, bravo2), AbstractC2208a.echo);
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, jVar, c0585q, 54);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q.lime) {
                f12 = f11;
            } else {
                f12 = f11;
            }
            ao.ad.blue(romeo, c0585q, romeo, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            C1726f c1726f4 = c1726f3;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 54);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie2 = T.a.charlie(layoutWeightElement, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie2);
            AbstractC0141o0.bravo(c1726f4, null, androidx.compose.foundation.layout.V.kilo(pVar, AbstractC2208a.foxtrot), AbstractC2208a.golf, c0585q, 3504, 0);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.oscar(pVar, AbstractC2208a.lima), c0585q);
            long j10 = AbstractC2208a.india;
            F.G2.bravo(alpha, null, AbstractC2208a.hotel, j10, null, null, 0L, null, 0L, 0, false, 1, 0, null, null, c0585q, 3456, 3072, 122866);
            c0585q.quebec(true);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.oscar(pVar, AbstractC2208a.mike), c0585q);
            F.G2.bravo(bravo3, androidx.compose.foundation.a.delta(pVar, false, null, new A0.h(0), onViewAssetsClick, 3), AbstractC2208a.juliet, j10, AbstractC2208a.kilo, null, 0L, null, 0L, 0, false, 1, 0, null, null, c0585q, 200064, 3072, 122832);
            c0585q = c0585q;
            c0585q.quebec(true);
            j6 = j7;
            f10 = f12;
            c1726f2 = c1726f4;
        } else {
            c0585q.ochre();
            c1726f2 = c1726f;
            f10 = f5;
            j6 = j5;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: eb.b
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i5 | 1);
                    float f14 = f10;
                    long j11 = j6;
                    D0.alpha(i4, onViewAssetsClick, sVar, c1726f2, f14, j11, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static String bravo(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i4 = 0; i4 < str.length(); i4++) {
                sb2.append(str.charAt(i4));
                if (str2.length() > i4) {
                    sb2.append(str2.charAt(i4));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
