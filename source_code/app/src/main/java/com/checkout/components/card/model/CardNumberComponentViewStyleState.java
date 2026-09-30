package com.checkout.components.card.model;

import T.p;
import T.s;
import a0.C0366t;
import ao.ad;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001c¨\u0006<"}, d2 = {"Lcom/checkout/components/card/model/CardNumberComponentViewStyleState;", "", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "textLabelStyle", "Lcom/checkout/components/ui/model/state/TextLabelState;", "textLabelState", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "infoImageStyle", "LT/s;", "containerModifier", "La0/t;", "selectedBorderColor", "Lcom/checkout/components/card/model/InfoBottomSheetViewStyleState;", "infoBottomSheetViewStyleState", "<init>", "(Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/state/TextLabelState;Lcom/checkout/components/ui/model/style/base/ImageStyle;LT/s;JLcom/checkout/components/card/model/InfoBottomSheetViewStyleState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "component2", "()Lcom/checkout/components/ui/model/state/TextLabelState;", "component3", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "component4", "()LT/s;", "component5-0d7_KjU", "()J", "component5", "component6", "()Lcom/checkout/components/card/model/InfoBottomSheetViewStyleState;", "copy-jzV_Hc0", "(Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/state/TextLabelState;Lcom/checkout/components/ui/model/style/base/ImageStyle;LT/s;JLcom/checkout/components/card/model/InfoBottomSheetViewStyleState;)Lcom/checkout/components/card/model/CardNumberComponentViewStyleState;", Constants.COPY_TYPE, "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "getTextLabelStyle", "b", "Lcom/checkout/components/ui/model/state/TextLabelState;", "getTextLabelState", "c", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "getInfoImageStyle", Constants.INAPP_DATA_TAG, "LT/s;", "getContainerModifier", "e", "J", "getSelectedBorderColor-0d7_KjU", "f", "Lcom/checkout/components/card/model/InfoBottomSheetViewStyleState;", "getInfoBottomSheetViewStyleState", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardNumberComponentViewStyleState {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewStyle textLabelStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLabelState textLabelState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImageStyle infoImageStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s containerModifier;

    /* renamed from: e, reason: from kotlin metadata */
    private final long selectedBorderColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InfoBottomSheetViewStyleState infoBottomSheetViewStyleState;

    static {
        int i4 = ImageStyle.$stable;
        int i5 = TextLabelState.$stable;
        int i10 = TextLabelViewStyle.$stable;
        $stable = i4 | i4 | i5 | i10 | i5 | i10 | i5 | i10;
    }

    public CardNumberComponentViewStyleState(TextLabelViewStyle textLabelStyle, TextLabelState textLabelState, ImageStyle infoImageStyle, s containerModifier, long j5, InfoBottomSheetViewStyleState infoBottomSheetViewStyleState, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.echo(textLabelStyle, "textLabelStyle");
        Intrinsics.echo(textLabelState, "textLabelState");
        Intrinsics.echo(infoImageStyle, "infoImageStyle");
        Intrinsics.echo(containerModifier, "containerModifier");
        Intrinsics.echo(infoBottomSheetViewStyleState, "infoBottomSheetViewStyleState");
        this.textLabelStyle = textLabelStyle;
        this.textLabelState = textLabelState;
        this.infoImageStyle = infoImageStyle;
        this.containerModifier = containerModifier;
        this.selectedBorderColor = j5;
        this.infoBottomSheetViewStyleState = infoBottomSheetViewStyleState;
    }

    /* renamed from: copy-jzV_Hc0$default, reason: not valid java name */
    public static /* synthetic */ CardNumberComponentViewStyleState m68copyjzV_Hc0$default(CardNumberComponentViewStyleState cardNumberComponentViewStyleState, TextLabelViewStyle textLabelViewStyle, TextLabelState textLabelState, ImageStyle imageStyle, s sVar, long j5, InfoBottomSheetViewStyleState infoBottomSheetViewStyleState, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            textLabelViewStyle = cardNumberComponentViewStyleState.textLabelStyle;
        }
        if ((i4 & 2) != 0) {
            textLabelState = cardNumberComponentViewStyleState.textLabelState;
        }
        if ((i4 & 4) != 0) {
            imageStyle = cardNumberComponentViewStyleState.infoImageStyle;
        }
        if ((i4 & 8) != 0) {
            sVar = cardNumberComponentViewStyleState.containerModifier;
        }
        if ((i4 & 16) != 0) {
            j5 = cardNumberComponentViewStyleState.selectedBorderColor;
        }
        if ((i4 & 32) != 0) {
            infoBottomSheetViewStyleState = cardNumberComponentViewStyleState.infoBottomSheetViewStyleState;
        }
        InfoBottomSheetViewStyleState infoBottomSheetViewStyleState2 = infoBottomSheetViewStyleState;
        long j6 = j5;
        return cardNumberComponentViewStyleState.m70copyjzV_Hc0(textLabelViewStyle, textLabelState, imageStyle, sVar, j6, infoBottomSheetViewStyleState2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextLabelViewStyle getTextLabelStyle() {
        return this.textLabelStyle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelState getTextLabelState() {
        return this.textLabelState;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ImageStyle getInfoImageStyle() {
        return this.infoImageStyle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final s getContainerModifier() {
        return this.containerModifier;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedBorderColor() {
        return this.selectedBorderColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final InfoBottomSheetViewStyleState getInfoBottomSheetViewStyleState() {
        return this.infoBottomSheetViewStyleState;
    }

    @NotNull
    /* renamed from: copy-jzV_Hc0, reason: not valid java name */
    public final CardNumberComponentViewStyleState m70copyjzV_Hc0(@NotNull TextLabelViewStyle textLabelStyle, @NotNull TextLabelState textLabelState, @NotNull ImageStyle infoImageStyle, @NotNull s containerModifier, long selectedBorderColor, @NotNull InfoBottomSheetViewStyleState infoBottomSheetViewStyleState) {
        Intrinsics.echo(textLabelStyle, "textLabelStyle");
        Intrinsics.echo(textLabelState, "textLabelState");
        Intrinsics.echo(infoImageStyle, "infoImageStyle");
        Intrinsics.echo(containerModifier, "containerModifier");
        Intrinsics.echo(infoBottomSheetViewStyleState, "infoBottomSheetViewStyleState");
        return new CardNumberComponentViewStyleState(textLabelStyle, textLabelState, infoImageStyle, containerModifier, selectedBorderColor, infoBottomSheetViewStyleState, null);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardNumberComponentViewStyleState)) {
            return false;
        }
        CardNumberComponentViewStyleState cardNumberComponentViewStyleState = (CardNumberComponentViewStyleState) other;
        return Intrinsics.areEqual(this.textLabelStyle, cardNumberComponentViewStyleState.textLabelStyle) && Intrinsics.areEqual(this.textLabelState, cardNumberComponentViewStyleState.textLabelState) && Intrinsics.areEqual(this.infoImageStyle, cardNumberComponentViewStyleState.infoImageStyle) && Intrinsics.areEqual(this.containerModifier, cardNumberComponentViewStyleState.containerModifier) && C0366t.charlie(this.selectedBorderColor, cardNumberComponentViewStyleState.selectedBorderColor) && Intrinsics.areEqual(this.infoBottomSheetViewStyleState, cardNumberComponentViewStyleState.infoBottomSheetViewStyleState);
    }

    @NotNull
    public final s getContainerModifier() {
        return this.containerModifier;
    }

    @NotNull
    public final InfoBottomSheetViewStyleState getInfoBottomSheetViewStyleState() {
        return this.infoBottomSheetViewStyleState;
    }

    @NotNull
    public final ImageStyle getInfoImageStyle() {
        return this.infoImageStyle;
    }

    /* renamed from: getSelectedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m71getSelectedBorderColor0d7_KjU() {
        return this.selectedBorderColor;
    }

    @NotNull
    public final TextLabelState getTextLabelState() {
        return this.textLabelState;
    }

    @NotNull
    public final TextLabelViewStyle getTextLabelStyle() {
        return this.textLabelStyle;
    }

    public final int hashCode() {
        int hashCode = (this.containerModifier.hashCode() + ((this.infoImageStyle.hashCode() + ((this.textLabelState.hashCode() + (this.textLabelStyle.hashCode() * 31)) * 31)) * 31)) * 31;
        long j5 = this.selectedBorderColor;
        int i4 = C0366t.lima;
        return this.infoBottomSheetViewStyleState.hashCode() + ad.whiskey(hashCode, 31, j5);
    }

    @NotNull
    public final String toString() {
        return "CardNumberComponentViewStyleState(textLabelStyle=" + this.textLabelStyle + ", textLabelState=" + this.textLabelState + ", infoImageStyle=" + this.infoImageStyle + ", containerModifier=" + this.containerModifier + ", selectedBorderColor=" + C0366t.india(this.selectedBorderColor) + ", infoBottomSheetViewStyleState=" + this.infoBottomSheetViewStyleState + ")";
    }

    public /* synthetic */ CardNumberComponentViewStyleState(TextLabelViewStyle textLabelViewStyle, TextLabelState textLabelState, ImageStyle imageStyle, s sVar, long j5, InfoBottomSheetViewStyleState infoBottomSheetViewStyleState, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLabelViewStyle, textLabelState, imageStyle, (i4 & 8) != 0 ? p.alpha : sVar, j5, infoBottomSheetViewStyleState, null);
    }
}
