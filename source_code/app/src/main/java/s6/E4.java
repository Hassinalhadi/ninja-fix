package s6;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import fb.C1705d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2214g;
import okhttp3.internal.http2.Http2;
import s6.E4;
import t6.AbstractC3076w3;

/* loaded from: classes2.dex */
public abstract class E4 {
    public static final /* synthetic */ int alpha = 0;

    public static final void alpha(final T.s sVar, final String str, final String str2, final String str3, final String earningsLabel, final String distanceLabel, final String distanceUnit, AbstractC1680b abstractC1680b, AbstractC1680b abstractC1680b2, long j5, C2093f c2093f, float f5, long j6, InterfaceC0581m interfaceC0581m, final int i4) {
        final T.s sVar2;
        int i5;
        String str4;
        final AbstractC1680b abstractC1680b3;
        final AbstractC1680b abstractC1680b4;
        final C2093f c2093f2;
        final float f10;
        final long j7;
        C0585q c0585q;
        final long j10;
        final AbstractC1680b charlie;
        final C2093f bravo;
        int i10;
        final AbstractC1680b abstractC1680b5;
        final long j11;
        boolean z2;
        boolean z10;
        final float f11;
        C0585q c0585q2;
        final long j12;
        C2093f c2093f3;
        C1705d c1705d;
        C1705d c1705d2;
        Intrinsics.echo(earningsLabel, "earningsLabel");
        Intrinsics.echo(distanceLabel, "distanceLabel");
        Intrinsics.echo(distanceUnit, "distanceUnit");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(1064640580);
        if ((i4 & 6) == 0) {
            sVar2 = sVar;
            i5 = (c0585q3.golf(sVar2) ? 4 : 2) | i4;
        } else {
            sVar2 = sVar;
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q3.golf(str) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q3.golf(str2) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q3.golf(str3) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q3.golf(earningsLabel) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0585q3.golf(distanceLabel) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0585q3.golf(distanceUnit) ? 1048576 : 524288;
        }
        int i11 = 12582912 | i5;
        if ((100663296 & i4) == 0) {
            i11 = 46137344 | i5;
        }
        if ((805306368 & i4) == 0) {
            i11 |= 268435456;
        }
        if (c0585q3.magenta(i11 & 1, (306783379 & i11) != 306783378)) {
            c0585q3.orange();
            if ((i4 & 1) != 0 && !c0585q3.beige()) {
                c0585q3.ochre();
                int i12 = i11 & (-2113929217);
                abstractC1680b5 = abstractC1680b2;
                bravo = c2093f;
                j11 = j6;
                i10 = i12;
                z2 = true;
                c0585q2 = c0585q3;
                z10 = false;
                charlie = abstractC1680b;
                j12 = j5;
                f11 = f5;
            } else {
                charlie = AbstractC3076w3.charlie(R.drawable.ic_save, c0585q3, 0);
                AbstractC1680b charlie2 = AbstractC3076w3.charlie(R.drawable.ic_location_from_to, c0585q3, 0);
                long j13 = AbstractC2214g.charlie;
                bravo = AbstractC2094g.bravo(AbstractC2214g.delta);
                float f12 = AbstractC2214g.echo;
                i10 = i11 & (-2113929217);
                abstractC1680b5 = charlie2;
                j11 = AbstractC2214g.foxtrot;
                z2 = true;
                z10 = false;
                f11 = f12;
                c0585q2 = c0585q3;
                j12 = j13;
            }
            c0585q2.romeo();
            boolean z11 = (str == null || StringsKt.gray(str)) ? z2 : z10;
            if (str3 != null && !StringsKt.gray(str3)) {
                z2 = z10;
            }
            if (z11 && z2) {
                androidx.compose.runtime.Q uniform = c0585q2.uniform();
                if (uniform != null) {
                    final int i13 = 0;
                    uniform.delta = new Xd.l() { // from class: fb.a
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                            switch (i13) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int cyan = C0564b.cyan(i4 | 1);
                                    E4.alpha(sVar2, str, str2, str3, earningsLabel, distanceLabel, distanceUnit, charlie, abstractC1680b5, j12, bravo, f11, j11, interfaceC0581m2, cyan);
                                    return Unit.INSTANCE;
                                default:
                                    ((Integer) obj2).getClass();
                                    int cyan2 = C0564b.cyan(i4 | 1);
                                    E4.alpha(sVar2, str, str2, str3, earningsLabel, distanceLabel, distanceUnit, charlie, abstractC1680b5, j12, bravo, f11, j11, interfaceC0581m2, cyan2);
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            str4 = str3;
            AbstractC1680b abstractC1680b6 = charlie;
            AbstractC1680b abstractC1680b7 = abstractC1680b5;
            float f13 = f11;
            long j14 = j11;
            long j15 = j12;
            C2093f c2093f4 = bravo;
            if (!z11) {
                Intrinsics.checkNotNull(str);
                c2093f3 = c2093f4;
                c1705d = new C1705d(abstractC1680b6, earningsLabel, StringsKt.b(str + " " + (str2 == null ? "" : str2)).toString());
            } else {
                c2093f3 = c2093f4;
                Intrinsics.checkNotNull(str4);
                c1705d = new C1705d(abstractC1680b7, distanceLabel, StringsKt.b(str4 + " " + distanceUnit).toString());
            }
            if (z11 || z2) {
                c1705d2 = null;
            } else {
                Intrinsics.checkNotNull(str4);
                c1705d2 = new C1705d(abstractC1680b7, distanceLabel, StringsKt.b(str4 + " " + distanceUnit).toString());
            }
            C0585q c0585q4 = c0585q2;
            C1705d c1705d3 = c1705d2;
            C2093f c2093f5 = c2093f3;
            G4.bravo(sVar, c1705d, c1705d3, c2093f5, j15, f13, j14, c0585q4, (i10 & 14) | ((i10 >> 12) & 7168) | 14352384, Barcode.FORMAT_QR_CODE);
            c2093f2 = c2093f5;
            f10 = f13;
            j7 = j14;
            abstractC1680b3 = abstractC1680b6;
            abstractC1680b4 = abstractC1680b7;
            c0585q = c0585q4;
            j10 = j15;
        } else {
            str4 = str3;
            c0585q3.ochre();
            abstractC1680b3 = abstractC1680b;
            abstractC1680b4 = abstractC1680b2;
            c2093f2 = c2093f;
            f10 = f5;
            j7 = j6;
            c0585q = c0585q3;
            j10 = j5;
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            final int i14 = 1;
            final String str5 = str4;
            uniform2.delta = new Xd.l() { // from class: fb.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                    switch (i14) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int cyan = C0564b.cyan(i4 | 1);
                            E4.alpha(sVar, str, str2, str5, earningsLabel, distanceLabel, distanceUnit, abstractC1680b3, abstractC1680b4, j10, c2093f2, f10, j7, interfaceC0581m2, cyan);
                            return Unit.INSTANCE;
                        default:
                            ((Integer) obj2).getClass();
                            int cyan2 = C0564b.cyan(i4 | 1);
                            E4.alpha(sVar, str, str2, str5, earningsLabel, distanceLabel, distanceUnit, abstractC1680b3, abstractC1680b4, j10, c2093f2, f10, j7, interfaceC0581m2, cyan2);
                            return Unit.INSTANCE;
                    }
                }
            };
        }
    }
}
