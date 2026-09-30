package com.checkout.components.ui.model.state;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJB\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/ui/model/state/TextLabelState;", "", "Landroidx/compose/runtime/ax;", "", Constants.KEY_TEXT, "", "textId", "", "isVisible", "<init>", "(Landroidx/compose/runtime/ax;Landroidx/compose/runtime/ax;Landroidx/compose/runtime/ax;)V", "component1", "()Landroidx/compose/runtime/ax;", "component2", "component3", Constants.COPY_TYPE, "(Landroidx/compose/runtime/ax;Landroidx/compose/runtime/ax;Landroidx/compose/runtime/ax;)Lcom/checkout/components/ui/model/state/TextLabelState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/ax;", "getText", "getTextId", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextLabelState {
    public static final int $stable = 0;

    @NotNull
    private final ax isVisible;

    @NotNull
    private final ax text;

    @NotNull
    private final ax textId;

    public TextLabelState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ TextLabelState copy$default(TextLabelState textLabelState, ax axVar, ax axVar2, ax axVar3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            axVar = textLabelState.text;
        }
        if ((i4 & 2) != 0) {
            axVar2 = textLabelState.textId;
        }
        if ((i4 & 4) != 0) {
            axVar3 = textLabelState.isVisible;
        }
        return textLabelState.copy(axVar, axVar2, axVar3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ax getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ax getTextId() {
        return this.textId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ax getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public final TextLabelState copy(@NotNull ax text, @NotNull ax textId, @NotNull ax isVisible) {
        Intrinsics.echo(text, "text");
        Intrinsics.echo(textId, "textId");
        Intrinsics.echo(isVisible, "isVisible");
        return new TextLabelState(text, textId, isVisible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLabelState)) {
            return false;
        }
        TextLabelState textLabelState = (TextLabelState) other;
        return Intrinsics.areEqual(this.text, textLabelState.text) && Intrinsics.areEqual(this.textId, textLabelState.textId) && Intrinsics.areEqual(this.isVisible, textLabelState.isVisible);
    }

    @NotNull
    public final ax getText() {
        return this.text;
    }

    @NotNull
    public final ax getTextId() {
        return this.textId;
    }

    public int hashCode() {
        return this.isVisible.hashCode() + ((this.textId.hashCode() + (this.text.hashCode() * 31)) * 31);
    }

    @NotNull
    public final ax isVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        return "TextLabelState(text=" + this.text + ", textId=" + this.textId + ", isVisible=" + this.isVisible + ")";
    }

    public TextLabelState(@NotNull ax text, @NotNull ax textId, @NotNull ax isVisible) {
        Intrinsics.echo(text, "text");
        Intrinsics.echo(textId, "textId");
        Intrinsics.echo(isVisible, "isVisible");
        this.text = text;
        this.textId = textId;
        this.isVisible = isVisible;
    }

    public /* synthetic */ TextLabelState(ax axVar, ax axVar2, ax axVar3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C0564b.zulu("") : axVar, (i4 & 2) != 0 ? C0564b.zulu(null) : axVar2, (i4 & 4) != 0 ? C0564b.zulu(Boolean.FALSE) : axVar3);
    }
}
