package com.checkout.components.ui.mapper;

import T.s;
import a0.ao;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.ShapeExtensionsKt;
import h5.C1809a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/ui/mapper/ButtonStyleToInternalViewStyleMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "LT/s;", "containerMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "textLabelMapper", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;)V", "from", "map", "(Lcom/checkout/components/ui/model/style/base/ButtonStyle;)Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Companion", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonStyleToInternalViewStyleMapper implements Mapper<ButtonStyle, InternalButtonViewStyle> {

    @NotNull
    private final Mapper<ContainerStyle, s> containerMapper;

    @NotNull
    private final Mapper<TextLabelStyle, TextLabelViewStyle> textLabelMapper;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Lazy<ButtonStyleToInternalViewStyleMapper> DEFAULT$delegate = LazyKt.lazy(new C1809a(4));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/checkout/components/ui/mapper/ButtonStyleToInternalViewStyleMapper$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/checkout/components/ui/mapper/ButtonStyleToInternalViewStyleMapper;", "getDEFAULT", "()Lcom/checkout/components/ui/mapper/ButtonStyleToInternalViewStyleMapper;", "DEFAULT$delegate", "Lkotlin/Lazy;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ButtonStyleToInternalViewStyleMapper getDEFAULT() {
            return (ButtonStyleToInternalViewStyleMapper) ButtonStyleToInternalViewStyleMapper.DEFAULT$delegate.getValue();
        }

        private Companion() {
        }
    }

    public ButtonStyleToInternalViewStyleMapper(@NotNull Mapper<ContainerStyle, s> containerMapper, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelMapper) {
        Intrinsics.echo(containerMapper, "containerMapper");
        Intrinsics.echo(textLabelMapper, "textLabelMapper");
        this.containerMapper = containerMapper;
        this.textLabelMapper = textLabelMapper;
    }

    public static final ButtonStyleToInternalViewStyleMapper DEFAULT_delegate$lambda$0() {
        return new ButtonStyleToInternalViewStyleMapper(new ContainerStyleToModifierMapper(), new TextLabelStyleToViewStyleMapper());
    }

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public InternalButtonViewStyle map(@NotNull ButtonStyle from) {
        Intrinsics.echo(from, "from");
        return new InternalButtonViewStyle(ao.delta(from.getContainerColor()), ao.delta(from.getDisabledContainerColor()), ao.delta(from.getSuccessContainerColor()), ao.delta(from.getContentColor()), ao.delta(from.getDisabledContentColor()), this.textLabelMapper.map(from.getTextStyle()), ShapeExtensionsKt.toComposeShape(from.getShape(), from.getBorderRadius()), this.containerMapper.map(from.getContainerStyle()), null);
    }
}
