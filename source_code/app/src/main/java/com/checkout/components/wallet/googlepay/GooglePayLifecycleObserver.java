package com.checkout.components.wallet.googlepay;

import Xd.l;
import ah.b;
import ah.h;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.InterfaceC0640j;
import androidx.lifecycle.al;
import androidx.lifecycle.b0;
import com.checkout.components.wallet.wrapper.GooglePayViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t6.AbstractC3062u;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/wallet/googlepay/GooglePayLifecycleObserver;", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/b0;", "viewModelProvider", "Lah/h;", "registry", "Lkotlin/Function2;", "", "", "", "handleActivityResult", "<init>", "(Landroidx/lifecycle/b0;Lah/h;LXd/l;)V", "Landroidx/lifecycle/al;", "owner", "onCreate", "(Landroidx/lifecycle/al;)V", "Lah/b;", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "getPaymentDataLauncher$wallet_standardRelease", "()Lah/b;", "getPaymentDataLauncher", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayLifecycleObserver implements InterfaceC0640j {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final b0 f6514a;

    /* renamed from: b, reason: collision with root package name */
    private final h f6515b;

    /* renamed from: c, reason: collision with root package name */
    private final l f6516c;

    /* renamed from: d, reason: collision with root package name */
    private GooglePayViewModel f6517d;

    public GooglePayLifecycleObserver(b0 viewModelProvider, h registry, l handleActivityResult) {
        Intrinsics.echo(viewModelProvider, "viewModelProvider");
        Intrinsics.echo(registry, "registry");
        Intrinsics.echo(handleActivityResult, "handleActivityResult");
        this.f6514a = viewModelProvider;
        this.f6515b = registry;
        this.f6516c = handleActivityResult;
    }

    public final b getPaymentDataLauncher$wallet_standardRelease() {
        GooglePayViewModel googlePayViewModel = this.f6517d;
        if (googlePayViewModel != null) {
            return googlePayViewModel.getPaymentDataLauncher$wallet_standardRelease();
        }
        Intrinsics.lima("googlePayViewModel");
        throw null;
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onCreate(al owner) {
        Intrinsics.echo(owner, "owner");
        b0 b0Var = this.f6514a;
        b0Var.getClass();
        GooglePayViewModel googlePayViewModel = (GooglePayViewModel) b0Var.alpha(AbstractC3062u.echo(GooglePayViewModel.class));
        this.f6517d = googlePayViewModel;
        googlePayViewModel.registerPaymentDataLauncher$wallet_standardRelease(this.f6515b, this.f6516c);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onDestroy(@NotNull al alVar) {
        P0.quebec(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onPause(@NotNull al alVar) {
        P0.romeo(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onResume(@NotNull al alVar) {
        P0.sierra(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onStart(@NotNull al alVar) {
        P0.tango(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public /* bridge */ /* synthetic */ void onStop(@NotNull al alVar) {
        P0.uniform(alVar);
    }
}
