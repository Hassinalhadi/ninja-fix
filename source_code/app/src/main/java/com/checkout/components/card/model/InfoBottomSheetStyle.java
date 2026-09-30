package com.checkout.components.card.model;

import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006)"}, d2 = {"Lcom/checkout/components/card/model/InfoBottomSheetStyle;", "", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "titleStyle", "descriptionStyle", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "closeIconImageStyle", "", "containerColor", "<init>", "(Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;J)V", "component1", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "component2", "component3", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "component4", "()J", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;J)Lcom/checkout/components/card/model/InfoBottomSheetStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getTitleStyle", "b", "getDescriptionStyle", "c", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "getCloseIconImageStyle", Constants.INAPP_DATA_TAG, "J", "getContainerColor", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoBottomSheetStyle {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLabelStyle titleStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLabelStyle descriptionStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImageStyle closeIconImageStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    static {
        int i4 = ImageStyle.$stable;
        int i5 = TextLabelStyle.$stable;
        $stable = i4 | i5 | i5;
    }

    public InfoBottomSheetStyle(@NotNull TextLabelStyle titleStyle, @NotNull TextLabelStyle descriptionStyle, @NotNull ImageStyle closeIconImageStyle, long j5) {
        Intrinsics.echo(titleStyle, "titleStyle");
        Intrinsics.echo(descriptionStyle, "descriptionStyle");
        Intrinsics.echo(closeIconImageStyle, "closeIconImageStyle");
        this.titleStyle = titleStyle;
        this.descriptionStyle = descriptionStyle;
        this.closeIconImageStyle = closeIconImageStyle;
        this.containerColor = j5;
    }

    public static /* synthetic */ InfoBottomSheetStyle copy$default(InfoBottomSheetStyle infoBottomSheetStyle, TextLabelStyle textLabelStyle, TextLabelStyle textLabelStyle2, ImageStyle imageStyle, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            textLabelStyle = infoBottomSheetStyle.titleStyle;
        }
        if ((i4 & 2) != 0) {
            textLabelStyle2 = infoBottomSheetStyle.descriptionStyle;
        }
        if ((i4 & 4) != 0) {
            imageStyle = infoBottomSheetStyle.closeIconImageStyle;
        }
        if ((i4 & 8) != 0) {
            j5 = infoBottomSheetStyle.containerColor;
        }
        ImageStyle imageStyle2 = imageStyle;
        return infoBottomSheetStyle.copy(textLabelStyle, textLabelStyle2, imageStyle2, j5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextLabelStyle getTitleStyle() {
        return this.titleStyle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelStyle getDescriptionStyle() {
        return this.descriptionStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ImageStyle getCloseIconImageStyle() {
        return this.closeIconImageStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    public final InfoBottomSheetStyle copy(@NotNull TextLabelStyle titleStyle, @NotNull TextLabelStyle descriptionStyle, @NotNull ImageStyle closeIconImageStyle, long containerColor) {
        Intrinsics.echo(titleStyle, "titleStyle");
        Intrinsics.echo(descriptionStyle, "descriptionStyle");
        Intrinsics.echo(closeIconImageStyle, "closeIconImageStyle");
        return new InfoBottomSheetStyle(titleStyle, descriptionStyle, closeIconImageStyle, containerColor);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoBottomSheetStyle)) {
            return false;
        }
        InfoBottomSheetStyle infoBottomSheetStyle = (InfoBottomSheetStyle) other;
        return Intrinsics.areEqual(this.titleStyle, infoBottomSheetStyle.titleStyle) && Intrinsics.areEqual(this.descriptionStyle, infoBottomSheetStyle.descriptionStyle) && Intrinsics.areEqual(this.closeIconImageStyle, infoBottomSheetStyle.closeIconImageStyle) && this.containerColor == infoBottomSheetStyle.containerColor;
    }

    @NotNull
    public final ImageStyle getCloseIconImageStyle() {
        return this.closeIconImageStyle;
    }

    public final long getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    public final TextLabelStyle getDescriptionStyle() {
        return this.descriptionStyle;
    }

    @NotNull
    public final TextLabelStyle getTitleStyle() {
        return this.titleStyle;
    }

    public final int hashCode() {
        int hashCode = (this.closeIconImageStyle.hashCode() + ((this.descriptionStyle.hashCode() + (this.titleStyle.hashCode() * 31)) * 31)) * 31;
        long j5 = this.containerColor;
        return ((int) (j5 ^ (j5 >>> 32))) + hashCode;
    }

    @NotNull
    public final String toString() {
        return "InfoBottomSheetStyle(titleStyle=" + this.titleStyle + ", descriptionStyle=" + this.descriptionStyle + ", closeIconImageStyle=" + this.closeIconImageStyle + ", containerColor=" + this.containerColor + ")";
    }
}
