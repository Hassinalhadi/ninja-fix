package com.checkout.components.ui.view;

import A2.ai;
import Ac.h;
import B9.ab;
import Cb.a;
import F.AbstractC0127k2;
import F.AbstractC0141o0;
import F.K1;
import F.M2;
import F.P2;
import F.Q2;
import F.ag;
import P.d;
import P.e;
import T.p;
import Xd.l;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.kmp.rememberme.view.otp.c;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.checkout.components.ui.view.ScreenHeaderViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.C1726f;
import h5.C1809a;
import k5.C2013f;
import k5.C2015h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0085\u0001\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/ui/model/state/TextLabelState;", "state", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "style", "Lg0/f;", "navigationIcon", "", "navigationIconContentDescription", "Lkotlin/Function0;", "", "onNavigationIconClick", "actionIcon", "actionIconContentDescription", "onActionIconClick", "LF/Q2;", "scrollBehavior", "", "isScrolledContainerColorChanged", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "screenHeaderStyle", "ScreenHeaderView", "(Lcom/checkout/components/ui/model/state/TextLabelState;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lg0/f;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lg0/f;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LF/Q2;ZLcom/checkout/components/ui/model/TopAppBarViewStyle;Landroidx/compose/runtime/m;III)V", "ScreenHeaderViewPreview", "(Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenHeaderViewKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenHeaderView(@NotNull final TextLabelState state, @NotNull final TextLabelViewStyle style, @Nullable C1726f c1726f, @Nullable String str, @Nullable Function0<Unit> function0, @Nullable C1726f c1726f2, @Nullable String str2, @Nullable Function0<Unit> function02, @NotNull final Q2 scrollBehavior, boolean z2, @NotNull final TopAppBarViewStyle screenHeaderStyle, @Nullable InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10) {
        int i11;
        C1726f c1726f3;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        Function0<Unit> function03;
        int i16;
        int i17;
        C1726f c1726f4;
        int i18;
        int i19;
        String str3;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z11;
        final String str4;
        final Function0<Unit> function04;
        final String str5;
        final C1726f c1726f5;
        final Function0<Unit> function05;
        final boolean z12;
        Q uniform;
        C1726f c1726f6;
        String str6;
        Function0<Unit> function06;
        Function0<Unit> function07;
        boolean z13;
        long m191toComposeColorvNxB06k;
        boolean india;
        int i27;
        int i28;
        int i29;
        int i30;
        Intrinsics.echo(state, "state");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(scrollBehavior, "scrollBehavior");
        Intrinsics.echo(screenHeaderStyle, "screenHeaderStyle");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1498677704);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(state)) {
                i30 = 4;
            } else {
                i30 = 2;
            }
            i11 = i30 | i4;
        } else {
            i11 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(style)) {
                i29 = 32;
            } else {
                i29 = 16;
            }
            i11 |= i29;
        }
        int i31 = i10 & 4;
        if (i31 != 0) {
            i11 |= 384;
        } else if ((i4 & 384) == 0) {
            c1726f3 = c1726f;
            if (c0585q.golf(c1726f3)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i11 |= i12;
            i13 = i10 & 8;
            if (i13 == 0) {
                i11 |= 3072;
                z10 = true;
            } else {
                z10 = true;
                if ((i4 & 3072) == 0) {
                    if (c0585q.golf(str)) {
                        i14 = 2048;
                    } else {
                        i14 = Barcode.FORMAT_UPC_E;
                    }
                    i11 |= i14;
                }
            }
            i15 = 16 & i10;
            if (i15 == 0) {
                i11 |= 24576;
                function03 = function0;
            } else if ((i4 & 24576) == 0) {
                function03 = function0;
                if (c0585q.india(function03)) {
                    i16 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i16 = 8192;
                }
                i11 |= i16;
            } else {
                function03 = function0;
            }
            i17 = i10 & 32;
            if (i17 == 0) {
                i11 |= 196608;
                c1726f4 = c1726f2;
            } else {
                c1726f4 = c1726f2;
                if ((i4 & 196608) == 0) {
                    if (c0585q.golf(c1726f4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i11 |= i18;
                }
            }
            i19 = i10 & 64;
            if (i19 == 0) {
                i11 |= 1572864;
                str3 = str2;
            } else {
                str3 = str2;
                if ((i4 & 1572864) == 0) {
                    if (c0585q.golf(str3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i11 |= i20;
                }
            }
            i21 = 128 & i10;
            if (i21 == 0) {
                i11 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                if (c0585q.india(function02)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i11 |= i22;
            }
            if ((i4 & 100663296) == 0) {
                if (c0585q.golf(scrollBehavior)) {
                    i28 = 67108864;
                } else {
                    i28 = 33554432;
                }
                i11 |= i28;
            }
            i23 = i10 & 512;
            if (i23 == 0) {
                i11 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                i24 = i23;
                if (c0585q.hotel(z2)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i11 |= i25;
                if ((i5 & 6) == 0) {
                    if ((i5 & 8) == 0) {
                        india = c0585q.golf(screenHeaderStyle);
                    } else {
                        india = c0585q.india(screenHeaderStyle);
                    }
                    if (india) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i5 | i27;
                } else {
                    i26 = i5;
                }
                if ((i11 & 306783379) != 306783378 && (i26 & 3) == 2) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if (c0585q.magenta(i11 & 1, z11)) {
                    if (i31 != 0) {
                        c1726f6 = null;
                    } else {
                        c1726f6 = c1726f3;
                    }
                    if (i13 != 0) {
                        str6 = "";
                    } else {
                        str6 = str;
                    }
                    as asVar = C0580l.alpha;
                    if (i15 != 0) {
                        Object jade = c0585q.jade();
                        if (jade == asVar) {
                            jade = new C1809a(11);
                            c0585q.f(jade);
                        }
                        function06 = (Function0) jade;
                    } else {
                        function06 = function03;
                    }
                    if (i17 != 0) {
                        c1726f4 = null;
                    }
                    if (i19 != 0) {
                        str3 = "";
                    }
                    if (i21 != 0) {
                        Object jade2 = c0585q.jade();
                        if (jade2 == asVar) {
                            jade2 = new C1809a(12);
                            c0585q.f(jade2);
                        }
                        function07 = (Function0) jade2;
                    } else {
                        function07 = function02;
                    }
                    if (i24 != 0) {
                        z13 = z10;
                    } else {
                        z13 = z2;
                    }
                    float f5 = P2.alpha;
                    Utils utils = Utils.INSTANCE;
                    Function0<Unit> function08 = function06;
                    long m191toComposeColorvNxB06k2 = utils.m191toComposeColorvNxB06k(screenHeaderStyle.getContainerColor());
                    if (z13) {
                        m191toComposeColorvNxB06k = utils.m191toComposeColorvNxB06k(screenHeaderStyle.getScrolledContainerColor());
                    } else {
                        m191toComposeColorvNxB06k = utils.m191toComposeColorvNxB06k(screenHeaderStyle.getContainerColor());
                    }
                    M2 delta = P2.delta(m191toComposeColorvNxB06k2, m191toComposeColorvNxB06k, 0L, c0585q, 28);
                    d echo = e.echo(1622691151, new a(29, style, state), c0585q);
                    C1726f c1726f7 = c1726f6;
                    String str7 = str6;
                    c1726f3 = c1726f7;
                    d echo2 = e.echo(1350636557, new h(c1726f7, function08, str7, screenHeaderStyle, 11), c0585q);
                    Function0<Unit> function09 = function07;
                    String str8 = str3;
                    C1726f c1726f8 = c1726f4;
                    ag.bravo(echo, null, echo2, e.echo(-116550972, new Ac.d(c1726f8, function09, str8, screenHeaderStyle, 8), c0585q), 0.0f, 0.0f, null, delta, scrollBehavior, c0585q, (i11 & 234881024) | 3462);
                    c1726f5 = c1726f8;
                    str4 = str7;
                    function04 = function08;
                    str5 = str8;
                    function05 = function09;
                    z12 = z13;
                } else {
                    c0585q.ochre();
                    str4 = str;
                    function04 = function03;
                    str5 = str3;
                    c1726f5 = c1726f4;
                    function05 = function02;
                    z12 = z2;
                }
                final C1726f c1726f9 = c1726f3;
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new l() { // from class: k5.g
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ScreenHeaderView$lambda$11;
                            int intValue = ((Integer) obj2).intValue();
                            TextLabelState textLabelState = TextLabelState.this;
                            TextLabelViewStyle textLabelViewStyle = style;
                            Q2 q22 = scrollBehavior;
                            TopAppBarViewStyle topAppBarViewStyle = screenHeaderStyle;
                            int i32 = i5;
                            int i33 = i10;
                            ScreenHeaderView$lambda$11 = ScreenHeaderViewKt.ScreenHeaderView$lambda$11(textLabelState, textLabelViewStyle, c1726f9, str4, function04, c1726f5, str5, function05, q22, z12, topAppBarViewStyle, i4, i32, i33, (InterfaceC0581m) obj, intValue);
                            return ScreenHeaderView$lambda$11;
                        }
                    };
                    return;
                }
                return;
            }
            i24 = i23;
            if ((i5 & 6) == 0) {
            }
            if ((i11 & 306783379) != 306783378) {
            }
            z11 = z10;
            if (c0585q.magenta(i11 & 1, z11)) {
            }
            final C1726f c1726f92 = c1726f3;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        c1726f3 = c1726f;
        i13 = i10 & 8;
        if (i13 == 0) {
        }
        i15 = 16 & i10;
        if (i15 == 0) {
        }
        i17 = i10 & 32;
        if (i17 == 0) {
        }
        i19 = i10 & 64;
        if (i19 == 0) {
        }
        i21 = 128 & i10;
        if (i21 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i23 = i10 & 512;
        if (i23 == 0) {
        }
        i24 = i23;
        if ((i5 & 6) == 0) {
        }
        if ((i11 & 306783379) != 306783378) {
        }
        z11 = z10;
        if (c0585q.magenta(i11 & 1, z11)) {
        }
        final C1726f c1726f922 = c1726f3;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final Unit ScreenHeaderView$lambda$10(C1726f c1726f, Function0 function0, String str, TopAppBarViewStyle topAppBarViewStyle, T MediumTopAppBar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(MediumTopAppBar, "$this$MediumTopAppBar");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            if (c1726f == null) {
                c0585q.purple(-1836392313);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-1836392312);
                K1.foxtrot(function0, null, false, null, e.echo(1789081018, new C2013f(str, topAppBarViewStyle, c1726f, 1), c0585q), c0585q, 196608, 30);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ScreenHeaderView$lambda$10$lambda$9$lambda$8(String str, TopAppBarViewStyle topAppBarViewStyle, C1726f c1726f, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0141o0.bravo(c1726f, str, androidx.compose.ui.platform.a.alpha(p.alpha, str), Utils.INSTANCE.m191toComposeColorvNxB06k(topAppBarViewStyle.getActionIconTintColor()), c0585q, 0, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ScreenHeaderView$lambda$11(TextLabelState textLabelState, TextLabelViewStyle textLabelViewStyle, C1726f c1726f, String str, Function0 function0, C1726f c1726f2, String str2, Function0 function02, Q2 q22, boolean z2, TopAppBarViewStyle topAppBarViewStyle, int i4, int i5, int i10, InterfaceC0581m interfaceC0581m, int i11) {
        ScreenHeaderView(textLabelState, textLabelViewStyle, c1726f, str, function0, c1726f2, str2, function02, q22, z2, topAppBarViewStyle, interfaceC0581m, C0564b.cyan(i4 | 1), C0564b.cyan(i5), i10);
        return Unit.INSTANCE;
    }

    public static final Unit ScreenHeaderView$lambda$4(TextLabelViewStyle textLabelViewStyle, TextLabelState textLabelState, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            TextLabelViewKt.TextLabelView(textLabelViewStyle, textLabelState, c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ScreenHeaderView$lambda$7(C1726f c1726f, Function0 function0, String str, TopAppBarViewStyle topAppBarViewStyle, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            if (c1726f == null) {
                c0585q.purple(1560084618);
                c0585q.quebec(false);
            } else {
                c0585q.purple(1560084619);
                K1.foxtrot(function0, null, false, null, e.echo(1293427799, new C2013f(str, topAppBarViewStyle, c1726f, 0), c0585q), c0585q, 196608, 30);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ScreenHeaderView$lambda$7$lambda$6$lambda$5(String str, TopAppBarViewStyle topAppBarViewStyle, C1726f c1726f, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0141o0.bravo(c1726f, str, androidx.compose.ui.platform.a.alpha(p.alpha, str), Utils.INSTANCE.m191toComposeColorvNxB06k(topAppBarViewStyle.getNavigationIconTintColor()), c0585q, 0, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    private static final void ScreenHeaderViewPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(335208132);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(1 & i4, z2)) {
            float f5 = P2.alpha;
            ab bravo = P2.bravo(ag.hotel(c0585q), c0585q);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = C0564b.zulu("Adding billing address");
                c0585q.f(jade);
            }
            AbstractC0127k2.alpha(AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(p.alpha, C0366t.echo, ao.alpha), 24).then(V.charlie), null, 0L, 0L, 0.0f, 0.0f, null, e.echo(-613708151, new C2015h(0, (ax) jade, bravo), c0585q), c0585q, 12582918, 126);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(i4, 14);
        }
    }

    public static final Unit ScreenHeaderViewPreview$lambda$13(ax axVar, Q2 q22, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            ScreenHeaderView(new TextLabelState(axVar, null, null, 6, null), new TextLabelViewStyle(null, 0, false, 0, null, null, false, 127, null), ai.charlie(), null, null, AbstractC2056a.alpha(), null, null, q22, false, new TopAppBarViewStyle(null, 0L, 0L, 0L, 0L, 31, null), c0585q, 0, FontFamily.$stable, 728);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ScreenHeaderViewPreview$lambda$14(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ScreenHeaderViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
