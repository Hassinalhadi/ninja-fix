package com.checkout.components.kmp.rememberme.utils;

import Q0.n;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.checkout.components.kmp.rememberme.shared.model.CheckoutLocale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/LayoutDirectionStateRepository;", "", "LQ0/n;", "default", "<init>", "(LQ0/n;)V", "<set-?>", "state$delegate", "Landroidx/compose/runtime/ax;", "getState$rememberme_release", "()LQ0/n;", "setState$rememberme_release", "state", "Companion", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutDirectionStateRepository {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: state$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/kmp/rememberme/utils/LayoutDirectionStateRepository$Companion;", "", "<init>", "()V", "fromLocale", "Lcom/checkout/components/kmp/rememberme/utils/LayoutDirectionStateRepository;", "locale", "Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LayoutDirectionStateRepository fromLocale(@NotNull CheckoutLocale locale) {
            Intrinsics.echo(locale, "locale");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (locale instanceof CheckoutLocale.Ar) {
                return new LayoutDirectionStateRepository(n.purple, defaultConstructorMarker);
            }
            return new LayoutDirectionStateRepository(n.alpha, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ LayoutDirectionStateRepository(n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar);
    }

    @NotNull
    public final n getState$rememberme_release() {
        return (n) this.state.getValue();
    }

    public final void setState$rememberme_release(@NotNull n nVar) {
        Intrinsics.echo(nVar, "<set-?>");
        this.state.setValue(nVar);
    }

    private LayoutDirectionStateRepository(n nVar) {
        this.state = C0564b.zulu(nVar);
    }
}
