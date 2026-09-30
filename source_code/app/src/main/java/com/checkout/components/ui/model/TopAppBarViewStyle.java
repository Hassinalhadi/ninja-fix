package com.checkout.components.ui.model;

import Q0.c;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "", "titleStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "scrolledContainerColor", "", "containerColor", "navigationIconTintColor", "actionIconTintColor", "<init>", "(Lcom/checkout/components/ui/model/style/base/TextLabelStyle;JJJJ)V", "getTitleStyle", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getScrolledContainerColor", "()J", "getContainerColor", "getNavigationIconTintColor", "getActionIconTintColor", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopAppBarViewStyle {
    public static final int $stable = FontFamily.$stable;
    private final long actionIconTintColor;
    private final long containerColor;
    private final long navigationIconTintColor;
    private final long scrolledContainerColor;

    @NotNull
    private final TextLabelStyle titleStyle;

    public TopAppBarViewStyle() {
        this(null, 0L, 0L, 0L, 0L, 31, null);
    }

    public static /* synthetic */ TopAppBarViewStyle copy$default(TopAppBarViewStyle topAppBarViewStyle, TextLabelStyle textLabelStyle, long j5, long j6, long j7, long j10, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            textLabelStyle = topAppBarViewStyle.titleStyle;
        }
        if ((i4 & 2) != 0) {
            j5 = topAppBarViewStyle.scrolledContainerColor;
        }
        if ((i4 & 4) != 0) {
            j6 = topAppBarViewStyle.containerColor;
        }
        if ((i4 & 8) != 0) {
            j7 = topAppBarViewStyle.navigationIconTintColor;
        }
        if ((i4 & 16) != 0) {
            j10 = topAppBarViewStyle.actionIconTintColor;
        }
        long j11 = j10;
        long j12 = j7;
        return topAppBarViewStyle.copy(textLabelStyle, j5, j6, j12, j11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextLabelStyle getTitleStyle() {
        return this.titleStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final long getScrolledContainerColor() {
        return this.scrolledContainerColor;
    }

    /* renamed from: component3, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: component4, reason: from getter */
    public final long getNavigationIconTintColor() {
        return this.navigationIconTintColor;
    }

    /* renamed from: component5, reason: from getter */
    public final long getActionIconTintColor() {
        return this.actionIconTintColor;
    }

    @NotNull
    public final TopAppBarViewStyle copy(@NotNull TextLabelStyle titleStyle, long scrolledContainerColor, long containerColor, long navigationIconTintColor, long actionIconTintColor) {
        Intrinsics.echo(titleStyle, "titleStyle");
        return new TopAppBarViewStyle(titleStyle, scrolledContainerColor, containerColor, navigationIconTintColor, actionIconTintColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAppBarViewStyle)) {
            return false;
        }
        TopAppBarViewStyle topAppBarViewStyle = (TopAppBarViewStyle) other;
        return Intrinsics.areEqual(this.titleStyle, topAppBarViewStyle.titleStyle) && this.scrolledContainerColor == topAppBarViewStyle.scrolledContainerColor && this.containerColor == topAppBarViewStyle.containerColor && this.navigationIconTintColor == topAppBarViewStyle.navigationIconTintColor && this.actionIconTintColor == topAppBarViewStyle.actionIconTintColor;
    }

    public final long getActionIconTintColor() {
        return this.actionIconTintColor;
    }

    public final long getContainerColor() {
        return this.containerColor;
    }

    public final long getNavigationIconTintColor() {
        return this.navigationIconTintColor;
    }

    public final long getScrolledContainerColor() {
        return this.scrolledContainerColor;
    }

    @NotNull
    public final TextLabelStyle getTitleStyle() {
        return this.titleStyle;
    }

    public int hashCode() {
        int hashCode = this.titleStyle.hashCode() * 31;
        long j5 = this.scrolledContainerColor;
        long j6 = this.containerColor;
        int i4 = (((int) (j6 ^ (j6 >>> 32))) + ((((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31)) * 31;
        long j7 = this.navigationIconTintColor;
        int i5 = (((int) (j7 ^ (j7 >>> 32))) + i4) * 31;
        long j10 = this.actionIconTintColor;
        return ((int) ((j10 >>> 32) ^ j10)) + i5;
    }

    @NotNull
    public String toString() {
        TextLabelStyle textLabelStyle = this.titleStyle;
        long j5 = this.scrolledContainerColor;
        long j6 = this.containerColor;
        long j7 = this.navigationIconTintColor;
        long j10 = this.actionIconTintColor;
        StringBuilder sb2 = new StringBuilder("TopAppBarViewStyle(titleStyle=");
        sb2.append(textLabelStyle);
        sb2.append(", scrolledContainerColor=");
        sb2.append(j5);
        c.amber(sb2, ", containerColor=", j6, ", navigationIconTintColor=");
        sb2.append(j7);
        sb2.append(", actionIconTintColor=");
        sb2.append(j10);
        sb2.append(")");
        return sb2.toString();
    }

    public TopAppBarViewStyle(@NotNull TextLabelStyle titleStyle, long j5, long j6, long j7, long j10) {
        Intrinsics.echo(titleStyle, "titleStyle");
        this.titleStyle = titleStyle;
        this.scrolledContainerColor = j5;
        this.containerColor = j6;
        this.navigationIconTintColor = j7;
        this.actionIconTintColor = j10;
    }

    public /* synthetic */ TopAppBarViewStyle(TextLabelStyle textLabelStyle, long j5, long j6, long j7, long j10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new TextLabelStyle(null, null, null, false, 15, null) : textLabelStyle, (i4 & 2) != 0 ? 4293453542L : j5, (i4 & 4) != 0 ? 4294967295L : j6, (i4 & 8) != 0 ? 4278190080L : j7, (i4 & 16) != 0 ? 4278190080L : j10);
    }
}
