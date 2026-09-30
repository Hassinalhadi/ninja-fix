package com.checkout.components.ui.model.state;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/ui/model/state/InputComponentState;", "", "inputFieldState", "Lcom/checkout/components/ui/model/state/InputFieldState;", "errorState", "Lcom/checkout/components/ui/model/state/TextLabelState;", "<init>", "(Lcom/checkout/components/ui/model/state/InputFieldState;Lcom/checkout/components/ui/model/state/TextLabelState;)V", "getInputFieldState", "()Lcom/checkout/components/ui/model/state/InputFieldState;", "getErrorState", "()Lcom/checkout/components/ui/model/state/TextLabelState;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputComponentState {
    public static final int $stable = 0;

    @NotNull
    private final TextLabelState errorState;

    @NotNull
    private final InputFieldState inputFieldState;

    /* JADX WARN: Multi-variable type inference failed */
    public InputComponentState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InputComponentState copy$default(InputComponentState inputComponentState, InputFieldState inputFieldState, TextLabelState textLabelState, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            inputFieldState = inputComponentState.inputFieldState;
        }
        if ((i4 & 2) != 0) {
            textLabelState = inputComponentState.errorState;
        }
        return inputComponentState.copy(inputFieldState, textLabelState);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputFieldState getInputFieldState() {
        return this.inputFieldState;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelState getErrorState() {
        return this.errorState;
    }

    @NotNull
    public final InputComponentState copy(@NotNull InputFieldState inputFieldState, @NotNull TextLabelState errorState) {
        Intrinsics.echo(inputFieldState, "inputFieldState");
        Intrinsics.echo(errorState, "errorState");
        return new InputComponentState(inputFieldState, errorState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputComponentState)) {
            return false;
        }
        InputComponentState inputComponentState = (InputComponentState) other;
        return Intrinsics.areEqual(this.inputFieldState, inputComponentState.inputFieldState) && Intrinsics.areEqual(this.errorState, inputComponentState.errorState);
    }

    @NotNull
    public final TextLabelState getErrorState() {
        return this.errorState;
    }

    @NotNull
    public final InputFieldState getInputFieldState() {
        return this.inputFieldState;
    }

    public int hashCode() {
        return this.errorState.hashCode() + (this.inputFieldState.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "InputComponentState(inputFieldState=" + this.inputFieldState + ", errorState=" + this.errorState + ")";
    }

    public InputComponentState(@NotNull InputFieldState inputFieldState, @NotNull TextLabelState errorState) {
        Intrinsics.echo(inputFieldState, "inputFieldState");
        Intrinsics.echo(errorState, "errorState");
        this.inputFieldState = inputFieldState;
        this.errorState = errorState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ InputComponentState(InputFieldState inputFieldState, TextLabelState textLabelState, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputFieldState, textLabelState);
        if ((i4 & 1) != 0) {
            inputFieldState = new InputFieldState(null, null, null, null, null, 31, null);
        }
        if ((i4 & 2) != 0) {
            textLabelState = new TextLabelState(null, null, null, 7, null);
        }
    }
}
