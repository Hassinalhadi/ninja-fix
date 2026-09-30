package com.checkout.components.card.ui.component.address;

import Nd.c;
import Od.a;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.address.AddressComponent;
import com.checkout.components.card.C0885a;
import com.checkout.components.card.C0886b;
import com.checkout.components.card.C0887c;
import com.checkout.components.card.C0888d;
import com.checkout.components.card.C0889e;
import com.checkout.components.card.C0890f;
import com.checkout.components.card.di.AddressLabelStyle;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;
import t4.b;
import vf.ad;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0085\u0001\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00105\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010:\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010A\u001a\u0004\u0018\u00010;8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010(\u001a\u0004\b>\u0010?R\u001c\u0010G\u001a\u0004\u0018\u00010B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001a0H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001a0H8\u0006¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010LR\u0013\u0010R\u001a\u0004\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/checkout/components/card/ui/component/address/AddressViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "addressConfiguration", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "labelStyleMapper", "Lcom/checkout/components/ui/model/state/TextLabelState;", "labelStateMapper", "textLabelStyle", "Ljava/util/Locale;", "locale", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "appearance", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "<init>", "(Lcom/checkout/components/interfaces/component/AddressConfiguration;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Ljava/util/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "", "isChecked", "", "onCheckBoxCheckedChange", "(Z)V", "a", "Lcom/checkout/components/interfaces/component/AddressConfiguration;", "getAddressConfiguration", "()Lcom/checkout/components/interfaces/component/AddressConfiguration;", "b", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getTextLabelStyle", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getTextLabelStyle$annotations", "()V", "c", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "getPaymentStateManager", "()Lcom/checkout/components/card/ui/manager/PaymentStateManager;", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "getResourceProvider", "()Lcom/checkout/components/interfaces/ui/ResourceProvider;", "h", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "getLabelStyle", "()Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "labelStyle", "i", "Lcom/checkout/components/ui/model/state/TextLabelState;", "getLabelState", "()Lcom/checkout/components/ui/model/state/TextLabelState;", "labelState", "Lcom/checkout/components/interfaces/model/AddressComponentConfig;", "j", "Lcom/checkout/components/interfaces/model/AddressComponentConfig;", "getComponentConfig$card_standardRelease", "()Lcom/checkout/components/interfaces/model/AddressComponentConfig;", "getComponentConfig$card_standardRelease$annotations", "componentConfig", "Lcom/checkout/address/AddressComponent;", "k", "Lcom/checkout/address/AddressComponent;", "getAddressComponent$card_standardRelease", "()Lcom/checkout/address/AddressComponent;", "addressComponent", "Lyf/L;", "f", "Lyf/L;", "isCheckBoxChecked", "()Lyf/L;", "g", "isCheckBoxShown", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;", "getColorTokens", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;", "colorTokens", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: a, reason: from kotlin metadata */
    private final AddressConfiguration addressConfiguration;

    /* renamed from: b, reason: from kotlin metadata */
    private final TextLabelStyle textLabelStyle;

    /* renamed from: c, reason: from kotlin metadata */
    private final PaymentStateManager paymentStateManager;

    /* renamed from: d */
    private final ResourceProvider resourceProvider;
    private final at e;

    /* renamed from: f */
    private final at f4407f;

    /* renamed from: g */
    private final at f4408g;

    /* renamed from: h, reason: from kotlin metadata */
    private final TextLabelViewStyle labelStyle;

    /* renamed from: i, reason: from kotlin metadata */
    private final TextLabelState labelState;

    /* renamed from: j, reason: from kotlin metadata */
    private final AddressComponentConfig componentConfig;

    /* renamed from: k, reason: from kotlin metadata */
    private final AddressComponent addressComponent;

    public AddressViewModel(@Nullable AddressConfiguration addressConfiguration, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> labelStyleMapper, @NotNull Mapper<TextLabelStyle, TextLabelState> labelStateMapper, @AddressLabelStyle @NotNull TextLabelStyle textLabelStyle, @NotNull Locale locale, @Nullable Map<ComponentTranslationKey, String> map, @Nullable DesignTokens designTokens, @NotNull PaymentStateManager paymentStateManager, @NotNull ResourceProvider resourceProvider) {
        ContactData contactData;
        boolean z2;
        ContactData contactData2;
        AddressConfiguration addressConfiguration2;
        AddressComponentConfig addressComponentConfig;
        Intrinsics.echo(labelStyleMapper, "labelStyleMapper");
        Intrinsics.echo(labelStateMapper, "labelStateMapper");
        Intrinsics.echo(textLabelStyle, "textLabelStyle");
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.addressConfiguration = addressConfiguration;
        this.textLabelStyle = textLabelStyle;
        this.paymentStateManager = paymentStateManager;
        this.resourceProvider = resourceProvider;
        if (addressConfiguration != null) {
            contactData = addressConfiguration.getData();
        } else {
            contactData = null;
        }
        if (contactData != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        N charlie = AbstractC3428A.charlie(Boolean.valueOf(z2));
        this.e = charlie;
        this.f4407f = charlie;
        if (addressConfiguration != null) {
            contactData2 = addressConfiguration.getData();
        } else {
            contactData2 = null;
        }
        this.f4408g = AbstractC3428A.charlie(Boolean.valueOf(contactData2 != null));
        this.labelStyle = labelStyleMapper.map(textLabelStyle);
        this.labelState = labelStateMapper.map(textLabelStyle);
        ad.zulu(T.hotel(this), null, null, new C0885a(this, null), 3);
        ad.zulu(T.hotel(this), null, null, new C0886b(this, null), 3);
        if (addressConfiguration != null) {
            addressConfiguration2 = AddressConfiguration.copy$default(addressConfiguration, null, null, new b(this, 1), 2, null);
        } else {
            addressConfiguration2 = null;
        }
        if (addressConfiguration2 != null) {
            addressComponentConfig = new AddressComponentConfig(new ComponentName.Address(addressConfiguration2), locale, map, designTokens, false);
        } else {
            addressComponentConfig = null;
        }
        this.componentConfig = addressComponentConfig;
        this.addressComponent = addressComponentConfig != null ? new AddressComponent(addressComponentConfig) : null;
    }

    public static final Unit a(AddressViewModel addressViewModel, ContactData contactData) {
        N n5;
        Object value;
        at contactData2 = addressViewModel.paymentStateManager.getContactData();
        do {
            n5 = (N) contactData2;
            value = n5.getValue();
        } while (!n5.hotel(value, contactData));
        addressViewModel.addressConfiguration.getOnComplete().invoke(contactData);
        AddressComponent addressComponent = addressViewModel.addressComponent;
        if (addressComponent != null) {
            addressComponent.hideError();
        }
        at isAddressValid = addressViewModel.paymentStateManager.isAddressValid();
        Boolean bool = Boolean.TRUE;
        N n10 = (N) isAddressValid;
        n10.getClass();
        n10.juliet(null, bool);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$subscribeFormValidation(AddressViewModel addressViewModel, c cVar) {
        C0887c c0887c;
        int i4;
        addressViewModel.getClass();
        if (cVar instanceof C0887c) {
            c0887c = (C0887c) cVar;
            int i5 = c0887c.f3999c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0887c.f3999c = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0887c.f3997a;
                a aVar = a.alpha;
                i4 = c0887c.f3999c;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2327c.amber(obj);
                }
                ResultKt.alpha(obj);
                at isCardValidationTriggered = addressViewModel.paymentStateManager.isCardValidationTriggered();
                C0888d c0888d = new C0888d(addressViewModel);
                c0887c.f3999c = 1;
                ((N) isCardValidationTriggered).collect(c0888d, c0887c);
                return aVar;
            }
        }
        c0887c = new C0887c(addressViewModel, cVar);
        Object obj2 = c0887c.f3997a;
        a aVar2 = a.alpha;
        i4 = c0887c.f3999c;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$subscribeIsCheckBoxCheckedUpdated(AddressViewModel addressViewModel, c cVar) {
        C0889e c0889e;
        int i4;
        addressViewModel.getClass();
        if (cVar instanceof C0889e) {
            c0889e = (C0889e) cVar;
            int i5 = c0889e.f4191c;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0889e.f4191c = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c0889e.f4189a;
                a aVar = a.alpha;
                i4 = c0889e.f4191c;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2327c.amber(obj);
                }
                ResultKt.alpha(obj);
                at atVar = addressViewModel.f4407f;
                C0890f c0890f = new C0890f(addressViewModel);
                c0889e.f4191c = 1;
                ((N) atVar).collect(c0890f, c0889e);
                return aVar;
            }
        }
        c0889e = new C0889e(addressViewModel, cVar);
        Object obj2 = c0889e.f4189a;
        a aVar2 = a.alpha;
        i4 = c0889e.f4191c;
        if (i4 == 0) {
        }
    }

    public static /* synthetic */ void getComponentConfig$card_standardRelease$annotations() {
    }

    @AddressLabelStyle
    public static /* synthetic */ void getTextLabelStyle$annotations() {
    }

    @Nullable
    /* renamed from: getAddressComponent$card_standardRelease, reason: from getter */
    public final AddressComponent getAddressComponent() {
        return this.addressComponent;
    }

    @Nullable
    public final AddressConfiguration getAddressConfiguration() {
        return this.addressConfiguration;
    }

    @Nullable
    public final ColorTokens getColorTokens() {
        DesignTokens appearance;
        AddressComponentConfig addressComponentConfig = this.componentConfig;
        if (addressComponentConfig != null && (appearance = addressComponentConfig.getAppearance()) != null) {
            return appearance.getColorTokens();
        }
        return null;
    }

    @Nullable
    /* renamed from: getComponentConfig$card_standardRelease, reason: from getter */
    public final AddressComponentConfig getComponentConfig() {
        return this.componentConfig;
    }

    @NotNull
    public final TextLabelState getLabelState() {
        return this.labelState;
    }

    @NotNull
    public final TextLabelViewStyle getLabelStyle() {
        return this.labelStyle;
    }

    @NotNull
    public final PaymentStateManager getPaymentStateManager() {
        return this.paymentStateManager;
    }

    @NotNull
    public final ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    @NotNull
    public final TextLabelStyle getTextLabelStyle() {
        return this.textLabelStyle;
    }

    @NotNull
    public final L isCheckBoxChecked() {
        return this.f4407f;
    }

    @NotNull
    public final L isCheckBoxShown() {
        return this.f4408g;
    }

    public final void onCheckBoxCheckedChange(boolean isChecked) {
        at atVar = this.e;
        Boolean valueOf = Boolean.valueOf(isChecked);
        N n5 = (N) atVar;
        n5.getClass();
        n5.juliet(null, valueOf);
    }
}
