package com.checkout.components.rememberme;

import D0.an;
import N2.ae;
import Yb.C0312j0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import bx.InterfaceC0775m;
import bx.aa;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.M1;
import com.checkout.components.rememberme.model.WalletCvvViewState;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.utils.PreviewFixtures;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.checkout.components.ui.view.CheckboxLabelViewKt;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.checkout.components.ui.view.StyledImageViewKt;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.mlkit.vision.barcode.common.Barcode;
import h.AbstractC1797a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public abstract class M1 {
    public static final Unit a(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, CardScheme cardScheme, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(z2, z10, z11, z12, z13, cardScheme, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final Unit b(boolean z2) {
        return Unit.INSTANCE;
    }

    public static final Unit a(DesignTokens designTokens, WalletListItem walletListItem, boolean z2, TextLabelViewItem textLabelViewItem, boolean z10, Function1 function1, WalletCvvViewState walletCvvViewState, String str, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(designTokens, walletListItem, z2, textLabelViewItem, z10, function1, walletCvvViewState, str, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final DesignTokens designTokens, final WalletListItem item, final boolean z2, final TextLabelViewItem defaultPaymentItem, final boolean z10, final Function1 onDefaultPaymentChanged, final WalletCvvViewState walletCvvViewState, String str, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        String str2;
        int i11;
        C0585q c0585q;
        final String str3;
        androidx.compose.runtime.Q uniform;
        long primaryColor;
        Intrinsics.echo(item, "item");
        Intrinsics.echo(defaultPaymentItem, "defaultPaymentItem");
        Intrinsics.echo(onDefaultPaymentChanged, "onDefaultPaymentChanged");
        Intrinsics.echo(walletCvvViewState, "walletCvvViewState");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1810393022);
        if ((i4 & 6) == 0) {
            i10 = ((i4 & 8) == 0 ? c0585q2.golf(designTokens) : c0585q2.india(designTokens) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= (i4 & 64) == 0 ? c0585q2.golf(item) : c0585q2.india(item) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= c0585q2.hotel(z2) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= (i4 & 4096) == 0 ? c0585q2.golf(defaultPaymentItem) : c0585q2.india(defaultPaymentItem) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i10 |= c0585q2.hotel(z10) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i10 |= c0585q2.india(onDefaultPaymentChanged) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i10 |= (2097152 & i4) == 0 ? c0585q2.golf(walletCvvViewState) : c0585q2.india(walletCvvViewState) ? 1048576 : 524288;
        }
        int i12 = i5 & 128;
        if (i12 != 0) {
            i10 |= 12582912;
        } else if ((12582912 & i4) == 0) {
            str2 = str;
            i10 |= c0585q2.golf(str2) ? 8388608 : 4194304;
            i11 = i10;
            if (!c0585q2.magenta(i11 & 1, (4793491 & i11) == 4793490)) {
                String str4 = i12 != 0 ? null : str2;
                final boolean z11 = !item.isSupported() || item.isExpired();
                if (z2) {
                    primaryColor = Utils.INSTANCE.actionColor(designTokens);
                } else if (z11) {
                    primaryColor = Utils.INSTANCE.disabledColor(designTokens);
                } else {
                    primaryColor = Utils.INSTANCE.primaryColor(designTokens);
                }
                T.s sVar = T.p.alpha;
                if (z11) {
                    c0585q2.purple(396637882);
                    c0585q2.quebec(false);
                } else {
                    c0585q2.purple(396638633);
                    boolean india = c0585q2.india(item);
                    Object jade = c0585q2.jade();
                    if (india || jade == C0580l.alpha) {
                        jade = new C0312j0(4, item);
                        c0585q2.f(jade);
                    }
                    sVar = androidx.compose.foundation.a.echo(15, sVar, null, (Function0) jade, false);
                    c0585q2.quebec(false);
                }
                final long j5 = primaryColor;
                String str5 = str4;
                J1.a(sVar, str5, P.e.echo(-301792356, new Xd.l() { // from class: a5.f
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        int intValue = ((Integer) obj2).intValue();
                        return M1.a(WalletListItem.this, z2, item, z11, designTokens, j5, walletCvvViewState, defaultPaymentItem, z10, onDefaultPaymentChanged, (InterfaceC0581m) obj, intValue);
                    }
                }, c0585q2), c0585q2, ((i11 >> 18) & 112) | 384, 0);
                c0585q = c0585q2;
                str3 = str5;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                str3 = str2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new Xd.l() { // from class: a5.g
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        int intValue = ((Integer) obj2).intValue();
                        return M1.a(DesignTokens.this, item, z2, defaultPaymentItem, z10, onDefaultPaymentChanged, walletCvvViewState, str3, i4, i5, (InterfaceC0581m) obj, intValue);
                    }
                };
                return;
            }
            return;
        }
        str2 = str;
        i11 = i10;
        if (!c0585q2.magenta(i11 & 1, (4793491 & i11) == 4793490)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit a(WalletListItem walletListItem) {
        walletListItem.getOnClick().invoke();
        return Unit.INSTANCE;
    }

    public static final Unit a(WalletListItem walletListItem, boolean z2, final WalletListItem walletListItem2, boolean z10, final DesignTokens designTokens, long j5, WalletCvvViewState walletCvvViewState, final TextLabelViewItem textLabelViewItem, final boolean z11, final Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        an anVar;
        Utils utils;
        long j6;
        T.p pVar;
        boolean z12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            T.p pVar2 = T.p.alpha;
            T.s charlie = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
            long j7 = c0585q.magenta;
            int i5 = (int) (j7 ^ (j7 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a6 = AbstractC0987v.a(c2551k, c0585q, alpha, c0585q, mike);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                AbstractC0990w.a(i5, c0585q, i5, a6);
            }
            C2549i c2549i = C2551k.delta;
            C0564b.blue(c2549i, c0585q, charlie2);
            T.s whiskey = AbstractC0538d.whiskey(pVar2, 0.0f, 0.0f, 16, 0.0f, 11);
            Utils utils2 = Utils.INSTANCE;
            F.I1.alpha(z2, null, whiskey, !z10, F.K1.papa(utils2.m191toComposeColorvNxB06k(utils2.actionColor(designTokens)), utils2.m191toComposeColorvNxB06k(utils2.primaryColor(designTokens)), c0585q), c0585q, 432, 32);
            ImageStyle localScheme = walletListItem.getCardImageStyles().getLocalScheme();
            if (localScheme == null) {
                c0585q.purple(932926341);
                c0585q.quebec(false);
            } else {
                c0585q.purple(932926342);
                StyledImageViewKt.StyledImageView(localScheme, null, c0585q, ImageStyle.$stable, 2);
                AbstractC0538d.echo(androidx.compose.foundation.layout.V.oscar(pVar2, 4), c0585q);
                c0585q.quebec(false);
            }
            ImageStyle defaultScheme = walletListItem.getCardImageStyles().getDefaultScheme();
            int i10 = ImageStyle.$stable;
            StyledImageViewKt.StyledImageView(defaultScheme, null, c0585q, i10, 2);
            TextLabelViewStyle style = walletListItem.getTextLabelItem().getStyle();
            T.s modifier = walletListItem.getTextLabelItem().getStyle().getModifier();
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            T.s then = modifier.then(new LayoutWeightElement(1.0f, true));
            float f5 = 8;
            T.s whiskey2 = AbstractC0538d.whiskey(then, f5, 0.0f, 0.0f, 0.0f, 14);
            an style2 = walletListItem.getTextLabelItem().getStyle().getStyle();
            if (style2 == null) {
                anVar = new an(0L, 0L, null, null, null, 0L, 0, 0L, 0, 16777215);
                j6 = j5;
                utils = utils2;
            } else {
                anVar = style2;
                utils = utils2;
                j6 = j5;
            }
            TextLabelViewStyle m180copyQstMH_w$default = TextLabelViewStyle.m180copyQstMH_w$default(style, whiskey2, 0, false, 0, null, an.alpha(anVar, utils.m191toComposeColorvNxB06k(j6), 0L, null, null, 0L, 0, 0L, null, null, 16777214), false, 94, null);
            TextLabelState state = walletListItem.getTextLabelItem().getState();
            int i11 = TextLabelViewStyle.$stable | (TextLabelState.$stable << 3);
            TextLabelViewKt.TextLabelView(m180copyQstMH_w$default, state, c0585q, i11);
            if (walletListItem.isDefault()) {
                c0585q.purple(933609148);
                pVar = pVar2;
                K1.a(utils.m191toComposeColorvNxB06k(utils.borderColor(designTokens)), walletListItem.getDefaultLabelViewItem(), c0585q, TextLabelViewItem.$stable << 3);
            } else {
                pVar = pVar2;
                c0585q.purple(929065354);
            }
            c0585q.quebec(false);
            if (walletListItem.isExpired()) {
                c0585q.purple(933842237);
                K1.a(utils.m191toComposeColorvNxB06k(utils.errorColor(designTokens)), walletListItem.getExpiredLabelViewItem(), c0585q, TextLabelViewItem.$stable << 3);
            } else {
                c0585q.purple(929065354);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
            if (!walletListItem.isSupported()) {
                c0585q.purple(-1327746922);
                T.s whiskey3 = AbstractC0538d.whiskey(pVar, 0.0f, 24, 0.0f, 0.0f, 13);
                androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f5), jVar, c0585q, 54);
                long j10 = c0585q.magenta;
                int i12 = (int) (j10 ^ (j10 >>> 32));
                androidx.compose.runtime.I mike2 = c0585q.mike();
                T.s charlie3 = T.a.charlie(whiskey3, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                Xd.l a8 = AbstractC0987v.a(c2551k, c0585q, alpha2, c0585q, mike2);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                    AbstractC0990w.a(i12, c0585q, i12, a8);
                }
                C0564b.blue(c2549i, c0585q, charlie3);
                StyledImageViewKt.StyledImageView(walletListItem.getInfoImageStyle(), null, c0585q, i10, 2);
                TextLabelViewKt.TextLabelView(walletListItem.getInfoLabelItem().getStyle(), walletListItem.getInfoLabelItem().getState(), c0585q, i11);
                z12 = true;
                c0585q.quebec(true);
            } else {
                z12 = true;
                c0585q.purple(-1332769914);
            }
            c0585q.quebec(false);
            androidx.compose.animation.b.delta((z2 && walletListItem2.getShowCvvInputField()) ? z12 : false, null, null, null, null, P.e.echo(1995644868, new Cb.d(10, walletCvvViewState), c0585q), c0585q, 196608);
            androidx.compose.animation.a.bravo(Boolean.valueOf((!z2 || walletListItem2.getContent() == null) ? false : z12), null, null, null, null, null, P.e.echo(988674169, new Xd.n() { // from class: a5.e
                @Override // Xd.n
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj4).intValue();
                    return M1.a(WalletListItem.this, textLabelViewItem, designTokens, z11, function1, (InterfaceC0775m) obj, ((Boolean) obj2).booleanValue(), (InterfaceC0581m) obj3, intValue);
                }
            }, c0585q), c0585q, 1572864, 62);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(WalletCvvViewState walletCvvViewState, aa AnimatedVisibility, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(AnimatedVisibility, "$this$AnimatedVisibility");
        T.s whiskey = AbstractC0538d.whiskey(T.p.alpha, 0.0f, 16, 0.0f, 0.0f, 13);
        C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, interfaceC0581m, 0);
        C0585q c0585q = (C0585q) interfaceC0581m;
        long j5 = c0585q.magenta;
        int i5 = (int) (j5 ^ (j5 >>> 32));
        androidx.compose.runtime.I mike = c0585q.mike();
        T.s charlie = T.a.charlie(whiskey, interfaceC0581m);
        C2551k c2551k = InterfaceC2552l.maroon;
        c2551k.getClass();
        C2550j c2550j = C2551k.bravo;
        C1298c c1298c = c0585q.alpha;
        c0585q.white();
        if (c0585q.lime) {
            c0585q.lima(c2550j);
        } else {
            c0585q.i();
        }
        Xd.l a6 = AbstractC0987v.a(c2551k, interfaceC0581m, alpha, interfaceC0581m, mike);
        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
            AbstractC0990w.a(i5, interfaceC0581m, i5, a6);
        }
        C0564b.blue(C2551k.delta, interfaceC0581m, charlie);
        InputContainerViewKt.InputComponentContainerView(walletCvvViewState.getStyle(), walletCvvViewState.getState(), walletCvvViewState.getOnValueChange(), walletCvvViewState.getOnFocusChanged(), "rm_wallet_cvv_input", interfaceC0581m, InputComponentViewStyle.$stable | 24576 | (InputComponentState.$stable << 3), 0);
        c0585q.quebec(true);
        return Unit.INSTANCE;
    }

    public static final Unit a(WalletListItem walletListItem, TextLabelViewItem textLabelViewItem, DesignTokens designTokens, boolean z2, Function1 function1, InterfaceC0775m AnimatedContent, boolean z10, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(AnimatedContent, "$this$AnimatedContent");
        if (z10) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            c0585q.purple(-1293472174);
            T.p pVar = T.p.alpha;
            float f5 = 16;
            T.s whiskey = AbstractC0538d.whiskey(pVar, 0.0f, f5, 0.0f, 0.0f, 13);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(whiskey, c0585q);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a6 = AbstractC0987v.a(c2551k, c0585q, alpha, c0585q, mike);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                AbstractC0990w.a(i5, c0585q, i5, a6);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            Xd.l content = walletListItem.getContent();
            if (content == null) {
                c0585q.purple(279115599);
            } else {
                c0585q.purple(1117382386);
                content.invoke(c0585q, 0);
            }
            c0585q.quebec(false);
            boolean golf = c0585q.golf(textLabelViewItem);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (golf || jade == asVar) {
                TextLabelViewStyle style = textLabelViewItem.getStyle();
                T.s whiskey2 = AbstractC0538d.whiskey(textLabelViewItem.getStyle().getModifier(), 0.0f, 0.0f, f5, 0.0f, 11);
                f5 = f5;
                jade = TextLabelViewItem.copy$default(textLabelViewItem, TextLabelViewStyle.m180copyQstMH_w$default(style, whiskey2, 0, false, 0, null, null, false, 126, null), null, 2, null);
                c0585q.f(jade);
            }
            TextLabelViewItem textLabelViewItem2 = (TextLabelViewItem) jade;
            T.s whiskey3 = AbstractC0538d.whiskey(pVar, 0.0f, f5, 0.0f, 0.0f, 13);
            boolean golf2 = c0585q.golf(function1);
            Object jade2 = c0585q.jade();
            if (golf2 || jade2 == asVar) {
                jade2 = new ae(5, function1);
                c0585q.f(jade2);
            }
            CheckboxLabelViewKt.CheckboxLabelView(designTokens, textLabelViewItem2, z2, (Function1) jade2, whiskey3, "rm_set_default_card_checkbox", c0585q, DesignTokens.$stable | 221184 | (TextLabelViewItem.$stable << 3), 0);
            c0585q.quebec(true);
            c0585q.quebec(false);
        } else {
            C0585q c0585q2 = (C0585q) interfaceC0581m;
            c0585q2.purple(-1299552855);
            c0585q2.quebec(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Function1 function1, boolean z2) {
        function1.invoke(Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, CardScheme cardScheme, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        boolean z14;
        int i10;
        boolean z15;
        int i11;
        boolean z16;
        int i12;
        int i13;
        boolean z17;
        int i14;
        C0585q c0585q;
        final boolean z18;
        final CardScheme cardScheme2;
        final boolean z19;
        final boolean z20;
        final boolean z21;
        final boolean z22;
        androidx.compose.runtime.Q uniform;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1116784985);
        int i15 = i5 & 1;
        if (i15 != 0) {
            i10 = i4 | 6;
            z14 = z2;
        } else if ((i4 & 6) == 0) {
            z14 = z2;
            i10 = (c0585q2.hotel(z14) ? 4 : 2) | i4;
        } else {
            z14 = z2;
            i10 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            z15 = z10;
            i10 |= c0585q2.hotel(z15) ? 32 : 16;
            i11 = i5 & 4;
            if (i11 == 0) {
                i10 |= 384;
            } else if ((i4 & 384) == 0) {
                z16 = z11;
                i10 |= c0585q2.hotel(z16) ? Barcode.FORMAT_QR_CODE : 128;
                i12 = i5 & 8;
                if (i12 != 0) {
                    i10 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    i10 |= c0585q2.hotel(z12) ? 2048 : Barcode.FORMAT_UPC_E;
                    i13 = i5 & 16;
                    if (i13 == 0) {
                        i10 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        z17 = z13;
                        i10 |= c0585q2.hotel(z17) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                        i14 = i5 & 32;
                        int i17 = 196608;
                        if (i14 == 0) {
                            if ((196608 & i4) == 0) {
                                i17 = c0585q2.echo(cardScheme == null ? -1 : cardScheme.ordinal()) ? 131072 : 65536;
                            }
                            if (!c0585q2.magenta(i10 & 1, (74899 & i10) == 74898)) {
                                boolean z23 = i15 != 0 ? false : z14;
                                boolean z24 = i16 != 0 ? false : z15;
                                boolean z25 = i11 != 0 ? true : z16;
                                boolean z26 = i12 != 0 ? false : z12;
                                boolean z27 = i13 != 0 ? false : z17;
                                CardScheme cardScheme3 = i14 != 0 ? CardScheme.VISA : cardScheme;
                                PreviewFixtures previewFixtures = PreviewFixtures.INSTANCE;
                                WalletListItem createWalletListItem$default = PreviewFixtures.createWalletListItem$default(previewFixtures, "preview", z24, z25, z26, z27, cardScheme3, false, null, 192, null);
                                TextLabelViewItem emailItem = previewFixtures.getEmailItem();
                                Object jade = c0585q2.jade();
                                as asVar = C0580l.alpha;
                                if (jade == asVar) {
                                    jade = new a5.c(0);
                                    c0585q2.f(jade);
                                }
                                Function1 function1 = (Function1) jade;
                                InputComponentState inputComponentState = new InputComponentState(null, null, 3, null);
                                InputComponentViewStyle inputComponentViewStyle = new InputComponentViewStyle(null, null, null, 7, null);
                                Object jade2 = c0585q2.jade();
                                if (jade2 == asVar) {
                                    jade2 = new a5.c(1);
                                    c0585q2.f(jade2);
                                }
                                Function1 function12 = (Function1) jade2;
                                Object jade3 = c0585q2.jade();
                                if (jade3 == asVar) {
                                    jade3 = new a5.c(2);
                                    c0585q2.f(jade3);
                                }
                                WalletCvvViewState walletCvvViewState = new WalletCvvViewState(inputComponentViewStyle, inputComponentState, function12, (Function1) jade3);
                                int i18 = ImageStyle.$stable;
                                int i19 = TextLabelViewItem.$stable;
                                c0585q = c0585q2;
                                a(null, createWalletListItem$default, z23, emailItem, false, function1, walletCvvViewState, null, c0585q, (((i18 | (((i18 | i19) | i19) | i19)) | i19) << 3) | 221190 | ((i10 << 6) & 896) | (i19 << 9) | ((InputComponentViewStyle.$stable | InputComponentState.$stable) << 18), 128);
                                z19 = z23;
                                z20 = z24;
                                z21 = z25;
                                z18 = z26;
                                z22 = z27;
                                cardScheme2 = cardScheme3;
                            } else {
                                c0585q = c0585q2;
                                c0585q.ochre();
                                z18 = z12;
                                cardScheme2 = cardScheme;
                                z19 = z14;
                                z20 = z15;
                                z21 = z16;
                                z22 = z17;
                            }
                            uniform = c0585q.uniform();
                            if (uniform == null) {
                                uniform.delta = new Xd.l() { // from class: a5.d
                                    @Override // Xd.l
                                    public final Object invoke(Object obj, Object obj2) {
                                        int intValue = ((Integer) obj2).intValue();
                                        return M1.a(z19, z20, z21, z18, z22, cardScheme2, i4, i5, (InterfaceC0581m) obj, intValue);
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i10 |= i17;
                        if (!c0585q2.magenta(i10 & 1, (74899 & i10) == 74898)) {
                        }
                        uniform = c0585q.uniform();
                        if (uniform == null) {
                        }
                    }
                    z17 = z13;
                    i14 = i5 & 32;
                    int i172 = 196608;
                    if (i14 == 0) {
                    }
                    i10 |= i172;
                    if (!c0585q2.magenta(i10 & 1, (74899 & i10) == 74898)) {
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                    }
                }
                i13 = i5 & 16;
                if (i13 == 0) {
                }
                z17 = z13;
                i14 = i5 & 32;
                int i1722 = 196608;
                if (i14 == 0) {
                }
                i10 |= i1722;
                if (!c0585q2.magenta(i10 & 1, (74899 & i10) == 74898)) {
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            z16 = z11;
            i12 = i5 & 8;
            if (i12 != 0) {
            }
            i13 = i5 & 16;
            if (i13 == 0) {
            }
            z17 = z13;
            i14 = i5 & 32;
            int i17222 = 196608;
            if (i14 == 0) {
            }
            i10 |= i17222;
            if (!c0585q2.magenta(i10 & 1, (74899 & i10) == 74898)) {
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        z15 = z10;
        i11 = i5 & 4;
        if (i11 == 0) {
        }
        z16 = z11;
        i12 = i5 & 8;
        if (i12 != 0) {
        }
        i13 = i5 & 16;
        if (i13 == 0) {
        }
        z17 = z13;
        i14 = i5 & 32;
        int i172222 = 196608;
        if (i14 == 0) {
        }
        i10 |= i172222;
        if (!c0585q2.magenta(i10 & 1, (74899 & i10) == 74898)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit a(boolean z2) {
        return Unit.INSTANCE;
    }

    public static final Unit a(String it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }
}
