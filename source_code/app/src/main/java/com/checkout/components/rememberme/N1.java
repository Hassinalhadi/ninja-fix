package com.checkout.components.rememberme;

import F.AbstractC0127k2;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.N1;
import com.checkout.components.rememberme.model.WalletCvvViewState;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.utils.Constants;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.S3;

/* loaded from: classes3.dex */
public abstract class N1 {
    public static final Unit a(DesignTokens designTokens, CheckoutKMPRememberMe checkoutKMPRememberMe, String str, TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, ImageStyle imageStyle, List list, Function0 function0, TextLabelViewItem textLabelViewItem3, boolean z2, Function1 function1, WalletCvvViewState walletCvvViewState, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(designTokens, checkoutKMPRememberMe, str, textLabelViewItem, textLabelViewItem2, imageStyle, list, function0, textLabelViewItem3, z2, function1, walletCvvViewState, interfaceC0581m, C0564b.cyan(i4 | 1), C0564b.cyan(i5));
        return Unit.INSTANCE;
    }

    public static final void a(final DesignTokens designTokens, final CheckoutKMPRememberMe kmpRememberMe, final String selectedMethodId, final TextLabelViewItem logoutTextItem, final TextLabelViewItem emailItem, final ImageStyle overflowImageStyle, final List walletListItems, final Function0 onLogoutClick, final TextLabelViewItem defaultPaymentItem, final boolean z2, final Function1 onDefaultPaymentChanged, final WalletCvvViewState walletCvvViewState, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        final boolean z10;
        int i11;
        C0585q c0585q;
        Intrinsics.echo(kmpRememberMe, "kmpRememberMe");
        Intrinsics.echo(selectedMethodId, "selectedMethodId");
        Intrinsics.echo(logoutTextItem, "logoutTextItem");
        Intrinsics.echo(emailItem, "emailItem");
        Intrinsics.echo(overflowImageStyle, "overflowImageStyle");
        Intrinsics.echo(walletListItems, "walletListItems");
        Intrinsics.echo(onLogoutClick, "onLogoutClick");
        Intrinsics.echo(defaultPaymentItem, "defaultPaymentItem");
        Intrinsics.echo(onDefaultPaymentChanged, "onDefaultPaymentChanged");
        Intrinsics.echo(walletCvvViewState, "walletCvvViewState");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1687519049);
        if ((i4 & 6) == 0) {
            i10 = ((i4 & 8) == 0 ? c0585q2.golf(designTokens) : c0585q2.india(designTokens) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= (i4 & 64) == 0 ? c0585q2.golf(kmpRememberMe) : c0585q2.india(kmpRememberMe) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= c0585q2.golf(selectedMethodId) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= (i4 & 4096) == 0 ? c0585q2.golf(logoutTextItem) : c0585q2.india(logoutTextItem) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i10 |= (32768 & i4) == 0 ? c0585q2.golf(emailItem) : c0585q2.india(emailItem) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i10 |= (262144 & i4) == 0 ? c0585q2.golf(overflowImageStyle) : c0585q2.india(overflowImageStyle) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i10 |= c0585q2.india(walletListItems) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i10 |= c0585q2.india(onLogoutClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i10 |= (134217728 & i4) == 0 ? c0585q2.golf(defaultPaymentItem) : c0585q2.india(defaultPaymentItem) ? 67108864 : 33554432;
        }
        if ((805306368 & i4) == 0) {
            z10 = z2;
            i10 |= c0585q2.hotel(z10) ? 536870912 : 268435456;
        } else {
            z10 = z2;
        }
        if ((i5 & 6) == 0) {
            i11 = i5 | (c0585q2.india(onDefaultPaymentChanged) ? 4 : 2);
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            i11 |= (i5 & 64) == 0 ? c0585q2.golf(walletCvvViewState) : c0585q2.india(walletCvvViewState) ? 32 : 16;
        }
        int i12 = i10;
        if (c0585q2.magenta(i12 & 1, ((i12 & 306783379) == 306783378 && (i11 & 19) == 18) ? false : true)) {
            Utils utils = Utils.INSTANCE;
            c0585q = c0585q2;
            AbstractC0127k2.alpha(null, utils.toFormShape(designTokens), utils.m191toComposeColorvNxB06k(utils.backgroundColor(designTokens)), utils.m191toComposeColorvNxB06k(utils.primaryColor(designTokens)), 0.0f, 0.0f, S3.alpha(1, utils.m191toComposeColorvNxB06k(utils.borderColor(designTokens))), P.e.echo(941003172, new Xd.l() { // from class: a5.h
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    return N1.a(TextLabelViewItem.this, emailItem, overflowImageStyle, onLogoutClick, walletListItems, kmpRememberMe, selectedMethodId, designTokens, defaultPaymentItem, z10, onDefaultPaymentChanged, walletCvvViewState, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                }
            }, c0585q2), c0585q, 12582912, 49);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: a5.i
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    return N1.a(DesignTokens.this, kmpRememberMe, selectedMethodId, logoutTextItem, emailItem, overflowImageStyle, walletListItems, onLogoutClick, defaultPaymentItem, z2, onDefaultPaymentChanged, walletCvvViewState, i4, i5, (InterfaceC0581m) obj, intValue);
                }
            };
        }
    }

    public static final Unit a(TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, ImageStyle imageStyle, Function0 function0, List list, CheckoutKMPRememberMe checkoutKMPRememberMe, String str, DesignTokens designTokens, TextLabelViewItem textLabelViewItem3, boolean z2, Function1 function1, WalletCvvViewState walletCvvViewState, InterfaceC0581m interfaceC0581m, int i4) {
        String zulu;
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            T.p pVar = T.p.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(pVar, c0585q);
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
            int i10 = TextLabelViewItem.$stable;
            H1.a(textLabelViewItem, textLabelViewItem2, imageStyle, function0, c0585q, i10 | (i10 << 3) | (ImageStyle.$stable << 6));
            L1.a(c0585q, 0);
            c0585q.purple(-1509493879);
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                WalletListItem walletListItem = (WalletListItem) obj;
                if (Intrinsics.areEqual(walletListItem.getId(), Constants.ADD_CARD_ITEM_ID)) {
                    zulu = "rm_wallet_add_card";
                } else {
                    zulu = ad.zulu(i12, "rm_wallet_list_item_");
                }
                String str2 = zulu;
                boolean areEqual = Intrinsics.areEqual(str, walletListItem.getId());
                int i13 = DesignTokens.$stable;
                int i14 = ImageStyle.$stable;
                int i15 = TextLabelViewItem.$stable;
                C0585q c0585q2 = c0585q;
                M1.a(designTokens, walletListItem, areEqual, textLabelViewItem3, z2, function1, walletCvvViewState, str2, c0585q2, i13 | (((i14 | (((i14 | i15) | i15) | i15)) | i15) << 3) | (i15 << 9) | ((InputComponentViewStyle.$stable | InputComponentState.$stable) << 18), 0);
                c0585q = c0585q2;
                L1.a(c0585q, 0);
                i11 = i12;
            }
            c0585q.quebec(false);
            float f5 = 16;
            AbstractC0926a1.a(checkoutKMPRememberMe, AbstractC0538d.victor(pVar, 24, f5, f5, f5), c0585q, CheckoutKMPRememberMe.$stable | 48, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
