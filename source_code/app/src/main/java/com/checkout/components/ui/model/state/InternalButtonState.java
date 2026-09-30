package com.checkout.components.ui.model.state;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0004\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/ui/model/state/InternalButtonState;", "", "Landroidx/compose/runtime/ax;", "", "isEnabled", "Lcom/checkout/components/ui/model/state/TextLabelState;", "textState", "<init>", "(Landroidx/compose/runtime/ax;Lcom/checkout/components/ui/model/state/TextLabelState;)V", "component1", "()Landroidx/compose/runtime/ax;", "component2", "()Lcom/checkout/components/ui/model/state/TextLabelState;", Constants.COPY_TYPE, "(Landroidx/compose/runtime/ax;Lcom/checkout/components/ui/model/state/TextLabelState;)Lcom/checkout/components/ui/model/state/InternalButtonState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/ax;", "Lcom/checkout/components/ui/model/state/TextLabelState;", "getTextState", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InternalButtonState {
    public static final int $stable = 0;

    @NotNull
    private final ax isEnabled;

    @NotNull
    private final TextLabelState textState;

    /* JADX WARN: Multi-variable type inference failed */
    public InternalButtonState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InternalButtonState copy$default(InternalButtonState internalButtonState, ax axVar, TextLabelState textLabelState, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            axVar = internalButtonState.isEnabled;
        }
        if ((i4 & 2) != 0) {
            textLabelState = internalButtonState.textState;
        }
        return internalButtonState.copy(axVar, textLabelState);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ax getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelState getTextState() {
        return this.textState;
    }

    @NotNull
    public final InternalButtonState copy(@NotNull ax isEnabled, @NotNull TextLabelState textState) {
        Intrinsics.echo(isEnabled, "isEnabled");
        Intrinsics.echo(textState, "textState");
        return new InternalButtonState(isEnabled, textState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalButtonState)) {
            return false;
        }
        InternalButtonState internalButtonState = (InternalButtonState) other;
        return Intrinsics.areEqual(this.isEnabled, internalButtonState.isEnabled) && Intrinsics.areEqual(this.textState, internalButtonState.textState);
    }

    @NotNull
    public final TextLabelState getTextState() {
        return this.textState;
    }

    public int hashCode() {
        return this.textState.hashCode() + (this.isEnabled.hashCode() * 31);
    }

    @NotNull
    public final ax isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        return "InternalButtonState(isEnabled=" + this.isEnabled + ", textState=" + this.textState + ")";
    }

    public InternalButtonState(@NotNull ax isEnabled, @NotNull TextLabelState textState) {
        Intrinsics.echo(isEnabled, "isEnabled");
        Intrinsics.echo(textState, "textState");
        this.isEnabled = isEnabled;
        this.textState = textState;
    }

    public /* synthetic */ InternalButtonState(ax axVar, TextLabelState textLabelState, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C0564b.zulu(Boolean.FALSE) : axVar, (i4 & 2) != 0 ? new TextLabelState(null, null, null, 7, null) : textLabelState);
    }
}
