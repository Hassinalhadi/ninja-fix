package com.checkout.components.ui.mapper;

import Xd.l;
import androidx.compose.runtime.C0564b;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/ui/mapper/InputFieldStyleToInputFieldStateMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/state/InputFieldState;", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "Lkotlin/Function0;", "", "imageMapper", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;)V", "from", "map", "(Lcom/checkout/components/ui/model/style/base/InputFieldStyle;)Lcom/checkout/components/ui/model/state/InputFieldState;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputFieldStyleToInputFieldStateMapper implements Mapper<InputFieldStyle, InputFieldState> {
    public static final int $stable = 8;

    @NotNull
    private final Mapper<ImageStyle, l> imageMapper;

    public InputFieldStyleToInputFieldStateMapper(@NotNull Mapper<ImageStyle, l> imageMapper) {
        Intrinsics.echo(imageMapper, "imageMapper");
        this.imageMapper = imageMapper;
    }

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public InputFieldState map(@NotNull InputFieldStyle from) {
        Intrinsics.echo(from, "from");
        return new InputFieldState(null, C0564b.zulu(from.getTextStyle().getMaxLength()), this.imageMapper.map(from.getLeadingIconStyle()), this.imageMapper.map(from.getTrailingIconStyle()), null, 17, null);
    }
}
