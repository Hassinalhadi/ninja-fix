package com.app.network.network.models.tickets;

import P8.c;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003JU\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\rHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006*"}, d2 = {"Lcom/app/network/network/models/tickets/TicketCommentResponse;", "", "ticketCommentAttachments", "", "Lcom/app/network/network/models/tickets/CommentAttachment;", "actorId", "", "ticketId", "createdAt", "Ljava/util/Date;", "actorType", "Lcom/app/network/network/models/tickets/ActorType;", Constants.KEY_MESSAGE, "", Constants.KEY_ID, "<init>", "(Ljava/util/List;IILjava/util/Date;Lcom/app/network/network/models/tickets/ActorType;Ljava/lang/String;I)V", "getTicketCommentAttachments", "()Ljava/util/List;", "getActorId", "()I", "getTicketId", "getCreatedAt", "()Ljava/util/Date;", "getActorType", "()Lcom/app/network/network/models/tickets/ActorType;", "getMessage", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TicketCommentResponse {

    @c("actorId")
    private final int actorId;

    @c("actorType")
    @NotNull
    private final ActorType actorType;

    @c("createdAt")
    @NotNull
    private final Date createdAt;

    @c(Constants.KEY_ID)
    private final int id;

    @c(Constants.KEY_MESSAGE)
    @NotNull
    private final String message;

    @c("ticketCommentAttachments")
    @NotNull
    private final List<CommentAttachment> ticketCommentAttachments;

    @c("ticketId")
    private final int ticketId;

    public TicketCommentResponse(@NotNull List<CommentAttachment> ticketCommentAttachments, int i4, int i5, @NotNull Date createdAt, @NotNull ActorType actorType, @NotNull String message, int i10) {
        Intrinsics.echo(ticketCommentAttachments, "ticketCommentAttachments");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(actorType, "actorType");
        Intrinsics.echo(message, "message");
        this.ticketCommentAttachments = ticketCommentAttachments;
        this.actorId = i4;
        this.ticketId = i5;
        this.createdAt = createdAt;
        this.actorType = actorType;
        this.message = message;
        this.id = i10;
    }

    public static /* synthetic */ TicketCommentResponse copy$default(TicketCommentResponse ticketCommentResponse, List list, int i4, int i5, Date date, ActorType actorType, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = ticketCommentResponse.ticketCommentAttachments;
        }
        if ((i11 & 2) != 0) {
            i4 = ticketCommentResponse.actorId;
        }
        if ((i11 & 4) != 0) {
            i5 = ticketCommentResponse.ticketId;
        }
        if ((i11 & 8) != 0) {
            date = ticketCommentResponse.createdAt;
        }
        if ((i11 & 16) != 0) {
            actorType = ticketCommentResponse.actorType;
        }
        if ((i11 & 32) != 0) {
            str = ticketCommentResponse.message;
        }
        if ((i11 & 64) != 0) {
            i10 = ticketCommentResponse.id;
        }
        String str2 = str;
        int i12 = i10;
        ActorType actorType2 = actorType;
        int i13 = i5;
        return ticketCommentResponse.copy(list, i4, i13, date, actorType2, str2, i12);
    }

    @NotNull
    public final List<CommentAttachment> component1() {
        return this.ticketCommentAttachments;
    }

    /* renamed from: component2, reason: from getter */
    public final int getActorId() {
        return this.actorId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTicketId() {
        return this.ticketId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ActorType getActorType() {
        return this.actorType;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component7, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final TicketCommentResponse copy(@NotNull List<CommentAttachment> ticketCommentAttachments, int actorId, int ticketId, @NotNull Date createdAt, @NotNull ActorType actorType, @NotNull String message, int id2) {
        Intrinsics.echo(ticketCommentAttachments, "ticketCommentAttachments");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(actorType, "actorType");
        Intrinsics.echo(message, "message");
        return new TicketCommentResponse(ticketCommentAttachments, actorId, ticketId, createdAt, actorType, message, id2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketCommentResponse)) {
            return false;
        }
        TicketCommentResponse ticketCommentResponse = (TicketCommentResponse) other;
        return Intrinsics.areEqual(this.ticketCommentAttachments, ticketCommentResponse.ticketCommentAttachments) && this.actorId == ticketCommentResponse.actorId && this.ticketId == ticketCommentResponse.ticketId && Intrinsics.areEqual(this.createdAt, ticketCommentResponse.createdAt) && this.actorType == ticketCommentResponse.actorType && Intrinsics.areEqual(this.message, ticketCommentResponse.message) && this.id == ticketCommentResponse.id;
    }

    public final int getActorId() {
        return this.actorId;
    }

    @NotNull
    public final ActorType getActorType() {
        return this.actorType;
    }

    @NotNull
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final List<CommentAttachment> getTicketCommentAttachments() {
        return this.ticketCommentAttachments;
    }

    public final int getTicketId() {
        return this.ticketId;
    }

    public int hashCode() {
        return AbstractC2327c.sierra((this.actorType.hashCode() + ((this.createdAt.hashCode() + (((((this.ticketCommentAttachments.hashCode() * 31) + this.actorId) * 31) + this.ticketId) * 31)) * 31)) * 31, 31, this.message) + this.id;
    }

    @NotNull
    public String toString() {
        List<CommentAttachment> list = this.ticketCommentAttachments;
        int i4 = this.actorId;
        int i5 = this.ticketId;
        Date date = this.createdAt;
        ActorType actorType = this.actorType;
        String str = this.message;
        int i10 = this.id;
        StringBuilder sb2 = new StringBuilder("TicketCommentResponse(ticketCommentAttachments=");
        sb2.append(list);
        sb2.append(", actorId=");
        sb2.append(i4);
        sb2.append(", ticketId=");
        sb2.append(i5);
        sb2.append(", createdAt=");
        sb2.append(date);
        sb2.append(", actorType=");
        sb2.append(actorType);
        sb2.append(", message=");
        sb2.append(str);
        sb2.append(", id=");
        return P0.cyan(sb2, i10, ")");
    }
}
