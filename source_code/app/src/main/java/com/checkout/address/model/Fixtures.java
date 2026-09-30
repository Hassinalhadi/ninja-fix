package com.checkout.address.model;

import D0.an;
import T.p;
import a0.C0366t;
import android.content.Context;
import androidx.compose.runtime.C0564b;
import com.checkout.address.di.ResourceProviderImpl;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.address.utils.StyleUtils;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.Address;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.model.contact.Name;
import com.checkout.components.interfaces.model.contact.Phone;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToViewStyleMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.CountryPickerResourceProvider;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import com.checkout.components.ui.utils.extensions.Utils;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00104\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100¨\u00065"}, d2 = {"Lcom/checkout/address/model/Fixtures;", "", "Landroid/content/Context;", "context", "Lcom/checkout/address/utils/StyleUtils;", "styleUtils", "(Landroid/content/Context;)Lcom/checkout/address/utils/StyleUtils;", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "a", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "getCONTACT_DATA", "()Lcom/checkout/components/interfaces/model/contact/ContactData;", "CONTACT_DATA", "Lcom/checkout/components/ui/mapper/InputFieldStyleToViewStyleMapper;", "b", "Lcom/checkout/components/ui/mapper/InputFieldStyleToViewStyleMapper;", "getINPUT_FIELD_STYLE_MAPPER", "()Lcom/checkout/components/ui/mapper/InputFieldStyleToViewStyleMapper;", "INPUT_FIELD_STYLE_MAPPER", "Lcom/checkout/components/ui/mapper/InputFieldStyleToInputFieldStateMapper;", "c", "Lcom/checkout/components/ui/mapper/InputFieldStyleToInputFieldStateMapper;", "getINPUT_FIELD_STATE_MAPPER", "()Lcom/checkout/components/ui/mapper/InputFieldStyleToInputFieldStateMapper;", "INPUT_FIELD_STATE_MAPPER", "", "Lcom/checkout/address/model/AddressFieldItem;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "getADDRESS_FIELD_ITEM_LIST", "()Ljava/util/List;", "ADDRESS_FIELD_ITEM_LIST", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "e", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "getBUTTON_STYLE", "()Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "BUTTON_STYLE", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "f", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "getBUTTON_STATE", "()Lcom/checkout/components/ui/model/state/InternalButtonState;", "BUTTON_STATE", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "g", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getTEXT_LABEL_ITEM", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "TEXT_LABEL_ITEM", "h", "getERROR_LABEL_ITEM", "ERROR_LABEL_ITEM", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Fixtures {
    public static final int $stable;

    @NotNull
    public static final Fixtures INSTANCE = new Fixtures();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final ContactData CONTACT_DATA = new ContactData(new Address(Country.JAPAN, "123 Main St", "Sakura apartments", "Shanghai", "Tokyo", "100-0001"), new Phone(Country.UNITED_KINGDOM, "123456789"), new Name("First", "Last"), "test@example.com");

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final InputFieldStyleToViewStyleMapper INPUT_FIELD_STYLE_MAPPER = new InputFieldStyleToViewStyleMapper(new TextLabelStyleToViewStyleMapper());

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final InputFieldStyleToInputFieldStateMapper INPUT_FIELD_STATE_MAPPER = new InputFieldStyleToInputFieldStateMapper(new ImageStyleToComposableImageMapper());

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final List ADDRESS_FIELD_ITEM_LIST;

    /* renamed from: e, reason: from kotlin metadata */
    private static final InternalButtonViewStyle BUTTON_STYLE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final InternalButtonState BUTTON_STATE;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final TextLabelViewItem TEXT_LABEL_ITEM;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final TextLabelViewItem ERROR_LABEL_ITEM;

    static {
        AddressField.AddressLine1 addressLine1 = new AddressField.AddressLine1(false, 1, null);
        com.checkout.components.ui.utils.constants.Fixtures fixtures = com.checkout.components.ui.utils.constants.Fixtures.INSTANCE;
        AddressFieldItem.Standard standard = new AddressFieldItem.Standard(addressLine1, fixtures.getSTYLE_MAPPER().map(fixtures.getINPUT_COMPONENT_STYLE()), new InputComponentState(null, null, 3, null));
        AddressFieldItem.Standard copy$default = AddressFieldItem.Standard.copy$default(standard, new AddressField.AddressLine2(false, 1, null), null, null, 6, null);
        AddressFieldItem.Phone phone = new AddressFieldItem.Phone(new AddressField.Phone(false, 1, null), fixtures.getSTYLE_MAPPER().map(fixtures.getINPUT_COMPONENT_STYLE()), new InputComponentState(null, null, 3, null), fixtures.getSTYLE_MAPPER().map(fixtures.getINPUT_COMPONENT_STYLE()), new InputComponentState(null, null, 3, null));
        ADDRESS_FIELD_ITEM_LIST = CollectionsKt.listOf(phone, standard, copy$default, phone);
        BUTTON_STYLE = new InternalButtonViewStyle(C0366t.hotel, 0L, 0L, C0366t.echo, 0L, new TextLabelViewStyle(null, 0, false, 0, null, null, false, 127, null), AbstractC2094g.bravo(8), p.alpha, 22, null);
        BUTTON_STATE = new InternalButtonState(C0564b.zulu(Boolean.TRUE), new TextLabelState(C0564b.zulu("test button"), null, null, 6, null));
        TEXT_LABEL_ITEM = new TextLabelViewItem(new TextLabelViewStyle(null, 0, false, 0, null, null, false, 127, null), new TextLabelState(C0564b.zulu("Test label"), null, null, 6, null));
        ERROR_LABEL_ITEM = new TextLabelViewItem(new TextLabelViewStyle(null, 0, false, 0, null, new an(Utils.INSTANCE.m191toComposeColorvNxB06k(4289538110L), 0L, null, null, null, 0L, 0, 0L, 0, 16777214), false, 95, null), new TextLabelState(C0564b.zulu("Error label"), null, null, 6, null));
        $stable = 8;
    }

    private Fixtures() {
    }

    @NotNull
    public final List<AddressFieldItem> getADDRESS_FIELD_ITEM_LIST() {
        return ADDRESS_FIELD_ITEM_LIST;
    }

    @NotNull
    public final InternalButtonState getBUTTON_STATE() {
        return BUTTON_STATE;
    }

    @NotNull
    public final InternalButtonViewStyle getBUTTON_STYLE() {
        return BUTTON_STYLE;
    }

    @NotNull
    public final ContactData getCONTACT_DATA() {
        return CONTACT_DATA;
    }

    @NotNull
    public final TextLabelViewItem getERROR_LABEL_ITEM() {
        return ERROR_LABEL_ITEM;
    }

    @NotNull
    public final InputFieldStyleToInputFieldStateMapper getINPUT_FIELD_STATE_MAPPER() {
        return INPUT_FIELD_STATE_MAPPER;
    }

    @NotNull
    public final InputFieldStyleToViewStyleMapper getINPUT_FIELD_STYLE_MAPPER() {
        return INPUT_FIELD_STYLE_MAPPER;
    }

    @NotNull
    public final TextLabelViewItem getTEXT_LABEL_ITEM() {
        return TEXT_LABEL_ITEM;
    }

    @NotNull
    public final StyleUtils styleUtils(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        return new StyleUtils(new ResourceProviderImpl(context, null), null, new CountryPickerStyleUtils(new CountryPickerResourceProvider(context, null), null, new ScreenHeaderStyleUtils(null)), new ScreenHeaderStyleUtils(null));
    }
}
