package com.app.network.network.models.tickets;

import P8.c;
import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/tickets/TicketAttachment;", "", Constants.KEY_ID, "", "fileId", "fileUrl", "", "<init>", "(IILjava/lang/String;)V", "getId", "()I", "getFileId", "getFileUrl", "()Ljava/lang/String;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TicketAttachment {

    @c("fileId")
    private final int fileId;

    @c("fileUrl")
    @NotNull
    private final String fileUrl;

    @c(Constants.KEY_ID)
    private final int id;

    public TicketAttachment(int i4, int i5, @NotNull String fileUrl) {
        Intrinsics.echo(fileUrl, "fileUrl");
        this.id = i4;
        this.fileId = i5;
        this.fileUrl = fileUrl;
    }

    public static /* synthetic */ TicketAttachment copy$default(TicketAttachment ticketAttachment, int i4, int i5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = ticketAttachment.id;
        }
        if ((i10 & 2) != 0) {
            i5 = ticketAttachment.fileId;
        }
        if ((i10 & 4) != 0) {
            str = ticketAttachment.fileUrl;
        }
        return ticketAttachment.copy(i4, i5, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFileId() {
        return this.fileId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @NotNull
    public final TicketAttachment copy(int id2, int fileId, @NotNull String fileUrl) {
        Intrinsics.echo(fileUrl, "fileUrl");
        return new TicketAttachment(id2, fileId, fileUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketAttachment)) {
            return false;
        }
        TicketAttachment ticketAttachment = (TicketAttachment) other;
        return this.id == ticketAttachment.id && this.fileId == ticketAttachment.fileId && Intrinsics.areEqual(this.fileUrl, ticketAttachment.fileUrl);
    }

    public final int getFileId() {
        return this.fileId;
    }

    @NotNull
    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.fileUrl.hashCode() + (((this.id * 31) + this.fileId) * 31);
    }

    @NotNull
    public String toString() {
        int i4 = this.id;
        int i5 = this.fileId;
        return P0.gold(q.hotel(i4, i5, "TicketAttachment(id=", ", fileId=", ", fileUrl="), this.fileUrl, ")");
    }
}
