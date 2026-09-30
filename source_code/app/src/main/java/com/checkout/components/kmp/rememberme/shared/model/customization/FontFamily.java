package com.checkout.components.kmp.rememberme.shared.model.customization;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;", "", "<init>", "()V", "Default", "Serif", "SansSerif", "Monospace", "Cursive", "Custom", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Cursive;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Custom;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Default;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Monospace;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$SansSerif;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Serif;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FontFamily {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Cursive;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Cursive extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final Cursive INSTANCE = new Cursive();

        private Cursive() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Cursive);
        }

        public int hashCode() {
            return 53904007;
        }

        @NotNull
        public String toString() {
            return "Cursive";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ`\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000f¨\u0006&"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Custom;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;", "normalFont", "", "normalItalicFont", "lightFont", "mediumFont", "semiBold", "boldFont", "extraBoldFont", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getNormalFont", "()I", "getNormalItalicFont", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLightFont", "getMediumFont", "getSemiBold", "getBoldFont", "getExtraBoldFont", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Custom;", "equals", "", "other", "", "hashCode", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Custom extends FontFamily {
        public static final int $stable = 0;

        @Nullable
        private final Integer boldFont;

        @Nullable
        private final Integer extraBoldFont;

        @Nullable
        private final Integer lightFont;

        @Nullable
        private final Integer mediumFont;
        private final int normalFont;

        @Nullable
        private final Integer normalItalicFont;

        @Nullable
        private final Integer semiBold;

        public /* synthetic */ Custom(int i4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i4, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? null : num2, (i5 & 8) != 0 ? null : num3, (i5 & 16) != 0 ? null : num4, (i5 & 32) != 0 ? null : num5, (i5 & 64) != 0 ? null : num6);
        }

        public static /* synthetic */ Custom copy$default(Custom custom, int i4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = custom.normalFont;
            }
            if ((i5 & 2) != 0) {
                num = custom.normalItalicFont;
            }
            if ((i5 & 4) != 0) {
                num2 = custom.lightFont;
            }
            if ((i5 & 8) != 0) {
                num3 = custom.mediumFont;
            }
            if ((i5 & 16) != 0) {
                num4 = custom.semiBold;
            }
            if ((i5 & 32) != 0) {
                num5 = custom.boldFont;
            }
            if ((i5 & 64) != 0) {
                num6 = custom.extraBoldFont;
            }
            Integer num7 = num5;
            Integer num8 = num6;
            Integer num9 = num4;
            Integer num10 = num2;
            return custom.copy(i4, num, num10, num3, num9, num7, num8);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNormalFont() {
            return this.normalFont;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getNormalItalicFont() {
            return this.normalItalicFont;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Integer getLightFont() {
            return this.lightFont;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Integer getMediumFont() {
            return this.mediumFont;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Integer getSemiBold() {
            return this.semiBold;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final Integer getBoldFont() {
            return this.boldFont;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Integer getExtraBoldFont() {
            return this.extraBoldFont;
        }

        @NotNull
        public final Custom copy(int normalFont, @Nullable Integer normalItalicFont, @Nullable Integer lightFont, @Nullable Integer mediumFont, @Nullable Integer semiBold, @Nullable Integer boldFont, @Nullable Integer extraBoldFont) {
            return new Custom(normalFont, normalItalicFont, lightFont, mediumFont, semiBold, boldFont, extraBoldFont);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return this.normalFont == custom.normalFont && Intrinsics.areEqual(this.normalItalicFont, custom.normalItalicFont) && Intrinsics.areEqual(this.lightFont, custom.lightFont) && Intrinsics.areEqual(this.mediumFont, custom.mediumFont) && Intrinsics.areEqual(this.semiBold, custom.semiBold) && Intrinsics.areEqual(this.boldFont, custom.boldFont) && Intrinsics.areEqual(this.extraBoldFont, custom.extraBoldFont);
        }

        @Nullable
        public final Integer getBoldFont() {
            return this.boldFont;
        }

        @Nullable
        public final Integer getExtraBoldFont() {
            return this.extraBoldFont;
        }

        @Nullable
        public final Integer getLightFont() {
            return this.lightFont;
        }

        @Nullable
        public final Integer getMediumFont() {
            return this.mediumFont;
        }

        public final int getNormalFont() {
            return this.normalFont;
        }

        @Nullable
        public final Integer getNormalItalicFont() {
            return this.normalItalicFont;
        }

        @Nullable
        public final Integer getSemiBold() {
            return this.semiBold;
        }

        public int hashCode() {
            int i4 = this.normalFont * 31;
            Integer num = this.normalItalicFont;
            int hashCode = (i4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.lightFont;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.mediumFont;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.semiBold;
            int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.boldFont;
            int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.extraBoldFont;
            return hashCode5 + (num6 != null ? num6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Custom(normalFont=" + this.normalFont + ", normalItalicFont=" + this.normalItalicFont + ", lightFont=" + this.lightFont + ", mediumFont=" + this.mediumFont + ", semiBold=" + this.semiBold + ", boldFont=" + this.boldFont + ", extraBoldFont=" + this.extraBoldFont + ")";
        }

        public Custom(int i4, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
            super(null);
            this.normalFont = i4;
            this.normalItalicFont = num;
            this.lightFont = num2;
            this.mediumFont = num3;
            this.semiBold = num4;
            this.boldFont = num5;
            this.extraBoldFont = num6;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Default;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Default extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Default);
        }

        public int hashCode() {
            return 471734019;
        }

        @NotNull
        public String toString() {
            return "Default";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Monospace;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Monospace extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final Monospace INSTANCE = new Monospace();

        private Monospace() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Monospace);
        }

        public int hashCode() {
            return -1859967931;
        }

        @NotNull
        public String toString() {
            return "Monospace";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$SansSerif;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class SansSerif extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final SansSerif INSTANCE = new SansSerif();

        private SansSerif() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof SansSerif);
        }

        public int hashCode() {
            return 1635319020;
        }

        @NotNull
        public String toString() {
            return "SansSerif";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily$Serif;", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Serif extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final Serif INSTANCE = new Serif();

        private Serif() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Serif);
        }

        public int hashCode() {
            return -1706313025;
        }

        @NotNull
        public String toString() {
            return "Serif";
        }
    }

    public /* synthetic */ FontFamily(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FontFamily() {
    }
}
