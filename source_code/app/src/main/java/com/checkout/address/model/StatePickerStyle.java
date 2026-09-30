package com.checkout.address.model;

import Q0.c;
import com.checkout.components.ui.model.PickerStyle;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001bR\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010\u001bR\u001a\u0010C\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010\u0012¨\u0006D"}, d2 = {"Lcom/checkout/address/model/StatePickerStyle;", "Lcom/checkout/components/ui/model/PickerStyle;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "nameStyle", "isoCodeStyle", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "searchFieldStyle", "notFoundViewTitleStyle", "notFoundViewSubtitleStyle", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "topAppBarViewStyle", "", "containerColor", "selectedRadioButtonColor", "unSelectedRadioButtonColor", "<init>", "(Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/InputFieldStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/TopAppBarViewStyle;JJJ)V", "component1", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "component2", "component3", "()Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "component4", "component5", "component6", "()Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "component7", "()J", "component8", "component9", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/InputFieldStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/TopAppBarViewStyle;JJJ)Lcom/checkout/address/model/StatePickerStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getNameStyle", "b", "getIsoCodeStyle", "c", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "getSearchFieldStyle", Constants.INAPP_DATA_TAG, "getNotFoundViewTitleStyle", "e", "getNotFoundViewSubtitleStyle", "f", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "getTopAppBarViewStyle", "g", "J", "getContainerColor", "h", "getSelectedRadioButtonColor", "i", "getUnSelectedRadioButtonColor", "j", "getItemNameStyle", "itemNameStyle", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatePickerStyle extends PickerStyle {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLabelStyle nameStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLabelStyle isoCodeStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InputFieldStyle searchFieldStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TextLabelStyle notFoundViewTitleStyle;

    /* renamed from: e, reason: from kotlin metadata */
    private final TextLabelStyle notFoundViewSubtitleStyle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TopAppBarViewStyle topAppBarViewStyle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long selectedRadioButtonColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long unSelectedRadioButtonColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TextLabelStyle itemNameStyle;

    static {
        int i4 = PickerStyle.$stable;
        int i5 = TextLabelStyle.$stable;
        $stable = i4 | i5 | TopAppBarViewStyle.$stable | i5 | i5 | InputFieldStyle.$stable | i5 | i5;
    }

    public /* synthetic */ StatePickerStyle(TextLabelStyle textLabelStyle, TextLabelStyle textLabelStyle2, InputFieldStyle inputFieldStyle, TextLabelStyle textLabelStyle3, TextLabelStyle textLabelStyle4, TopAppBarViewStyle topAppBarViewStyle, long j5, long j6, long j7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLabelStyle, textLabelStyle2, inputFieldStyle, textLabelStyle3, textLabelStyle4, (i4 & 32) != 0 ? new TopAppBarViewStyle(null, 0L, 0L, 0L, 0L, 31, null) : topAppBarViewStyle, (i4 & 64) != 0 ? 4294967295L : j5, (i4 & 128) != 0 ? 4279790335L : j6, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? 4278190080L : j7);
    }

    public static /* synthetic */ StatePickerStyle copy$default(StatePickerStyle statePickerStyle, TextLabelStyle textLabelStyle, TextLabelStyle textLabelStyle2, InputFieldStyle inputFieldStyle, TextLabelStyle textLabelStyle3, TextLabelStyle textLabelStyle4, TopAppBarViewStyle topAppBarViewStyle, long j5, long j6, long j7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            textLabelStyle = statePickerStyle.nameStyle;
        }
        if ((i4 & 2) != 0) {
            textLabelStyle2 = statePickerStyle.isoCodeStyle;
        }
        if ((i4 & 4) != 0) {
            inputFieldStyle = statePickerStyle.searchFieldStyle;
        }
        if ((i4 & 8) != 0) {
            textLabelStyle3 = statePickerStyle.notFoundViewTitleStyle;
        }
        if ((i4 & 16) != 0) {
            textLabelStyle4 = statePickerStyle.notFoundViewSubtitleStyle;
        }
        if ((i4 & 32) != 0) {
            topAppBarViewStyle = statePickerStyle.topAppBarViewStyle;
        }
        if ((i4 & 64) != 0) {
            j5 = statePickerStyle.containerColor;
        }
        if ((i4 & 128) != 0) {
            j6 = statePickerStyle.selectedRadioButtonColor;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            j7 = statePickerStyle.unSelectedRadioButtonColor;
        }
        long j10 = j7;
        long j11 = j6;
        long j12 = j5;
        TextLabelStyle textLabelStyle5 = textLabelStyle4;
        TopAppBarViewStyle topAppBarViewStyle2 = topAppBarViewStyle;
        return statePickerStyle.copy(textLabelStyle, textLabelStyle2, inputFieldStyle, textLabelStyle3, textLabelStyle5, topAppBarViewStyle2, j12, j11, j10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextLabelStyle getNameStyle() {
        return this.nameStyle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelStyle getIsoCodeStyle() {
        return this.isoCodeStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InputFieldStyle getSearchFieldStyle() {
        return this.searchFieldStyle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextLabelStyle getNotFoundViewTitleStyle() {
        return this.notFoundViewTitleStyle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextLabelStyle getNotFoundViewSubtitleStyle() {
        return this.notFoundViewSubtitleStyle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    /* renamed from: component7, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: component8, reason: from getter */
    public final long getSelectedRadioButtonColor() {
        return this.selectedRadioButtonColor;
    }

    /* renamed from: component9, reason: from getter */
    public final long getUnSelectedRadioButtonColor() {
        return this.unSelectedRadioButtonColor;
    }

    @NotNull
    public final StatePickerStyle copy(@NotNull TextLabelStyle nameStyle, @NotNull TextLabelStyle isoCodeStyle, @NotNull InputFieldStyle searchFieldStyle, @NotNull TextLabelStyle notFoundViewTitleStyle, @NotNull TextLabelStyle notFoundViewSubtitleStyle, @NotNull TopAppBarViewStyle topAppBarViewStyle, long containerColor, long selectedRadioButtonColor, long unSelectedRadioButtonColor) {
        Intrinsics.echo(nameStyle, "nameStyle");
        Intrinsics.echo(isoCodeStyle, "isoCodeStyle");
        Intrinsics.echo(searchFieldStyle, "searchFieldStyle");
        Intrinsics.echo(notFoundViewTitleStyle, "notFoundViewTitleStyle");
        Intrinsics.echo(notFoundViewSubtitleStyle, "notFoundViewSubtitleStyle");
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        return new StatePickerStyle(nameStyle, isoCodeStyle, searchFieldStyle, notFoundViewTitleStyle, notFoundViewSubtitleStyle, topAppBarViewStyle, containerColor, selectedRadioButtonColor, unSelectedRadioButtonColor);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatePickerStyle)) {
            return false;
        }
        StatePickerStyle statePickerStyle = (StatePickerStyle) other;
        return Intrinsics.areEqual(this.nameStyle, statePickerStyle.nameStyle) && Intrinsics.areEqual(this.isoCodeStyle, statePickerStyle.isoCodeStyle) && Intrinsics.areEqual(this.searchFieldStyle, statePickerStyle.searchFieldStyle) && Intrinsics.areEqual(this.notFoundViewTitleStyle, statePickerStyle.notFoundViewTitleStyle) && Intrinsics.areEqual(this.notFoundViewSubtitleStyle, statePickerStyle.notFoundViewSubtitleStyle) && Intrinsics.areEqual(this.topAppBarViewStyle, statePickerStyle.topAppBarViewStyle) && this.containerColor == statePickerStyle.containerColor && this.selectedRadioButtonColor == statePickerStyle.selectedRadioButtonColor && this.unSelectedRadioButtonColor == statePickerStyle.unSelectedRadioButtonColor;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    public final long getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    public final TextLabelStyle getIsoCodeStyle() {
        return this.isoCodeStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public final TextLabelStyle getItemNameStyle() {
        return this.itemNameStyle;
    }

    @NotNull
    public final TextLabelStyle getNameStyle() {
        return this.nameStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public final TextLabelStyle getNotFoundViewSubtitleStyle() {
        return this.notFoundViewSubtitleStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public final TextLabelStyle getNotFoundViewTitleStyle() {
        return this.notFoundViewTitleStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public final InputFieldStyle getSearchFieldStyle() {
        return this.searchFieldStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    public final long getSelectedRadioButtonColor() {
        return this.selectedRadioButtonColor;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public final TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    public final long getUnSelectedRadioButtonColor() {
        return this.unSelectedRadioButtonColor;
    }

    public final int hashCode() {
        int hashCode = (this.topAppBarViewStyle.hashCode() + ((this.notFoundViewSubtitleStyle.hashCode() + ((this.notFoundViewTitleStyle.hashCode() + ((this.searchFieldStyle.hashCode() + ((this.isoCodeStyle.hashCode() + (this.nameStyle.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        long j5 = this.containerColor;
        long j6 = this.selectedRadioButtonColor;
        int i4 = (((int) (j6 ^ (j6 >>> 32))) + ((((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31)) * 31;
        long j7 = this.unSelectedRadioButtonColor;
        return ((int) (j7 ^ (j7 >>> 32))) + i4;
    }

    @NotNull
    public final String toString() {
        TextLabelStyle textLabelStyle = this.nameStyle;
        TextLabelStyle textLabelStyle2 = this.isoCodeStyle;
        InputFieldStyle inputFieldStyle = this.searchFieldStyle;
        TextLabelStyle textLabelStyle3 = this.notFoundViewTitleStyle;
        TextLabelStyle textLabelStyle4 = this.notFoundViewSubtitleStyle;
        TopAppBarViewStyle topAppBarViewStyle = this.topAppBarViewStyle;
        long j5 = this.containerColor;
        long j6 = this.selectedRadioButtonColor;
        long j7 = this.unSelectedRadioButtonColor;
        StringBuilder sb2 = new StringBuilder("StatePickerStyle(nameStyle=");
        sb2.append(textLabelStyle);
        sb2.append(", isoCodeStyle=");
        sb2.append(textLabelStyle2);
        sb2.append(", searchFieldStyle=");
        sb2.append(inputFieldStyle);
        sb2.append(", notFoundViewTitleStyle=");
        sb2.append(textLabelStyle3);
        sb2.append(", notFoundViewSubtitleStyle=");
        sb2.append(textLabelStyle4);
        sb2.append(", topAppBarViewStyle=");
        sb2.append(topAppBarViewStyle);
        sb2.append(", containerColor=");
        sb2.append(j5);
        c.amber(sb2, ", selectedRadioButtonColor=", j6, ", unSelectedRadioButtonColor=");
        return c.mike(j7, ")", sb2);
    }

    public StatePickerStyle(@NotNull TextLabelStyle nameStyle, @NotNull TextLabelStyle isoCodeStyle, @NotNull InputFieldStyle searchFieldStyle, @NotNull TextLabelStyle notFoundViewTitleStyle, @NotNull TextLabelStyle notFoundViewSubtitleStyle, @NotNull TopAppBarViewStyle topAppBarViewStyle, long j5, long j6, long j7) {
        Intrinsics.echo(nameStyle, "nameStyle");
        Intrinsics.echo(isoCodeStyle, "isoCodeStyle");
        Intrinsics.echo(searchFieldStyle, "searchFieldStyle");
        Intrinsics.echo(notFoundViewTitleStyle, "notFoundViewTitleStyle");
        Intrinsics.echo(notFoundViewSubtitleStyle, "notFoundViewSubtitleStyle");
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        this.nameStyle = nameStyle;
        this.isoCodeStyle = isoCodeStyle;
        this.searchFieldStyle = searchFieldStyle;
        this.notFoundViewTitleStyle = notFoundViewTitleStyle;
        this.notFoundViewSubtitleStyle = notFoundViewSubtitleStyle;
        this.topAppBarViewStyle = topAppBarViewStyle;
        this.containerColor = j5;
        this.selectedRadioButtonColor = j6;
        this.unSelectedRadioButtonColor = j7;
        this.itemNameStyle = nameStyle;
    }
}
