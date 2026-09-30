package com.checkout.components.ui.utils.constants;

import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;
import com.checkout.components.ui.mapper.InputComponentStyleToViewStyleMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToViewStyleMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.style.DefaultStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/ui/utils/constants/Fixtures;", "", "<init>", "()V", "INPUT_COMPONENT_STYLE", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "getINPUT_COMPONENT_STYLE", "()Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "STYLE_MAPPER", "Lcom/checkout/components/ui/mapper/InputComponentStyleToViewStyleMapper;", "getSTYLE_MAPPER", "()Lcom/checkout/components/ui/mapper/InputComponentStyleToViewStyleMapper;", "PHONE_COUNTRY_PICKER", "", "PAYMENT_METHOD_PHONE_COUNTRY_PICKER", "createCountryPickerScreenTestTag", Constants.KEY_TYPE, "Lcom/checkout/components/ui/model/CountryPickerType;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Fixtures {

    @NotNull
    public static final String PAYMENT_METHOD_PHONE_COUNTRY_PICKER = "phone_country_selector";

    @NotNull
    public static final String PHONE_COUNTRY_PICKER = "phone_country_selector";

    @NotNull
    public static final Fixtures INSTANCE = new Fixtures();

    @NotNull
    private static final InputComponentStyle INPUT_COMPONENT_STYLE = DefaultStyle.createInputComponentStyle$default(DefaultStyle.INSTANCE, "Test input field", null, null, null, null, 30, null);

    @NotNull
    private static final InputComponentStyleToViewStyleMapper STYLE_MAPPER = new InputComponentStyleToViewStyleMapper(new ContainerStyleToModifierMapper(), new TextLabelStyleToViewStyleMapper(), new InputFieldStyleToViewStyleMapper(new TextLabelStyleToViewStyleMapper()));
    public static final int $stable = 8;

    private Fixtures() {
    }

    @NotNull
    public final String createCountryPickerScreenTestTag(@NotNull CountryPickerType type) {
        Intrinsics.echo(type, "type");
        return "address_country_picker_screen_type_" + type + ".name";
    }

    @NotNull
    public final InputComponentStyle getINPUT_COMPONENT_STYLE() {
        return INPUT_COMPONENT_STYLE;
    }

    @NotNull
    public final InputComponentStyleToViewStyleMapper getSTYLE_MAPPER() {
        return STYLE_MAPPER;
    }
}
