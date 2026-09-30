package com.app.network.network.models.trophies;

import A0.z;
import P8.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020\u0005J\b\u0010#\u001a\u0004\u0018\u00010\u0005J\u0006\u0010$\u001a\u00020\u0005J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J}\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0006\u00101\u001a\u00020\u0003J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 ¨\u0006="}, d2 = {"Lcom/app/network/network/models/trophies/Trophy;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", Constants.KEY_TITLE, "", "titleAr", "description", "descriptionAr", "image", "imageAr", "startsAt", "endsAt", "Ljava/util/Date;", "captainProgress", "", "rewardPoints", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DD)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getTitleAr", "getDescription", "getDescriptionAr", "getImage", "getImageAr", "getStartsAt", "getEndsAt", "()Ljava/util/Date;", "getCaptainProgress", "()D", "getRewardPoints", "localizedTitle", "localizedDescription", "localizedImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Trophy implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Trophy> CREATOR = new Creator();

    @c("captainProgress")
    private final double captainProgress;

    @c("description")
    @Nullable
    private final String description;

    @c("descriptionAr")
    @Nullable
    private final String descriptionAr;

    @c("endsAt")
    @Nullable
    private final Date endsAt;

    @c(Constants.KEY_ID)
    private final int id;

    @c("image")
    @NotNull
    private final String image;

    @c("imageAr")
    @NotNull
    private final String imageAr;

    @c("rewardPoints")
    private final double rewardPoints;

    @c("startsAt")
    @NotNull
    private final String startsAt;

    @c(Constants.KEY_TITLE)
    @NotNull
    private final String title;

    @c("titleAr")
    @NotNull
    private final String titleAr;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Trophy> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Trophy createFromParcel(Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new Trophy(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Trophy[] newArray(int i4) {
            return new Trophy[i4];
        }
    }

    public Trophy() {
        this(0, null, null, null, null, null, null, null, null, 0.0d, 0.0d, 2047, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final double getCaptainProgress() {
        return this.captainProgress;
    }

    /* renamed from: component11, reason: from getter */
    public final double getRewardPoints() {
        return this.rewardPoints;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitleAr() {
        return this.titleAr;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDescriptionAr() {
        return this.descriptionAr;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getImageAr() {
        return this.imageAr;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getStartsAt() {
        return this.startsAt;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Date getEndsAt() {
        return this.endsAt;
    }

    @NotNull
    public final Trophy copy(int id2, @NotNull String title, @NotNull String titleAr, @Nullable String description, @Nullable String descriptionAr, @NotNull String image, @NotNull String imageAr, @NotNull String startsAt, @Nullable Date endsAt, double captainProgress, double rewardPoints) {
        Intrinsics.echo(title, "title");
        Intrinsics.echo(titleAr, "titleAr");
        Intrinsics.echo(image, "image");
        Intrinsics.echo(imageAr, "imageAr");
        Intrinsics.echo(startsAt, "startsAt");
        return new Trophy(id2, title, titleAr, description, descriptionAr, image, imageAr, startsAt, endsAt, captainProgress, rewardPoints);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Trophy)) {
            return false;
        }
        Trophy trophy = (Trophy) other;
        return this.id == trophy.id && Intrinsics.areEqual(this.title, trophy.title) && Intrinsics.areEqual(this.titleAr, trophy.titleAr) && Intrinsics.areEqual(this.description, trophy.description) && Intrinsics.areEqual(this.descriptionAr, trophy.descriptionAr) && Intrinsics.areEqual(this.image, trophy.image) && Intrinsics.areEqual(this.imageAr, trophy.imageAr) && Intrinsics.areEqual(this.startsAt, trophy.startsAt) && Intrinsics.areEqual(this.endsAt, trophy.endsAt) && Double.compare(this.captainProgress, trophy.captainProgress) == 0 && Double.compare(this.rewardPoints, trophy.rewardPoints) == 0;
    }

    public final double getCaptainProgress() {
        return this.captainProgress;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDescriptionAr() {
        return this.descriptionAr;
    }

    @Nullable
    public final Date getEndsAt() {
        return this.endsAt;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getImageAr() {
        return this.imageAr;
    }

    public final double getRewardPoints() {
        return this.rewardPoints;
    }

    @NotNull
    public final String getStartsAt() {
        return this.startsAt;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTitleAr() {
        return this.titleAr;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(this.id * 31, 31, this.title), 31, this.titleAr);
        String str = this.description;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (sierra + hashCode) * 31;
        String str2 = this.descriptionAr;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int sierra2 = AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra((i5 + hashCode2) * 31, 31, this.image), 31, this.imageAr), 31, this.startsAt);
        Date date = this.endsAt;
        if (date != null) {
            i4 = date.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.captainProgress);
        long doubleToLongBits2 = Double.doubleToLongBits(this.rewardPoints);
        return ((((sierra2 + i4) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    @Nullable
    public final String localizedDescription() {
        String str;
        if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), "ar") && (str = this.descriptionAr) != null && !StringsKt.gray(str)) {
            return this.descriptionAr;
        }
        return this.description;
    }

    @NotNull
    public final String localizedImage() {
        if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), "ar") && !StringsKt.gray(this.imageAr)) {
            return this.imageAr;
        }
        return this.image;
    }

    @NotNull
    public final String localizedTitle() {
        if (Intrinsics.areEqual(Locale.getDefault().getLanguage(), "ar") && !StringsKt.gray(this.titleAr)) {
            return this.titleAr;
        }
        return this.title;
    }

    @NotNull
    public String toString() {
        int i4 = this.id;
        String str = this.title;
        String str2 = this.titleAr;
        String str3 = this.description;
        String str4 = this.descriptionAr;
        String str5 = this.image;
        String str6 = this.imageAr;
        String str7 = this.startsAt;
        Date date = this.endsAt;
        double d4 = this.captainProgress;
        double d9 = this.rewardPoints;
        StringBuilder lima = z.lima("Trophy(id=", ", title=", str, ", titleAr=", i4);
        Q0.c.azure(lima, str2, ", description=", str3, ", descriptionAr=");
        Q0.c.azure(lima, str4, ", image=", str5, ", imageAr=");
        Q0.c.azure(lima, str6, ", startsAt=", str7, ", endsAt=");
        lima.append(date);
        lima.append(", captainProgress=");
        lima.append(d4);
        lima.append(", rewardPoints=");
        lima.append(d9);
        lima.append(")");
        return lima.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.title);
        dest.writeString(this.titleAr);
        dest.writeString(this.description);
        dest.writeString(this.descriptionAr);
        dest.writeString(this.image);
        dest.writeString(this.imageAr);
        dest.writeString(this.startsAt);
        dest.writeSerializable(this.endsAt);
        dest.writeDouble(this.captainProgress);
        dest.writeDouble(this.rewardPoints);
    }

    public Trophy(int i4, @NotNull String title, @NotNull String titleAr, @Nullable String str, @Nullable String str2, @NotNull String image, @NotNull String imageAr, @NotNull String startsAt, @Nullable Date date, double d4, double d9) {
        Intrinsics.echo(title, "title");
        Intrinsics.echo(titleAr, "titleAr");
        Intrinsics.echo(image, "image");
        Intrinsics.echo(imageAr, "imageAr");
        Intrinsics.echo(startsAt, "startsAt");
        this.id = i4;
        this.title = title;
        this.titleAr = titleAr;
        this.description = str;
        this.descriptionAr = str2;
        this.image = image;
        this.imageAr = imageAr;
        this.startsAt = startsAt;
        this.endsAt = date;
        this.captainProgress = d4;
        this.rewardPoints = d9;
    }

    public /* synthetic */ Trophy(int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, double d4, double d9, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i4, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? null : str3, (i5 & 16) != 0 ? null : str4, (i5 & 32) != 0 ? "" : str5, (i5 & 64) != 0 ? "" : str6, (i5 & 128) == 0 ? str7 : "", (i5 & Barcode.FORMAT_QR_CODE) == 0 ? date : null, (i5 & 512) != 0 ? 0.0d : d4, (i5 & Barcode.FORMAT_UPC_E) != 0 ? 0.0d : d9);
    }
}
