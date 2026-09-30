package com.checkout.components.core.ui.content;

import A0.z;
import Bb.a;
import D0.an;
import F4.g;
import F4.h;
import T.d;
import T.j;
import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import ao.ad;
import com.checkout.components.core.R;
import com.checkout.components.core.common.Fixtures;
import com.checkout.components.core.ui.content.PaymentComponentHeaderViewKt;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.core.ui.views.InternalImageViewKt;
import com.checkout.components.core.ui.views.InternalRadioButtonViewKt;
import com.checkout.components.core.ui.views.InternalTextLabelViewKt;
import com.checkout.components.core.utils.constants.PaymentComponentHeaderConstants;
import com.checkout.components.redirecthandler.RedirectDelegate;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3086y3;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a_\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "paymentComponentName", "paymentComponentSubtitle", "", "shouldTintPaymentComponentIcon", "isPaymentComponentSelected", "Lkotlin/Function0;", "", "onSelectPaymentComponent", "", "paymentComponentIconId", "Lcom/checkout/components/core/ui/model/ComposeStyle;", "style", "testTag", "PaymentComponentHeaderView", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;ILcom/checkout/components/core/ui/model/ComposeStyle;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "PaymentComponentHeaderViewPreview", "(Landroidx/compose/runtime/m;I)V", "core_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentComponentHeaderViewKt {
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01da, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.jade(), java.lang.Integer.valueOf(r6)) == false) goto L263;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentComponentHeaderView(@NotNull final String paymentComponentName, @Nullable String str, boolean z2, final boolean z10, @NotNull final Function0<Unit> onSelectPaymentComponent, final int i4, @NotNull final ComposeStyle style, @Nullable String str2, @Nullable InterfaceC0581m interfaceC0581m, final int i5, final int i10) {
        int i11;
        String str3;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        String str4;
        int i16;
        int i17;
        boolean z12;
        final String str5;
        final boolean z13;
        Q uniform;
        String str6;
        boolean z14;
        long j5;
        C0366t c0366t;
        boolean z15;
        C2549i c2549i;
        boolean z16;
        String str7;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Intrinsics.echo(paymentComponentName, "paymentComponentName");
        Intrinsics.echo(onSelectPaymentComponent, "onSelectPaymentComponent");
        Intrinsics.echo(style, "style");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(535669234);
        if ((i5 & 6) == 0) {
            if (c0585q.golf(paymentComponentName)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i11 = i22 | i5;
        } else {
            i11 = i5;
        }
        int i23 = i10 & 2;
        if (i23 != 0) {
            i11 |= 48;
        } else if ((i5 & 48) == 0) {
            str3 = str;
            if (c0585q.golf(str3)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
            i13 = i10 & 4;
            if (i13 == 0) {
                i11 |= 384;
            } else if ((i5 & 384) == 0) {
                z11 = z2;
                if (c0585q.hotel(z11)) {
                    i14 = Barcode.FORMAT_QR_CODE;
                } else {
                    i14 = 128;
                }
                i11 |= i14;
                if ((i5 & 3072) == 0) {
                    if (c0585q.hotel(z10)) {
                        i21 = 2048;
                    } else {
                        i21 = Barcode.FORMAT_UPC_E;
                    }
                    i11 |= i21;
                }
                if ((i5 & 24576) == 0) {
                    if (c0585q.india(onSelectPaymentComponent)) {
                        i20 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i20 = 8192;
                    }
                    i11 |= i20;
                }
                if ((196608 & i5) == 0) {
                    if (c0585q.echo(i4)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i11 |= i19;
                }
                if ((1572864 & i5) == 0) {
                    if (c0585q.golf(style)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i11 |= i18;
                }
                i15 = i10 & 128;
                if (i15 != 0) {
                    i11 |= 12582912;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i5 & 12582912) == 0) {
                        if (c0585q.golf(str4)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i11 |= i16;
                    }
                }
                i17 = i11;
                if ((i17 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0585q.magenta(i17 & 1, z12)) {
                    if (i23 != 0) {
                        str6 = null;
                    } else {
                        str6 = str3;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        str4 = null;
                    }
                    long m93getAction0d7_KjU = style.getComponentColors().m93getAction0d7_KjU();
                    long m96getPrimary0d7_KjU = style.getComponentColors().m96getPrimary0d7_KjU();
                    if (z10) {
                        j5 = m93getAction0d7_KjU;
                    } else {
                        j5 = m96getPrimary0d7_KjU;
                    }
                    an alpha = an.alpha(style.getSubHeadingTextStyle(), j5, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
                    an footNoteTextStyle = style.getFootNoteTextStyle();
                    C0366t c0366t2 = new C0366t(m96getPrimary0d7_KjU);
                    if (z14) {
                        c0366t = c0366t2;
                    } else {
                        c0366t = null;
                    }
                    j jVar = d.f2061d;
                    p pVar = p.alpha;
                    s charlie = V.charlie(pVar, 1.0f);
                    PaymentComponentHeaderConstants paymentComponentHeaderConstants = PaymentComponentHeaderConstants.INSTANCE;
                    s whiskey = AbstractC0538d.whiskey(charlie, 0.0f, paymentComponentHeaderConstants.m110getContainerPaddingD9Ej5fM(), paymentComponentHeaderConstants.m110getContainerPaddingD9Ej5fM(), paymentComponentHeaderConstants.m110getContainerPaddingD9Ej5fM(), 1);
                    int i24 = i17 & 57344;
                    if (i24 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    Object jade = c0585q.jade();
                    as asVar = C0580l.alpha;
                    if (z15 || jade == asVar) {
                        jade = new a(onSelectPaymentComponent, 3);
                        c0585q.f(jade);
                    }
                    s echo = androidx.compose.foundation.a.echo(15, whiskey, null, (Function0) jade, false);
                    S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
                    long j6 = c0585q.magenta;
                    int i25 = (int) (j6 ^ (j6 >>> 32));
                    I mike = c0585q.mike();
                    s charlie2 = T.a.charlie(echo, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C2549i c2549i2 = C2551k.foxtrot;
                    C0564b.blue(c2549i2, c0585q, alpha2);
                    C2549i c2549i3 = C2551k.echo;
                    C0564b.blue(c2549i3, c0585q, mike);
                    C2549i c2549i4 = C2551k.golf;
                    if (!c0585q.lime) {
                        c2549i = c2549i2;
                    } else {
                        c2549i = c2549i2;
                    }
                    ad.blue(i25, c0585q, i25, c2549i4);
                    C2549i c2549i5 = C2551k.delta;
                    C0564b.blue(c2549i5, c0585q, charlie2);
                    if (i24 == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    Object jade2 = c0585q.jade();
                    if (z16 || jade2 == asVar) {
                        jade2 = new a(onSelectPaymentComponent, 4);
                        c0585q.f(jade2);
                    }
                    C2549i c2549i6 = c2549i;
                    String str8 = str4;
                    InternalRadioButtonViewKt.m99InternalRadioButtonVieweaDK9VM(z10, (Function0) jade2, m93getAction0d7_KjU, m96getPrimary0d7_KjU, c0585q, (i17 >> 9) & 14, 0);
                    S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(paymentComponentHeaderConstants.m111getPaddingD9Ej5fM()), jVar, c0585q, 54);
                    long j7 = c0585q.magenta;
                    int i26 = (int) (j7 ^ (j7 >>> 32));
                    I mike2 = c0585q.mike();
                    s charlie3 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i6, c0585q, alpha3);
                    C0564b.blue(c2549i3, c0585q, mike2);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i26))) {
                        ad.blue(i26, c0585q, i26, c2549i4);
                    }
                    C0564b.blue(c2549i5, c0585q, charlie3);
                    InternalImageViewKt.m98InternalImageViewgKt5lHk(i4, paymentComponentName, c0366t, c0585q, ((i17 >> 15) & 14) | ((i17 << 3) & 112), 0);
                    C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(4), d.f2062f, c0585q, 6);
                    long j10 = c0585q.magenta;
                    int i27 = (int) (j10 ^ (j10 >>> 32));
                    I mike3 = c0585q.mike();
                    s charlie4 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i6, c0585q, alpha4);
                    C0564b.blue(c2549i3, c0585q, mike3);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i27))) {
                        ad.blue(i27, c0585q, i27, c2549i4);
                    }
                    C0564b.blue(c2549i5, c0585q, charlie4);
                    InternalTextLabelViewKt.InternalTextLabelView(paymentComponentName, null, alpha, str8, c0585q, (i17 & 14) | ((i17 >> 12) & 7168), 2);
                    str4 = str8;
                    c0585q = c0585q;
                    if (str6 == null) {
                        c0585q.purple(186552635);
                        c0585q.quebec(false);
                        str7 = str6;
                    } else {
                        c0585q.purple(186552636);
                        str7 = str6;
                        InternalTextLabelViewKt.InternalTextLabelView(str7, null, footNoteTextStyle, null, c0585q, 0, 10);
                        c0585q.quebec(false);
                    }
                    z.papa(c0585q, true, true, true);
                    str5 = str7;
                    z13 = z14;
                } else {
                    c0585q.ochre();
                    str5 = str3;
                    z13 = z11;
                }
                final String str9 = str4;
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new l() { // from class: G4.c
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            Unit a6;
                            int intValue = ((Integer) obj2).intValue();
                            String str10 = paymentComponentName;
                            Function0 function0 = onSelectPaymentComponent;
                            ComposeStyle composeStyle = style;
                            int i28 = i5;
                            int i29 = i10;
                            a6 = PaymentComponentHeaderViewKt.a(str10, str5, z13, z10, function0, i4, composeStyle, str9, i28, i29, (InterfaceC0581m) obj, intValue);
                            return a6;
                        }
                    };
                    return;
                }
                return;
            }
            z11 = z2;
            if ((i5 & 3072) == 0) {
            }
            if ((i5 & 24576) == 0) {
            }
            if ((196608 & i5) == 0) {
            }
            if ((1572864 & i5) == 0) {
            }
            i15 = i10 & 128;
            if (i15 != 0) {
            }
            i17 = i11;
            if ((i17 & 4793491) != 4793490) {
            }
            if (c0585q.magenta(i17 & 1, z12)) {
            }
            final String str92 = str4;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        str3 = str;
        i13 = i10 & 4;
        if (i13 == 0) {
        }
        z11 = z2;
        if ((i5 & 3072) == 0) {
        }
        if ((i5 & 24576) == 0) {
        }
        if ((196608 & i5) == 0) {
        }
        if ((1572864 & i5) == 0) {
        }
        i15 = i10 & 128;
        if (i15 != 0) {
        }
        i17 = i11;
        if ((i17 & 4793491) != 4793490) {
        }
        if (c0585q.magenta(i17 & 1, z12)) {
        }
        final String str922 = str4;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void PaymentComponentHeaderViewPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-26056779);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            String bravo = AbstractC3086y3.bravo(c0585q, R.string.cko_tamara_split_payments);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new h(5);
                c0585q.f(jade);
            }
            PaymentComponentHeaderView(RedirectDelegate.COMPONENT_NAME_TAMARA, bravo, false, true, (Function0) jade, com.checkout.components.ui.R.drawable.cko_ic_tamara, Fixtures.INSTANCE.getComposeStyle$core_standardRelease(), null, c0585q, 28038, 128);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 2);
        }
    }

    public static final Unit a(String str, String str2, boolean z2, boolean z10, Function0 function0, int i4, ComposeStyle composeStyle, String str3, int i5, int i10, InterfaceC0581m interfaceC0581m, int i11) {
        PaymentComponentHeaderView(str, str2, z2, z10, function0, i4, composeStyle, str3, interfaceC0581m, C0564b.cyan(i5 | 1), i10);
        return Unit.INSTANCE;
    }

    public static final Unit b(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        PaymentComponentHeaderViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
