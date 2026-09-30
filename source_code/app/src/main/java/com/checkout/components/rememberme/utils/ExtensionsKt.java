package com.checkout.components.rememberme.utils;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.AbstractC0981t;
import com.checkout.components.rememberme.C0984u;
import com.checkout.components.rememberme.model.PaymentMethod;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.utils.extensions.CardSchemeExtensionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001d\u0010\b\u001a\u00020\u0006*\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u001e\u0010\u0012\u001a\u00020\u0011*\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/Environment;", "", "baseUrlCag", "(Lcom/checkout/components/interfaces/Environment;)Ljava/lang/String;", "baseUrl", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "Lcom/checkout/components/interfaces/model/ComponentName;", "default", "mapToComponentName", "(Lcom/checkout/components/rememberme/model/RememberMeScreen;Lcom/checkout/components/interfaces/model/ComponentName;)Lcom/checkout/components/interfaces/model/ComponentName;", "Lcom/checkout/components/rememberme/model/PaymentMethod;", "Lcom/checkout/components/ui/model/CardScheme;", "determineCvvSupportedLocalScheme", "(Lcom/checkout/components/rememberme/model/PaymentMethod;)Lcom/checkout/components/ui/model/CardScheme;", "determineScheme", "Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "email", "", "isAccountAvailableForEmail", "(Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "rememberme_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtensionsKt {
    @NotNull
    public static final String baseUrl(@NotNull Environment environment) {
        Intrinsics.echo(environment, "<this>");
        int i4 = AbstractC0981t.f6293a[environment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return "https://api.checkout.com/";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "https://api.sandbox.checkout.com/";
    }

    @NotNull
    public static final String baseUrlCag(@NotNull Environment environment) {
        Intrinsics.echo(environment, "<this>");
        int i4 = AbstractC0981t.f6293a[environment.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return Constants.CONSUMER_API_BASE_URL_PROD;
            }
            throw new NoWhenBranchMatchedException();
        }
        return Constants.CONSUMER_API_BASE_URL_SBOX;
    }

    @Nullable
    public static final CardScheme determineCvvSupportedLocalScheme(@NotNull PaymentMethod paymentMethod) {
        String normalizeSchemeName;
        CardScheme cardScheme;
        Intrinsics.echo(paymentMethod, "<this>");
        String schemeLocal = paymentMethod.getCardDetails().getSchemeLocal();
        if (schemeLocal == null || (normalizeSchemeName = CardSchemeExtensionsKt.normalizeSchemeName(schemeLocal)) == null || (cardScheme = CardSchemeExtensionsKt.toCardScheme(normalizeSchemeName)) == null || cardScheme != CardScheme.MADA) {
            return null;
        }
        return cardScheme;
    }

    @Nullable
    public static final CardScheme determineScheme(@NotNull PaymentMethod paymentMethod) {
        String normalizeSchemeName;
        Intrinsics.echo(paymentMethod, "<this>");
        String scheme = paymentMethod.getCardDetails().getScheme();
        if (scheme != null && (normalizeSchemeName = CardSchemeExtensionsKt.normalizeSchemeName(scheme)) != null) {
            return CardSchemeExtensionsKt.toCardScheme(normalizeSchemeName);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object isAccountAvailableForEmail(@NotNull CheckoutKMPRememberMe checkoutKMPRememberMe, @Nullable String str, @NotNull c<? super Boolean> cVar) {
        C0984u c0984u;
        int i4;
        boolean z2;
        Object m117isAccountAvailablegIAlus;
        if (cVar instanceof C0984u) {
            c0984u = (C0984u) cVar;
            int i5 = c0984u.e;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0984u.e = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0984u.f6318d;
                Object obj2 = a.alpha;
                i4 = c0984u.e;
                Object obj3 = null;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                        m117isAccountAvailablegIAlus = ((Result) obj).alpha;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (str == null || str.length() == 0) {
                        str = null;
                    }
                    if (str != null) {
                        c0984u.f6315a = null;
                        c0984u.f6316b = null;
                        c0984u.f6317c = null;
                        c0984u.e = 1;
                        m117isAccountAvailablegIAlus = checkoutKMPRememberMe.m117isAccountAvailablegIAlus(str, c0984u);
                        if (m117isAccountAvailablegIAlus == obj2) {
                            return obj2;
                        }
                    } else {
                        z2 = false;
                        return Boolean.valueOf(z2);
                    }
                }
                Result.Companion companion = Result.INSTANCE;
                if (!(m117isAccountAvailablegIAlus instanceof k)) {
                    obj3 = m117isAccountAvailablegIAlus;
                }
                z2 = Intrinsics.areEqual(obj3, Boolean.TRUE);
                return Boolean.valueOf(z2);
            }
        }
        c0984u = new C0984u(cVar);
        Object obj4 = c0984u.f6318d;
        Object obj22 = a.alpha;
        i4 = c0984u.e;
        Object obj32 = null;
        if (i4 == 0) {
        }
        Result.Companion companion2 = Result.INSTANCE;
        if (!(m117isAccountAvailablegIAlus instanceof k)) {
        }
        z2 = Intrinsics.areEqual(obj32, Boolean.TRUE);
        return Boolean.valueOf(z2);
    }

    @NotNull
    public static final ComponentName mapToComponentName(@Nullable RememberMeScreen rememberMeScreen, @NotNull ComponentName componentName) {
        Intrinsics.echo(componentName, "default");
        if (!Intrinsics.areEqual(rememberMeScreen, RememberMeScreen.Alternative.INSTANCE) && rememberMeScreen != null) {
            return PaymentMethodName.INSTANCE.getRememberMe();
        }
        return componentName;
    }
}
