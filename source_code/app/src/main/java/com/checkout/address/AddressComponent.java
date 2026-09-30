package com.checkout.address;

import Ec.ar;
import P.d;
import Yb.F;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.ui.platform.ComposeView;
import bz.af;
import com.checkout.address.di.AddressButtonComponent;
import com.checkout.address.di.AddressStyleModule;
import com.checkout.components.address.K;
import com.checkout.components.interfaces.api.StandaloneComponent;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.interfaces.model.ComponentName;
import com.clevertap.android.sdk.Constants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/checkout/address/AddressComponent;", "Lcom/checkout/components/interfaces/api/StandaloneComponent;", "Lcom/checkout/components/interfaces/model/AddressComponentConfig;", Constants.KEY_CONFIG, "Lcom/checkout/address/di/AddressButtonComponent;", "di", "<init>", "(Lcom/checkout/components/interfaces/model/AddressComponentConfig;Lcom/checkout/address/di/AddressButtonComponent;)V", "(Lcom/checkout/components/interfaces/model/AddressComponentConfig;)V", "", "Render", "(Landroidx/compose/runtime/m;I)V", "Landroid/view/View;", "container", "provideView", "(Landroid/view/View;)Landroid/view/View;", "", Constants.KEY_MESSAGE, "showError", "(Ljava/lang/String;)V", "hideError", "()V", "Lcom/checkout/components/interfaces/model/ComponentName;", "b", "Lcom/checkout/components/interfaces/model/ComponentName;", "getName", "()Lcom/checkout/components/interfaces/model/ComponentName;", "name", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressComponent implements StandaloneComponent {
    public static final int $stable = 8;

    /* renamed from: a */
    private final AddressButtonComponent f3725a;

    /* renamed from: b */
    private final ComponentName.Address f3726b;

    /* renamed from: c */
    private final Lazy f3727c;

    public AddressComponent(@NotNull AddressComponentConfig config, @NotNull AddressButtonComponent di) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(di, "di");
        this.f3725a = di;
        this.f3726b = config.getName();
        this.f3727c = LazyKt.lazy(new F(13, config, this));
    }

    public static final Unit a(AddressComponent addressComponent, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        addressComponent.Render(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ AddressComponentViewRenderer charlie(AddressComponentConfig addressComponentConfig, AddressComponent addressComponent) {
        return a(addressComponentConfig, addressComponent);
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    public final void Render(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-319529753);
        if ((i4 & 6) == 0) {
            if (c0585q.india(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            ((AddressComponentViewRenderer) this.f3727c.getValue()).Render(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(this, i4, 5);
        }
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    @NotNull
    public final ComponentName getName() {
        return this.f3726b;
    }

    public final void hideError() {
        this.f3725a.errorMessageRepository().update((PrimitiveStateFlowRepository<String>) null);
    }

    @Override // com.checkout.components.interfaces.api.BaseComponent
    @NotNull
    public final View provideView(@NotNull View container) {
        Intrinsics.echo(container, "container");
        Context context = container.getContext();
        Intrinsics.delta(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(new d(new af(7, this), 1427821313, true));
        return composeView;
    }

    public final void showError(@NotNull String r22) {
        Intrinsics.echo(r22, "message");
        this.f3725a.errorMessageRepository().update((PrimitiveStateFlowRepository<String>) r22);
    }

    public static final AddressComponentViewRenderer a(AddressComponentConfig addressComponentConfig, AddressComponent addressComponent) {
        return new AddressComponentViewRenderer(addressComponentConfig, addressComponent.f3725a);
    }

    public static final Unit a(AddressComponent addressComponent, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            addressComponent.Render(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressComponent(@NotNull AddressComponentConfig config) {
        this(config, new K(new AddressStyleModule()));
        Intrinsics.echo(config, "config");
    }
}
