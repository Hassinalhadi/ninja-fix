package com.app.network.network.models.trophies;

import P8.c;
import androidx.annotation.Keep;
import av.q;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003Je\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006+"}, d2 = {"Lcom/app/network/network/models/trophies/TrophyMilestone;", "", "captainId", "", "trophyId", "trophyMilestoneId", "achievedValue", "", "targetValue", "milestoneTitle", "", "description", Constants.KEY_ID, "progress", "<init>", "(IIIDDLjava/lang/String;Ljava/lang/String;ID)V", "getCaptainId", "()I", "getTrophyId", "getTrophyMilestoneId", "getAchievedValue", "()D", "getTargetValue", "getMilestoneTitle", "()Ljava/lang/String;", "getDescription", "getId", "getProgress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrophyMilestone {

    @c("achievedValue")
    private final double achievedValue;

    @c("captainId")
    private final int captainId;

    @c("milestoneDescription")
    @Nullable
    private final String description;

    @c(Constants.KEY_ID)
    private final int id;

    @c("milestoneTitle")
    @NotNull
    private final String milestoneTitle;

    @c("progress")
    private final double progress;

    @c("targetValue")
    private final double targetValue;

    @c("trophyId")
    private final int trophyId;

    @c("trophyMilestoneId")
    private final int trophyMilestoneId;

    public TrophyMilestone() {
        this(0, 0, 0, 0.0d, 0.0d, null, null, 0, 0.0d, 511, null);
    }

    public static /* synthetic */ TrophyMilestone copy$default(TrophyMilestone trophyMilestone, int i4, int i5, int i10, double d4, double d9, String str, String str2, int i11, double d10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i4 = trophyMilestone.captainId;
        }
        if ((i12 & 2) != 0) {
            i5 = trophyMilestone.trophyId;
        }
        if ((i12 & 4) != 0) {
            i10 = trophyMilestone.trophyMilestoneId;
        }
        if ((i12 & 8) != 0) {
            d4 = trophyMilestone.achievedValue;
        }
        if ((i12 & 16) != 0) {
            d9 = trophyMilestone.targetValue;
        }
        if ((i12 & 32) != 0) {
            str = trophyMilestone.milestoneTitle;
        }
        if ((i12 & 64) != 0) {
            str2 = trophyMilestone.description;
        }
        if ((i12 & 128) != 0) {
            i11 = trophyMilestone.id;
        }
        if ((i12 & Barcode.FORMAT_QR_CODE) != 0) {
            d10 = trophyMilestone.progress;
        }
        int i13 = i11;
        String str3 = str;
        double d11 = d9;
        double d12 = d4;
        int i14 = i10;
        return trophyMilestone.copy(i4, i5, i14, d12, d11, str3, str2, i13, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCaptainId() {
        return this.captainId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTrophyId() {
        return this.trophyId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTrophyMilestoneId() {
        return this.trophyMilestoneId;
    }

    /* renamed from: component4, reason: from getter */
    public final double getAchievedValue() {
        return this.achievedValue;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTargetValue() {
        return this.targetValue;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getMilestoneTitle() {
        return this.milestoneTitle;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component8, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component9, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    @NotNull
    public final TrophyMilestone copy(int captainId, int trophyId, int trophyMilestoneId, double achievedValue, double targetValue, @NotNull String milestoneTitle, @Nullable String description, int id2, double progress) {
        Intrinsics.echo(milestoneTitle, "milestoneTitle");
        return new TrophyMilestone(captainId, trophyId, trophyMilestoneId, achievedValue, targetValue, milestoneTitle, description, id2, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrophyMilestone)) {
            return false;
        }
        TrophyMilestone trophyMilestone = (TrophyMilestone) other;
        return this.captainId == trophyMilestone.captainId && this.trophyId == trophyMilestone.trophyId && this.trophyMilestoneId == trophyMilestone.trophyMilestoneId && Double.compare(this.achievedValue, trophyMilestone.achievedValue) == 0 && Double.compare(this.targetValue, trophyMilestone.targetValue) == 0 && Intrinsics.areEqual(this.milestoneTitle, trophyMilestone.milestoneTitle) && Intrinsics.areEqual(this.description, trophyMilestone.description) && this.id == trophyMilestone.id && Double.compare(this.progress, trophyMilestone.progress) == 0;
    }

    public final double getAchievedValue() {
        return this.achievedValue;
    }

    public final int getCaptainId() {
        return this.captainId;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMilestoneTitle() {
        return this.milestoneTitle;
    }

    public final double getProgress() {
        return this.progress;
    }

    public final double getTargetValue() {
        return this.targetValue;
    }

    public final int getTrophyId() {
        return this.trophyId;
    }

    public final int getTrophyMilestoneId() {
        return this.trophyMilestoneId;
    }

    public int hashCode() {
        int hashCode;
        int i4 = ((((this.captainId * 31) + this.trophyId) * 31) + this.trophyMilestoneId) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.achievedValue);
        int i5 = (i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.targetValue);
        int sierra = AbstractC2327c.sierra((i5 + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31, 31, this.milestoneTitle);
        String str = this.description;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (((sierra + hashCode) * 31) + this.id) * 31;
        long doubleToLongBits3 = Double.doubleToLongBits(this.progress);
        return i10 + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    @NotNull
    public String toString() {
        int i4 = this.captainId;
        int i5 = this.trophyId;
        int i10 = this.trophyMilestoneId;
        double d4 = this.achievedValue;
        double d9 = this.targetValue;
        String str = this.milestoneTitle;
        String str2 = this.description;
        int i11 = this.id;
        double d10 = this.progress;
        StringBuilder hotel = q.hotel(i4, i5, "TrophyMilestone(captainId=", ", trophyId=", ", trophyMilestoneId=");
        hotel.append(i10);
        hotel.append(", achievedValue=");
        hotel.append(d4);
        hotel.append(", targetValue=");
        hotel.append(d9);
        hotel.append(", milestoneTitle=");
        Q0.c.azure(hotel, str, ", description=", str2, ", id=");
        hotel.append(i11);
        hotel.append(", progress=");
        hotel.append(d10);
        hotel.append(")");
        return hotel.toString();
    }

    public TrophyMilestone(int i4, int i5, int i10, double d4, double d9, @NotNull String milestoneTitle, @Nullable String str, int i11, double d10) {
        Intrinsics.echo(milestoneTitle, "milestoneTitle");
        this.captainId = i4;
        this.trophyId = i5;
        this.trophyMilestoneId = i10;
        this.achievedValue = d4;
        this.targetValue = d9;
        this.milestoneTitle = milestoneTitle;
        this.description = str;
        this.id = i11;
        this.progress = d10;
    }

    public /* synthetic */ TrophyMilestone(int i4, int i5, int i10, double d4, double d9, String str, String str2, int i11, double d10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i4, (i12 & 2) != 0 ? 0 : i5, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0.0d : d4, (i12 & 16) != 0 ? 0.0d : d9, (i12 & 32) != 0 ? "" : str, (i12 & 64) != 0 ? null : str2, (i12 & 128) == 0 ? i11 : 0, (i12 & Barcode.FORMAT_QR_CODE) != 0 ? 0.0d : d10);
    }
}
