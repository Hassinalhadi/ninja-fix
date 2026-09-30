package com.checkout.components.ui.model.state;

import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010Jf\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0010R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b$\u0010\u0013R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/checkout/components/ui/model/state/InputFieldState;", "", "Landroidx/compose/runtime/ax;", "", Constants.KEY_TEXT, "", "maxLength", "Lkotlin/Function0;", "", "leadingIcon", "trailingIcon", "", "isError", "<init>", "(Landroidx/compose/runtime/ax;Landroidx/compose/runtime/ax;LXd/l;LXd/l;Landroidx/compose/runtime/ax;)V", "component1", "()Landroidx/compose/runtime/ax;", "component2", "component3", "()LXd/l;", "component4", "component5", Constants.COPY_TYPE, "(Landroidx/compose/runtime/ax;Landroidx/compose/runtime/ax;LXd/l;LXd/l;Landroidx/compose/runtime/ax;)Lcom/checkout/components/ui/model/state/InputFieldState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/ax;", "getText", "getMaxLength", "LXd/l;", "getLeadingIcon", "getTrailingIcon", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputFieldState {
    public static final int $stable = 0;

    @NotNull
    private final ax isError;

    @Nullable
    private final l leadingIcon;

    @NotNull
    private final ax maxLength;

    @NotNull
    private final ax text;

    @Nullable
    private final l trailingIcon;

    public InputFieldState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ InputFieldState copy$default(InputFieldState inputFieldState, ax axVar, ax axVar2, l lVar, l lVar2, ax axVar3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            axVar = inputFieldState.text;
        }
        if ((i4 & 2) != 0) {
            axVar2 = inputFieldState.maxLength;
        }
        if ((i4 & 4) != 0) {
            lVar = inputFieldState.leadingIcon;
        }
        if ((i4 & 8) != 0) {
            lVar2 = inputFieldState.trailingIcon;
        }
        if ((i4 & 16) != 0) {
            axVar3 = inputFieldState.isError;
        }
        ax axVar4 = axVar3;
        l lVar3 = lVar;
        return inputFieldState.copy(axVar, axVar2, lVar3, lVar2, axVar4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ax getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ax getMaxLength() {
        return this.maxLength;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final l getLeadingIcon() {
        return this.leadingIcon;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final l getTrailingIcon() {
        return this.trailingIcon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ax getIsError() {
        return this.isError;
    }

    @NotNull
    public final InputFieldState copy(@NotNull ax text, @NotNull ax maxLength, @Nullable l leadingIcon, @Nullable l trailingIcon, @NotNull ax isError) {
        Intrinsics.echo(text, "text");
        Intrinsics.echo(maxLength, "maxLength");
        Intrinsics.echo(isError, "isError");
        return new InputFieldState(text, maxLength, leadingIcon, trailingIcon, isError);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldState)) {
            return false;
        }
        InputFieldState inputFieldState = (InputFieldState) other;
        return Intrinsics.areEqual(this.text, inputFieldState.text) && Intrinsics.areEqual(this.maxLength, inputFieldState.maxLength) && Intrinsics.areEqual(this.leadingIcon, inputFieldState.leadingIcon) && Intrinsics.areEqual(this.trailingIcon, inputFieldState.trailingIcon) && Intrinsics.areEqual(this.isError, inputFieldState.isError);
    }

    @Nullable
    public final l getLeadingIcon() {
        return this.leadingIcon;
    }

    @NotNull
    public final ax getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final ax getText() {
        return this.text;
    }

    @Nullable
    public final l getTrailingIcon() {
        return this.trailingIcon;
    }

    public int hashCode() {
        int hashCode = (this.maxLength.hashCode() + (this.text.hashCode() * 31)) * 31;
        l lVar = this.leadingIcon;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        l lVar2 = this.trailingIcon;
        return this.isError.hashCode() + ((hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final ax isError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        return "InputFieldState(text=" + this.text + ", maxLength=" + this.maxLength + ", leadingIcon=" + this.leadingIcon + ", trailingIcon=" + this.trailingIcon + ", isError=" + this.isError + ")";
    }

    public InputFieldState(@NotNull ax text, @NotNull ax maxLength, @Nullable l lVar, @Nullable l lVar2, @NotNull ax isError) {
        Intrinsics.echo(text, "text");
        Intrinsics.echo(maxLength, "maxLength");
        Intrinsics.echo(isError, "isError");
        this.text = text;
        this.maxLength = maxLength;
        this.leadingIcon = lVar;
        this.trailingIcon = lVar2;
        this.isError = isError;
    }

    public /* synthetic */ InputFieldState(ax axVar, ax axVar2, l lVar, l lVar2, ax axVar3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C0564b.zulu("") : axVar, (i4 & 2) != 0 ? C0564b.zulu(null) : axVar2, (i4 & 4) != 0 ? null : lVar, (i4 & 8) != 0 ? null : lVar2, (i4 & 16) != 0 ? C0564b.zulu(Boolean.FALSE) : axVar3);
    }
}
