package com.checkout.components.card.ui.component.cardholdername;

import F.AbstractC0127k2;
import F.O;
import T.p;
import T1.c;
import U1.a;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.d0;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.ui.component.base.InputComponentViewKt;
import com.checkout.components.card.ui.component.base.InputComponentViewKt$InputComponent$1$1;
import com.checkout.components.card.ui.component.base.InputComponentViewKt$InputComponent$2$1;
import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import com.checkout.components.card.ui.component.base.InputComponentViewModelFactory;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.card.ui.component.cvv.CVVViewModel;
import com.checkout.components.card.ui.component.expirydate.ExpiryDateViewModel;
import com.checkout.components.card.utils.constants.TestTags;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.clevertap.android.sdk.Constants;
import ge.InterfaceC1775g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.F7;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/card/di/base/Injector;", "injector", "", Constants.KEY_KEY, "", "CardHolderNameComponent", "(Lcom/checkout/components/card/di/base/Injector;Ljava/lang/String;Landroidx/compose/runtime/m;I)V", "InputComponentPreview", "(Landroidx/compose/runtime/m;I)V", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardHolderNameViewKt {
    public static final void CardHolderNameComponent(@NotNull Injector injector, @NotNull String key, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        c cVar;
        String str;
        int i10;
        boolean india;
        int i11;
        Intrinsics.echo(injector, "injector");
        Intrinsics.echo(key, "key");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(411804684);
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
            InputComponentViewModelFactory inputComponentViewModelFactory = new InputComponentViewModelFactory(injector);
            String concat = "CardHolderNameViewModel-".concat(key);
            d0 alpha = a.alpha(c0585q);
            if (alpha != null) {
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                InputComponentViewModel inputComponentViewModel = (InputComponentViewModel) F7.bravo(u.alpha.bravo(CardHolderNameViewModel.class), alpha, concat, inputComponentViewModelFactory, cVar, c0585q);
                boolean z10 = inputComponentViewModel instanceof CardNumberViewModel;
                if (z10) {
                    str = TestTags.CARD_NUMBER_INPUT;
                } else if (inputComponentViewModel instanceof CardHolderNameViewModel) {
                    str = TestTags.CARD_HOLDER_NAME_INPUT;
                } else if (inputComponentViewModel instanceof ExpiryDateViewModel) {
                    str = TestTags.EXPIRY_DATE_INPUT;
                } else if (inputComponentViewModel instanceof CVVViewModel) {
                    str = TestTags.CVV_INPUT;
                } else {
                    str = null;
                }
                String str2 = str;
                if (z10) {
                    c0585q.purple(-1386530849);
                    InputComponentViewKt.RenderCardNumberInput((CardNumberViewModel) inputComponentViewModel, c0585q, 0);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(-1386447707);
                    InputComponentViewStyle style$card_standardRelease = inputComponentViewModel.getStyle$card_standardRelease();
                    InputComponentState state$card_standardRelease = inputComponentViewModel.getState$card_standardRelease();
                    boolean india2 = c0585q.india(inputComponentViewModel);
                    Object jade = c0585q.jade();
                    as asVar = C0580l.alpha;
                    if (india2 || jade == asVar) {
                        jade = new InputComponentViewKt$InputComponent$1$1(inputComponentViewModel);
                        c0585q.f(jade);
                    }
                    InterfaceC1775g interfaceC1775g = (InterfaceC1775g) jade;
                    boolean india3 = c0585q.india(inputComponentViewModel);
                    Object jade2 = c0585q.jade();
                    if (india3 || jade2 == asVar) {
                        jade2 = new InputComponentViewKt$InputComponent$2$1(inputComponentViewModel);
                        c0585q.f(jade2);
                    }
                    InputContainerViewKt.InputComponentContainerView(style$card_standardRelease, state$card_standardRelease, (Function1) ((InterfaceC1775g) jade2), (Function1) interfaceC1775g, str2, c0585q, InputComponentViewStyle.$stable | (InputComponentState.$stable << 3), 0);
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
            uniform.delta = new com.checkout.components.card.ui.component.cardnumber.a(injector, key, i4, 4);
        }
    }

    @SuppressLint({"UnrememberedMutableState"})
    public static final void InputComponentPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2007537356);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            AbstractC0127k2.alpha(V.charlie(AbstractC0538d.sierra(p.alpha, 20), 1.0f), null, ((O) c0585q.kilo(F.Q.alpha)).november, 0L, 0.0f, 0.0f, null, ComposableSingletons$CardHolderNameViewKt.INSTANCE.m77getLambda$84504305$card_standardRelease(), c0585q, 12582918, 122);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.kmp.rememberme.view.otp.c(i4, 19);
        }
    }

    public static final Unit a(Injector injector, String str, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        CardHolderNameComponent(injector, str, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        InputComponentPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
