package com.checkout.components.ui.model.style.base;

import I0.aj;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n.aw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJT\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001b¨\u00063"}, d2 = {"Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "inputFieldStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "errorMessageStyle", "", "defaultTextMaxLength", "Ln/aw;", "keyboardOptions", "LI0/aj;", "visualTransformation", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "containerStyle", "<init>", "(Lcom/checkout/components/ui/model/style/base/InputFieldStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Ljava/lang/Integer;Ln/aw;LI0/aj;Lcom/checkout/components/ui/model/style/base/ContainerStyle;)V", "component1", "()Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "component2", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "component3", "()Ljava/lang/Integer;", "component4", "()Ln/aw;", "component5", "()LI0/aj;", "component6", "()Lcom/checkout/components/ui/model/style/base/ContainerStyle;", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/style/base/InputFieldStyle;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Ljava/lang/Integer;Ln/aw;LI0/aj;Lcom/checkout/components/ui/model/style/base/ContainerStyle;)Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "getInputFieldStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getErrorMessageStyle", "Ljava/lang/Integer;", "getDefaultTextMaxLength", "Ln/aw;", "getKeyboardOptions", "LI0/aj;", "getVisualTransformation", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "getContainerStyle", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputComponentStyle {
    public static final int $stable;

    @NotNull
    private final ContainerStyle containerStyle;

    @Nullable
    private final Integer defaultTextMaxLength;

    @Nullable
    private final TextLabelStyle errorMessageStyle;

    @NotNull
    private final InputFieldStyle inputFieldStyle;

    @Nullable
    private final aw keyboardOptions;

    @Nullable
    private final aj visualTransformation;

    static {
        int i4 = FontFamily.$stable;
        $stable = i4 | BorderRadius.$stable | i4 | i4 | i4;
    }

    public InputComponentStyle() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ InputComponentStyle copy$default(InputComponentStyle inputComponentStyle, InputFieldStyle inputFieldStyle, TextLabelStyle textLabelStyle, Integer num, aw awVar, aj ajVar, ContainerStyle containerStyle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            inputFieldStyle = inputComponentStyle.inputFieldStyle;
        }
        if ((i4 & 2) != 0) {
            textLabelStyle = inputComponentStyle.errorMessageStyle;
        }
        if ((i4 & 4) != 0) {
            num = inputComponentStyle.defaultTextMaxLength;
        }
        if ((i4 & 8) != 0) {
            awVar = inputComponentStyle.keyboardOptions;
        }
        if ((i4 & 16) != 0) {
            ajVar = inputComponentStyle.visualTransformation;
        }
        if ((i4 & 32) != 0) {
            containerStyle = inputComponentStyle.containerStyle;
        }
        aj ajVar2 = ajVar;
        ContainerStyle containerStyle2 = containerStyle;
        return inputComponentStyle.copy(inputFieldStyle, textLabelStyle, num, awVar, ajVar2, containerStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputFieldStyle getInputFieldStyle() {
        return this.inputFieldStyle;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final TextLabelStyle getErrorMessageStyle() {
        return this.errorMessageStyle;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getDefaultTextMaxLength() {
        return this.defaultTextMaxLength;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final aw getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final aj getVisualTransformation() {
        return this.visualTransformation;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ContainerStyle getContainerStyle() {
        return this.containerStyle;
    }

    @NotNull
    public final InputComponentStyle copy(@NotNull InputFieldStyle inputFieldStyle, @Nullable TextLabelStyle errorMessageStyle, @Nullable Integer defaultTextMaxLength, @Nullable aw keyboardOptions, @Nullable aj visualTransformation, @NotNull ContainerStyle containerStyle) {
        Intrinsics.echo(inputFieldStyle, "inputFieldStyle");
        Intrinsics.echo(containerStyle, "containerStyle");
        return new InputComponentStyle(inputFieldStyle, errorMessageStyle, defaultTextMaxLength, keyboardOptions, visualTransformation, containerStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputComponentStyle)) {
            return false;
        }
        InputComponentStyle inputComponentStyle = (InputComponentStyle) other;
        return Intrinsics.areEqual(this.inputFieldStyle, inputComponentStyle.inputFieldStyle) && Intrinsics.areEqual(this.errorMessageStyle, inputComponentStyle.errorMessageStyle) && Intrinsics.areEqual(this.defaultTextMaxLength, inputComponentStyle.defaultTextMaxLength) && Intrinsics.areEqual(this.keyboardOptions, inputComponentStyle.keyboardOptions) && Intrinsics.areEqual(this.visualTransformation, inputComponentStyle.visualTransformation) && Intrinsics.areEqual(this.containerStyle, inputComponentStyle.containerStyle);
    }

    @NotNull
    public final ContainerStyle getContainerStyle() {
        return this.containerStyle;
    }

    @Nullable
    public final Integer getDefaultTextMaxLength() {
        return this.defaultTextMaxLength;
    }

    @Nullable
    public final TextLabelStyle getErrorMessageStyle() {
        return this.errorMessageStyle;
    }

    @NotNull
    public final InputFieldStyle getInputFieldStyle() {
        return this.inputFieldStyle;
    }

    @Nullable
    public final aw getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @Nullable
    public final aj getVisualTransformation() {
        return this.visualTransformation;
    }

    public int hashCode() {
        int hashCode = this.inputFieldStyle.hashCode() * 31;
        TextLabelStyle textLabelStyle = this.errorMessageStyle;
        int hashCode2 = (hashCode + (textLabelStyle == null ? 0 : textLabelStyle.hashCode())) * 31;
        Integer num = this.defaultTextMaxLength;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        aw awVar = this.keyboardOptions;
        int hashCode4 = (hashCode3 + (awVar == null ? 0 : awVar.hashCode())) * 31;
        aj ajVar = this.visualTransformation;
        return this.containerStyle.hashCode() + ((hashCode4 + (ajVar != null ? ajVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "InputComponentStyle(inputFieldStyle=" + this.inputFieldStyle + ", errorMessageStyle=" + this.errorMessageStyle + ", defaultTextMaxLength=" + this.defaultTextMaxLength + ", keyboardOptions=" + this.keyboardOptions + ", visualTransformation=" + this.visualTransformation + ", containerStyle=" + this.containerStyle + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputComponentStyle(@NotNull InputFieldStyle inputFieldStyle) {
        this(inputFieldStyle, null, null, null, null, null, 62, null);
        Intrinsics.echo(inputFieldStyle, "inputFieldStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputComponentStyle(@NotNull InputFieldStyle inputFieldStyle, @Nullable TextLabelStyle textLabelStyle) {
        this(inputFieldStyle, textLabelStyle, null, null, null, null, 60, null);
        Intrinsics.echo(inputFieldStyle, "inputFieldStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputComponentStyle(@NotNull InputFieldStyle inputFieldStyle, @Nullable TextLabelStyle textLabelStyle, @Nullable Integer num) {
        this(inputFieldStyle, textLabelStyle, num, null, null, null, 56, null);
        Intrinsics.echo(inputFieldStyle, "inputFieldStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputComponentStyle(@NotNull InputFieldStyle inputFieldStyle, @Nullable TextLabelStyle textLabelStyle, @Nullable Integer num, @Nullable aw awVar) {
        this(inputFieldStyle, textLabelStyle, num, awVar, null, null, 48, null);
        Intrinsics.echo(inputFieldStyle, "inputFieldStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputComponentStyle(@NotNull InputFieldStyle inputFieldStyle, @Nullable TextLabelStyle textLabelStyle, @Nullable Integer num, @Nullable aw awVar, @Nullable aj ajVar) {
        this(inputFieldStyle, textLabelStyle, num, awVar, ajVar, null, 32, null);
        Intrinsics.echo(inputFieldStyle, "inputFieldStyle");
    }

    public InputComponentStyle(@NotNull InputFieldStyle inputFieldStyle, @Nullable TextLabelStyle textLabelStyle, @Nullable Integer num, @Nullable aw awVar, @Nullable aj ajVar, @NotNull ContainerStyle containerStyle) {
        Intrinsics.echo(inputFieldStyle, "inputFieldStyle");
        Intrinsics.echo(containerStyle, "containerStyle");
        this.inputFieldStyle = inputFieldStyle;
        this.errorMessageStyle = textLabelStyle;
        this.defaultTextMaxLength = num;
        this.keyboardOptions = awVar;
        this.visualTransformation = ajVar;
        this.containerStyle = containerStyle;
    }

    public /* synthetic */ InputComponentStyle(InputFieldStyle inputFieldStyle, TextLabelStyle textLabelStyle, Integer num, aw awVar, aj ajVar, ContainerStyle containerStyle, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new InputFieldStyle(null, null, null, null, null, null, null, null, null, null, null, null, 0L, false, 16383, null) : inputFieldStyle, (i4 & 2) != 0 ? null : textLabelStyle, (i4 & 4) != 0 ? null : num, (i4 & 8) != 0 ? null : awVar, (i4 & 16) == 0 ? ajVar : null, (i4 & 32) != 0 ? new ContainerStyle(0L, null, null, null, 15, null) : containerStyle);
    }
}
