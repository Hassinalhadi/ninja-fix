package com.checkout.components.interfaces.uicustomisation.font;

import android.os.Parcel;
import android.os.Parcelable;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "Landroid/os/Parcelable;", "Default", "Serif", "SansSerif", "Monospace", "Cursive", "Custom", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Cursive;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Custom;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Default;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Monospace;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$SansSerif;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Serif;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public abstract class FontFamily implements Parcelable {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Cursive;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Cursive extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final Cursive INSTANCE = new Cursive();

        @NotNull
        public static final Parcelable.Creator<Cursive> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Cursive> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cursive createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Cursive.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cursive[] newArray(int i4) {
                return new Cursive[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Cursive createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Cursive.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Cursive[] newArray(int i4) {
                return new Cursive[i4];
            }
        }

        private Cursive() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Cursive);
        }

        public final int hashCode() {
            return 1703336842;
        }

        @NotNull
        public final String toString() {
            return "Cursive";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016Jb\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\rJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010\u0016¨\u00067"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Custom;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "normalFont", "normalItalicFont", "lightFont", "mediumFont", "semiBold", "boldFont", "extraBoldFont", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Custom;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getNormalFont", "b", "Ljava/lang/Integer;", "getNormalItalicFont", "c", "getLightFont", Constants.INAPP_DATA_TAG, "getMediumFont", "e", "getSemiBold", "f", "getBoldFont", "g", "getExtraBoldFont", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Custom extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new Creator();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int normalFont;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Integer normalItalicFont;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Integer lightFont;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Integer mediumFont;

        /* renamed from: e, reason: from kotlin metadata */
        private final Integer semiBold;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Integer boldFont;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Integer extraBoldFont;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Custom> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new Custom(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i4) {
                return new Custom[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i4) {
                return new Custom[i4];
            }
        }

        public Custom(int i4) {
            this(i4, null, null, null, null, null, null, 126, null);
        }

        public static Custom copy$default(Custom custom, int i4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i5, Object obj) {
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
            Integer num7 = num6;
            custom.getClass();
            Integer num8 = num5;
            Integer num9 = num4;
            Integer num10 = num2;
            return new Custom(i4, num, num10, num3, num9, num8, num7);
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
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

        public final int hashCode() {
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
        public final String toString() {
            return "Custom(normalFont=" + this.normalFont + ", normalItalicFont=" + this.normalItalicFont + ", lightFont=" + this.lightFont + ", mediumFont=" + this.mediumFont + ", semiBold=" + this.semiBold + ", boldFont=" + this.boldFont + ", extraBoldFont=" + this.extraBoldFont + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.normalFont);
            Integer num = this.normalItalicFont;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Integer num2 = this.lightFont;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            Integer num3 = this.mediumFont;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num3.intValue());
            }
            Integer num4 = this.semiBold;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num4.intValue());
            }
            Integer num5 = this.boldFont;
            if (num5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num5.intValue());
            }
            Integer num6 = this.extraBoldFont;
            if (num6 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num6.intValue());
            }
        }

        public Custom(int i4, @Nullable Integer num) {
            this(i4, num, null, null, null, null, null, 124, null);
        }

        public Custom(int i4, @Nullable Integer num, @Nullable Integer num2) {
            this(i4, num, num2, null, null, null, null, 120, null);
        }

        public Custom(int i4, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
            this(i4, num, num2, num3, null, null, null, 112, null);
        }

        public Custom(int i4, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
            this(i4, num, num2, num3, num4, null, null, 96, null);
        }

        public Custom(int i4, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
            this(i4, num, num2, num3, num4, num5, null, 64, null);
        }

        public /* synthetic */ Custom(int i4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i4, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? null : num2, (i5 & 8) != 0 ? null : num3, (i5 & 16) != 0 ? null : num4, (i5 & 32) != 0 ? null : num5, (i5 & 64) != 0 ? null : num6);
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Default;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Default extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final Default INSTANCE = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Default.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i4) {
                return new Default[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Default.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i4) {
                return new Default[i4];
            }
        }

        private Default() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Default);
        }

        public final int hashCode() {
            return 2121166854;
        }

        @NotNull
        public final String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Monospace;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Monospace extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final Monospace INSTANCE = new Monospace();

        @NotNull
        public static final Parcelable.Creator<Monospace> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Monospace> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Monospace createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Monospace.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Monospace[] newArray(int i4) {
                return new Monospace[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Monospace createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Monospace.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Monospace[] newArray(int i4) {
                return new Monospace[i4];
            }
        }

        private Monospace() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Monospace);
        }

        public final int hashCode() {
            return -1597945720;
        }

        @NotNull
        public final String toString() {
            return "Monospace";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$SansSerif;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class SansSerif extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final SansSerif INSTANCE = new SansSerif();

        @NotNull
        public static final Parcelable.Creator<SansSerif> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<SansSerif> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SansSerif createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return SansSerif.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SansSerif[] newArray(int i4) {
                return new SansSerif[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final SansSerif createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return SansSerif.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final SansSerif[] newArray(int i4) {
                return new SansSerif[i4];
            }
        }

        private SansSerif() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof SansSerif);
        }

        public final int hashCode() {
            return 1897341231;
        }

        @NotNull
        public final String toString() {
            return "SansSerif";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily$Serif;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Serif extends FontFamily {
        public static final int $stable = 0;

        @NotNull
        public static final Serif INSTANCE = new Serif();

        @NotNull
        public static final Parcelable.Creator<Serif> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Serif> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Serif createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Serif.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Serif[] newArray(int i4) {
                return new Serif[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Serif createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Serif.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Serif[] newArray(int i4) {
                return new Serif[i4];
            }
        }

        private Serif() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Serif);
        }

        public final int hashCode() {
            return 1003780226;
        }

        @NotNull
        public final String toString() {
            return "Serif";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    public FontFamily(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
