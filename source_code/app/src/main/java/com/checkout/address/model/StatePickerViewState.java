package com.checkout.address.model;

import a0.C0366t;
import ao.ad;
import com.checkout.components.ui.model.InputFieldViewItem;
import com.checkout.components.ui.model.PickerViewState;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010\u001fJt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\bI\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010\u001fR\u001a\u0010N\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u00104\u001a\u0004\bM\u0010\u0014¨\u0006O"}, d2 = {"Lcom/checkout/address/model/StatePickerViewState;", "Lcom/checkout/components/ui/model/PickerViewState;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "displayName", "code", "Lcom/checkout/components/ui/model/InputFieldViewItem;", "searchField", "Lcom/checkout/components/ui/model/TextLabelViewItem;", Constants.KEY_TITLE, "notFoundViewTitle", "notFoundViewSubtitle", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "topAppBarViewStyle", "La0/t;", "containerColor", "selectedRadioButtonColor", "unSelectedRadioButtonColor", "<init>", "(Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/InputFieldViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TopAppBarViewStyle;JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "component2", "component3", "()Lcom/checkout/components/ui/model/InputFieldViewItem;", "component4", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "component5", "component6", "component7", "()Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "component8-0d7_KjU", "()J", "component8", "component9-0d7_KjU", "component9", "component10-0d7_KjU", "component10", "copy-GtmZt9E", "(Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/InputFieldViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TopAppBarViewStyle;JJJ)Lcom/checkout/address/model/StatePickerViewState;", Constants.COPY_TYPE, "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "getDisplayName", "b", "getCode", "c", "Lcom/checkout/components/ui/model/InputFieldViewItem;", "getSearchField", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getTitle", "e", "getNotFoundViewTitle", "f", "getNotFoundViewSubtitle", "g", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "getTopAppBarViewStyle", "h", "J", "getContainerColor-0d7_KjU", "i", "getSelectedRadioButtonColor-0d7_KjU", "j", "getUnSelectedRadioButtonColor-0d7_KjU", "k", "getItemName", "itemName", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatePickerViewState extends PickerViewState {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewStyle displayName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewStyle code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InputFieldViewItem searchField;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem title;

    /* renamed from: e, reason: from kotlin metadata */
    private final TextLabelViewItem notFoundViewTitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem notFoundViewSubtitle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final TopAppBarViewStyle topAppBarViewStyle;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long selectedRadioButtonColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long unSelectedRadioButtonColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewStyle itemName;

    static {
        int i4 = PickerViewState.$stable;
        int i5 = TextLabelViewStyle.$stable;
        int i10 = i4 | i5 | TopAppBarViewStyle.$stable;
        int i11 = TextLabelViewItem.$stable;
        $stable = i10 | i11 | i11 | i11 | InputFieldViewItem.$stable | i5 | i5;
    }

    public StatePickerViewState(TextLabelViewStyle displayName, TextLabelViewStyle code, InputFieldViewItem searchField, TextLabelViewItem title, TextLabelViewItem notFoundViewTitle, TextLabelViewItem notFoundViewSubtitle, TopAppBarViewStyle topAppBarViewStyle, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.echo(displayName, "displayName");
        Intrinsics.echo(code, "code");
        Intrinsics.echo(searchField, "searchField");
        Intrinsics.echo(title, "title");
        Intrinsics.echo(notFoundViewTitle, "notFoundViewTitle");
        Intrinsics.echo(notFoundViewSubtitle, "notFoundViewSubtitle");
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        this.displayName = displayName;
        this.code = code;
        this.searchField = searchField;
        this.title = title;
        this.notFoundViewTitle = notFoundViewTitle;
        this.notFoundViewSubtitle = notFoundViewSubtitle;
        this.topAppBarViewStyle = topAppBarViewStyle;
        this.containerColor = j5;
        this.selectedRadioButtonColor = j6;
        this.unSelectedRadioButtonColor = j7;
        this.itemName = displayName;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextLabelViewStyle getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnSelectedRadioButtonColor() {
        return this.unSelectedRadioButtonColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelViewStyle getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InputFieldViewItem getSearchField() {
        return this.searchField;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextLabelViewItem getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextLabelViewItem getNotFoundViewTitle() {
        return this.notFoundViewTitle;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextLabelViewItem getNotFoundViewSubtitle() {
        return this.notFoundViewSubtitle;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedRadioButtonColor() {
        return this.selectedRadioButtonColor;
    }

    @NotNull
    /* renamed from: copy-GtmZt9E, reason: not valid java name */
    public final StatePickerViewState m62copyGtmZt9E(@NotNull TextLabelViewStyle displayName, @NotNull TextLabelViewStyle code, @NotNull InputFieldViewItem searchField, @NotNull TextLabelViewItem title, @NotNull TextLabelViewItem notFoundViewTitle, @NotNull TextLabelViewItem notFoundViewSubtitle, @NotNull TopAppBarViewStyle topAppBarViewStyle, long containerColor, long selectedRadioButtonColor, long unSelectedRadioButtonColor) {
        Intrinsics.echo(displayName, "displayName");
        Intrinsics.echo(code, "code");
        Intrinsics.echo(searchField, "searchField");
        Intrinsics.echo(title, "title");
        Intrinsics.echo(notFoundViewTitle, "notFoundViewTitle");
        Intrinsics.echo(notFoundViewSubtitle, "notFoundViewSubtitle");
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        return new StatePickerViewState(displayName, code, searchField, title, notFoundViewTitle, notFoundViewSubtitle, topAppBarViewStyle, containerColor, selectedRadioButtonColor, unSelectedRadioButtonColor, null);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatePickerViewState)) {
            return false;
        }
        StatePickerViewState statePickerViewState = (StatePickerViewState) other;
        return Intrinsics.areEqual(this.displayName, statePickerViewState.displayName) && Intrinsics.areEqual(this.code, statePickerViewState.code) && Intrinsics.areEqual(this.searchField, statePickerViewState.searchField) && Intrinsics.areEqual(this.title, statePickerViewState.title) && Intrinsics.areEqual(this.notFoundViewTitle, statePickerViewState.notFoundViewTitle) && Intrinsics.areEqual(this.notFoundViewSubtitle, statePickerViewState.notFoundViewSubtitle) && Intrinsics.areEqual(this.topAppBarViewStyle, statePickerViewState.topAppBarViewStyle) && C0366t.charlie(this.containerColor, statePickerViewState.containerColor) && C0366t.charlie(this.selectedRadioButtonColor, statePickerViewState.selectedRadioButtonColor) && C0366t.charlie(this.unSelectedRadioButtonColor, statePickerViewState.unSelectedRadioButtonColor);
    }

    @NotNull
    public final TextLabelViewStyle getCode() {
        return this.code;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long mo63getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    @NotNull
    public final TextLabelViewStyle getDisplayName() {
        return this.displayName;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public final TextLabelViewStyle getItemName() {
        return this.itemName;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public final TextLabelViewItem getNotFoundViewSubtitle() {
        return this.notFoundViewSubtitle;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public final TextLabelViewItem getNotFoundViewTitle() {
        return this.notFoundViewTitle;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public final InputFieldViewItem getSearchField() {
        return this.searchField;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    /* renamed from: getSelectedRadioButtonColor-0d7_KjU, reason: not valid java name */
    public final long mo64getSelectedRadioButtonColor0d7_KjU() {
        return this.selectedRadioButtonColor;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public final TextLabelViewItem getTitle() {
        return this.title;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    @NotNull
    public final TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    @Override // com.checkout.components.ui.model.PickerViewState
    /* renamed from: getUnSelectedRadioButtonColor-0d7_KjU, reason: not valid java name */
    public final long mo65getUnSelectedRadioButtonColor0d7_KjU() {
        return this.unSelectedRadioButtonColor;
    }

    public final int hashCode() {
        int hashCode = (this.topAppBarViewStyle.hashCode() + ((this.notFoundViewSubtitle.hashCode() + ((this.notFoundViewTitle.hashCode() + ((this.title.hashCode() + ((this.searchField.hashCode() + ((this.code.hashCode() + (this.displayName.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        long j5 = this.containerColor;
        int i4 = C0366t.lima;
        return p.alpha(this.unSelectedRadioButtonColor) + ad.whiskey(ad.whiskey(hashCode, 31, j5), 31, this.selectedRadioButtonColor);
    }

    @NotNull
    public final String toString() {
        TextLabelViewStyle textLabelViewStyle = this.displayName;
        TextLabelViewStyle textLabelViewStyle2 = this.code;
        InputFieldViewItem inputFieldViewItem = this.searchField;
        TextLabelViewItem textLabelViewItem = this.title;
        TextLabelViewItem textLabelViewItem2 = this.notFoundViewTitle;
        TextLabelViewItem textLabelViewItem3 = this.notFoundViewSubtitle;
        TopAppBarViewStyle topAppBarViewStyle = this.topAppBarViewStyle;
        String india = C0366t.india(this.containerColor);
        String india2 = C0366t.india(this.selectedRadioButtonColor);
        String india3 = C0366t.india(this.unSelectedRadioButtonColor);
        StringBuilder sb2 = new StringBuilder("StatePickerViewState(displayName=");
        sb2.append(textLabelViewStyle);
        sb2.append(", code=");
        sb2.append(textLabelViewStyle2);
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
}
