package com.checkout.components.interfaces.uicustomisation.font;

import android.os.Parcel;
import android.os.Parcelable;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000fJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJP\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010\u000fJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010\u001e¨\u0006<"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "Landroid/os/Parcelable;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "fontFamily", "Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "fontStyle", "Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "fontWeight", "", "fontSize", "lineHeight", "letterSpacing", "<init>", "(Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;ILjava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "component2", "()Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "component3", "()Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "component4", "component5", "()Ljava/lang/Integer;", "component6", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "getFontFamily", "b", "Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "getFontStyle", "c", "Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "getFontWeight", Constants.INAPP_DATA_TAG, "I", "getFontSize", "e", "Ljava/lang/Integer;", "getLineHeight", "f", "getLetterSpacing", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class Font implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Font> CREATOR = new Creator();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FontFamily fontFamily;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FontStyle fontStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final FontWeight fontWeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int fontSize;

    /* renamed from: e, reason: from kotlin metadata */
    private final Integer lineHeight;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Integer letterSpacing;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Font> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Font createFromParcel(Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new Font((FontFamily) parcel.readParcelable(Font.class.getClassLoader()), FontStyle.CREATOR.createFromParcel(parcel), FontWeight.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Font[] newArray(int i4) {
            return new Font[i4];
        }

        @Override // android.os.Parcelable.Creator
        public final Font[] newArray(int i4) {
            return new Font[i4];
        }
    }

    public Font() {
        this(null, null, null, 0, null, null, 63, null);
    }

    public static /* synthetic */ Font copy$default(Font font, FontFamily fontFamily, FontStyle fontStyle, FontWeight fontWeight, int i4, Integer num, Integer num2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            fontFamily = font.fontFamily;
        }
        if ((i5 & 2) != 0) {
            fontStyle = font.fontStyle;
        }
        if ((i5 & 4) != 0) {
            fontWeight = font.fontWeight;
        }
        if ((i5 & 8) != 0) {
            i4 = font.fontSize;
        }
        if ((i5 & 16) != 0) {
            num = font.lineHeight;
        }
        if ((i5 & 32) != 0) {
            num2 = font.letterSpacing;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return font.copy(fontFamily, fontStyle, fontWeight, i4, num3, num4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FontStyle getFontStyle() {
        return this.fontStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getLetterSpacing() {
        return this.letterSpacing;
    }

    @NotNull
    public final Font copy(@NotNull FontFamily fontFamily, @NotNull FontStyle fontStyle, @NotNull FontWeight fontWeight, int fontSize, @Nullable Integer lineHeight, @Nullable Integer letterSpacing) {
        Intrinsics.echo(fontFamily, "fontFamily");
        Intrinsics.echo(fontStyle, "fontStyle");
        Intrinsics.echo(fontWeight, "fontWeight");
        return new Font(fontFamily, fontStyle, fontWeight, fontSize, lineHeight, letterSpacing);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Font)) {
            return false;
        }
        Font font = (Font) other;
        return Intrinsics.areEqual(this.fontFamily, font.fontFamily) && this.fontStyle == font.fontStyle && this.fontWeight == font.fontWeight && this.fontSize == font.fontSize && Intrinsics.areEqual(this.lineHeight, font.lineHeight) && Intrinsics.areEqual(this.letterSpacing, font.letterSpacing);
    }

    @NotNull
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    @NotNull
    public final FontStyle getFontStyle() {
        return this.fontStyle;
    }

    @NotNull
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    public final Integer getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final int hashCode() {
        int hashCode = (this.fontSize + ((this.fontWeight.hashCode() + ((this.fontStyle.hashCode() + (this.fontFamily.hashCode() * 31)) * 31)) * 31)) * 31;
        Integer num = this.lineHeight;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.letterSpacing;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Font(fontFamily=" + this.fontFamily + ", fontStyle=" + this.fontStyle + ", fontWeight=" + this.fontWeight + ", fontSize=" + this.fontSize + ", lineHeight=" + this.lineHeight + ", letterSpacing=" + this.letterSpacing + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeParcelable(this.fontFamily, flags);
        FontStyle fontStyle = this.fontStyle;
        fontStyle.getClass();
        dest.writeString(fontStyle.name());
        FontWeight fontWeight = this.fontWeight;
        fontWeight.getClass();
        dest.writeString(fontWeight.name());
        dest.writeInt(this.fontSize);
        Integer num = this.lineHeight;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.letterSpacing;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public Font(@NotNull FontFamily fontFamily, @NotNull FontStyle fontStyle, @NotNull FontWeight fontWeight, int i4, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.echo(fontFamily, "fontFamily");
        Intrinsics.echo(fontStyle, "fontStyle");
        Intrinsics.echo(fontWeight, "fontWeight");
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontWeight = fontWeight;
        this.fontSize = i4;
        this.lineHeight = num;
        this.letterSpacing = num2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Font(com.checkout.components.interfaces.uicustomisation.font.FontFamily r2, com.checkout.components.interfaces.uicustomisation.font.FontStyle r3, com.checkout.components.interfaces.uicustomisation.font.FontWeight r4, int r5, java.lang.Integer r6, java.lang.Integer r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            com.checkout.components.interfaces.uicustomisation.font.FontFamily$SansSerif r2 = com.checkout.components.interfaces.uicustomisation.font.FontFamily.SansSerif.INSTANCE
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            com.checkout.components.interfaces.uicustomisation.font.FontStyle r3 = com.checkout.components.interfaces.uicustomisation.font.FontStyle.Normal
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            com.checkout.components.interfaces.uicustomisation.font.FontWeight r4 = com.checkout.components.interfaces.uicustomisation.font.FontWeight.Normal
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L18
            r5 = 14
        L18:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1e
            r6 = r0
        L1e:
            r8 = r8 & 32
            if (r8 == 0) goto L2a
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L31
        L2a:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L31:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.checkout.components.interfaces.uicustomisation.font.Font.<init>(com.checkout.components.interfaces.uicustomisation.font.FontFamily, com.checkout.components.interfaces.uicustomisation.font.FontStyle, com.checkout.components.interfaces.uicustomisation.font.FontWeight, int, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
