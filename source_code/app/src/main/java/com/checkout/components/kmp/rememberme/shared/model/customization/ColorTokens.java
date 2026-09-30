package com.checkout.components.kmp.rememberme.shared.model.customization;

import Q0.c;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00065"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/ColorTokens;", "", "disabled", "", RedirectCustomTabEventLogger.RESULT_ERROR, "inverse", Constants.KEY_ACTION, RedirectionConstants.REDIRECT_SUCCESS_VALUE, "primary", "secondary", "formBorder", Constants.KEY_BORDER, "outline", "formBackground", "background", "scrolledContainer", "<init>", "(JJJJJJJJJJJJJ)V", "getDisabled", "()J", "getError", "getInverse", "getAction", "getSuccess", "getPrimary", "getSecondary", "getFormBorder", "getBorder", "getOutline", "getFormBackground", "getBackground", "getScrolledContainer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ColorTokens {
    public static final int $stable = 0;
    private final long action;
    private final long background;
    private final long border;
    private final long disabled;
    private final long error;
    private final long formBackground;
    private final long formBorder;
    private final long inverse;
    private final long outline;
    private final long primary;
    private final long scrolledContainer;
    private final long secondary;
    private final long success;

    public ColorTokens() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8191, null);
    }

    public static /* synthetic */ ColorTokens copy$default(ColorTokens colorTokens, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i4, Object obj) {
        long j20;
        long j21;
        long j22 = (i4 & 1) != 0 ? colorTokens.disabled : j5;
        long j23 = (i4 & 2) != 0 ? colorTokens.error : j6;
        long j24 = (i4 & 4) != 0 ? colorTokens.inverse : j7;
        long j25 = (i4 & 8) != 0 ? colorTokens.action : j10;
        long j26 = (i4 & 16) != 0 ? colorTokens.success : j11;
        long j27 = (i4 & 32) != 0 ? colorTokens.primary : j12;
        long j28 = (i4 & 64) != 0 ? colorTokens.secondary : j13;
        long j29 = j22;
        long j30 = (i4 & 128) != 0 ? colorTokens.formBorder : j14;
        long j31 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? colorTokens.border : j15;
        long j32 = (i4 & 512) != 0 ? colorTokens.outline : j16;
        long j33 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? colorTokens.formBackground : j17;
        long j34 = (i4 & 2048) != 0 ? colorTokens.background : j18;
        if ((i4 & 4096) != 0) {
            j21 = j34;
            j20 = colorTokens.scrolledContainer;
        } else {
            j20 = j19;
            j21 = j34;
        }
        return colorTokens.copy(j29, j23, j24, j25, j26, j27, j28, j30, j31, j32, j33, j21, j20);
    }

    /* renamed from: component1, reason: from getter */
    public final long getDisabled() {
        return this.disabled;
    }

    /* renamed from: component10, reason: from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* renamed from: component11, reason: from getter */
    public final long getFormBackground() {
        return this.formBackground;
    }

    /* renamed from: component12, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component13, reason: from getter */
    public final long getScrolledContainer() {
        return this.scrolledContainer;
    }

    /* renamed from: component2, reason: from getter */
    public final long getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final long getInverse() {
        return this.inverse;
    }

    /* renamed from: component4, reason: from getter */
    public final long getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSuccess() {
        return this.success;
    }

    /* renamed from: component6, reason: from getter */
    public final long getPrimary() {
        return this.primary;
    }

    /* renamed from: component7, reason: from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* renamed from: component8, reason: from getter */
    public final long getFormBorder() {
        return this.formBorder;
    }

    /* renamed from: component9, reason: from getter */
    public final long getBorder() {
        return this.border;
    }

    @NotNull
    public final ColorTokens copy(long disabled, long error, long inverse, long action, long success, long primary, long secondary, long formBorder, long border, long outline, long formBackground, long background, long scrolledContainer) {
        return new ColorTokens(disabled, error, inverse, action, success, primary, secondary, formBorder, border, outline, formBackground, background, scrolledContainer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorTokens)) {
            return false;
        }
        ColorTokens colorTokens = (ColorTokens) other;
        return this.disabled == colorTokens.disabled && this.error == colorTokens.error && this.inverse == colorTokens.inverse && this.action == colorTokens.action && this.success == colorTokens.success && this.primary == colorTokens.primary && this.secondary == colorTokens.secondary && this.formBorder == colorTokens.formBorder && this.border == colorTokens.border && this.outline == colorTokens.outline && this.formBackground == colorTokens.formBackground && this.background == colorTokens.background && this.scrolledContainer == colorTokens.scrolledContainer;
    }

    public final long getAction() {
        return this.action;
    }

    public final long getBackground() {
        return this.background;
    }

    public final long getBorder() {
        return this.border;
    }

    public final long getDisabled() {
        return this.disabled;
    }

    public final long getError() {
        return this.error;
    }

    public final long getFormBackground() {
        return this.formBackground;
    }

    public final long getFormBorder() {
        return this.formBorder;
    }

    public final long getInverse() {
        return this.inverse;
    }

    public final long getOutline() {
        return this.outline;
    }

    public final long getPrimary() {
        return this.primary;
    }

    public final long getScrolledContainer() {
        return this.scrolledContainer;
    }

    public final long getSecondary() {
        return this.secondary;
    }

    public final long getSuccess() {
        return this.success;
    }

    public int hashCode() {
        long j5 = this.disabled;
        long j6 = this.error;
        int i4 = ((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.inverse;
        int i5 = (i4 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j10 = this.action;
        int i10 = (i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.success;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.primary;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.secondary;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.formBorder;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.border;
        int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.outline;
        int i16 = (i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
        long j17 = this.formBackground;
        int i17 = (i16 + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.background;
        int i18 = (i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.scrolledContainer;
        return i18 + ((int) ((j19 >>> 32) ^ j19));
    }

    @NotNull
    public String toString() {
        long j5 = this.disabled;
        long j6 = this.error;
        long j7 = this.inverse;
        long j10 = this.action;
        long j11 = this.success;
        long j12 = this.primary;
        long j13 = this.secondary;
        long j14 = this.formBorder;
        long j15 = this.border;
        long j16 = this.outline;
        long j17 = this.formBackground;
        long j18 = this.background;
        long j19 = this.scrolledContainer;
        StringBuilder uniform = c.uniform("ColorTokens(disabled=", j5, ", error=");
        uniform.append(j6);
        c.amber(uniform, ", inverse=", j7, ", action=");
        uniform.append(j10);
        c.amber(uniform, ", success=", j11, ", primary=");
        uniform.append(j12);
        c.amber(uniform, ", secondary=", j13, ", formBorder=");
        uniform.append(j14);
        c.amber(uniform, ", border=", j15, ", outline=");
        uniform.append(j16);
        c.amber(uniform, ", formBackground=", j17, ", background=");
        uniform.append(j18);
        uniform.append(", scrolledContainer=");
        uniform.append(j19);
        uniform.append(")");
        return uniform.toString();
    }

    public ColorTokens(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.disabled = j5;
        this.error = j6;
        this.inverse = j7;
        this.action = j10;
        this.success = j11;
        this.primary = j12;
        this.secondary = j13;
        this.formBorder = j14;
        this.border = j15;
        this.outline = j16;
        this.formBackground = j17;
        this.background = j18;
        this.scrolledContainer = j19;
    }

    public /* synthetic */ ColorTokens(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 4289769648L : j5, (i4 & 2) != 0 ? 4289538110L : j6, (i4 & 4) != 0 ? 4294967295L : j7, (i4 & 8) != 0 ? 4279790335L : j10, (i4 & 16) != 0 ? 4278224234L : j11, (i4 & 32) != 0 ? 4278190080L : j12, (i4 & 64) != 0 ? 4285690482L : j13, (i4 & 128) != 0 ? 4287927444L : j14, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? 4292730333L : j15, (i4 & 512) != 0 ? 4287738606L : j16, (i4 & Barcode.FORMAT_UPC_E) != 0 ? 4294967295L : j17, (i4 & 2048) == 0 ? j18 : 4294967295L, (i4 & 4096) != 0 ? 4293453542L : j19);
    }
}
