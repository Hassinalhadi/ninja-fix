package com.checkout.components.ui.model;

import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0012\u0010\u001a\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/ui/model/PickerStyle;", "", "<init>", "()V", "searchFieldStyle", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "getSearchFieldStyle", "()Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "itemNameStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getItemNameStyle", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "notFoundViewTitleStyle", "getNotFoundViewTitleStyle", "notFoundViewSubtitleStyle", "getNotFoundViewSubtitleStyle", "topAppBarViewStyle", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "getTopAppBarViewStyle", "()Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "containerColor", "", "getContainerColor", "()J", "selectedRadioButtonColor", "getSelectedRadioButtonColor", "unSelectedRadioButtonColor", "getUnSelectedRadioButtonColor", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PickerStyle {
    public static final int $stable = 0;

    public abstract long getContainerColor();

    @NotNull
    public abstract TextLabelStyle getItemNameStyle();

    @NotNull
    public abstract TextLabelStyle getNotFoundViewSubtitleStyle();

    @NotNull
    public abstract TextLabelStyle getNotFoundViewTitleStyle();

    @NotNull
    public abstract InputFieldStyle getSearchFieldStyle();

    public abstract long getSelectedRadioButtonColor();

    @NotNull
    public abstract TopAppBarViewStyle getTopAppBarViewStyle();

    public abstract long getUnSelectedRadioButtonColor();
}
