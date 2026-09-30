package com.checkout.components.ui.model.style.base;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/checkout/components/ui/model/style/base/CursorStyle;", "", "cursorColor", "", "errorCursorColor", "cursorHandleColor", "cursorHighlightColor", "<init>", "(JJJJ)V", "getCursorColor", "()J", "getErrorCursorColor", "getCursorHandleColor", "getCursorHighlightColor", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CursorStyle {
    public static final int $stable = 0;
    private final long cursorColor;
    private final long cursorHandleColor;
    private final long cursorHighlightColor;
    private final long errorCursorColor;

    public CursorStyle(long j5, long j6, long j7, long j10) {
        this.cursorColor = j5;
        this.errorCursorColor = j6;
        this.cursorHandleColor = j7;
        this.cursorHighlightColor = j10;
    }

    public static /* synthetic */ CursorStyle copy$default(CursorStyle cursorStyle, long j5, long j6, long j7, long j10, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = cursorStyle.cursorColor;
        }
        long j11 = j5;
        if ((i4 & 2) != 0) {
            j6 = cursorStyle.errorCursorColor;
        }
        long j12 = j6;
        if ((i4 & 4) != 0) {
            j7 = cursorStyle.cursorHandleColor;
        }
        return cursorStyle.copy(j11, j12, j7, (i4 & 8) != 0 ? cursorStyle.cursorHighlightColor : j10);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCursorColor() {
        return this.cursorColor;
    }

    /* renamed from: component2, reason: from getter */
    public final long getErrorCursorColor() {
        return this.errorCursorColor;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCursorHandleColor() {
        return this.cursorHandleColor;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCursorHighlightColor() {
        return this.cursorHighlightColor;
    }

    @NotNull
    public final CursorStyle copy(long cursorColor, long errorCursorColor, long cursorHandleColor, long cursorHighlightColor) {
        return new CursorStyle(cursorColor, errorCursorColor, cursorHandleColor, cursorHighlightColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CursorStyle)) {
            return false;
        }
        CursorStyle cursorStyle = (CursorStyle) other;
        return this.cursorColor == cursorStyle.cursorColor && this.errorCursorColor == cursorStyle.errorCursorColor && this.cursorHandleColor == cursorStyle.cursorHandleColor && this.cursorHighlightColor == cursorStyle.cursorHighlightColor;
    }

    public final long getCursorColor() {
        return this.cursorColor;
    }

    public final long getCursorHandleColor() {
        return this.cursorHandleColor;
    }

    public final long getCursorHighlightColor() {
        return this.cursorHighlightColor;
    }

    public final long getErrorCursorColor() {
        return this.errorCursorColor;
    }

    public int hashCode() {
        long j5 = this.cursorColor;
        long j6 = this.errorCursorColor;
        int i4 = (((int) (j6 ^ (j6 >>> 32))) + (((int) (j5 ^ (j5 >>> 32))) * 31)) * 31;
        long j7 = this.cursorHandleColor;
        int i5 = (((int) (j7 ^ (j7 >>> 32))) + i4) * 31;
        long j10 = this.cursorHighlightColor;
        return ((int) ((j10 >>> 32) ^ j10)) + i5;
    }

    @NotNull
    public String toString() {
        long j5 = this.cursorColor;
        long j6 = this.errorCursorColor;
        long j7 = this.cursorHandleColor;
        long j10 = this.cursorHighlightColor;
        StringBuilder uniform = c.uniform("CursorStyle(cursorColor=", j5, ", errorCursorColor=");
        uniform.append(j6);
        c.amber(uniform, ", cursorHandleColor=", j7, ", cursorHighlightColor=");
        return c.mike(j10, ")", uniform);
    }
}
