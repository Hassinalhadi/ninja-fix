package com.checkout.components.ui.model.style.view;

import T.p;
import T.s;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "inputFieldStyle", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "errorMessageStyle", "LT/s;", "containerModifier", "<init>", "(Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;LT/s;)V", "component1", "()Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "component2", "()Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "component3", "()LT/s;", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;LT/s;)Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "getInputFieldStyle", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "getErrorMessageStyle", "LT/s;", "getContainerModifier", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputComponentViewStyle {
    public static final int $stable = 0;

    @NotNull
    private final s containerModifier;

    @NotNull
    private final TextLabelViewStyle errorMessageStyle;

    @NotNull
    private final InputFieldViewStyle inputFieldStyle;

    public InputComponentViewStyle() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ InputComponentViewStyle copy$default(InputComponentViewStyle inputComponentViewStyle, InputFieldViewStyle inputFieldViewStyle, TextLabelViewStyle textLabelViewStyle, s sVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            inputFieldViewStyle = inputComponentViewStyle.inputFieldStyle;
        }
        if ((i4 & 2) != 0) {
            textLabelViewStyle = inputComponentViewStyle.errorMessageStyle;
        }
        if ((i4 & 4) != 0) {
            sVar = inputComponentViewStyle.containerModifier;
        }
        return inputComponentViewStyle.copy(inputFieldViewStyle, textLabelViewStyle, sVar);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputFieldViewStyle getInputFieldStyle() {
        return this.inputFieldStyle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelViewStyle getErrorMessageStyle() {
        return this.errorMessageStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final s getContainerModifier() {
        return this.containerModifier;
    }

    @NotNull
    public final InputComponentViewStyle copy(@NotNull InputFieldViewStyle inputFieldStyle, @NotNull TextLabelViewStyle errorMessageStyle, @NotNull s containerModifier) {
        Intrinsics.echo(inputFieldStyle, "inputFieldStyle");
        Intrinsics.echo(errorMessageStyle, "errorMessageStyle");
        Intrinsics.echo(containerModifier, "containerModifier");
        return new InputComponentViewStyle(inputFieldStyle, errorMessageStyle, containerModifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputComponentViewStyle)) {
            return false;
        }
        InputComponentViewStyle inputComponentViewStyle = (InputComponentViewStyle) other;
        return Intrinsics.areEqual(this.inputFieldStyle, inputComponentViewStyle.inputFieldStyle) && Intrinsics.areEqual(this.errorMessageStyle, inputComponentViewStyle.errorMessageStyle) && Intrinsics.areEqual(this.containerModifier, inputComponentViewStyle.containerModifier);
    }

    @NotNull
    public final s getContainerModifier() {
        return this.containerModifier;
    }

    @NotNull
    public final TextLabelViewStyle getErrorMessageStyle() {
        return this.errorMessageStyle;
    }

    @NotNull
    public final InputFieldViewStyle getInputFieldStyle() {
        return this.inputFieldStyle;
    }

    public int hashCode() {
        return this.containerModifier.hashCode() + ((this.errorMessageStyle.hashCode() + (this.inputFieldStyle.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "InputComponentViewStyle(inputFieldStyle=" + this.inputFieldStyle + ", errorMessageStyle=" + this.errorMessageStyle + ", containerModifier=" + this.containerModifier + ")";
    }

    public InputComponentViewStyle(@NotNull InputFieldViewStyle inputFieldStyle, @NotNull TextLabelViewStyle errorMessageStyle, @NotNull s containerModifier) {
        Intrinsics.echo(inputFieldStyle, "inputFieldStyle");
        Intrinsics.echo(errorMessageStyle, "errorMessageStyle");
        Intrinsics.echo(containerModifier, "containerModifier");
        this.inputFieldStyle = inputFieldStyle;
        this.errorMessageStyle = errorMessageStyle;
        this.containerModifier = containerModifier;
    }

    public /* synthetic */ InputComponentViewStyle(InputFieldViewStyle inputFieldViewStyle, TextLabelViewStyle textLabelViewStyle, s sVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new InputFieldViewStyle(null, false, false, null, null, null, null, null, null, false, 0, 0, null, null, null, 32767, null) : inputFieldViewStyle, (i4 & 2) != 0 ? new TextLabelViewStyle(null, 0, false, 0, null, null, false, 127, null) : textLabelViewStyle, (i4 & 4) != 0 ? p.alpha : sVar);
    }
}
