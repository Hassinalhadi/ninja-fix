package com.app.network.network.models;

import P8.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003JT\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0003J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006*"}, d2 = {"Lcom/app/network/network/models/CsatResponse;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "ticketId", "status", "", "orderId", "ticketTitle", "ticketContent", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getTicketId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/String;", "getOrderId", "getTicketTitle", "getTicketContent", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/app/network/network/models/CsatResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CsatResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CsatResponse> CREATOR = new Creator();

    @c(Constants.KEY_ID)
    private final int id;

    @c("orderId")
    @Nullable
    private final Integer orderId;

    @c("status")
    @Nullable
    private final String status;

    @c("ticketContent")
    @Nullable
    private final String ticketContent;

    @c("ticketId")
    @Nullable
    private final Integer ticketId;

    @c("ticketTitle")
    @Nullable
    private final String ticketTitle;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<CsatResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CsatResponse createFromParcel(Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new CsatResponse(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CsatResponse[] newArray(int i4) {
            return new CsatResponse[i4];
        }
    }

    public CsatResponse(int i4, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable String str3) {
        this.id = i4;
        this.ticketId = num;
        this.status = str;
        this.orderId = num2;
        this.ticketTitle = str2;
        this.ticketContent = str3;
    }

    public static /* synthetic */ CsatResponse copy$default(CsatResponse csatResponse, int i4, Integer num, String str, Integer num2, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = csatResponse.id;
        }
        if ((i5 & 2) != 0) {
            num = csatResponse.ticketId;
        }
        if ((i5 & 4) != 0) {
            str = csatResponse.status;
        }
        if ((i5 & 8) != 0) {
            num2 = csatResponse.orderId;
        }
        if ((i5 & 16) != 0) {
            str2 = csatResponse.ticketTitle;
        }
        if ((i5 & 32) != 0) {
            str3 = csatResponse.ticketContent;
        }
        String str4 = str2;
        String str5 = str3;
        return csatResponse.copy(i4, num, str, num2, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTicketId() {
        return this.ticketId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getTicketTitle() {
        return this.ticketTitle;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTicketContent() {
        return this.ticketContent;
    }

    @NotNull
    public final CsatResponse copy(int id2, @Nullable Integer ticketId, @Nullable String status, @Nullable Integer orderId, @Nullable String ticketTitle, @Nullable String ticketContent) {
        return new CsatResponse(id2, ticketId, status, orderId, ticketTitle, ticketContent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CsatResponse)) {
            return false;
        }
        CsatResponse csatResponse = (CsatResponse) other;
        return this.id == csatResponse.id && Intrinsics.areEqual(this.ticketId, csatResponse.ticketId) && Intrinsics.areEqual(this.status, csatResponse.status) && Intrinsics.areEqual(this.orderId, csatResponse.orderId) && Intrinsics.areEqual(this.ticketTitle, csatResponse.ticketTitle) && Intrinsics.areEqual(this.ticketContent, csatResponse.ticketContent);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTicketContent() {
        return this.ticketContent;
    }

    @Nullable
    public final Integer getTicketId() {
        return this.ticketId;
    }

    @Nullable
    public final String getTicketTitle() {
        return this.ticketTitle;
    }

    public int hashCode() {
        int i4 = this.id * 31;
        Integer num = this.ticketId;
        int hashCode = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.orderId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.ticketTitle;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ticketContent;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i4 = this.id;
        Integer num = this.ticketId;
        String str = this.status;
        Integer num2 = this.orderId;
        String str2 = this.ticketTitle;
        String str3 = this.ticketContent;
        StringBuilder sb2 = new StringBuilder("CsatResponse(id=");
        sb2.append(i4);
        sb2.append(", ticketId=");
        sb2.append(num);
        sb2.append(", status=");
        sb2.append(str);
        sb2.append(", orderId=");
        sb2.append(num2);
        sb2.append(", ticketTitle=");
        return j.lima(sb2, str2, ", ticketContent=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeInt(this.id);
        Integer num = this.ticketId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.status);
        Integer num2 = this.orderId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.ticketTitle);
        dest.writeString(this.ticketContent);
    }
}
