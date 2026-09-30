package com.checkout.components.rememberme.wallet;

import F.AbstractC0127k2;
import P.b;
import P.d;
import T.p;
import Xd.l;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.N1;
import com.checkout.components.rememberme.model.WalletCvvViewState;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.utils.PreviewFixtures;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.clevertap.android.sdk.inapp.images.preload.a;
import g4.C1752a;
import h5.C1809a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$WalletListViewKt {

    @NotNull
    public static final ComposableSingletons$WalletListViewKt INSTANCE = new ComposableSingletons$WalletListViewKt();

    /* renamed from: a */
    private static final b f6367a = new d(new C1752a(9), 985666312, false);

    /* renamed from: b */
    private static final b f6368b = new d(new C1752a(10), 1501098413, false);

    public static final Unit a(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            AbstractC0127k2.alpha(AbstractC0538d.sierra(p.alpha, 16), null, 0L, 0L, 0.0f, 0.0f, null, f6367a, c0585q, 12582918, 126);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            PreviewFixtures previewFixtures = PreviewFixtures.INSTANCE;
            CheckoutKMPRememberMe previewKmpRememberMe = previewFixtures.getPreviewKmpRememberMe();
            TextLabelViewItem emailItem = previewFixtures.getEmailItem();
            TextLabelViewItem emailItem2 = previewFixtures.getEmailItem();
            ImageStyle overflowImageStyle = previewFixtures.getOverflowImageStyle();
            List<WalletListItem> walletListItems = previewFixtures.getWalletListItems();
            TextLabelViewItem emailItem3 = previewFixtures.getEmailItem();
            InputComponentState inputComponentState = new InputComponentState(null, null, 3, null);
            InputComponentViewStyle inputComponentViewStyle = new InputComponentViewStyle(null, null, null, 7, null);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new a(26);
                c0585q.f(jade);
            }
            Function1 function1 = (Function1) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new a(27);
                c0585q.f(jade2);
            }
            WalletCvvViewState walletCvvViewState = new WalletCvvViewState(inputComponentViewStyle, inputComponentState, function1, (Function1) jade2);
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new C1809a(0);
                c0585q.f(jade3);
            }
            Function0 function0 = (Function0) jade3;
            Object jade4 = c0585q.jade();
            if (jade4 == asVar) {
                jade4 = new a(28);
                c0585q.f(jade4);
            }
            Function1 function12 = (Function1) jade4;
            int i5 = (CheckoutKMPRememberMe.$stable << 3) | 817889670;
            int i10 = TextLabelViewItem.$stable;
            N1.a(null, previewKmpRememberMe, "1", emailItem, emailItem2, overflowImageStyle, walletListItems, function0, emailItem3, false, function12, walletCvvViewState, c0585q, i5 | (i10 << 9) | (i10 << 12) | (ImageStyle.$stable << 15) | (i10 << 24), ((InputComponentViewStyle.$stable | InputComponentState.$stable) << 3) | 6);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final l getLambda$1501098413$rememberme_standardRelease() {
        return f6368b;
    }

    @NotNull
    public final l getLambda$985666312$rememberme_standardRelease() {
        return f6367a;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(String str) {
        Intrinsics.echo(str, "<unused var>");
        return Unit.INSTANCE;
    }

    public static final Unit a(boolean z2) {
        return Unit.INSTANCE;
    }

    public static final Unit b(boolean z2) {
        return Unit.INSTANCE;
    }
}
