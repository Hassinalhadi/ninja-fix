package com.checkout.components.card.ui.component.errorlabel;

import T.d;
import T.p;
import T.s;
import T1.c;
import U1.a;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.d0;
import ao.ad;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.F7;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/card/di/base/Injector;", "injector", "", Constants.KEY_KEY, "", "ErrorLabelView", "(Lcom/checkout/components/card/di/base/Injector;Ljava/lang/String;Landroidx/compose/runtime/m;I)V", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorLabelViewKt {
    public static final void ErrorLabelView(@NotNull Injector injector, @NotNull String key, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        c cVar;
        int i10;
        boolean india;
        int i11;
        Intrinsics.echo(injector, "injector");
        Intrinsics.echo(key, "key");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(520531403);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q.golf(injector);
            } else {
                india = c0585q.india(injector);
            }
            if (india) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(key)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            ErrorLabelViewModel.ErrorLabelViewModelFactory errorLabelViewModelFactory = new ErrorLabelViewModel.ErrorLabelViewModelFactory(injector);
            String concat = "ErrorLabelViewModel-".concat(key);
            d0 alpha = a.alpha(c0585q);
            if (alpha != null) {
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                ErrorLabelViewModel errorLabelViewModel = (ErrorLabelViewModel) F7.bravo(u.alpha.bravo(ErrorLabelViewModel.class), alpha, concat, errorLabelViewModelFactory, cVar, c0585q);
                Object value = errorLabelViewModel.getLabelState().getText().getValue();
                if (StringsKt.gray((String) value)) {
                    value = null;
                }
                if (((String) value) == null) {
                    c0585q.purple(-1975452615);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(-1975452614);
                    p pVar = p.alpha;
                    ap delta = AbstractC0547m.delta(d.alpha, false);
                    long j5 = c0585q.magenta;
                    int i12 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q.mike();
                    s charlie = T.a.charlie(pVar, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, delta);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                        ad.blue(i12, c0585q, i12, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    TextLabelViewKt.TextLabelView(errorLabelViewModel.getLabelStyle(), errorLabelViewModel.getLabelState(), c0585q, TextLabelViewStyle.$stable | (TextLabelState.$stable << 3));
                    c0585q.quebec(true);
                    c0585q.quebec(false);
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.card.ui.component.cardnumber.a(injector, key, i4, 6);
        }
    }

    public static final Unit a(Injector injector, String str, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        ErrorLabelView(injector, str, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
