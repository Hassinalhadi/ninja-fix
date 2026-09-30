package com.checkout.address;

import Ec.ar;
import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.checkout.address.di.AddressButtonComponent;
import com.checkout.address.di.ResourceProviderImpl;
import com.checkout.address.ui.view.AddressButtonViewKt;
import com.checkout.address.utils.StyleUtils;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.localisation.ContextExtensionsKt;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.ui.ViewRenderer;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.utils.CountryPickerResourceProvider;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/checkout/address/AddressComponentViewRenderer;", "Lcom/checkout/components/interfaces/ui/ViewRenderer;", "Lcom/checkout/components/interfaces/model/AddressComponentConfig;", Constants.KEY_CONFIG, "Lcom/checkout/address/di/AddressButtonComponent;", "di", "<init>", "(Lcom/checkout/components/interfaces/model/AddressComponentConfig;Lcom/checkout/address/di/AddressButtonComponent;)V", "", "Render", "(Landroidx/compose/runtime/m;I)V", "a", "Lcom/checkout/components/interfaces/model/AddressComponentConfig;", "getConfig", "()Lcom/checkout/components/interfaces/model/AddressComponentConfig;", "b", "Lcom/checkout/address/di/AddressButtonComponent;", "getDi", "()Lcom/checkout/address/di/AddressButtonComponent;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressComponentViewRenderer implements ViewRenderer {
    public static final int $stable = AddressComponentConfig.$stable;

    /* renamed from: a, reason: from kotlin metadata */
    private final AddressComponentConfig com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String;

    /* renamed from: b, reason: from kotlin metadata */
    private final AddressButtonComponent di;

    public AddressComponentViewRenderer(@NotNull AddressComponentConfig config, @NotNull AddressButtonComponent di) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(di, "di");
        this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String = config;
        this.di = di;
    }

    public static final Unit a(AddressComponentViewRenderer addressComponentViewRenderer, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        addressComponentViewRenderer.Render(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.ui.ViewRenderer
    public final void Render(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean india;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1927247847);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q.golf(this);
            } else {
                india = c0585q.india(this);
            }
            if (india) {
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
            Context configContext = ContextExtensionsKt.toConfigContext((Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo), this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getLocale());
            ScreenHeaderStyleUtils screenHeaderStyleUtils = new ScreenHeaderStyleUtils(this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getAppearance());
            StyleUtils styleUtils = new StyleUtils(new ResourceProviderImpl(configContext, this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getTranslation()), this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getAppearance(), new CountryPickerStyleUtils(new CountryPickerResourceProvider(configContext, this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getTranslation()), this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String.getAppearance(), screenHeaderStyleUtils), screenHeaderStyleUtils);
            AddressButtonViewKt.AddressButtonView(this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String, this.di.inputFieldStateMapper(), this.di.inputFieldStyleMapper(), styleUtils, this.di.errorMessageRepository(), new TextLabelViewItem(this.di.textLabelViewStyleMapper().map(styleUtils.errorLabelStyle$address_standardRelease()), this.di.textLabelStateMapper().map(styleUtils.errorLabelStyle$address_standardRelease())), c0585q, (TextLabelViewItem.$stable << 15) | AddressComponentConfig.$stable | ((((ResourceProvider.$stable | DesignTokens.$stable) | CountryPickerStyleUtils.$stable) | ScreenHeaderStyleUtils.$stable) << 9) | (PrimitiveStateFlowRepository.$stable << 12));
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(this, i4, 6);
        }
    }

    @NotNull
    /* renamed from: getConfig, reason: from getter */
    public final AddressComponentConfig getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String() {
        return this.com.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String;
    }

    @NotNull
    public final AddressButtonComponent getDi() {
        return this.di;
    }
}
