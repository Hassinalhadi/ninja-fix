package com.checkout.components.ui.model.style.base;

import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "", Constants.KEY_TEXT, "", "textId", "", "textStyle", "Lcom/checkout/components/ui/model/style/base/TextStyle;", "isLabelPreparingForInputField", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/checkout/components/ui/model/style/base/TextStyle;Z)V", "getText", "()Ljava/lang/String;", "getTextId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextStyle", "()Lcom/checkout/components/ui/model/style/base/TextStyle;", "()Z", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Lcom/checkout/components/ui/model/style/base/TextStyle;Z)Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "equals", "other", "hashCode", "toString", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextLabelStyle {
    public static final int $stable = FontFamily.$stable;
    private final boolean isLabelPreparingForInputField;

    @NotNull
    private final String text;

    @Nullable
    private final Integer textId;

    @NotNull
    private final TextStyle textStyle;

    public TextLabelStyle() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ TextLabelStyle copy$default(TextLabelStyle textLabelStyle, String str, Integer num, TextStyle textStyle, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = textLabelStyle.text;
        }
        if ((i4 & 2) != 0) {
            num = textLabelStyle.textId;
        }
        if ((i4 & 4) != 0) {
            textStyle = textLabelStyle.textStyle;
        }
        if ((i4 & 8) != 0) {
            z2 = textLabelStyle.isLabelPreparingForInputField;
        }
        return textLabelStyle.copy(str, num, textStyle, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTextId() {
        return this.textId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLabelPreparingForInputField() {
        return this.isLabelPreparingForInputField;
    }

    @NotNull
    public final TextLabelStyle copy(@NotNull String text, @Nullable Integer num, @NotNull TextStyle textStyle, boolean z2) {
        Intrinsics.echo(text, "text");
        Intrinsics.echo(textStyle, "textStyle");
        return new TextLabelStyle(text, num, textStyle, z2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLabelStyle)) {
            return false;
        }
        TextLabelStyle textLabelStyle = (TextLabelStyle) other;
        return Intrinsics.areEqual(this.text, textLabelStyle.text) && Intrinsics.areEqual(this.textId, textLabelStyle.textId) && Intrinsics.areEqual(this.textStyle, textLabelStyle.textStyle) && this.isLabelPreparingForInputField == textLabelStyle.isLabelPreparingForInputField;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getTextId() {
        return this.textId;
    }

    @NotNull
    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Integer num = this.textId;
        return (this.isLabelPreparingForInputField ? 1231 : 1237) + ((this.textStyle.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    public final boolean isLabelPreparingForInputField() {
        return this.isLabelPreparingForInputField;
    }

    @NotNull
    public String toString() {
        return "TextLabelStyle(text=" + this.text + ", textId=" + this.textId + ", textStyle=" + this.textStyle + ", isLabelPreparingForInputField=" + this.isLabelPreparingForInputField + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextLabelStyle(@NotNull String text) {
        this(text, null, null, false, 14, null);
        Intrinsics.echo(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextLabelStyle(@NotNull String text, @Nullable Integer num) {
        this(text, num, null, false, 12, null);
        Intrinsics.echo(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextLabelStyle(@NotNull String text, @Nullable Integer num, @NotNull TextStyle textStyle) {
        this(text, num, textStyle, false, 8, null);
        Intrinsics.echo(text, "text");
        Intrinsics.echo(textStyle, "textStyle");
    }

    public TextLabelStyle(@NotNull String text, @Nullable Integer num, @NotNull TextStyle textStyle, boolean z2) {
        Intrinsics.echo(text, "text");
        Intrinsics.echo(textStyle, "textStyle");
        this.text = text;
        this.textId = num;
        this.textStyle = textStyle;
        this.isLabelPreparingForInputField = z2;
    }

    public /* synthetic */ TextLabelStyle(String str, Integer num, TextStyle textStyle, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? new TextStyle(0, null, null, null, 0L, null, 0, null, null, null, 1023, null) : textStyle, (i4 & 8) != 0 ? false : z2);
    }
}
