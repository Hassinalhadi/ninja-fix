package com.checkout.components.kmp.rememberme.shared.model.customization;

import com.checkout.components.kmp.rememberme.utils.DefaultBorder;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "", "colorTokens", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/ColorTokens;", "fonts", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/Fonts;", "borderFormRadius", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;", "borderButtonRadius", "<init>", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/ColorTokens;Lcom/checkout/components/kmp/rememberme/shared/model/customization/Fonts;Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;)V", "getColorTokens", "()Lcom/checkout/components/kmp/rememberme/shared/model/customization/ColorTokens;", "getFonts", "()Lcom/checkout/components/kmp/rememberme/shared/model/customization/Fonts;", "getBorderFormRadius", "()Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;", "getBorderButtonRadius", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Companion", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DesignTokens {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DesignTokens DEFAULT = new DesignTokens(null, null, null, null, 15, null);

    @NotNull
    private final BorderRadius borderButtonRadius;

    @NotNull
    private final BorderRadius borderFormRadius;

    @NotNull
    private final ColorTokens colorTokens;

    @NotNull
    private final Fonts fonts;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "getDEFAULT", "()Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DesignTokens getDEFAULT() {
            return DesignTokens.DEFAULT;
        }

        private Companion() {
        }
    }

    public DesignTokens() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DesignTokens copy$default(DesignTokens designTokens, ColorTokens colorTokens, Fonts fonts, BorderRadius borderRadius, BorderRadius borderRadius2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            colorTokens = designTokens.colorTokens;
        }
        if ((i4 & 2) != 0) {
            fonts = designTokens.fonts;
        }
        if ((i4 & 4) != 0) {
            borderRadius = designTokens.borderFormRadius;
        }
        if ((i4 & 8) != 0) {
            borderRadius2 = designTokens.borderButtonRadius;
        }
        return designTokens.copy(colorTokens, fonts, borderRadius, borderRadius2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ColorTokens getColorTokens() {
        return this.colorTokens;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Fonts getFonts() {
        return this.fonts;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BorderRadius getBorderFormRadius() {
        return this.borderFormRadius;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BorderRadius getBorderButtonRadius() {
        return this.borderButtonRadius;
    }

    @NotNull
    public final DesignTokens copy(@NotNull ColorTokens colorTokens, @NotNull Fonts fonts, @NotNull BorderRadius borderFormRadius, @NotNull BorderRadius borderButtonRadius) {
        Intrinsics.echo(colorTokens, "colorTokens");
        Intrinsics.echo(fonts, "fonts");
        Intrinsics.echo(borderFormRadius, "borderFormRadius");
        Intrinsics.echo(borderButtonRadius, "borderButtonRadius");
        return new DesignTokens(colorTokens, fonts, borderFormRadius, borderButtonRadius);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesignTokens)) {
            return false;
        }
        DesignTokens designTokens = (DesignTokens) other;
        return Intrinsics.areEqual(this.colorTokens, designTokens.colorTokens) && Intrinsics.areEqual(this.fonts, designTokens.fonts) && Intrinsics.areEqual(this.borderFormRadius, designTokens.borderFormRadius) && Intrinsics.areEqual(this.borderButtonRadius, designTokens.borderButtonRadius);
    }

    @NotNull
    public final BorderRadius getBorderButtonRadius() {
        return this.borderButtonRadius;
    }

    @NotNull
    public final BorderRadius getBorderFormRadius() {
        return this.borderFormRadius;
    }

    @NotNull
    public final ColorTokens getColorTokens() {
        return this.colorTokens;
    }

    @NotNull
    public final Fonts getFonts() {
        return this.fonts;
    }

    public int hashCode() {
        return this.borderButtonRadius.hashCode() + ((this.borderFormRadius.hashCode() + ((this.fonts.hashCode() + (this.colorTokens.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DesignTokens(colorTokens=" + this.colorTokens + ", fonts=" + this.fonts + ", borderFormRadius=" + this.borderFormRadius + ", borderButtonRadius=" + this.borderButtonRadius + ")";
    }

    public DesignTokens(@NotNull ColorTokens colorTokens, @NotNull Fonts fonts, @NotNull BorderRadius borderFormRadius, @NotNull BorderRadius borderButtonRadius) {
        Intrinsics.echo(colorTokens, "colorTokens");
        Intrinsics.echo(fonts, "fonts");
        Intrinsics.echo(borderFormRadius, "borderFormRadius");
        Intrinsics.echo(borderButtonRadius, "borderButtonRadius");
        this.colorTokens = colorTokens;
        this.fonts = fonts;
        this.borderFormRadius = borderFormRadius;
        this.borderButtonRadius = borderButtonRadius;
    }

    public /* synthetic */ DesignTokens(ColorTokens colorTokens, Fonts fonts, BorderRadius borderRadius, BorderRadius borderRadius2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new ColorTokens(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8191, null) : colorTokens, (i4 & 2) != 0 ? new Fonts(null, null, null, null, null, null, 63, null) : fonts, (i4 & 4) != 0 ? DefaultBorder.INSTANCE.getFORM() : borderRadius, (i4 & 8) != 0 ? DefaultBorder.INSTANCE.getBUTTON() : borderRadius2);
    }
}
