package com.app.network.network.models;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003JX\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006+"}, d2 = {"Lcom/app/network/network/models/TransferCard;", "Lcom/app/network/network/models/Language;", "areaType", "", "areaId", "", "amount", "", "createdAt", "areaName", "distance", "", "expiresAt", "<init>", "(Ljava/lang/String;JDLjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "getAreaType", "()Ljava/lang/String;", "getAreaId", "()J", "getAmount", "()D", "getCreatedAt", "getAreaName", "getDistance", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getExpiresAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/String;JDLjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/app/network/network/models/TransferCard;", "equals", "", "other", "", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferCard extends Language {
    private final double amount;
    private final long areaId;

    @NotNull
    private final String areaName;

    @NotNull
    private final String areaType;

    @NotNull
    private final String createdAt;

    @Nullable
    private final Float distance;

    @Nullable
    private final String expiresAt;

    public /* synthetic */ TransferCard(String str, long j5, double d4, String str2, String str3, Float f5, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j5, d4, str2, str3, (i4 & 32) != 0 ? null : f5, (i4 & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ TransferCard copy$default(TransferCard transferCard, String str, long j5, double d4, String str2, String str3, Float f5, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = transferCard.areaType;
        }
        if ((i4 & 2) != 0) {
            j5 = transferCard.areaId;
        }
        if ((i4 & 4) != 0) {
            d4 = transferCard.amount;
        }
        if ((i4 & 8) != 0) {
            str2 = transferCard.createdAt;
        }
        if ((i4 & 16) != 0) {
            str3 = transferCard.areaName;
        }
        if ((i4 & 32) != 0) {
            f5 = transferCard.distance;
        }
        if ((i4 & 64) != 0) {
            str4 = transferCard.expiresAt;
        }
        double d9 = d4;
        return transferCard.copy(str, j5, d9, str2, str3, f5, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAreaType() {
        return this.areaType;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAreaId() {
        return this.areaId;
    }

    /* renamed from: component3, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAreaName() {
        return this.areaName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getDistance() {
        return this.distance;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @NotNull
    public final TransferCard copy(@NotNull String areaType, long areaId, double amount, @NotNull String createdAt, @NotNull String areaName, @Nullable Float distance, @Nullable String expiresAt) {
        Intrinsics.echo(areaType, "areaType");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(areaName, "areaName");
        return new TransferCard(areaType, areaId, amount, createdAt, areaName, distance, expiresAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferCard)) {
            return false;
        }
        TransferCard transferCard = (TransferCard) other;
        return Intrinsics.areEqual(this.areaType, transferCard.areaType) && this.areaId == transferCard.areaId && Double.compare(this.amount, transferCard.amount) == 0 && Intrinsics.areEqual(this.createdAt, transferCard.createdAt) && Intrinsics.areEqual(this.areaName, transferCard.areaName) && Intrinsics.areEqual(this.distance, transferCard.distance) && Intrinsics.areEqual(this.expiresAt, transferCard.expiresAt);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final long getAreaId() {
        return this.areaId;
    }

    @NotNull
    public final String getAreaName() {
        return this.areaName;
    }

    @NotNull
    public final String getAreaType() {
        return this.areaType;
    }

    @NotNull
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Float getDistance() {
        return this.distance;
    }

    @Nullable
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.areaType.hashCode() * 31;
        long j5 = this.areaId;
        int i4 = (hashCode2 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.amount);
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra((i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31, 31, this.createdAt), 31, this.areaName);
        Float f5 = this.distance;
        int i5 = 0;
        if (f5 == null) {
            hashCode = 0;
        } else {
            hashCode = f5.hashCode();
        }
        int i10 = (sierra + hashCode) * 31;
        String str = this.expiresAt;
        if (str != null) {
            i5 = str.hashCode();
        }
        return i10 + i5;
    }

    @NotNull
    public String toString() {
        String str = this.areaType;
        long j5 = this.areaId;
        double d4 = this.amount;
        String str2 = this.createdAt;
        String str3 = this.areaName;
        Float f5 = this.distance;
        String str4 = this.expiresAt;
        StringBuilder sb2 = new StringBuilder("TransferCard(areaType=");
        sb2.append(str);
        sb2.append(", areaId=");
        sb2.append(j5);
        sb2.append(", amount=");
        sb2.append(d4);
        sb2.append(", createdAt=");
        c.azure(sb2, str2, ", areaName=", str3, ", distance=");
        sb2.append(f5);
        sb2.append(", expiresAt=");
        sb2.append(str4);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferCard(@NotNull String areaType, long j5, double d4, @NotNull String createdAt, @NotNull String areaName, @Nullable Float f5, @Nullable String str) {
        super(null, 1, null);
        Intrinsics.echo(areaType, "areaType");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(areaName, "areaName");
        this.areaType = areaType;
        this.areaId = j5;
        this.amount = d4;
        this.createdAt = createdAt;
        this.areaName = areaName;
        this.distance = f5;
        this.expiresAt = str;
    }
}
