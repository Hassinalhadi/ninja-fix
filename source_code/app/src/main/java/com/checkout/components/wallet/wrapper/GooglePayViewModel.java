package com.checkout.components.wallet.wrapper;

import J6.a;
import Xd.l;
import ah.b;
import ah.h;
import androidx.lifecycle.Y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
import h9.an;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/wallet/wrapper/GooglePayViewModel;", "Landroidx/lifecycle/Y;", "<init>", "()V", "Lah/h;", "registry", "Lkotlin/Function2;", "", "", "", "handleActivityResult", "registerPaymentDataLauncher$wallet_standardRelease", "(Lah/h;LXd/l;)V", "registerPaymentDataLauncher", "Lah/b;", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "getPaymentDataLauncher$wallet_standardRelease", "()Lah/b;", "getPaymentDataLauncher", "Companion", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: a */
    private b f6544a;

    public static final void a(GooglePayViewModel googlePayViewModel, l lVar, a aVar) {
        String str;
        PaymentData paymentData = (PaymentData) aVar.alpha;
        Status status = aVar.bravo;
        if (paymentData != null && (str = paymentData.yellow) != null) {
            lVar.invoke(Integer.valueOf(status.alpha), str);
        } else {
            lVar.invoke(Integer.valueOf(status.alpha), "");
        }
    }

    public final b getPaymentDataLauncher$wallet_standardRelease() {
        b bVar = this.f6544a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("PaymentDataLauncher is not initialised");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ai.b, java.lang.Object] */
    public final void registerPaymentDataLauncher$wallet_standardRelease(h registry, l handleActivityResult) {
        Intrinsics.echo(registry, "registry");
        Intrinsics.echo(handleActivityResult, "handleActivityResult");
        this.f6544a = registry.charlie("paymentDataLauncher", new Object(), new an(this, handleActivityResult));
    }
}
