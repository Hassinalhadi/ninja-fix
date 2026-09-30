package com.checkout.components.core.ui.content;

import F4.g;
import F4.h;
import P.e;
import T.a;
import T.d;
import T.p;
import T.s;
import Xd.l;
import androidx.compose.animation.b;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import bx.aa;
import com.checkout.components.core.common.Fixtures;
import com.checkout.components.core.ui.content.FlowComponentItemViewKt;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.core.utils.extension.ExtensionsKt;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.ui.utils.FlowAnimations;
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

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "paymentComponentName", "paymentComponentSubtitle", "", "shouldTintPaymentComponentIcon", "isPaymentComponentSelected", "Lkotlin/Function0;", "", "onSelectPaymentComponent", "paymentComponentUi", "", "paymentComponentIconId", "Lcom/checkout/components/core/ui/model/ComposeStyle;", "style", "testTag", "FlowComponentItemView", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;LXd/l;ILcom/checkout/components/core/ui/model/ComposeStyle;Ljava/lang/String;Landroidx/compose/runtime/m;II)V", "FlowComponentItemViewPreview", "(Landroidx/compose/runtime/m;I)V", "core_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowComponentItemViewKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowComponentItemView(@NotNull final String paymentComponentName, @Nullable String str, boolean z2, final boolean z10, @NotNull final Function0<Unit> onSelectPaymentComponent, @NotNull final l paymentComponentUi, final int i4, @NotNull final ComposeStyle style, @Nullable String str2, @Nullable InterfaceC0581m interfaceC0581m, final int i5, final int i10) {
        int i11;
        String str3;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        String str4;
        char c3;
        int i17;
        int i18;
        boolean z12;
        final String str5;
        final boolean z13;
        final String str6;
        Q uniform;
        String str7;
        boolean z14;
        String str8;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Intrinsics.echo(paymentComponentName, "paymentComponentName");
        Intrinsics.echo(onSelectPaymentComponent, "onSelectPaymentComponent");
        Intrinsics.echo(paymentComponentUi, "paymentComponentUi");
        Intrinsics.echo(style, "style");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1501532011);
        if ((i5 & 6) == 0) {
            if (c0585q.golf(paymentComponentName)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i11 = i24 | i5;
        } else {
            i11 = i5;
        }
        int i25 = i10 & 2;
        if (i25 != 0) {
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
                        i23 = 2048;
                    } else {
                        i23 = Barcode.FORMAT_UPC_E;
                    }
                    i11 |= i23;
                }
                if ((i5 & 24576) == 0) {
                    if (c0585q.india(onSelectPaymentComponent)) {
                        i22 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i22 = 8192;
                    }
                    i11 |= i22;
                }
                if ((196608 & i5) == 0) {
                    if (c0585q.india(paymentComponentUi)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i11 |= i21;
                }
                if ((1572864 & i5) == 0) {
                    i15 = i4;
                    if (c0585q.echo(i15)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i11 |= i20;
                } else {
                    i15 = i4;
                }
                if ((12582912 & i5) == 0) {
                    if (c0585q.golf(style)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i11 |= i19;
                }
                i16 = i10 & Barcode.FORMAT_QR_CODE;
                if (i16 != 0) {
                    str4 = str2;
                    i17 = i11 | 100663296;
                    c3 = ' ';
                } else {
                    str4 = str2;
                    c3 = ' ';
                    if ((i5 & 100663296) == 0) {
                        if (c0585q.golf(str4)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i11 |= i18;
                    }
                    i17 = i11;
                }
                if ((i17 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0585q.magenta(i17 & 1, z12)) {
                    String str9 = null;
                    if (i25 != 0) {
                        str7 = null;
                    } else {
                        str7 = null;
                        str9 = str3;
                    }
                    String str10 = str7;
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i16 != 0) {
                        str8 = str10;
                    } else {
                        str8 = str4;
                    }
                    p pVar = p.alpha;
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q, 0);
                    long j5 = c0585q.magenta;
                    int i26 = (int) (j5 ^ (j5 >>> c3));
                    I mike = c0585q.mike();
                    s charlie = a.charlie(pVar, c0585q);
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
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i26))) {
                        ad.blue(i26, c0585q, i26, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    int i27 = i17 >> 3;
                    PaymentComponentHeaderViewKt.PaymentComponentHeaderView(paymentComponentName, str9, z14, z10, onSelectPaymentComponent, i15, style, str8, c0585q, (i17 & 65534) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128), 0);
                    boolean z15 = z14;
                    FlowAnimations flowAnimations = FlowAnimations.INSTANCE;
                    b.charlie(z10, null, flowAnimations.getDefaultEnterTransition(), flowAnimations.getDefaultExitTransition(), null, e.echo(-2058370467, new Cb.d(4, paymentComponentUi), c0585q), c0585q, ((i17 >> 6) & 112) | 1572870, 18);
                    c0585q.quebec(true);
                    str5 = str8;
                    str6 = str9;
                    z13 = z15;
                } else {
                    c0585q.ochre();
                    boolean z16 = z11;
                    str5 = str4;
                    z13 = z16;
                    str6 = str3;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new l() { // from class: G4.a
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            Unit a6;
                            int intValue = ((Integer) obj2).intValue();
                            String str11 = paymentComponentName;
                            Function0 function0 = onSelectPaymentComponent;
                            l lVar = paymentComponentUi;
                            ComposeStyle composeStyle = style;
                            int i28 = i5;
                            int i29 = i10;
                            a6 = FlowComponentItemViewKt.a(str11, str6, z13, z10, function0, lVar, i4, composeStyle, str5, i28, i29, (InterfaceC0581m) obj, intValue);
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
            if ((12582912 & i5) == 0) {
            }
            i16 = i10 & Barcode.FORMAT_QR_CODE;
            if (i16 != 0) {
            }
            if ((i17 & 38347923) != 38347922) {
            }
            if (c0585q.magenta(i17 & 1, z12)) {
            }
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
        if ((12582912 & i5) == 0) {
        }
        i16 = i10 & Barcode.FORMAT_QR_CODE;
        if (i16 != 0) {
        }
        if ((i17 & 38347923) != 38347922) {
        }
        if (c0585q.magenta(i17 & 1, z12)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void FlowComponentItemViewPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-289574617);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new h(4);
                c0585q.f(jade);
            }
            FlowComponentItemView("Card", null, true, true, (Function0) jade, ComposableSingletons$FlowComponentItemViewKt.INSTANCE.getLambda$264259184$core_standardRelease(), ExtensionsKt.getPaymentMethodIcon(PaymentMethodName.INSTANCE.getGooglePay()), Fixtures.INSTANCE.getComposeStyle$core_standardRelease(), null, c0585q, 224694, Barcode.FORMAT_QR_CODE);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 1);
        }
    }

    public static final Unit a(String str, String str2, boolean z2, boolean z10, Function0 function0, l lVar, int i4, ComposeStyle composeStyle, String str3, int i5, int i10, InterfaceC0581m interfaceC0581m, int i11) {
        FlowComponentItemView(str, str2, z2, z10, function0, lVar, i4, composeStyle, str3, interfaceC0581m, C0564b.cyan(i5 | 1), i10);
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        FlowComponentItemViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(l lVar, aa AnimatedVisibility, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(AnimatedVisibility, "$this$AnimatedVisibility");
        PaymentComponentContainerViewKt.PaymentComponentContainerView(lVar, interfaceC0581m, 0);
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
