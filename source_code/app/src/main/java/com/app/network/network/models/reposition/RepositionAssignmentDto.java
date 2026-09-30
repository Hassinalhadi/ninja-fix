package com.app.network.network.models.reposition;

import P8.c;
import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jn\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006/"}, d2 = {"Lcom/app/network/network/models/reposition/RepositionAssignmentDto;", "", Constants.KEY_ID, "", "status", "", "fromSectionName", "toSectionName", "amount", "", "transferMode", "distanceInKm", Constants.KEY_TITLE, Constants.KEY_MESSAGE, "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getStatus", "()Ljava/lang/String;", "getFromSectionName", "getToSectionName", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTransferMode", "getDistanceInKm", "()D", "getTitle", "getMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/app/network/network/models/reposition/RepositionAssignmentDto;", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RepositionAssignmentDto {

    @c("amount")
    @Nullable
    private final Double amount;

    @c("distanceInKm")
    private final double distanceInKm;

    @c("fromSectionName")
    @NotNull
    private final String fromSectionName;

    @c(Constants.KEY_ID)
    private final long id;

    @c(Constants.KEY_MESSAGE)
    @Nullable
    private final String message;

    @c("status")
    @NotNull
    private final String status;

    @c(Constants.KEY_TITLE)
    @Nullable
    private final String title;

    @c("toSectionName")
    @NotNull
    private final String toSectionName;

    @c("transferMode")
    @NotNull
    private final String transferMode;

    public RepositionAssignmentDto(long j5, @NotNull String status, @NotNull String fromSectionName, @NotNull String toSectionName, @Nullable Double d4, @NotNull String transferMode, double d9, @Nullable String str, @Nullable String str2) {
        Intrinsics.echo(status, "status");
        Intrinsics.echo(fromSectionName, "fromSectionName");
        Intrinsics.echo(toSectionName, "toSectionName");
        Intrinsics.echo(transferMode, "transferMode");
        this.id = j5;
        this.status = status;
        this.fromSectionName = fromSectionName;
        this.toSectionName = toSectionName;
        this.amount = d4;
        this.transferMode = transferMode;
        this.distanceInKm = d9;
        this.title = str;
        this.message = str2;
    }

    public static /* synthetic */ RepositionAssignmentDto copy$default(RepositionAssignmentDto repositionAssignmentDto, long j5, String str, String str2, String str3, Double d4, String str4, double d9, String str5, String str6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = repositionAssignmentDto.id;
        }
        long j6 = j5;
        if ((i4 & 2) != 0) {
            str = repositionAssignmentDto.status;
        }
        return repositionAssignmentDto.copy(j6, str, (i4 & 4) != 0 ? repositionAssignmentDto.fromSectionName : str2, (i4 & 8) != 0 ? repositionAssignmentDto.toSectionName : str3, (i4 & 16) != 0 ? repositionAssignmentDto.amount : d4, (i4 & 32) != 0 ? repositionAssignmentDto.transferMode : str4, (i4 & 64) != 0 ? repositionAssignmentDto.distanceInKm : d9, (i4 & 128) != 0 ? repositionAssignmentDto.title : str5, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? repositionAssignmentDto.message : str6);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFromSectionName() {
        return this.fromSectionName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getToSectionName() {
        return this.toSectionName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTransferMode() {
        return this.transferMode;
    }

    /* renamed from: component7, reason: from getter */
    public final double getDistanceInKm() {
        return this.distanceInKm;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final RepositionAssignmentDto copy(long id2, @NotNull String status, @NotNull String fromSectionName, @NotNull String toSectionName, @Nullable Double amount, @NotNull String transferMode, double distanceInKm, @Nullable String title, @Nullable String message) {
        Intrinsics.echo(status, "status");
        Intrinsics.echo(fromSectionName, "fromSectionName");
        Intrinsics.echo(toSectionName, "toSectionName");
        Intrinsics.echo(transferMode, "transferMode");
        return new RepositionAssignmentDto(id2, status, fromSectionName, toSectionName, amount, transferMode, distanceInKm, title, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepositionAssignmentDto)) {
            return false;
        }
        RepositionAssignmentDto repositionAssignmentDto = (RepositionAssignmentDto) other;
        return this.id == repositionAssignmentDto.id && Intrinsics.areEqual(this.status, repositionAssignmentDto.status) && Intrinsics.areEqual(this.fromSectionName, repositionAssignmentDto.fromSectionName) && Intrinsics.areEqual(this.toSectionName, repositionAssignmentDto.toSectionName) && Intrinsics.areEqual(this.amount, repositionAssignmentDto.amount) && Intrinsics.areEqual(this.transferMode, repositionAssignmentDto.transferMode) && Double.compare(this.distanceInKm, repositionAssignmentDto.distanceInKm) == 0 && Intrinsics.areEqual(this.title, repositionAssignmentDto.title) && Intrinsics.areEqual(this.message, repositionAssignmentDto.message);
    }

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    public final double getDistanceInKm() {
        return this.distanceInKm;
    }

    @NotNull
    public final String getFromSectionName() {
        return this.fromSectionName;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getToSectionName() {
        return this.toSectionName;
    }

    @NotNull
    public final String getTransferMode() {
        return this.transferMode;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j5 = this.id;
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(((int) (j5 ^ (j5 >>> 32))) * 31, 31, this.status), 31, this.fromSectionName), 31, this.toSectionName);
        Double d4 = this.amount;
        int i4 = 0;
        if (d4 == null) {
            hashCode = 0;
        } else {
            hashCode = d4.hashCode();
        }
        int sierra2 = AbstractC2327c.sierra((sierra + hashCode) * 31, 31, this.transferMode);
        long doubleToLongBits = Double.doubleToLongBits(this.distanceInKm);
        int i5 = (sierra2 + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits))) * 31;
        String str = this.title;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str2 = this.message;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i10 + i4;
    }

    @NotNull
    public String toString() {
        long j5 = this.id;
        String str = this.status;
        String str2 = this.fromSectionName;
        String str3 = this.toSectionName;
        Double d4 = this.amount;
        String str4 = this.transferMode;
        double d9 = this.distanceInKm;
        String str5 = this.title;
        String str6 = this.message;
        StringBuilder sb2 = new StringBuilder("RepositionAssignmentDto(id=");
        sb2.append(j5);
        sb2.append(", status=");
        sb2.append(str);
        Q0.c.azure(sb2, ", fromSectionName=", str2, ", toSectionName=", str3);
        sb2.append(", amount=");
        sb2.append(d4);
        sb2.append(", transferMode=");
        sb2.append(str4);
        sb2.append(", distanceInKm=");
        sb2.append(d9);
        sb2.append(", title=");
        return j.lima(sb2, str5, ", message=", str6, ")");
    }

    public /* synthetic */ RepositionAssignmentDto(long j5, String str, String str2, String str3, Double d4, String str4, double d9, String str5, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j5, str, str2, str3, d4, str4, d9, (i4 & 128) != 0 ? null : str5, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : str6);
    }
}
