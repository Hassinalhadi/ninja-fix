package com.checkout.components.ui.model;

import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/ui/model/ButtonItem;", "", "style", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "state", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "<init>", "(Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;Lcom/checkout/components/ui/model/state/InternalButtonState;)V", "getStyle", "()Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "getState", "()Lcom/checkout/components/ui/model/state/InternalButtonState;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonItem {
    public static final int $stable = 0;

    @NotNull
    private final InternalButtonState state;

    @NotNull
    private final InternalButtonViewStyle style;

    public ButtonItem(@NotNull InternalButtonViewStyle style, @NotNull InternalButtonState state) {
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        this.style = style;
        this.state = state;
    }

    public static /* synthetic */ ButtonItem copy$default(ButtonItem buttonItem, InternalButtonViewStyle internalButtonViewStyle, InternalButtonState internalButtonState, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            internalButtonViewStyle = buttonItem.style;
        }
        if ((i4 & 2) != 0) {
            internalButtonState = buttonItem.state;
        }
        return buttonItem.copy(internalButtonViewStyle, internalButtonState);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InternalButtonViewStyle getStyle() {
        return this.style;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InternalButtonState getState() {
        return this.state;
    }

    @NotNull
    public final ButtonItem copy(@NotNull InternalButtonViewStyle style, @NotNull InternalButtonState state) {
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        return new ButtonItem(style, state);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonItem)) {
            return false;
        }
        ButtonItem buttonItem = (ButtonItem) other;
        return Intrinsics.areEqual(this.style, buttonItem.style) && Intrinsics.areEqual(this.state, buttonItem.state);
    }

    @NotNull
    public final InternalButtonState getState() {
        return this.state;
    }

    @NotNull
    public final InternalButtonViewStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.state.hashCode() + (this.style.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ButtonItem(style=" + this.style + ", state=" + this.state + ")";
    }
}
