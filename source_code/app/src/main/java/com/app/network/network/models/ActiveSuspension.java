package com.app.network.network.models;

import P8.c;
import av.q;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/app/network/network/models/ActiveSuspension;", "Ljava/io/Serializable;", Constants.KEY_TYPE, "", "unblockAt", "categoryText", "categoryTextAr", "remainingDurationString", "percentage", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getType", "()Ljava/lang/String;", "getUnblockAt", "getCategoryText", "getCategoryTextAr", "getRemainingDurationString", "getPercentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/app/network/network/models/ActiveSuspension;", "equals", "", "other", "", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActiveSuspension implements Serializable {

    @c("categoryText")
    @Nullable
    private final String categoryText;

    @c("categoryTextAr")
    @Nullable
    private final String categoryTextAr;

    @c("percentage")
    @Nullable
    private final Double percentage;

    @c("remainingDurationString")
    @Nullable
    private final String remainingDurationString;

    @c(Constants.KEY_TYPE)
    @Nullable
    private final String type;

    @c("unblockAt")
    @Nullable
    private final String unblockAt;

    public ActiveSuspension(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Double d4) {
        this.type = str;
        this.unblockAt = str2;
        this.categoryText = str3;
        this.categoryTextAr = str4;
        this.remainingDurationString = str5;
        this.percentage = d4;
    }

    public static /* synthetic */ ActiveSuspension copy$default(ActiveSuspension activeSuspension, String str, String str2, String str3, String str4, String str5, Double d4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = activeSuspension.type;
        }
        if ((i4 & 2) != 0) {
            str2 = activeSuspension.unblockAt;
        }
        if ((i4 & 4) != 0) {
            str3 = activeSuspension.categoryText;
        }
        if ((i4 & 8) != 0) {
            str4 = activeSuspension.categoryTextAr;
        }
        if ((i4 & 16) != 0) {
            str5 = activeSuspension.remainingDurationString;
        }
        if ((i4 & 32) != 0) {
            d4 = activeSuspension.percentage;
        }
        String str6 = str5;
        Double d9 = d4;
        return activeSuspension.copy(str, str2, str3, str4, str6, d9);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getUnblockAt() {
        return this.unblockAt;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCategoryTextAr() {
        return this.categoryTextAr;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRemainingDurationString() {
        return this.remainingDurationString;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final ActiveSuspension copy(@Nullable String type, @Nullable String unblockAt, @Nullable String categoryText, @Nullable String categoryTextAr, @Nullable String remainingDurationString, @Nullable Double percentage) {
        return new ActiveSuspension(type, unblockAt, categoryText, categoryTextAr, remainingDurationString, percentage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveSuspension)) {
            return false;
        }
        ActiveSuspension activeSuspension = (ActiveSuspension) other;
        return Intrinsics.areEqual(this.type, activeSuspension.type) && Intrinsics.areEqual(this.unblockAt, activeSuspension.unblockAt) && Intrinsics.areEqual(this.categoryText, activeSuspension.categoryText) && Intrinsics.areEqual(this.categoryTextAr, activeSuspension.categoryTextAr) && Intrinsics.areEqual(this.remainingDurationString, activeSuspension.remainingDurationString) && Intrinsics.areEqual(this.percentage, activeSuspension.percentage);
    }

    @Nullable
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    public final String getCategoryTextAr() {
        return this.categoryTextAr;
    }

    @Nullable
    public final Double getPercentage() {
        return this.percentage;
    }

    @Nullable
    public final String getRemainingDurationString() {
        return this.remainingDurationString;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUnblockAt() {
        return this.unblockAt;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.unblockAt;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.categoryTextAr;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.remainingDurationString;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d4 = this.percentage;
        return hashCode5 + (d4 != null ? d4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.unblockAt;
        String str3 = this.categoryText;
        String str4 = this.categoryTextAr;
        String str5 = this.remainingDurationString;
        Double d4 = this.percentage;
        StringBuilder india = q.india("ActiveSuspension(type=", str, ", unblockAt=", str2, ", categoryText=");
        Q0.c.azure(india, str3, ", categoryTextAr=", str4, ", remainingDurationString=");
        india.append(str5);
        india.append(", percentage=");
        india.append(d4);
        india.append(")");
        return india.toString();
    }
}
