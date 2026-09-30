package com.checkout.components.card.model;

import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0017¨\u00063"}, d2 = {"Lcom/checkout/components/card/model/CardNumberComponentStyle;", "", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "inputStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "infoTextStyle", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "infoImageStyle", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "containerStyle", "Lcom/checkout/components/card/model/InfoBottomSheetStyle;", "infoBottomSheetStyle", "<init>", "(Lcom/checkout/components/ui/model/style/base/InputComponentStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/style/base/ContainerStyle;Lcom/checkout/components/card/model/InfoBottomSheetStyle;)V", "component1", "()Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "component2", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "component3", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "component4", "()Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "component5", "()Lcom/checkout/components/card/model/InfoBottomSheetStyle;", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/style/base/InputComponentStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/style/base/ContainerStyle;Lcom/checkout/components/card/model/InfoBottomSheetStyle;)Lcom/checkout/components/card/model/CardNumberComponentStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "getInputStyle", "b", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getInfoTextStyle", "c", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "getInfoImageStyle", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "getContainerStyle", "e", "Lcom/checkout/components/card/model/InfoBottomSheetStyle;", "getInfoBottomSheetStyle", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardNumberComponentStyle {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputComponentStyle inputStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLabelStyle infoTextStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImageStyle infoImageStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ContainerStyle containerStyle;

    /* renamed from: e, reason: from kotlin metadata */
    private final InfoBottomSheetStyle infoBottomSheetStyle;

    static {
        int i4 = ImageStyle.$stable;
        int i5 = TextLabelStyle.$stable;
        $stable = i4 | i4 | i5 | i5 | ContainerStyle.$stable | i5 | InputComponentStyle.$stable;
    }

    public CardNumberComponentStyle(@NotNull InputComponentStyle inputStyle, @NotNull TextLabelStyle infoTextStyle, @NotNull ImageStyle infoImageStyle, @NotNull ContainerStyle containerStyle, @NotNull InfoBottomSheetStyle infoBottomSheetStyle) {
        Intrinsics.echo(inputStyle, "inputStyle");
        Intrinsics.echo(infoTextStyle, "infoTextStyle");
        Intrinsics.echo(infoImageStyle, "infoImageStyle");
        Intrinsics.echo(containerStyle, "containerStyle");
        Intrinsics.echo(infoBottomSheetStyle, "infoBottomSheetStyle");
        this.inputStyle = inputStyle;
        this.infoTextStyle = infoTextStyle;
        this.infoImageStyle = infoImageStyle;
        this.containerStyle = containerStyle;
        this.infoBottomSheetStyle = infoBottomSheetStyle;
    }

    public static /* synthetic */ CardNumberComponentStyle copy$default(CardNumberComponentStyle cardNumberComponentStyle, InputComponentStyle inputComponentStyle, TextLabelStyle textLabelStyle, ImageStyle imageStyle, ContainerStyle containerStyle, InfoBottomSheetStyle infoBottomSheetStyle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            inputComponentStyle = cardNumberComponentStyle.inputStyle;
        }
        if ((i4 & 2) != 0) {
            textLabelStyle = cardNumberComponentStyle.infoTextStyle;
        }
        if ((i4 & 4) != 0) {
            imageStyle = cardNumberComponentStyle.infoImageStyle;
        }
        if ((i4 & 8) != 0) {
            containerStyle = cardNumberComponentStyle.containerStyle;
        }
        if ((i4 & 16) != 0) {
            infoBottomSheetStyle = cardNumberComponentStyle.infoBottomSheetStyle;
        }
        InfoBottomSheetStyle infoBottomSheetStyle2 = infoBottomSheetStyle;
        ImageStyle imageStyle2 = imageStyle;
        return cardNumberComponentStyle.copy(inputComponentStyle, textLabelStyle, imageStyle2, containerStyle, infoBottomSheetStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputComponentStyle getInputStyle() {
        return this.inputStyle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelStyle getInfoTextStyle() {
        return this.infoTextStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ImageStyle getInfoImageStyle() {
        return this.infoImageStyle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ContainerStyle getContainerStyle() {
        return this.containerStyle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final InfoBottomSheetStyle getInfoBottomSheetStyle() {
        return this.infoBottomSheetStyle;
    }

    @NotNull
    public final CardNumberComponentStyle copy(@NotNull InputComponentStyle inputStyle, @NotNull TextLabelStyle infoTextStyle, @NotNull ImageStyle infoImageStyle, @NotNull ContainerStyle containerStyle, @NotNull InfoBottomSheetStyle infoBottomSheetStyle) {
        Intrinsics.echo(inputStyle, "inputStyle");
        Intrinsics.echo(infoTextStyle, "infoTextStyle");
        Intrinsics.echo(infoImageStyle, "infoImageStyle");
        Intrinsics.echo(containerStyle, "containerStyle");
        Intrinsics.echo(infoBottomSheetStyle, "infoBottomSheetStyle");
        return new CardNumberComponentStyle(inputStyle, infoTextStyle, infoImageStyle, containerStyle, infoBottomSheetStyle);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardNumberComponentStyle)) {
            return false;
        }
        CardNumberComponentStyle cardNumberComponentStyle = (CardNumberComponentStyle) other;
        return Intrinsics.areEqual(this.inputStyle, cardNumberComponentStyle.inputStyle) && Intrinsics.areEqual(this.infoTextStyle, cardNumberComponentStyle.infoTextStyle) && Intrinsics.areEqual(this.infoImageStyle, cardNumberComponentStyle.infoImageStyle) && Intrinsics.areEqual(this.containerStyle, cardNumberComponentStyle.containerStyle) && Intrinsics.areEqual(this.infoBottomSheetStyle, cardNumberComponentStyle.infoBottomSheetStyle);
    }

    @NotNull
    public final ContainerStyle getContainerStyle() {
        return this.containerStyle;
    }

    @NotNull
    public final InfoBottomSheetStyle getInfoBottomSheetStyle() {
        return this.infoBottomSheetStyle;
    }

    @NotNull
    public final ImageStyle getInfoImageStyle() {
        return this.infoImageStyle;
    }

    @NotNull
    public final TextLabelStyle getInfoTextStyle() {
        return this.infoTextStyle;
    }

    @NotNull
    public final InputComponentStyle getInputStyle() {
        return this.inputStyle;
    }

    public final int hashCode() {
        return this.infoBottomSheetStyle.hashCode() + ((this.containerStyle.hashCode() + ((this.infoImageStyle.hashCode() + ((this.infoTextStyle.hashCode() + (this.inputStyle.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CardNumberComponentStyle(inputStyle=" + this.inputStyle + ", infoTextStyle=" + this.infoTextStyle + ", infoImageStyle=" + this.infoImageStyle + ", containerStyle=" + this.containerStyle + ", infoBottomSheetStyle=" + this.infoBottomSheetStyle + ")";
    }
}
