package com.checkout.components.ui.mapper;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.TextStyleExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/checkout/components/ui/mapper/TextLabelStyleToViewStyleMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "<init>", "()V", "map", "from", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextLabelStyleToViewStyleMapper implements Mapper<TextLabelStyle, TextLabelViewStyle> {
    public static final int $stable = 0;

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public TextLabelViewStyle map(@NotNull TextLabelStyle from) {
        Intrinsics.echo(from, "from");
        return new TextLabelViewStyle(null, 0, false, from.getTextStyle().getMaxLines(), null, TextStyleExtensionsKt.toComposeTextStyle(from.getTextStyle(), from.isLabelPreparingForInputField()), false, 87, null);
    }
}
