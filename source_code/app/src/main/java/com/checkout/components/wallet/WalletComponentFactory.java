package com.checkout.components.wallet;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.wallet.ui.model.WalletComponentConfig;
import com.clevertap.android.sdk.Constants;
import h5.C1809a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/wallet/WalletComponentFactory;", "", "Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;", Constants.KEY_CONFIG, "Lcom/checkout/components/wallet/WalletComponent;", "create", "(Lcom/checkout/components/wallet/ui/model/WalletComponentConfig;)Lcom/checkout/components/wallet/WalletComponent;", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "getComponentCallback", "()Lcom/checkout/components/interfaces/component/ComponentCallback;", "Companion", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletComponentFactory {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b */
    private static final Lazy f6445b = LazyKt.lazy(new C1809a(18));

    /* renamed from: a */
    private final ax f6446a = C0564b.zulu(ComponentCallback.INSTANCE.getNO_OPS());

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/checkout/components/wallet/WalletComponentFactory$Companion;", "", "Lcom/checkout/components/wallet/WalletComponentFactory;", "INSTANCE$delegate", "Lkotlin/Lazy;", "getINSTANCE", "()Lcom/checkout/components/wallet/WalletComponentFactory;", "INSTANCE", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final WalletComponentFactory getINSTANCE() {
            return (WalletComponentFactory) WalletComponentFactory.f6445b.getValue();
        }
    }

    private WalletComponentFactory() {
    }

    public static final WalletComponentFactory a() {
        return new WalletComponentFactory();
    }

    public final WalletComponent create(WalletComponentConfig r32) {
        Intrinsics.echo(r32, "config");
        this.f6446a.setValue(r32.getComponentCallback());
        return new WalletComponent(r32);
    }

    public final ComponentCallback getComponentCallback() {
        return (ComponentCallback) this.f6446a.getValue();
    }
}
