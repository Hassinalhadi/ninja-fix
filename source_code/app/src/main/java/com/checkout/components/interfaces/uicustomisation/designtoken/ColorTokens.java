package com.checkout.components.interfaces.uicustomisation.designtoken;

import Q0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0092\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b.\u0010\u0014J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00105\u001a\u0004\b>\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bB\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00105\u001a\u0004\bF\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00105\u001a\u0004\bH\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u00105\u001a\u0004\bL\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u00105\u001a\u0004\bN\u0010\u001c¨\u0006O"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;", "Landroid/os/Parcelable;", "", "colorDisabled", "colorError", "colorInverse", "colorAction", "colorSuccess", "colorPrimary", "colorSecondary", "colorFormBorder", "colorBorder", "colorOutline", "colorFormBackground", "colorBackground", "colorScrolledContainer", "<init>", "(JJJJJJJJJJJJJ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "(JJJJJJJJJJJJJ)Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getColorDisabled", "b", "getColorError", "c", "getColorInverse", Constants.INAPP_DATA_TAG, "getColorAction", "e", "getColorSuccess", "f", "getColorPrimary", "g", "getColorSecondary", "h", "getColorFormBorder", "i", "getColorBorder", "j", "getColorOutline", "k", "getColorFormBackground", "l", "getColorBackground", "m", "getColorScrolledContainer", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class ColorTokens implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ColorTokens> CREATOR = new Creator();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long colorDisabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long colorError;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long colorInverse;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long colorAction;

    /* renamed from: e, reason: from kotlin metadata */
    private final long colorSuccess;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long colorPrimary;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long colorSecondary;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long colorFormBorder;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long colorBorder;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long colorOutline;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long colorFormBackground;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long colorBackground;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long colorScrolledContainer;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<ColorTokens> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ColorTokens createFromParcel(Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new ColorTokens(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ColorTokens[] newArray(int i4) {
            return new ColorTokens[i4];
        }

        @Override // android.os.Parcelable.Creator
        public final ColorTokens[] newArray(int i4) {
            return new ColorTokens[i4];
        }
    }

    public ColorTokens() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8191, null);
    }

    public static ColorTokens copy$default(ColorTokens colorTokens, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i4, Object obj) {
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        if ((i4 & 1) != 0) {
            j20 = colorTokens.colorDisabled;
        } else {
            j20 = j5;
        }
        if ((i4 & 2) != 0) {
            j21 = colorTokens.colorError;
        } else {
            j21 = j6;
        }
        if ((i4 & 4) != 0) {
            j22 = colorTokens.colorInverse;
        } else {
            j22 = j7;
        }
        if ((i4 & 8) != 0) {
            j23 = colorTokens.colorAction;
        } else {
            j23 = j10;
        }
        if ((i4 & 16) != 0) {
            j24 = colorTokens.colorSuccess;
        } else {
            j24 = j11;
        }
        if ((i4 & 32) != 0) {
            j25 = colorTokens.colorPrimary;
        } else {
            j25 = j12;
        }
        if ((i4 & 64) != 0) {
            j26 = colorTokens.colorSecondary;
        } else {
            j26 = j13;
        }
        long j33 = j20;
        if ((i4 & 128) != 0) {
            j27 = colorTokens.colorFormBorder;
        } else {
            j27 = j14;
        }
        long j34 = j27;
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            j28 = colorTokens.colorBorder;
        } else {
            j28 = j15;
        }
        long j35 = j28;
        if ((i4 & 512) != 0) {
            j29 = colorTokens.colorOutline;
        } else {
            j29 = j16;
        }
        long j36 = j29;
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            j30 = colorTokens.colorFormBackground;
        } else {
            j30 = j17;
        }
        long j37 = j30;
        if ((i4 & 2048) != 0) {
            j31 = colorTokens.colorBackground;
        } else {
            j31 = j18;
        }
        long j38 = j31;
        if ((i4 & 4096) != 0) {
            j32 = colorTokens.colorScrolledContainer;
        } else {
            j32 = j19;
        }
        colorTokens.getClass();
        return new ColorTokens(j33, j21, j22, j23, j24, j25, j26, j34, j35, j36, j37, j38, j32);
    }

    /* renamed from: component1, reason: from getter */
    public final long getColorDisabled() {
        return this.colorDisabled;
    }

    /* renamed from: component10, reason: from getter */
    public final long getColorOutline() {
        return this.colorOutline;
    }

    /* renamed from: component11, reason: from getter */
    public final long getColorFormBackground() {
        return this.colorFormBackground;
    }

    /* renamed from: component12, reason: from getter */
    public final long getColorBackground() {
        return this.colorBackground;
    }

    /* renamed from: component13, reason: from getter */
    public final long getColorScrolledContainer() {
        return this.colorScrolledContainer;
    }

    /* renamed from: component2, reason: from getter */
    public final long getColorError() {
        return this.colorError;
    }

    /* renamed from: component3, reason: from getter */
    public final long getColorInverse() {
        return this.colorInverse;
    }

    /* renamed from: component4, reason: from getter */
    public final long getColorAction() {
        return this.colorAction;
    }

    /* renamed from: component5, reason: from getter */
    public final long getColorSuccess() {
        return this.colorSuccess;
    }

    /* renamed from: component6, reason: from getter */
    public final long getColorPrimary() {
        return this.colorPrimary;
    }

    /* renamed from: component7, reason: from getter */
    public final long getColorSecondary() {
        return this.colorSecondary;
    }

    /* renamed from: component8, reason: from getter */
    public final long getColorFormBorder() {
        return this.colorFormBorder;
    }

    /* renamed from: component9, reason: from getter */
    public final long getColorBorder() {
        return this.colorBorder;
    }

    @NotNull
    public final ColorTokens copy(long colorDisabled, long colorError, long colorInverse, long colorAction, long colorSuccess, long colorPrimary, long colorSecondary, long colorFormBorder, long colorBorder, long colorOutline, long colorFormBackground, long colorBackground, long colorScrolledContainer) {
        return new ColorTokens(colorDisabled, colorError, colorInverse, colorAction, colorSuccess, colorPrimary, colorSecondary, colorFormBorder, colorBorder, colorOutline, colorFormBackground, colorBackground, colorScrolledContainer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorTokens)) {
            return false;
        }
        ColorTokens colorTokens = (ColorTokens) other;
        return this.colorDisabled == colorTokens.colorDisabled && this.colorError == colorTokens.colorError && this.colorInverse == colorTokens.colorInverse && this.colorAction == colorTokens.colorAction && this.colorSuccess == colorTokens.colorSuccess && this.colorPrimary == colorTokens.colorPrimary && this.colorSecondary == colorTokens.colorSecondary && this.colorFormBorder == colorTokens.colorFormBorder && this.colorBorder == colorTokens.colorBorder && this.colorOutline == colorTokens.colorOutline && this.colorFormBackground == colorTokens.colorFormBackground && this.colorBackground == colorTokens.colorBackground && this.colorScrolledContainer == colorTokens.colorScrolledContainer;
    }

    public final long getColorAction() {
        return this.colorAction;
    }

    public final long getColorBackground() {
        return this.colorBackground;
    }

    public final long getColorBorder() {
        return this.colorBorder;
    }

    public final long getColorDisabled() {
        return this.colorDisabled;
    }

    public final long getColorError() {
        return this.colorError;
    }

    public final long getColorFormBackground() {
        return this.colorFormBackground;
    }

    public final long getColorFormBorder() {
        return this.colorFormBorder;
    }

    public final long getColorInverse() {
        return this.colorInverse;
    }

    public final long getColorOutline() {
        return this.colorOutline;
    }

    public final long getColorPrimary() {
        return this.colorPrimary;
    }

    public final long getColorScrolledContainer() {
        return this.colorScrolledContainer;
    }

    public final long getColorSecondary() {
        return this.colorSecondary;
    }

    public final long getColorSuccess() {
        return this.colorSuccess;
    }

    public final int hashCode() {
        long j5 = this.colorDisabled;
        long j6 = this.colorError;
        int i4 = (((int) (j6 ^ (j6 >>> 32))) + (((int) (j5 ^ (j5 >>> 32))) * 31)) * 31;
        long j7 = this.colorInverse;
        int i5 = (((int) (j7 ^ (j7 >>> 32))) + i4) * 31;
        long j10 = this.colorAction;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + i5) * 31;
        long j11 = this.colorSuccess;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) + i10) * 31;
        long j12 = this.colorPrimary;
        int i12 = (((int) (j12 ^ (j12 >>> 32))) + i11) * 31;
        long j13 = this.colorSecondary;
        int i13 = (((int) (j13 ^ (j13 >>> 32))) + i12) * 31;
        long j14 = this.colorFormBorder;
        int i14 = (((int) (j14 ^ (j14 >>> 32))) + i13) * 31;
        long j15 = this.colorBorder;
        int i15 = (((int) (j15 ^ (j15 >>> 32))) + i14) * 31;
        long j16 = this.colorOutline;
        int i16 = (((int) (j16 ^ (j16 >>> 32))) + i15) * 31;
        long j17 = this.colorFormBackground;
        int i17 = (((int) (j17 ^ (j17 >>> 32))) + i16) * 31;
        long j18 = this.colorBackground;
        int i18 = (((int) (j18 ^ (j18 >>> 32))) + i17) * 31;
        long j19 = this.colorScrolledContainer;
        return ((int) (j19 ^ (j19 >>> 32))) + i18;
    }

    @NotNull
    public final String toString() {
        long j5 = this.colorDisabled;
        long j6 = this.colorError;
        long j7 = this.colorInverse;
        long j10 = this.colorAction;
        long j11 = this.colorSuccess;
        long j12 = this.colorPrimary;
        long j13 = this.colorSecondary;
        long j14 = this.colorFormBorder;
        long j15 = this.colorBorder;
        long j16 = this.colorOutline;
        long j17 = this.colorFormBackground;
        long j18 = this.colorBackground;
        long j19 = this.colorScrolledContainer;
        StringBuilder uniform = c.uniform("ColorTokens(colorDisabled=", j5, ", colorError=");
        uniform.append(j6);
        c.amber(uniform, ", colorInverse=", j7, ", colorAction=");
        uniform.append(j10);
        c.amber(uniform, ", colorSuccess=", j11, ", colorPrimary=");
        uniform.append(j12);
        c.amber(uniform, ", colorSecondary=", j13, ", colorFormBorder=");
        uniform.append(j14);
        c.amber(uniform, ", colorBorder=", j15, ", colorOutline=");
        uniform.append(j16);
        c.amber(uniform, ", colorFormBackground=", j17, ", colorBackground=");
        uniform.append(j18);
        uniform.append(", colorScrolledContainer=");
        uniform.append(j19);
        uniform.append(")");
        return uniform.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeLong(this.colorDisabled);
        dest.writeLong(this.colorError);
        dest.writeLong(this.colorInverse);
        dest.writeLong(this.colorAction);
        dest.writeLong(this.colorSuccess);
        dest.writeLong(this.colorPrimary);
        dest.writeLong(this.colorSecondary);
        dest.writeLong(this.colorFormBorder);
        dest.writeLong(this.colorBorder);
        dest.writeLong(this.colorOutline);
        dest.writeLong(this.colorFormBackground);
        dest.writeLong(this.colorBackground);
        dest.writeLong(this.colorScrolledContainer);
    }

    public ColorTokens(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.colorDisabled = j5;
        this.colorError = j6;
        this.colorInverse = j7;
        this.colorAction = j10;
        this.colorSuccess = j11;
        this.colorPrimary = j12;
        this.colorSecondary = j13;
        this.colorFormBorder = j14;
        this.colorBorder = j15;
        this.colorOutline = j16;
        this.colorFormBackground = j17;
        this.colorBackground = j18;
        this.colorScrolledContainer = j19;
    }

    public /* synthetic */ ColorTokens(long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 4289769648L : j5, (i4 & 2) != 0 ? 4289538110L : j6, (i4 & 4) != 0 ? 4294967295L : j7, (i4 & 8) != 0 ? 4279790335L : j10, (i4 & 16) != 0 ? 4278224234L : j11, (i4 & 32) != 0 ? 4278190080L : j12, (i4 & 64) != 0 ? 4285690482L : j13, (i4 & 128) != 0 ? 4287927444L : j14, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? 4292730333L : j15, (i4 & 512) != 0 ? 4287738606L : j16, (i4 & Barcode.FORMAT_UPC_E) != 0 ? 4294967295L : j17, (i4 & 2048) == 0 ? j18 : 4294967295L, (i4 & 4096) != 0 ? 4293453542L : j19);
    }
}
