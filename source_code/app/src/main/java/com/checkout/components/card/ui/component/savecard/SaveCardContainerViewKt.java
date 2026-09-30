package com.checkout.components.card.ui.component.savecard;

import T1.c;
import U1.a;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.d0;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.rememberme.model.CustomerInfo;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.F7;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/card/di/base/Injector;", "injector", "", Constants.KEY_KEY, "", "SaveCardContainerView", "(Lcom/checkout/components/card/di/base/Injector;Ljava/lang/String;Landroidx/compose/runtime/m;I)V", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveCardContainerViewKt {
    public static final void SaveCardContainerView(@NotNull Injector injector, @NotNull String key, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        c cVar;
        int i10;
        boolean india;
        int i11;
        Intrinsics.echo(injector, "injector");
        Intrinsics.echo(key, "key");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-104657434);
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
            SaveCardContainerViewModelFactory saveCardContainerViewModelFactory = new SaveCardContainerViewModelFactory(injector);
            String concat = "SaveCardContainerViewModel-".concat(key);
            d0 alpha = a.alpha(c0585q);
            if (alpha != null) {
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                SaveCardContainerViewModel saveCardContainerViewModel = (SaveCardContainerViewModel) F7.bravo(u.alpha.bravo(SaveCardContainerViewModel.class), alpha, concat, saveCardContainerViewModelFactory, cVar, c0585q);
                CheckoutRememberMe rememberMe = saveCardContainerViewModel.getRememberMe();
                if (rememberMe == null) {
                    c0585q.purple(296973078);
                } else {
                    c0585q.purple(-1791535541);
                    rememberMe.SaveCardView(saveCardContainerViewModel.getPrefilledData(), c0585q, CustomerInfo.$stable | (CheckoutRememberMe.$stable << 3), 0);
                }
                c0585q.quebec(false);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.card.ui.component.cardnumber.a(injector, key, i4, 2);
        }
    }

    public static final Unit a(Injector injector, String str, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        SaveCardContainerView(injector, str, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
