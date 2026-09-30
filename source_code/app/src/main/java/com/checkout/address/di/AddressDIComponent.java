package com.checkout.address.di;

import androidx.annotation.Keep;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.address.model.validation.contract.AddressValidator;
import com.checkout.address.utils.StyleUtils;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0002j\u0002`\nH&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0002j\u0002`\rH&¢\u0006\u0004\b\u000e\u0010\u0007J\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0002j\u0002`\u0011H&¢\u0006\u0004\b\u0012\u0010\u0007J\u001f\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u0002j\u0002`\u0014H&¢\u0006\u0004\b\u0015\u0010\u0007J\u001f\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0002j\u0002`\u0018H&¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H&¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H&¢\u0006\u0004\b*\u0010+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Lcom/checkout/address/di/AddressDIComponent;", "", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/model/AddressField;", "Lcom/checkout/address/model/AddressFieldItem;", "Lcom/checkout/address/mapper/AddressFieldStyleMapper;", "addressFieldMapper", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "Lcom/checkout/components/ui/mapper/ButtonViewStyleMapper;", "buttonStyleMapper", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "Lcom/checkout/components/ui/mapper/ButtonStateMapper;", "buttonStateMapper", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/state/InputFieldState;", "Lcom/checkout/components/ui/mapper/InputFieldStateMapper;", "inputFieldStateMapper", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "inputFieldStyleMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "Lcom/checkout/components/ui/mapper/TextLabelViewStyleMapper;", "textLabelViewStyleMapper", "Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "textLabelStateMapper", "()Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "Lcom/checkout/address/utils/StyleUtils;", "styleUtils", "()Lcom/checkout/address/utils/StyleUtils;", "Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "countryPickerStyleUtils", "()Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "Lcom/checkout/address/model/validation/contract/AddressValidator;", "addressValidator", "()Lcom/checkout/address/model/validation/contract/AddressValidator;", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "()Lcom/checkout/components/interfaces/ui/ResourceProvider;", "", "isRTL", "()Z", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AddressDIComponent {
    @NotNull
    Mapper<AddressField, AddressFieldItem> addressFieldMapper();

    @NotNull
    AddressValidator addressValidator();

    @NotNull
    Mapper<ButtonStyle, InternalButtonState> buttonStateMapper();

    @NotNull
    Mapper<ButtonStyle, InternalButtonViewStyle> buttonStyleMapper();

    @NotNull
    CountryPickerStyleUtils countryPickerStyleUtils();

    @NotNull
    Mapper<InputFieldStyle, InputFieldState> inputFieldStateMapper();

    @NotNull
    Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldStyleMapper();

    boolean isRTL();

    @NotNull
    ResourceProvider resourceProvider();

    @NotNull
    StyleUtils styleUtils();

    @NotNull
    TextLabelStyleToStateMapper textLabelStateMapper();

    @NotNull
    Mapper<TextLabelStyle, TextLabelViewStyle> textLabelViewStyleMapper();
}
