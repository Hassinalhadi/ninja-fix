package com.checkout.components.ui.model;

import Q0.c;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003Jm\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013¨\u00065"}, d2 = {"Lcom/checkout/components/ui/model/CountryPickerStyle;", "Lcom/checkout/components/ui/model/PickerStyle;", "countryNameStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "dialingCodeStyle", "emojiStyle", "searchFieldStyle", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "notFoundViewTitleStyle", "notFoundViewSubtitleStyle", "topAppBarViewStyle", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "containerColor", "", "selectedRadioButtonColor", "unSelectedRadioButtonColor", "<init>", "(Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/InputFieldStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/TopAppBarViewStyle;JJJ)V", "getCountryNameStyle", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getDialingCodeStyle", "getEmojiStyle", "getSearchFieldStyle", "()Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "getNotFoundViewTitleStyle", "getNotFoundViewSubtitleStyle", "getTopAppBarViewStyle", "()Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "getContainerColor", "()J", "getSelectedRadioButtonColor", "getUnSelectedRadioButtonColor", "itemNameStyle", "getItemNameStyle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CountryPickerStyle extends PickerStyle {
    public static final int $stable;
    private final long containerColor;

    @NotNull
    private final TextLabelStyle countryNameStyle;

    @NotNull
    private final TextLabelStyle dialingCodeStyle;

    @NotNull
    private final TextLabelStyle emojiStyle;

    @NotNull
    private final TextLabelStyle itemNameStyle;

    @NotNull
    private final TextLabelStyle notFoundViewSubtitleStyle;

    @NotNull
    private final TextLabelStyle notFoundViewTitleStyle;

    @NotNull
    private final InputFieldStyle searchFieldStyle;
    private final long selectedRadioButtonColor;

    @NotNull
    private final TopAppBarViewStyle topAppBarViewStyle;
    private final long unSelectedRadioButtonColor;

    static {
        int i4 = FontFamily.$stable;
        $stable = i4 | BorderRadius.$stable | i4 | i4 | i4 | i4 | i4 | i4;
    }

    public /* synthetic */ CountryPickerStyle(TextLabelStyle textLabelStyle, TextLabelStyle textLabelStyle2, TextLabelStyle textLabelStyle3, InputFieldStyle inputFieldStyle, TextLabelStyle textLabelStyle4, TextLabelStyle textLabelStyle5, TopAppBarViewStyle topAppBarViewStyle, long j5, long j6, long j7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLabelStyle, textLabelStyle2, textLabelStyle3, inputFieldStyle, textLabelStyle4, textLabelStyle5, (i4 & 64) != 0 ? new TopAppBarViewStyle(null, 0L, 0L, 0L, 0L, 31, null) : topAppBarViewStyle, (i4 & 128) != 0 ? 4294967295L : j5, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? 4279790335L : j6, (i4 & 512) != 0 ? 4278190080L : j7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextLabelStyle getCountryNameStyle() {
        return this.countryNameStyle;
    }

    /* renamed from: component10, reason: from getter */
    public final long getUnSelectedRadioButtonColor() {
        return this.unSelectedRadioButtonColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelStyle getDialingCodeStyle() {
        return this.dialingCodeStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextLabelStyle getEmojiStyle() {
        return this.emojiStyle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InputFieldStyle getSearchFieldStyle() {
        return this.searchFieldStyle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextLabelStyle getNotFoundViewTitleStyle() {
        return this.notFoundViewTitleStyle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextLabelStyle getNotFoundViewSubtitleStyle() {
        return this.notFoundViewSubtitleStyle;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    /* renamed from: component8, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: component9, reason: from getter */
    public final long getSelectedRadioButtonColor() {
        return this.selectedRadioButtonColor;
    }

    @NotNull
    public final CountryPickerStyle copy(@NotNull TextLabelStyle countryNameStyle, @NotNull TextLabelStyle dialingCodeStyle, @NotNull TextLabelStyle emojiStyle, @NotNull InputFieldStyle searchFieldStyle, @NotNull TextLabelStyle notFoundViewTitleStyle, @NotNull TextLabelStyle notFoundViewSubtitleStyle, @NotNull TopAppBarViewStyle topAppBarViewStyle, long containerColor, long selectedRadioButtonColor, long unSelectedRadioButtonColor) {
        Intrinsics.echo(countryNameStyle, "countryNameStyle");
        Intrinsics.echo(dialingCodeStyle, "dialingCodeStyle");
        Intrinsics.echo(emojiStyle, "emojiStyle");
        Intrinsics.echo(searchFieldStyle, "searchFieldStyle");
        Intrinsics.echo(notFoundViewTitleStyle, "notFoundViewTitleStyle");
        Intrinsics.echo(notFoundViewSubtitleStyle, "notFoundViewSubtitleStyle");
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        return new CountryPickerStyle(countryNameStyle, dialingCodeStyle, emojiStyle, searchFieldStyle, notFoundViewTitleStyle, notFoundViewSubtitleStyle, topAppBarViewStyle, containerColor, selectedRadioButtonColor, unSelectedRadioButtonColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryPickerStyle)) {
            return false;
        }
        CountryPickerStyle countryPickerStyle = (CountryPickerStyle) other;
        return Intrinsics.areEqual(this.countryNameStyle, countryPickerStyle.countryNameStyle) && Intrinsics.areEqual(this.dialingCodeStyle, countryPickerStyle.dialingCodeStyle) && Intrinsics.areEqual(this.emojiStyle, countryPickerStyle.emojiStyle) && Intrinsics.areEqual(this.searchFieldStyle, countryPickerStyle.searchFieldStyle) && Intrinsics.areEqual(this.notFoundViewTitleStyle, countryPickerStyle.notFoundViewTitleStyle) && Intrinsics.areEqual(this.notFoundViewSubtitleStyle, countryPickerStyle.notFoundViewSubtitleStyle) && Intrinsics.areEqual(this.topAppBarViewStyle, countryPickerStyle.topAppBarViewStyle) && this.containerColor == countryPickerStyle.containerColor && this.selectedRadioButtonColor == countryPickerStyle.selectedRadioButtonColor && this.unSelectedRadioButtonColor == countryPickerStyle.unSelectedRadioButtonColor;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    public long getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    public final TextLabelStyle getCountryNameStyle() {
        return this.countryNameStyle;
    }

    @NotNull
    public final TextLabelStyle getDialingCodeStyle() {
        return this.dialingCodeStyle;
    }

    @NotNull
    public final TextLabelStyle getEmojiStyle() {
        return this.emojiStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public TextLabelStyle getItemNameStyle() {
        return this.itemNameStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public TextLabelStyle getNotFoundViewSubtitleStyle() {
        return this.notFoundViewSubtitleStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public TextLabelStyle getNotFoundViewTitleStyle() {
        return this.notFoundViewTitleStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public InputFieldStyle getSearchFieldStyle() {
        return this.searchFieldStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    public long getSelectedRadioButtonColor() {
        return this.selectedRadioButtonColor;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    @NotNull
    public TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    @Override // com.checkout.components.ui.model.PickerStyle
    public long getUnSelectedRadioButtonColor() {
        return this.unSelectedRadioButtonColor;
    }

    public int hashCode() {
        int hashCode = (this.topAppBarViewStyle.hashCode() + ((this.notFoundViewSubtitleStyle.hashCode() + ((this.notFoundViewTitleStyle.hashCode() + ((this.searchFieldStyle.hashCode() + ((this.emojiStyle.hashCode() + ((this.dialingCodeStyle.hashCode() + (this.countryNameStyle.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        long j5 = this.containerColor;
        long j6 = this.selectedRadioButtonColor;
        int i4 = (((int) (j6 ^ (j6 >>> 32))) + ((((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31)) * 31;
        long j7 = this.unSelectedRadioButtonColor;
        return ((int) (j7 ^ (j7 >>> 32))) + i4;
    }

    @NotNull
    public String toString() {
        TextLabelStyle textLabelStyle = this.countryNameStyle;
        TextLabelStyle textLabelStyle2 = this.dialingCodeStyle;
        TextLabelStyle textLabelStyle3 = this.emojiStyle;
        InputFieldStyle inputFieldStyle = this.searchFieldStyle;
        TextLabelStyle textLabelStyle4 = this.notFoundViewTitleStyle;
        TextLabelStyle textLabelStyle5 = this.notFoundViewSubtitleStyle;
        TopAppBarViewStyle topAppBarViewStyle = this.topAppBarViewStyle;
        long j5 = this.containerColor;
        long j6 = this.selectedRadioButtonColor;
        long j7 = this.unSelectedRadioButtonColor;
        StringBuilder sb2 = new StringBuilder("CountryPickerStyle(countryNameStyle=");
        sb2.append(textLabelStyle);
        sb2.append(", dialingCodeStyle=");
        sb2.append(textLabelStyle2);
        sb2.append(", emojiStyle=");
        sb2.append(textLabelStyle3);
        sb2.append(", searchFieldStyle=");
        sb2.append(inputFieldStyle);
        sb2.append(", notFoundViewTitleStyle=");
        sb2.append(textLabelStyle4);
        sb2.append(", notFoundViewSubtitleStyle=");
        sb2.append(textLabelStyle5);
        sb2.append(", topAppBarViewStyle=");
        sb2.append(topAppBarViewStyle);
        sb2.append(", containerColor=");
        sb2.append(j5);
        c.amber(sb2, ", selectedRadioButtonColor=", j6, ", unSelectedRadioButtonColor=");
        return c.mike(j7, ")", sb2);
    }

    public CountryPickerStyle(@NotNull TextLabelStyle countryNameStyle, @NotNull TextLabelStyle dialingCodeStyle, @NotNull TextLabelStyle emojiStyle, @NotNull InputFieldStyle searchFieldStyle, @NotNull TextLabelStyle notFoundViewTitleStyle, @NotNull TextLabelStyle notFoundViewSubtitleStyle, @NotNull TopAppBarViewStyle topAppBarViewStyle, long j5, long j6, long j7) {
        Intrinsics.echo(countryNameStyle, "countryNameStyle");
        Intrinsics.echo(dialingCodeStyle, "dialingCodeStyle");
        Intrinsics.echo(emojiStyle, "emojiStyle");
        Intrinsics.echo(searchFieldStyle, "searchFieldStyle");
        Intrinsics.echo(notFoundViewTitleStyle, "notFoundViewTitleStyle");
        Intrinsics.echo(notFoundViewSubtitleStyle, "notFoundViewSubtitleStyle");
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        this.countryNameStyle = countryNameStyle;
        this.dialingCodeStyle = dialingCodeStyle;
        this.emojiStyle = emojiStyle;
        this.searchFieldStyle = searchFieldStyle;
        this.notFoundViewTitleStyle = notFoundViewTitleStyle;
        this.notFoundViewSubtitleStyle = notFoundViewSubtitleStyle;
        this.topAppBarViewStyle = topAppBarViewStyle;
        this.containerColor = j5;
        this.selectedRadioButtonColor = j6;
        this.unSelectedRadioButtonColor = j7;
        this.itemNameStyle = countryNameStyle;
    }
}
