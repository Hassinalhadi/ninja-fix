package com.checkout.address.model;

import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/checkout/address/model/ButtonViewItem;", "", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "state", "<init>", "(Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;Lcom/checkout/components/ui/model/state/InternalButtonState;)V", "component1", "()Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "component2", "()Lcom/checkout/components/ui/model/state/InternalButtonState;", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;Lcom/checkout/components/ui/model/state/InternalButtonState;)Lcom/checkout/address/model/ButtonViewItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "getStyle", "b", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "getState", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonViewItem {
    public static final int $stable = InternalButtonState.$stable | InternalButtonViewStyle.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InternalButtonViewStyle style;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InternalButtonState state;

    public ButtonViewItem(@NotNull InternalButtonViewStyle style, @NotNull InternalButtonState state) {
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        this.style = style;
        this.state = state;
    }

    public static /* synthetic */ ButtonViewItem copy$default(ButtonViewItem buttonViewItem, InternalButtonViewStyle internalButtonViewStyle, InternalButtonState internalButtonState, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            internalButtonViewStyle = buttonViewItem.style;
        }
        if ((i4 & 2) != 0) {
            internalButtonState = buttonViewItem.state;
        }
        return buttonViewItem.copy(internalButtonViewStyle, internalButtonState);
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
    public final ButtonViewItem copy(@NotNull InternalButtonViewStyle style, @NotNull InternalButtonState state) {
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        return new ButtonViewItem(style, state);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonViewItem)) {
            return false;
        }
        ButtonViewItem buttonViewItem = (ButtonViewItem) other;
        return Intrinsics.areEqual(this.style, buttonViewItem.style) && Intrinsics.areEqual(this.state, buttonViewItem.state);
    }

    @NotNull
    public final InternalButtonState getState() {
        return this.state;
    }

    @NotNull
    public final InternalButtonViewStyle getStyle() {
        return this.style;
    }

    public final int hashCode() {
        return this.state.hashCode() + (this.style.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ButtonViewItem(style=" + this.style + ", state=" + this.state + ")";
    }
}
