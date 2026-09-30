package com.checkout.components.ui.picker;

import androidx.lifecycle.Y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yf.L;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0004R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/ui/picker/PickerViewModel;", "T", "Landroidx/lifecycle/Y;", "<init>", "()V", "", "onBottomSheetDismissed", "Lyf/L;", "", "getFilteredItems", "()Lyf/L;", "filteredItems", "La0/t;", "getContainerColor-0d7_KjU", "()J", "containerColor", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PickerViewModel<T> extends Y {
    public static final int $stable = 8;

    /* renamed from: getContainerColor-0d7_KjU */
    public abstract long mo66getContainerColor0d7_KjU();

    @NotNull
    public abstract L getFilteredItems();

    public abstract void onBottomSheetDismissed();
}
