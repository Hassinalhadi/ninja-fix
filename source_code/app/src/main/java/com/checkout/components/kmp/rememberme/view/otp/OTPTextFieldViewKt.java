package com.checkout.components.kmp.rememberme.view.otp;

import D0.an;
import F.C0143o2;
import F.C0150q1;
import I0.ai;
import P.e;
import T.p;
import Xd.l;
import Xd.m;
import Y.s;
import a0.au;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import n.AbstractC2134i;
import n.aw;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/T;", "", "value", "Lkotlin/Function2;", "", "", "updateOTPCode", "index", "isEnabled", "", "otpCodes", "hasError", "LF/o2;", "colors", "LD0/an;", "textStyle", "LY/s;", "focusRequesters", "LT/s;", "modifier", "", "OTPTextFieldView", "(Landroidx/compose/foundation/layout/T;Ljava/lang/String;LXd/l;IZLjava/util/List;ZLF/o2;LD0/an;Ljava/util/List;LT/s;Landroidx/compose/runtime/m;III)V", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OTPTextFieldViewKt {
    public static final void OTPTextFieldView(@NotNull final T t5, @NotNull final String value, @NotNull final l updateOTPCode, final int i4, final boolean z2, @NotNull final List<Integer> otpCodes, final boolean z10, @NotNull final C0143o2 colors, @NotNull final an textStyle, @NotNull final List<s> focusRequesters, @Nullable T.s sVar, @Nullable InterfaceC0581m interfaceC0581m, final int i5, final int i10, final int i11) {
        int i12;
        boolean z11;
        T.s sVar2;
        int i13;
        int i14;
        boolean z12;
        C0585q c0585q;
        final T.s sVar3;
        T.s sVar4;
        long j5;
        boolean z13;
        au auVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Intrinsics.echo(t5, "<this>");
        Intrinsics.echo(value, "value");
        Intrinsics.echo(updateOTPCode, "updateOTPCode");
        Intrinsics.echo(otpCodes, "otpCodes");
        Intrinsics.echo(colors, "colors");
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(focusRequesters, "focusRequesters");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(129439474);
        if ((i5 & 6) == 0) {
            if (c0585q2.golf(t5)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i12 = i25 | i5;
        } else {
            i12 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q2.golf(value)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i12 |= i24;
        }
        if ((i5 & 384) == 0) {
            if (c0585q2.india(updateOTPCode)) {
                i23 = Barcode.FORMAT_QR_CODE;
            } else {
                i23 = 128;
            }
            i12 |= i23;
        }
        if ((i5 & 3072) == 0) {
            if (c0585q2.echo(i4)) {
                i22 = 2048;
            } else {
                i22 = Barcode.FORMAT_UPC_E;
            }
            i12 |= i22;
        }
        if ((i5 & 24576) == 0) {
            z11 = z2;
            if (c0585q2.hotel(z11)) {
                i21 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i21 = 8192;
            }
            i12 |= i21;
        } else {
            z11 = z2;
        }
        if ((i5 & 196608) == 0) {
            if (c0585q2.india(otpCodes)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        if ((i5 & 1572864) == 0) {
            if (c0585q2.hotel(z10)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i12 |= i19;
        }
        if ((i5 & 12582912) == 0) {
            if (c0585q2.golf(colors)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i5 & 100663296) == 0) {
            if (c0585q2.golf(textStyle)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i12 |= i17;
        }
        if ((i5 & 805306368) == 0) {
            if (c0585q2.india(focusRequesters)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i12 |= i16;
        }
        int i26 = i11 & 512;
        if (i26 != 0) {
            sVar2 = sVar;
            i13 = i10 | 6;
        } else {
            sVar2 = sVar;
            if ((i10 & 6) == 0) {
                if (c0585q2.golf(sVar2)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i10 | i14;
            } else {
                i13 = i10;
            }
        }
        boolean z14 = true;
        if ((i12 & 306783379) == 306783378 && (i13 & 3) == 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (c0585q2.magenta(i12 & 1, z12)) {
            if (i26 != 0) {
                sVar4 = p.alpha;
            } else {
                sVar4 = sVar2;
            }
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = ad.xray(c0585q2);
            }
            final InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade;
            float f5 = 48;
            T.s sVar5 = sVar4;
            T.s alpha = androidx.compose.ui.focus.a.alpha(t5.alpha(V.papa(V.echo(sVar4, f5), 12, f5), 1.0f, false), focusRequesters.get(i4));
            aw awVar = new aw(3, 0, 123);
            if (z10) {
                j5 = colors.juliet;
            } else {
                j5 = colors.india;
            }
            au auVar2 = new au(j5);
            if ((i12 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z15 = z13;
            if ((i12 & 7168) != 2048) {
                z14 = false;
            }
            boolean india = z15 | z14 | c0585q2.india(otpCodes) | c0585q2.india(focusRequesters);
            Object jade2 = c0585q2.jade();
            if (!india && jade2 != asVar) {
                i15 = i12;
                auVar = auVar2;
            } else {
                auVar = auVar2;
                i15 = i12;
                R9.a aVar = new R9.a(updateOTPCode, i4, otpCodes, focusRequesters, 3);
                c0585q2.f(aVar);
                jade2 = aVar;
            }
            final boolean z16 = z11;
            int i27 = i15 >> 3;
            c0585q = c0585q2;
            AbstractC2134i.alpha(value, (Function1) jade2, alpha, z2, false, textStyle, awVar, null, true, 0, 0, null, null, null, auVar, e.echo(-1591206033, new m() { // from class: com.checkout.components.kmp.rememberme.view.otp.a
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit OTPTextFieldView$lambda$5;
                    int intValue = ((Integer) obj3).intValue();
                    String str = value;
                    C0143o2 c0143o2 = colors;
                    OTPTextFieldView$lambda$5 = OTPTextFieldViewKt.OTPTextFieldView$lambda$5(str, z16, interfaceC1673j, z10, c0143o2, (l) obj, (InterfaceC0581m) obj2, intValue);
                    return OTPTextFieldView$lambda$5;
                }
            }, c0585q2), c0585q, (i27 & 7168) | (i27 & 14) | 102236160 | ((i15 >> 9) & 458752), 196608, 16016);
            sVar3 = sVar5;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            sVar3 = sVar2;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new l() { // from class: com.checkout.components.kmp.rememberme.view.otp.b
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    Unit OTPTextFieldView$lambda$6;
                    int intValue = ((Integer) obj2).intValue();
                    T t10 = T.this;
                    String str = value;
                    l lVar = updateOTPCode;
                    List list = otpCodes;
                    C0143o2 c0143o2 = colors;
                    an anVar = textStyle;
                    List list2 = focusRequesters;
                    int i28 = i10;
                    int i29 = i11;
                    OTPTextFieldView$lambda$6 = OTPTextFieldViewKt.OTPTextFieldView$lambda$6(t10, str, lVar, i4, z2, list, z10, c0143o2, anVar, list2, sVar3, i5, i28, i29, (InterfaceC0581m) obj, intValue);
                    return OTPTextFieldView$lambda$6;
                }
            };
        }
    }

    public static final Unit OTPTextFieldView$lambda$3$lambda$2(l lVar, int i4, List list, List list2, String newValue) {
        Intrinsics.echo(newValue, "newValue");
        boolean booleanValue = ((Boolean) lVar.invoke(Integer.valueOf(i4), newValue)).booleanValue();
        if (booleanValue && newValue.length() == 1 && i4 < list.size() - 1) {
            s.bravo((s) list2.get(i4 + 1));
        } else if (booleanValue && newValue.length() == 0 && i4 > 0) {
            s.bravo((s) list2.get(i4 - 1));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OTPTextFieldView$lambda$5(String str, boolean z2, InterfaceC1673j interfaceC1673j, boolean z10, C0143o2 c0143o2, l innerTextField, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z11;
        int i10;
        Intrinsics.echo(innerTextField, "innerTextField");
        if ((i4 & 6) == 0) {
            if (((C0585q) interfaceC0581m).india(innerTextField)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i4 | i10;
        } else {
            i5 = i4;
        }
        if ((i5 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i5 & 1, z11)) {
            float f5 = 0;
            C0150q1.alpha.bravo(str, innerTextField, z2, true, ai.alpha, interfaceC1673j, z10, null, null, null, null, null, c0143o2, new M(f5, f5, f5, f5), e.echo(-540146046, new Mb.c(c0143o2, interfaceC1673j, z2, z10), c0585q), c0585q, ((i5 << 3) & 112) | 918776832, 14355894, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OTPTextFieldView$lambda$5$lambda$4(boolean z2, boolean z10, InterfaceC1673j interfaceC1673j, C0143o2 c0143o2, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z11;
        if ((i4 & 3) != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z11)) {
            C0150q1.alpha.alpha(z2, z10, interfaceC1673j, null, c0143o2, AbstractC2094g.alpha(8), 0.0f, 0.0f, c0585q, 100663680, 200);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OTPTextFieldView$lambda$6(T t5, String str, l lVar, int i4, boolean z2, List list, boolean z10, C0143o2 c0143o2, an anVar, List list2, T.s sVar, int i5, int i10, int i11, InterfaceC0581m interfaceC0581m, int i12) {
        OTPTextFieldView(t5, str, lVar, i4, z2, list, z10, c0143o2, anVar, list2, sVar, interfaceC0581m, C0564b.cyan(i5 | 1), C0564b.cyan(i10), i11);
        return Unit.INSTANCE;
    }
}
