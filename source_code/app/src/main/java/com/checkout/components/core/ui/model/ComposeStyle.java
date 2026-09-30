package com.checkout.components.core.ui.model;

import D0.an;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m.C2093f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006)"}, d2 = {"Lcom/checkout/components/core/ui/model/ComposeStyle;", "", "LD0/an;", "subHeadingTextStyle", "footNoteTextStyle", "Lm/f;", "roundedCornerShape", "Lcom/checkout/components/core/ui/model/ComponentColors;", "componentColors", "<init>", "(LD0/an;LD0/an;Lm/f;Lcom/checkout/components/core/ui/model/ComponentColors;)V", "component1", "()LD0/an;", "component2", "component3", "()Lm/f;", "component4", "()Lcom/checkout/components/core/ui/model/ComponentColors;", Constants.COPY_TYPE, "(LD0/an;LD0/an;Lm/f;Lcom/checkout/components/core/ui/model/ComponentColors;)Lcom/checkout/components/core/ui/model/ComposeStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LD0/an;", "getSubHeadingTextStyle", "b", "getFootNoteTextStyle", "c", "Lm/f;", "getRoundedCornerShape", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/core/ui/model/ComponentColors;", "getComponentColors", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ComposeStyle {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final an subHeadingTextStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final an footNoteTextStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C2093f roundedCornerShape;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ComponentColors componentColors;

    public ComposeStyle(@NotNull an subHeadingTextStyle, @NotNull an footNoteTextStyle, @NotNull C2093f roundedCornerShape, @NotNull ComponentColors componentColors) {
        Intrinsics.echo(subHeadingTextStyle, "subHeadingTextStyle");
        Intrinsics.echo(footNoteTextStyle, "footNoteTextStyle");
        Intrinsics.echo(roundedCornerShape, "roundedCornerShape");
        Intrinsics.echo(componentColors, "componentColors");
        this.subHeadingTextStyle = subHeadingTextStyle;
        this.footNoteTextStyle = footNoteTextStyle;
        this.roundedCornerShape = roundedCornerShape;
        this.componentColors = componentColors;
    }

    public static /* synthetic */ ComposeStyle copy$default(ComposeStyle composeStyle, an anVar, an anVar2, C2093f c2093f, ComponentColors componentColors, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            anVar = composeStyle.subHeadingTextStyle;
        }
        if ((i4 & 2) != 0) {
            anVar2 = composeStyle.footNoteTextStyle;
        }
        if ((i4 & 4) != 0) {
            c2093f = composeStyle.roundedCornerShape;
        }
        if ((i4 & 8) != 0) {
            componentColors = composeStyle.componentColors;
        }
        return composeStyle.copy(anVar, anVar2, c2093f, componentColors);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final an getSubHeadingTextStyle() {
        return this.subHeadingTextStyle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final an getFootNoteTextStyle() {
        return this.footNoteTextStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final C2093f getRoundedCornerShape() {
        return this.roundedCornerShape;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ComponentColors getComponentColors() {
        return this.componentColors;
    }

    @NotNull
    public final ComposeStyle copy(@NotNull an subHeadingTextStyle, @NotNull an footNoteTextStyle, @NotNull C2093f roundedCornerShape, @NotNull ComponentColors componentColors) {
        Intrinsics.echo(subHeadingTextStyle, "subHeadingTextStyle");
        Intrinsics.echo(footNoteTextStyle, "footNoteTextStyle");
        Intrinsics.echo(roundedCornerShape, "roundedCornerShape");
        Intrinsics.echo(componentColors, "componentColors");
        return new ComposeStyle(subHeadingTextStyle, footNoteTextStyle, roundedCornerShape, componentColors);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeStyle)) {
            return false;
        }
        ComposeStyle composeStyle = (ComposeStyle) other;
        return Intrinsics.areEqual(this.subHeadingTextStyle, composeStyle.subHeadingTextStyle) && Intrinsics.areEqual(this.footNoteTextStyle, composeStyle.footNoteTextStyle) && Intrinsics.areEqual(this.roundedCornerShape, composeStyle.roundedCornerShape) && Intrinsics.areEqual(this.componentColors, composeStyle.componentColors);
    }

    @NotNull
    public final ComponentColors getComponentColors() {
        return this.componentColors;
    }

    @NotNull
    public final an getFootNoteTextStyle() {
        return this.footNoteTextStyle;
    }

    @NotNull
    public final C2093f getRoundedCornerShape() {
        return this.roundedCornerShape;
    }

    @NotNull
    public final an getSubHeadingTextStyle() {
        return this.subHeadingTextStyle;
    }

    public final int hashCode() {
        return this.componentColors.hashCode() + ((this.roundedCornerShape.hashCode() + AbstractC2327c.romeo(this.subHeadingTextStyle.hashCode() * 31, 31, this.footNoteTextStyle)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ComposeStyle(subHeadingTextStyle=" + this.subHeadingTextStyle + ", footNoteTextStyle=" + this.footNoteTextStyle + ", roundedCornerShape=" + this.roundedCornerShape + ", componentColors=" + this.componentColors + ")";
    }

    public /* synthetic */ ComposeStyle(an anVar, an anVar2, C2093f c2093f, ComponentColors componentColors, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new an(0L, 0L, null, null, null, 0L, 0, 0L, 0, 16777215) : anVar, (i4 & 2) != 0 ? new an(0L, 0L, null, null, null, 0L, 0, 0L, 0, 16777215) : anVar2, c2093f, componentColors);
    }
}
