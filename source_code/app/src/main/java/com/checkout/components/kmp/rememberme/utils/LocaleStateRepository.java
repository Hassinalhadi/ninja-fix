package com.checkout.components.kmp.rememberme.utils;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.checkout.components.kmp.rememberme.shared.model.CheckoutLocale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/LocaleStateRepository;", "", "Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;", "defaultLocale", "<init>", "(Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;)V", "<set-?>", "state$delegate", "Landroidx/compose/runtime/ax;", "getState$rememberme_release", "()Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;", "setState$rememberme_release", "state", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocaleStateRepository {
    public static final int $stable = 0;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax state;

    public LocaleStateRepository(@NotNull CheckoutLocale defaultLocale) {
        Intrinsics.echo(defaultLocale, "defaultLocale");
        this.state = C0564b.zulu(defaultLocale);
    }

    @NotNull
    public final CheckoutLocale getState$rememberme_release() {
        return (CheckoutLocale) this.state.getValue();
    }

    public final void setState$rememberme_release(@NotNull CheckoutLocale checkoutLocale) {
        Intrinsics.echo(checkoutLocale, "<set-?>");
        this.state.setValue(checkoutLocale);
    }
}
