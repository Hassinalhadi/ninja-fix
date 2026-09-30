package com.checkout.address.mapper;

import androidx.appcompat.widget.P0;
import ao.ad;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.components.address.R;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.Padding;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.style.DefaultStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n.aw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004BK\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001j\u0002`\t\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0001j\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/checkout/address/mapper/AddressFieldToInputComponentStyleMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/model/AddressField;", "Lcom/checkout/address/model/AddressFieldItem;", "Lcom/checkout/address/mapper/AddressFieldStyleMapper;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "Lcom/checkout/components/ui/mapper/InputComponentViewStyleMapper;", "viewStyleMapper", "Lcom/checkout/components/ui/model/state/InputComponentState;", "Lcom/checkout/components/ui/mapper/InputComponentStateMapper;", "stateMapper", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "<init>", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "from", "map", "(Lcom/checkout/components/interfaces/model/AddressField;)Lcom/checkout/address/model/AddressFieldItem;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressFieldToInputComponentStyleMapper implements Mapper<AddressField, AddressFieldItem> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final DesignTokens f3730a;

    /* renamed from: b, reason: collision with root package name */
    private final Mapper f3731b;

    /* renamed from: c, reason: collision with root package name */
    private final Mapper f3732c;

    /* renamed from: d, reason: collision with root package name */
    private final ResourceProvider f3733d;

    public AddressFieldToInputComponentStyleMapper(@Nullable DesignTokens designTokens, @NotNull Mapper<InputComponentStyle, InputComponentViewStyle> viewStyleMapper, @NotNull Mapper<InputComponentStyle, InputComponentState> stateMapper, @NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(viewStyleMapper, "viewStyleMapper");
        Intrinsics.echo(stateMapper, "stateMapper");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.f3730a = designTokens;
        this.f3731b = viewStyleMapper;
        this.f3732c = stateMapper;
        this.f3733d = resourceProvider;
    }

    private final InputComponentStyle a(AddressField addressField) {
        if (addressField instanceof AddressField.AddressLine1) {
            return a(this, P0.crimson(this.f3733d.getString(R.string.cko_address_address_line1), b(addressField)), 0, 0, null, 14);
        }
        if (addressField instanceof AddressField.AddressLine2) {
            return a(this, P0.crimson(this.f3733d.getString(R.string.cko_address_address_line2), b(addressField)), 0, 0, null, 14);
        }
        if (addressField instanceof AddressField.City) {
            return a(this, P0.crimson(this.f3733d.getString(R.string.cko_address_city), b(addressField)), 0, 0, null, 14);
        }
        if (addressField instanceof AddressField.Email) {
            return a(this, P0.crimson(this.f3733d.getString(com.checkout.components.ui.R.string.cko_form_email), b(addressField)), 6, 0, null, 12);
        }
        if (addressField instanceof AddressField.FirstName) {
            return a(this, P0.crimson(this.f3733d.getString(R.string.cko_form_first_name), b(addressField)), 0, 0, null, 14);
        }
        if (addressField instanceof AddressField.LastName) {
            return a(this, P0.crimson(this.f3733d.getString(R.string.cko_form_last_name), b(addressField)), 0, 0, null, 14);
        }
        if (addressField instanceof AddressField.Phone) {
            return a(this, P0.crimson(this.f3733d.getString(com.checkout.components.ui.R.string.cko_form_phone_number), b(addressField)), 4, 0, new Padding(10, 0, 4, 16, 2, null), 4);
        }
        if (addressField instanceof AddressField.State) {
            return a(b(addressField));
        }
        if (addressField instanceof AddressField.Zip) {
            return a(this, P0.crimson(this.f3733d.getString(R.string.cko_address_zip), b(addressField)), 1, 7, null, 8);
        }
        if (addressField instanceof AddressField.Country) {
            return DefaultStyle.INSTANCE.createPickerFieldStyle(new Padding(10, 0, 16, 16, 2, null), this.f3733d.getString(R.string.cko_address_country), this.f3730a);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String b(AddressField addressField) {
        if (addressField.getIsOptional()) {
            return ad.gray(" (", this.f3733d.getString(R.string.cko_form_optional), ")");
        }
        return "";
    }

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public final AddressFieldItem map(@NotNull AddressField from) {
        Intrinsics.echo(from, "from");
        InputComponentStyle a6 = a(from);
        InputComponentViewStyle inputComponentViewStyle = (InputComponentViewStyle) this.f3731b.map(a6);
        InputComponentState inputComponentState = (InputComponentState) this.f3732c.map(a6);
        if (from instanceof AddressField.Phone) {
            InputComponentStyle createPickerFieldStyle = DefaultStyle.INSTANCE.createPickerFieldStyle(new Padding(10, 0, 16, 0, 10, null), this.f3733d.getString(R.string.cko_address_country), this.f3730a);
            InputComponentViewStyle inputComponentViewStyle2 = (InputComponentViewStyle) this.f3731b.map(createPickerFieldStyle);
            return new AddressFieldItem.Phone((AddressField.Phone) from, inputComponentViewStyle, inputComponentState, InputComponentViewStyle.copy$default(inputComponentViewStyle2, InputFieldViewStyle.copy$default(inputComponentViewStyle2.getInputFieldStyle(), null, false, true, null, null, null, null, null, null, false, 0, 0, null, null, null, 32761, null), null, null, 6, null), (InputComponentState) this.f3732c.map(createPickerFieldStyle));
        }
        if (from instanceof AddressField.Country) {
            return new AddressFieldItem.Standard(from, InputComponentViewStyle.copy$default(inputComponentViewStyle, InputFieldViewStyle.copy$default(inputComponentViewStyle.getInputFieldStyle(), null, false, true, null, null, null, null, null, null, false, 0, 0, null, null, null, 32761, null), null, null, 6, null), inputComponentState);
        }
        return new AddressFieldItem.Standard(from, inputComponentViewStyle, inputComponentState);
    }

    public /* synthetic */ AddressFieldToInputComponentStyleMapper(DesignTokens designTokens, Mapper mapper, Mapper mapper2, ResourceProvider resourceProvider, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : designTokens, mapper, mapper2, resourceProvider);
    }

    public static InputComponentStyle a(AddressFieldToInputComponentStyleMapper addressFieldToInputComponentStyleMapper, String str, int i4, int i5, Padding padding, int i10) {
        if ((i10 & 2) != 0) {
            i4 = 1;
        }
        if ((i10 & 4) != 0) {
            i5 = 6;
        }
        if ((i10 & 8) != 0) {
            padding = null;
        }
        return DefaultStyle.createInputComponentStyle$default(DefaultStyle.INSTANCE, str, addressFieldToInputComponentStyleMapper.f3730a, padding, new aw(i4, i5, 115), null, 16, null);
    }

    private final InputComponentStyle a(String str) {
        return DefaultStyle.INSTANCE.createPickerFieldStyle(new Padding(10, 0, 16, 16, 2, null), P0.crimson(this.f3733d.getString(R.string.cko_address_state), str), this.f3730a);
    }
}
