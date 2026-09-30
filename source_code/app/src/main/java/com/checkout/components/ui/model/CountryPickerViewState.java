package com.checkout.components.ui.model;

import a0.C0366t;
import ao.ad;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0088\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b\u0007\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010\u001fR\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bA\u0010\u001fR\u001a\u0010\r\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bB\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010#R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010%R\u001a\u0010\u0012\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bG\u0010%R\u001a\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bH\u0010%R\u001a\u0010I\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bJ\u0010\u0017¨\u0006K"}, d2 = {"Lcom/checkout/components/ui/model/CountryPickerViewState;", "Lcom/checkout/components/ui/model/PickerViewState;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "emoji", "countryName", "dialingCode", "", "isRTL", "Lcom/checkout/components/ui/model/InputFieldViewItem;", "searchField", "Lcom/checkout/components/ui/model/TextLabelViewItem;", Constants.KEY_TITLE, "notFoundViewTitle", "notFoundViewSubtitle", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "topAppBarViewStyle", "La0/t;", "containerColor", "selectedRadioButtonColor", "unSelectedRadioButtonColor", "<init>", "(Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;ZLcom/checkout/components/ui/model/InputFieldViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TopAppBarViewStyle;JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "component2", "component3", "component4", "()Z", "component5", "()Lcom/checkout/components/ui/model/InputFieldViewItem;", "component6", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "component7", "component8", "component9", "()Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "component10-0d7_KjU", "()J", "component10", "component11-0d7_KjU", "component11", "component12-0d7_KjU", "component12", "copy-liAtOIg", "(Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;ZLcom/checkout/components/ui/model/InputFieldViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TopAppBarViewStyle;JJJ)Lcom/checkout/components/ui/model/CountryPickerViewState;", Constants.COPY_TYPE, "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "getEmoji", "getCountryName", "getDialingCode", "Z", "Lcom/checkout/components/ui/model/InputFieldViewItem;", "getSearchField", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getTitle", "getNotFoundViewTitle", "getNotFoundViewSubtitle", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "getTopAppBarViewStyle", "J", "getContainerColor-0d7_KjU", "getSelectedRadioButtonColor-0d7_KjU", "getUnSelectedRadioButtonColor-0d7_KjU", "itemName", "getItemName", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CountryPickerViewState extends PickerViewState {
    public static final int $stable = FontFamily.$stable;
    private final long containerColor;

    @NotNull
    private final TextLabelViewStyle countryName;

    @NotNull
    private final TextLabelViewStyle dialingCode;

    @NotNull
    private final TextLabelViewStyle emoji;
    private final boolean isRTL;

    @NotNull
    private final TextLabelViewStyle itemName;

    @NotNull
    private final TextLabelViewItem notFoundViewSubtitle;

    @NotNull
    private final TextLabelViewItem notFoundViewTitle;

    @NotNull
    private final InputFieldViewItem searchField;
    private final long selectedRadioButtonColor;

    @NotNull
    private final TextLabelViewItem title;

    @NotNull
    private final TopAppBarViewStyle topAppBarViewStyle;
    private final long unSelectedRadioButtonColor;

    public /* synthetic */ CountryPickerViewState(TextLabelViewStyle textLabelViewStyle, TextLabelViewStyle textLabelViewStyle2, TextLabelViewStyle textLabelViewStyle3, boolean z2, InputFieldViewItem inputFieldViewItem, TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, TopAppBarViewStyle topAppBarViewStyle, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLabelViewStyle, textLabelViewStyle2, textLabelViewStyle3, z2, inputFieldViewItem, textLabelViewItem, textLabelViewItem2, textLabelViewItem3, topAppBarViewStyle, j5, j6, j7);
    }

    /* renamed from: copy-liAtOIg$default, reason: not valid java name */
    public static /* synthetic */ CountryPickerViewState m133copyliAtOIg$default(CountryPickerViewState countryPickerViewState, TextLabelViewStyle textLabelViewStyle, TextLabelViewStyle textLabelViewStyle2, TextLabelViewStyle textLabelViewStyle3, boolean z2, InputFieldViewItem inputFieldViewItem, TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, TopAppBarViewStyle topAppBarViewStyle, long j5, long j6, long j7, int i4, Object obj) {
        long j10;
        TextLabelViewStyle textLabelViewStyle4;
        CountryPickerViewState countryPickerViewState2;
        TextLabelViewStyle textLabelViewStyle5;
        TextLabelViewStyle textLabelViewStyle6;
        boolean z10;
        InputFieldViewItem inputFieldViewItem2;
        TextLabelViewItem textLabelViewItem4;
        TextLabelViewItem textLabelViewItem5;
        TextLabelViewItem textLabelViewItem6;
        TopAppBarViewStyle topAppBarViewStyle2;
        long j11;
        long j12;
        TextLabelViewStyle textLabelViewStyle7 = (i4 & 1) != 0 ? countryPickerViewState.emoji : textLabelViewStyle;
        TextLabelViewStyle textLabelViewStyle8 = (i4 & 2) != 0 ? countryPickerViewState.countryName : textLabelViewStyle2;
        TextLabelViewStyle textLabelViewStyle9 = (i4 & 4) != 0 ? countryPickerViewState.dialingCode : textLabelViewStyle3;
        boolean z11 = (i4 & 8) != 0 ? countryPickerViewState.isRTL : z2;
        InputFieldViewItem inputFieldViewItem3 = (i4 & 16) != 0 ? countryPickerViewState.searchField : inputFieldViewItem;
        TextLabelViewItem textLabelViewItem7 = (i4 & 32) != 0 ? countryPickerViewState.title : textLabelViewItem;
        TextLabelViewItem textLabelViewItem8 = (i4 & 64) != 0 ? countryPickerViewState.notFoundViewTitle : textLabelViewItem2;
        TextLabelViewItem textLabelViewItem9 = (i4 & 128) != 0 ? countryPickerViewState.notFoundViewSubtitle : textLabelViewItem3;
        TopAppBarViewStyle topAppBarViewStyle3 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? countryPickerViewState.topAppBarViewStyle : topAppBarViewStyle;
        long j13 = (i4 & 512) != 0 ? countryPickerViewState.containerColor : j5;
        long j14 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? countryPickerViewState.selectedRadioButtonColor : j6;
        if ((i4 & 2048) != 0) {
            textLabelViewStyle4 = textLabelViewStyle7;
            j10 = countryPickerViewState.unSelectedRadioButtonColor;
            textLabelViewStyle5 = textLabelViewStyle8;
            textLabelViewStyle6 = textLabelViewStyle9;
            z10 = z11;
            inputFieldViewItem2 = inputFieldViewItem3;
            textLabelViewItem4 = textLabelViewItem7;
            textLabelViewItem5 = textLabelViewItem8;
            textLabelViewItem6 = textLabelViewItem9;
            topAppBarViewStyle2 = topAppBarViewStyle3;
            j11 = j13;
            j12 = j14;
            countryPickerViewState2 = countryPickerViewState;
        } else {
            j10 = j7;
            textLabelViewStyle4 = textLabelViewStyle7;
            countryPickerViewState2 = countryPickerViewState;
            textLabelViewStyle5 = textLabelViewStyle8;
            textLabelViewStyle6 = textLabelViewStyle9;
            z10 = z11;
            inputFieldViewItem2 = inputFieldViewItem3;
            textLabelViewItem4 = textLabelViewItem7;
            textLabelViewItem5 = textLabelViewItem8;
            textLabelViewItem6 = textLabelViewItem9;
            topAppBarViewStyle2 = topAppBarViewStyle3;
            j11 = j13;
            j12 = j14;
        }
        return countryPickerViewState2.m137copyliAtOIg(textLabelViewStyle4, textLabelViewStyle5, textLabelViewStyle6, z10, inputFieldViewItem2, textLabelViewItem4, textLabelViewItem5, textLabelViewItem6, topAppBarViewStyle2, j11, j12, j10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextLabelViewStyle getEmoji() {
        return this.emoji;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedRadioButtonColor() {
        return this.selectedRadioButtonColor;
    }

    /* renamed from: component12-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnSelectedRadioButtonColor() {
        return this.unSelectedRadioButtonColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelViewStyle getCountryName() {
        return this.countryName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextLabelViewStyle getDialingCode() {
        return this.dialingCode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRTL() {
        return this.isRTL;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final InputFieldViewItem getSearchField() {
        return this.searchField;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextLabelViewItem getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TextLabelViewItem getNotFoundViewTitle() {
        return this.notFoundViewTitle;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final TextLabelViewItem getNotFoundViewSubtitle() {
        return this.notFoundViewSubtitle;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    @NotNull
    /* renamed from: copy-liAtOIg, reason: not valid java name */
    public final CountryPickerViewState m137copyliAtOIg(@NotNull TextLabelViewStyle emoji, @NotNull TextLabelViewStyle countryName, @NotNull TextLabelViewStyle dialingCode, boolean isRTL, @NotNull InputFieldViewItem searchField, @NotNull TextLabelViewItem title, @NotNull TextLabelViewItem notFoundViewTitle, @NotNull TextLabelViewItem notFoundViewSubtitle, @NotNull TopAppBarViewStyle topAppBarViewStyle, long containerColor, long selectedRadioButtonColor, long unSelectedRadioButtonColor) {
        Intrinsics.echo(emoji, "emoji");
        Intrinsics.echo(countryName, "countryName");
        Intrinsics.echo(dialingCode, "dialingCode");
        Intrinsics.echo(searchField, "searchField");
        Intrinsics.echo(title, "title");
        Intrinsics.echo(notFoundViewTitle, "notFoundViewTitle");
        Intrinsics.echo(notFoundViewSubtitle, "notFoundViewSubtitle");
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        return new CountryPickerViewState(emoji, countryName, dialingCode, isRTL, searchField, title, notFoundViewTitle, notFoundViewSubtitle, topAppBarViewStyle, containerColor, selectedRadioButtonColor, unSelectedRadioButtonColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryPickerViewState)) {
            return false;
        }
        CountryPickerViewState countryPickerViewState = (CountryPickerViewState) other;
        return Intrinsics.areEqual(this.emoji, countryPickerViewState.emoji) && Intrinsics.areEqual(this.countryName, countryPickerViewState.countryName) && Intrinsics.areEqual(this.dialingCode, countryPickerViewState.dialingCode) && this.isRTL == countryPickerViewState.isRTL && Intrinsics.areEqual(this.searchField, countryPickerViewState.searchField) && Intrinsics.areEqual(this.title, countryPickerViewState.title) && Intrinsics.areEqual(this.notFoundViewTitle, countryPickerViewState.notFoundViewTitle) && Intrinsics.areEqual(this.notFoundViewSubtitle, countryPickerViewState.notFoundViewSubtitle) && Intrinsics.areEqual(this.topAppBarViewStyle, countryPickerViewState.topAppBarViewStyle) && C0366t.charlie(this.containerColor, countryPickerViewState.containerColor) && C0366t.charlie(this.selectedRadioButtonColor, countryPickerViewState.selectedRadioButtonColor) && C0366t.charlie(this.unSelectedRadioButtonColor, countryPickerViewState.unSelectedRadioButtonColor);
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    /* renamed from: getContainerColor-0d7_KjU */
    public long mo63getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    @NotNull
    public final TextLabelViewStyle getCountryName() {
        return this.countryName;
    }

    @NotNull
    public final TextLabelViewStyle getDialingCode() {
        return this.dialingCode;
    }

    @NotNull
    public final TextLabelViewStyle getEmoji() {
        return this.emoji;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public TextLabelViewStyle getItemName() {
        return this.itemName;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public TextLabelViewItem getNotFoundViewSubtitle() {
        return this.notFoundViewSubtitle;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public TextLabelViewItem getNotFoundViewTitle() {
        return this.notFoundViewTitle;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public InputFieldViewItem getSearchField() {
        return this.searchField;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    /* renamed from: getSelectedRadioButtonColor-0d7_KjU */
    public long mo64getSelectedRadioButtonColor0d7_KjU() {
        return this.selectedRadioButtonColor;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public TextLabelViewItem getTitle() {
        return this.title;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    /* renamed from: getUnSelectedRadioButtonColor-0d7_KjU */
    public long mo65getUnSelectedRadioButtonColor0d7_KjU() {
        return this.unSelectedRadioButtonColor;
    }

    public int hashCode() {
        int i4;
        int hashCode = (this.dialingCode.hashCode() + ((this.countryName.hashCode() + (this.emoji.hashCode() * 31)) * 31)) * 31;
        if (this.isRTL) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int hashCode2 = (this.topAppBarViewStyle.hashCode() + ((this.notFoundViewSubtitle.hashCode() + ((this.notFoundViewTitle.hashCode() + ((this.title.hashCode() + ((this.searchField.hashCode() + ((i4 + hashCode) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        long j5 = this.containerColor;
        int i5 = C0366t.lima;
        return p.alpha(this.unSelectedRadioButtonColor) + ad.whiskey(ad.whiskey(hashCode2, 31, j5), 31, this.selectedRadioButtonColor);
    }

    public final boolean isRTL() {
        return this.isRTL;
    }

    @NotNull
    public String toString() {
        TextLabelViewStyle textLabelViewStyle = this.emoji;
        TextLabelViewStyle textLabelViewStyle2 = this.countryName;
        TextLabelViewStyle textLabelViewStyle3 = this.dialingCode;
        boolean z2 = this.isRTL;
        InputFieldViewItem inputFieldViewItem = this.searchField;
        TextLabelViewItem textLabelViewItem = this.title;
        TextLabelViewItem textLabelViewItem2 = this.notFoundViewTitle;
        TextLabelViewItem textLabelViewItem3 = this.notFoundViewSubtitle;
        TopAppBarViewStyle topAppBarViewStyle = this.topAppBarViewStyle;
        String india = C0366t.india(this.containerColor);
        String india2 = C0366t.india(this.selectedRadioButtonColor);
        String india3 = C0366t.india(this.unSelectedRadioButtonColor);
        StringBuilder sb2 = new StringBuilder("CountryPickerViewState(emoji=");
        sb2.append(textLabelViewStyle);
        sb2.append(", countryName=");
        sb2.append(textLabelViewStyle2);
        sb2.append(", dialingCode=");
        sb2.append(textLabelViewStyle3);
        sb2.append(", isRTL=");
        sb2.append(z2);
        sb2.append(", searchField=");
        sb2.append(inputFieldViewItem);
        sb2.append(", title=");
        sb2.append(textLabelViewItem);
        sb2.append(", notFoundViewTitle=");
        sb2.append(textLabelViewItem2);
        sb2.append(", notFoundViewSubtitle=");
        sb2.append(textLabelViewItem3);
        sb2.append(", topAppBarViewStyle=");
        sb2.append(topAppBarViewStyle);
        sb2.append(", containerColor=");
        sb2.append(india);
        sb2.append(", selectedRadioButtonColor=");
        return j.lima(sb2, india2, ", unSelectedRadioButtonColor=", india3, ")");
    }

    private CountryPickerViewState(TextLabelViewStyle emoji, TextLabelViewStyle countryName, TextLabelViewStyle dialingCode, boolean z2, InputFieldViewItem searchField, TextLabelViewItem title, TextLabelViewItem notFoundViewTitle, TextLabelViewItem notFoundViewSubtitle, TopAppBarViewStyle topAppBarViewStyle, long j5, long j6, long j7) {
        Intrinsics.echo(emoji, "emoji");
        Intrinsics.echo(countryName, "countryName");
        Intrinsics.echo(dialingCode, "dialingCode");
        Intrinsics.echo(searchField, "searchField");
        Intrinsics.echo(title, "title");
        Intrinsics.echo(notFoundViewTitle, "notFoundViewTitle");
        Intrinsics.echo(notFoundViewSubtitle, "notFoundViewSubtitle");
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        this.emoji = emoji;
        this.countryName = countryName;
        this.dialingCode = dialingCode;
        this.isRTL = z2;
        this.searchField = searchField;
        this.title = title;
        this.notFoundViewTitle = notFoundViewTitle;
        this.notFoundViewSubtitle = notFoundViewSubtitle;
        this.topAppBarViewStyle = topAppBarViewStyle;
        this.containerColor = j5;
        this.selectedRadioButtonColor = j6;
        this.unSelectedRadioButtonColor = j7;
        this.itemName = countryName;
    }
}
