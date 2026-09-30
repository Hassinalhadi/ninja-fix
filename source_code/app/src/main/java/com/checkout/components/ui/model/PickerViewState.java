package com.checkout.components.ui.model;

import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Lcom/checkout/components/ui/model/PickerViewState;", "", "<init>", "()V", "Lcom/checkout/components/ui/model/InputFieldViewItem;", "getSearchField", "()Lcom/checkout/components/ui/model/InputFieldViewItem;", "searchField", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "getItemName", "()Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "itemName", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getTitle", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", Constants.KEY_TITLE, "getNotFoundViewTitle", "notFoundViewTitle", "getNotFoundViewSubtitle", "notFoundViewSubtitle", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "getTopAppBarViewStyle", "()Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "topAppBarViewStyle", "La0/t;", "getContainerColor-0d7_KjU", "()J", "containerColor", "getSelectedRadioButtonColor-0d7_KjU", "selectedRadioButtonColor", "getUnSelectedRadioButtonColor-0d7_KjU", "unSelectedRadioButtonColor", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PickerViewState {
    public static final int $stable = 0;

    /* renamed from: getContainerColor-0d7_KjU */
    public abstract long mo63getContainerColor0d7_KjU();

    @NotNull
    public abstract TextLabelViewStyle getItemName();

    @NotNull
    public abstract TextLabelViewItem getNotFoundViewSubtitle();

    @NotNull
    public abstract TextLabelViewItem getNotFoundViewTitle();

    @NotNull
    public abstract InputFieldViewItem getSearchField();

    /* renamed from: getSelectedRadioButtonColor-0d7_KjU */
    public abstract long mo64getSelectedRadioButtonColor0d7_KjU();

    @NotNull
    public abstract TextLabelViewItem getTitle();

    @NotNull
    public abstract TopAppBarViewStyle getTopAppBarViewStyle();

    /* renamed from: getUnSelectedRadioButtonColor-0d7_KjU */
    public abstract long mo65getUnSelectedRadioButtonColor0d7_KjU();
}
