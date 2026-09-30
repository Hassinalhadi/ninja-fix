package com.app.network.network.models.points.redeem;

import A0.z;
import P8.c;
import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010*\u001a\u00020\u0005J\b\u0010+\u001a\u0004\u0018\u00010\u0005J\u0006\u0010,\u001a\u00020\u0003J\u0006\u0010-\u001a\u00020\u0005J\u0006\u0010.\u001a\u00020\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010&J\t\u0010:\u001a\u00020\u0012HÆ\u0003J\u008e\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006A"}, d2 = {"Lcom/app/network/network/models/points/redeem/PointRewardResponse;", "", Constants.KEY_ID, "", "name", "", "nameAr", "image", "imageAr", "points", "", "usageLimit", "usageCount", Constants.KEY_TYPE, "Lcom/app/network/network/models/points/redeem/RewardType;", "amount", "quantity", "enabled", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIILcom/app/network/network/models/points/redeem/RewardType;Ljava/lang/Double;Ljava/lang/Integer;Z)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getNameAr", "getImage", "getImageAr", "getPoints", "()D", "getUsageLimit", "getUsageCount", "getType", "()Lcom/app/network/network/models/points/redeem/RewardType;", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnabled", "()Z", "getDisplayName", "getImageUrl", "getRemaining", "getRemainingText", "getUsageProgressPercent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", Constants.COPY_TYPE, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIILcom/app/network/network/models/points/redeem/RewardType;Ljava/lang/Double;Ljava/lang/Integer;Z)Lcom/app/network/network/models/points/redeem/PointRewardResponse;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PointRewardResponse {

    @c("amount")
    @Nullable
    private final Double amount;
    private final boolean enabled;

    @c(Constants.KEY_ID)
    private final int id;

    @c("image")
    @Nullable
    private final String image;

    @c("imageAr")
    @Nullable
    private final String imageAr;

    @c("name")
    @NotNull
    private final String name;

    @c("nameAr")
    @NotNull
    private final String nameAr;

    @c("points")
    private final double points;

    @c("quantity")
    @Nullable
    private final Integer quantity;

    @c(Constants.KEY_TYPE)
    @NotNull
    private final RewardType type;

    @c("usageCount")
    private final int usageCount;

    @c("usageLimit")
    private final int usageLimit;

    public PointRewardResponse() {
        this(0, null, null, null, null, 0.0d, 0, 0, null, null, null, false, 4095, null);
    }

    public static /* synthetic */ PointRewardResponse copy$default(PointRewardResponse pointRewardResponse, int i4, String str, String str2, String str3, String str4, double d4, int i5, int i10, RewardType rewardType, Double d9, Integer num, boolean z2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i4 = pointRewardResponse.id;
        }
        return pointRewardResponse.copy(i4, (i11 & 2) != 0 ? pointRewardResponse.name : str, (i11 & 4) != 0 ? pointRewardResponse.nameAr : str2, (i11 & 8) != 0 ? pointRewardResponse.image : str3, (i11 & 16) != 0 ? pointRewardResponse.imageAr : str4, (i11 & 32) != 0 ? pointRewardResponse.points : d4, (i11 & 64) != 0 ? pointRewardResponse.usageLimit : i5, (i11 & 128) != 0 ? pointRewardResponse.usageCount : i10, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? pointRewardResponse.type : rewardType, (i11 & 512) != 0 ? pointRewardResponse.amount : d9, (i11 & Barcode.FORMAT_UPC_E) != 0 ? pointRewardResponse.quantity : num, (i11 & 2048) != 0 ? pointRewardResponse.enabled : z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNameAr() {
        return this.nameAr;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getImageAr() {
        return this.imageAr;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPoints() {
        return this.points;
    }

    /* renamed from: component7, reason: from getter */
    public final int getUsageLimit() {
        return this.usageLimit;
    }

    /* renamed from: component8, reason: from getter */
    public final int getUsageCount() {
        return this.usageCount;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final RewardType getType() {
        return this.type;
    }

    @NotNull
    public final PointRewardResponse copy(int id2, @NotNull String name, @NotNull String nameAr, @Nullable String image, @Nullable String imageAr, double points, int usageLimit, int usageCount, @NotNull RewardType type, @Nullable Double amount, @Nullable Integer quantity, boolean enabled) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(nameAr, "nameAr");
        Intrinsics.echo(type, "type");
        return new PointRewardResponse(id2, name, nameAr, image, imageAr, points, usageLimit, usageCount, type, amount, quantity, enabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointRewardResponse)) {
            return false;
        }
        PointRewardResponse pointRewardResponse = (PointRewardResponse) other;
        return this.id == pointRewardResponse.id && Intrinsics.areEqual(this.name, pointRewardResponse.name) && Intrinsics.areEqual(this.nameAr, pointRewardResponse.nameAr) && Intrinsics.areEqual(this.image, pointRewardResponse.image) && Intrinsics.areEqual(this.imageAr, pointRewardResponse.imageAr) && Double.compare(this.points, pointRewardResponse.points) == 0 && this.usageLimit == pointRewardResponse.usageLimit && this.usageCount == pointRewardResponse.usageCount && this.type == pointRewardResponse.type && Intrinsics.areEqual(this.amount, pointRewardResponse.amount) && Intrinsics.areEqual(this.quantity, pointRewardResponse.quantity) && this.enabled == pointRewardResponse.enabled;
    }

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getDisplayName() {
        if (Locale.getDefault().getLanguage().equals("ar") && !StringsKt.gray(this.nameAr)) {
            return this.nameAr;
        }
        return this.name;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getImageAr() {
        return this.imageAr;
    }

    @Nullable
    public final String getImageUrl() {
        if (Locale.getDefault().getLanguage().equals("ar")) {
            String str = this.imageAr;
            if (str == null) {
                return this.image;
            }
            return str;
        }
        return this.image;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNameAr() {
        return this.nameAr;
    }

    public final double getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getQuantity() {
        return this.quantity;
    }

    public final int getRemaining() {
        int i4 = this.usageLimit - this.usageCount;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    @NotNull
    public final String getRemainingText() {
        return getRemaining() + " remaining";
    }

    @NotNull
    public final RewardType getType() {
        return this.type;
    }

    public final int getUsageCount() {
        return this.usageCount;
    }

    public final int getUsageLimit() {
        return this.usageLimit;
    }

    public final int getUsageProgressPercent() {
        int i4 = this.usageLimit;
        if (i4 == 0) {
            return 0;
        }
        return (int) ((this.usageCount / i4) * 100);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i4;
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(this.id * 31, 31, this.name), 31, this.nameAr);
        String str = this.image;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (sierra + hashCode) * 31;
        String str2 = this.imageAr;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.points);
        int hashCode4 = (this.type.hashCode() + ((((((((i10 + hashCode2) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.usageLimit) * 31) + this.usageCount) * 31)) * 31;
        Double d4 = this.amount;
        if (d4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d4.hashCode();
        }
        int i11 = (hashCode4 + hashCode3) * 31;
        Integer num = this.quantity;
        if (num != null) {
            i5 = num.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        if (this.enabled) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i12 + i4;
    }

    @NotNull
    public String toString() {
        int i4 = this.id;
        String str = this.name;
        String str2 = this.nameAr;
        String str3 = this.image;
        String str4 = this.imageAr;
        double d4 = this.points;
        int i5 = this.usageLimit;
        int i10 = this.usageCount;
        RewardType rewardType = this.type;
        Double d9 = this.amount;
        Integer num = this.quantity;
        boolean z2 = this.enabled;
        StringBuilder lima = z.lima("PointRewardResponse(id=", ", name=", str, ", nameAr=", i4);
        Q0.c.azure(lima, str2, ", image=", str3, ", imageAr=");
        lima.append(str4);
        lima.append(", points=");
        lima.append(d4);
        lima.append(", usageLimit=");
        lima.append(i5);
        lima.append(", usageCount=");
        lima.append(i10);
        lima.append(", type=");
        lima.append(rewardType);
        lima.append(", amount=");
        lima.append(d9);
        lima.append(", quantity=");
        lima.append(num);
        lima.append(", enabled=");
        lima.append(z2);
        lima.append(")");
        return lima.toString();
    }

    public PointRewardResponse(int i4, @NotNull String name, @NotNull String nameAr, @Nullable String str, @Nullable String str2, double d4, int i5, int i10, @NotNull RewardType type, @Nullable Double d9, @Nullable Integer num, boolean z2) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(nameAr, "nameAr");
        Intrinsics.echo(type, "type");
        this.id = i4;
        this.name = name;
        this.nameAr = nameAr;
        this.image = str;
        this.imageAr = str2;
        this.points = d4;
        this.usageLimit = i5;
        this.usageCount = i10;
        this.type = type;
        this.amount = d9;
        this.quantity = num;
        this.enabled = z2;
    }

    public /* synthetic */ PointRewardResponse(int i4, String str, String str2, String str3, String str4, double d4, int i5, int i10, RewardType rewardType, Double d9, Integer num, boolean z2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i4, (i11 & 2) != 0 ? "" : str, (i11 & 4) == 0 ? str2 : "", (i11 & 8) != 0 ? null : str3, (i11 & 16) == 0 ? str4 : null, (i11 & 32) != 0 ? 0.0d : d4, (i11 & 64) != 0 ? 0 : i5, (i11 & 128) != 0 ? 0 : i10, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? RewardType.WALLET : rewardType, (i11 & 512) != 0 ? Double.valueOf(0.0d) : d9, (i11 & Barcode.FORMAT_UPC_E) != 0 ? 0 : num, (i11 & 2048) != 0 ? false : z2);
    }
}
