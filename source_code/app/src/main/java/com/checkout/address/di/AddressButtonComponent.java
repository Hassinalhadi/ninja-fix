package com.checkout.address.di;

import androidx.annotation.Keep;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006H&J\u0018\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\tH&J\u0018\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0003j\u0002`\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/checkout/address/di/AddressButtonComponent;", "", "inputFieldStateMapper", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/state/InputFieldState;", "Lcom/checkout/components/ui/mapper/InputFieldStateMapper;", "inputFieldStyleMapper", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "textLabelViewStyleMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "Lcom/checkout/components/ui/mapper/TextLabelViewStyleMapper;", "textLabelStateMapper", "Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "errorMessageRepository", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AddressButtonComponent {
    @NotNull
    PrimitiveStateFlowRepository<String> errorMessageRepository();

    @NotNull
    Mapper<InputFieldStyle, InputFieldState> inputFieldStateMapper();

    @NotNull
    Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldStyleMapper();

    @NotNull
    TextLabelStyleToStateMapper textLabelStateMapper();

    @NotNull
    Mapper<TextLabelStyle, TextLabelViewStyle> textLabelViewStyleMapper();
}
