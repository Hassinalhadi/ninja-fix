package com.checkout.components.core.ui.model;

import Q0.c;
import a0.C0366t;
import androidx.appcompat.widget.P0;
import ao.ad;
import av.q;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u000b¨\u0006-"}, d2 = {"Lcom/checkout/components/core/ui/model/ComponentColors;", "", "La0/t;", Constants.KEY_BORDER, "primary", Constants.KEY_ACTION, "background", RedirectionConstants.REDIRECT_SUCCESS_VALUE, "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "copy-t635Npw", "(JJJJJ)Lcom/checkout/components/core/ui/model/ComponentColors;", Constants.COPY_TYPE, "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getBorder-0d7_KjU", "b", "getPrimary-0d7_KjU", "c", "getAction-0d7_KjU", Constants.INAPP_DATA_TAG, "getBackground-0d7_KjU", "e", "getSuccess-0d7_KjU", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ComponentColors {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long border;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long primary;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long action;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long background;

    /* renamed from: e, reason: from kotlin metadata */
    private final long success;

    public ComponentColors(long j5, long j6, long j7, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this.border = j5;
        this.primary = j6;
        this.action = j7;
        this.background = j10;
        this.success = j11;
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static ComponentColors m86copyt635Npw$default(ComponentColors componentColors, long j5, long j6, long j7, long j10, long j11, int i4, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        if ((i4 & 1) != 0) {
            j5 = componentColors.border;
        }
        long j16 = j5;
        if ((i4 & 2) != 0) {
            j12 = componentColors.primary;
        } else {
            j12 = j6;
        }
        if ((i4 & 4) != 0) {
            j13 = componentColors.action;
        } else {
            j13 = j7;
        }
        if ((i4 & 8) != 0) {
            j14 = componentColors.background;
        } else {
            j14 = j10;
        }
        if ((i4 & 16) != 0) {
            j15 = componentColors.success;
        } else {
            j15 = j11;
        }
        componentColors.getClass();
        return new ComponentColors(j16, j12, j13, j14, j15, null);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorder() {
        return this.border;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimary() {
        return this.primary;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getAction() {
        return this.action;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getSuccess() {
        return this.success;
    }

    @NotNull
    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final ComponentColors m92copyt635Npw(long border, long primary, long action, long background, long success) {
        return new ComponentColors(border, primary, action, background, success, null);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentColors)) {
            return false;
        }
        ComponentColors componentColors = (ComponentColors) other;
        return C0366t.charlie(this.border, componentColors.border) && C0366t.charlie(this.primary, componentColors.primary) && C0366t.charlie(this.action, componentColors.action) && C0366t.charlie(this.background, componentColors.background) && C0366t.charlie(this.success, componentColors.success);
    }

    /* renamed from: getAction-0d7_KjU, reason: not valid java name */
    public final long m93getAction0d7_KjU() {
        return this.action;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m94getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m95getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m96getPrimary0d7_KjU() {
        return this.primary;
    }

    /* renamed from: getSuccess-0d7_KjU, reason: not valid java name */
    public final long m97getSuccess0d7_KjU() {
        return this.success;
    }

    public final int hashCode() {
        long j5 = this.border;
        int i4 = C0366t.lima;
        return p.alpha(this.success) + ad.whiskey(ad.whiskey(ad.whiskey(p.alpha(j5) * 31, 31, this.primary), 31, this.action), 31, this.background);
    }

    @NotNull
    public final String toString() {
        String india = C0366t.india(this.border);
        String india2 = C0366t.india(this.primary);
        String india3 = C0366t.india(this.action);
        String india4 = C0366t.india(this.background);
        String india5 = C0366t.india(this.success);
        StringBuilder india6 = q.india("ComponentColors(border=", india, ", primary=", india2, ", action=");
        c.azure(india6, india3, ", background=", india4, ", success=");
        return P0.gold(india6, india5, ")");
    }
}
