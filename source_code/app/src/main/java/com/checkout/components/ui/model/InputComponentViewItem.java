package com.checkout.components.ui.model;

import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/ui/model/InputComponentViewItem;", "", "state", "Lcom/checkout/components/ui/model/state/InputComponentState;", "style", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "<init>", "(Lcom/checkout/components/ui/model/state/InputComponentState;Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;)V", "getState", "()Lcom/checkout/components/ui/model/state/InputComponentState;", "getStyle", "()Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputComponentViewItem {
    public static final int $stable = 0;

    @NotNull
    private final InputComponentState state;

    @NotNull
    private final InputComponentViewStyle style;

    public InputComponentViewItem(@NotNull InputComponentState state, @NotNull InputComponentViewStyle style) {
        Intrinsics.echo(state, "state");
        Intrinsics.echo(style, "style");
        this.state = state;
        this.style = style;
    }

    public static /* synthetic */ InputComponentViewItem copy$default(InputComponentViewItem inputComponentViewItem, InputComponentState inputComponentState, InputComponentViewStyle inputComponentViewStyle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            inputComponentState = inputComponentViewItem.state;
        }
        if ((i4 & 2) != 0) {
            inputComponentViewStyle = inputComponentViewItem.style;
        }
        return inputComponentViewItem.copy(inputComponentState, inputComponentViewStyle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputComponentState getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InputComponentViewStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final InputComponentViewItem copy(@NotNull InputComponentState state, @NotNull InputComponentViewStyle style) {
        Intrinsics.echo(state, "state");
        Intrinsics.echo(style, "style");
        return new InputComponentViewItem(state, style);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputComponentViewItem)) {
            return false;
        }
        InputComponentViewItem inputComponentViewItem = (InputComponentViewItem) other;
        return Intrinsics.areEqual(this.state, inputComponentViewItem.state) && Intrinsics.areEqual(this.style, inputComponentViewItem.style);
    }

    @NotNull
    public final InputComponentState getState() {
        return this.state;
    }

    @NotNull
    public final InputComponentViewStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.style.hashCode() + (this.state.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "InputComponentViewItem(state=" + this.state + ", style=" + this.style + ")";
    }
}
