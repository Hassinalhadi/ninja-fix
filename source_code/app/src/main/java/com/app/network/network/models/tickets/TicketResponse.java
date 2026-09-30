package com.app.network.network.models.tickets;

import P8.c;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\u008c\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00132\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*¨\u0006="}, d2 = {"Lcom/app/network/network/models/tickets/TicketResponse;", "", "status", "Lcom/app/network/network/models/tickets/TicketStatus;", Constants.KEY_TITLE, "", "ownerId", "", "createdAt", "Ljava/util/Date;", "ticketActionId", Constants.KEY_ID, Constants.KEY_CONTENT, "attachments", "", "Lcom/app/network/network/models/tickets/TicketAttachment;", "comments", "Lcom/app/network/network/models/tickets/TicketCommentResponse;", "canReopen", "", "active", "<init>", "(Lcom/app/network/network/models/tickets/TicketStatus;Ljava/lang/String;ILjava/util/Date;Ljava/lang/Integer;ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;)V", "getStatus", "()Lcom/app/network/network/models/tickets/TicketStatus;", "getTitle", "()Ljava/lang/String;", "getOwnerId", "()I", "getCreatedAt", "()Ljava/util/Date;", "getTicketActionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getContent", "getAttachments", "()Ljava/util/List;", "getComments", "getCanReopen", "()Z", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "(Lcom/app/network/network/models/tickets/TicketStatus;Ljava/lang/String;ILjava/util/Date;Ljava/lang/Integer;ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;)Lcom/app/network/network/models/tickets/TicketResponse;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TicketResponse {

    @c("active")
    @Nullable
    private final Boolean active;

    @c("attachments")
    @NotNull
    private final List<TicketAttachment> attachments;

    @c("canReopen")
    private final boolean canReopen;

    @c("comments")
    @NotNull
    private final List<TicketCommentResponse> comments;

    @c(Constants.KEY_CONTENT)
    @NotNull
    private final String content;

    @c("createdAt")
    @NotNull
    private final Date createdAt;

    @c(Constants.KEY_ID)
    private final int id;

    @c("ownerId")
    private final int ownerId;

    @c("status")
    @NotNull
    private final TicketStatus status;

    @c("ticketActionId")
    @Nullable
    private final Integer ticketActionId;

    @c(Constants.KEY_TITLE)
    @NotNull
    private final String title;

    public TicketResponse(@NotNull TicketStatus status, @NotNull String title, int i4, @NotNull Date createdAt, @Nullable Integer num, int i5, @NotNull String content, @NotNull List<TicketAttachment> attachments, @NotNull List<TicketCommentResponse> comments, boolean z2, @Nullable Boolean bool) {
        Intrinsics.echo(status, "status");
        Intrinsics.echo(title, "title");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(content, "content");
        Intrinsics.echo(attachments, "attachments");
        Intrinsics.echo(comments, "comments");
        this.status = status;
        this.title = title;
        this.ownerId = i4;
        this.createdAt = createdAt;
        this.ticketActionId = num;
        this.id = i5;
        this.content = content;
        this.attachments = attachments;
        this.comments = comments;
        this.canReopen = z2;
        this.active = bool;
    }

    public static /* synthetic */ TicketResponse copy$default(TicketResponse ticketResponse, TicketStatus ticketStatus, String str, int i4, Date date, Integer num, int i5, String str2, List list, List list2, boolean z2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ticketStatus = ticketResponse.status;
        }
        if ((i10 & 2) != 0) {
            str = ticketResponse.title;
        }
        if ((i10 & 4) != 0) {
            i4 = ticketResponse.ownerId;
        }
        if ((i10 & 8) != 0) {
            date = ticketResponse.createdAt;
        }
        if ((i10 & 16) != 0) {
            num = ticketResponse.ticketActionId;
        }
        if ((i10 & 32) != 0) {
            i5 = ticketResponse.id;
        }
        if ((i10 & 64) != 0) {
            str2 = ticketResponse.content;
        }
        if ((i10 & 128) != 0) {
            list = ticketResponse.attachments;
        }
        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
            list2 = ticketResponse.comments;
        }
        if ((i10 & 512) != 0) {
            z2 = ticketResponse.canReopen;
        }
        if ((i10 & Barcode.FORMAT_UPC_E) != 0) {
            bool = ticketResponse.active;
        }
        boolean z10 = z2;
        Boolean bool2 = bool;
        List list3 = list;
        List list4 = list2;
        int i11 = i5;
        String str3 = str2;
        Integer num2 = num;
        int i12 = i4;
        return ticketResponse.copy(ticketStatus, str, i12, date, num2, i11, str3, list3, list4, z10, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TicketStatus getStatus() {
        return this.status;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getCanReopen() {
        return this.canReopen;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOwnerId() {
        return this.ownerId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getTicketActionId() {
        return this.ticketActionId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final List<TicketAttachment> component8() {
        return this.attachments;
    }

    @NotNull
    public final List<TicketCommentResponse> component9() {
        return this.comments;
    }

    @NotNull
    public final TicketResponse copy(@NotNull TicketStatus status, @NotNull String title, int ownerId, @NotNull Date createdAt, @Nullable Integer ticketActionId, int id2, @NotNull String content, @NotNull List<TicketAttachment> attachments, @NotNull List<TicketCommentResponse> comments, boolean canReopen, @Nullable Boolean active) {
        Intrinsics.echo(status, "status");
        Intrinsics.echo(title, "title");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(content, "content");
        Intrinsics.echo(attachments, "attachments");
        Intrinsics.echo(comments, "comments");
        return new TicketResponse(status, title, ownerId, createdAt, ticketActionId, id2, content, attachments, comments, canReopen, active);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketResponse)) {
            return false;
        }
        TicketResponse ticketResponse = (TicketResponse) other;
        return this.status == ticketResponse.status && Intrinsics.areEqual(this.title, ticketResponse.title) && this.ownerId == ticketResponse.ownerId && Intrinsics.areEqual(this.createdAt, ticketResponse.createdAt) && Intrinsics.areEqual(this.ticketActionId, ticketResponse.ticketActionId) && this.id == ticketResponse.id && Intrinsics.areEqual(this.content, ticketResponse.content) && Intrinsics.areEqual(this.attachments, ticketResponse.attachments) && Intrinsics.areEqual(this.comments, ticketResponse.comments) && this.canReopen == ticketResponse.canReopen && Intrinsics.areEqual(this.active, ticketResponse.active);
    }

    @Nullable
    public final Boolean getActive() {
        return this.active;
    }

    @NotNull
    public final List<TicketAttachment> getAttachments() {
        return this.attachments;
    }

    public final boolean getCanReopen() {
        return this.canReopen;
    }

    @NotNull
    public final List<TicketCommentResponse> getComments() {
        return this.comments;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOwnerId() {
        return this.ownerId;
    }

    @NotNull
    public final TicketStatus getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getTicketActionId() {
        return this.ticketActionId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int i4;
        int hashCode2 = (this.createdAt.hashCode() + ((AbstractC2327c.sierra(this.status.hashCode() * 31, 31, this.title) + this.ownerId) * 31)) * 31;
        Integer num = this.ticketActionId;
        int i5 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int golf = j.golf(j.golf(AbstractC2327c.sierra((((hashCode2 + hashCode) * 31) + this.id) * 31, 31, this.content), 31, this.attachments), 31, this.comments);
        if (this.canReopen) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (golf + i4) * 31;
        Boolean bool = this.active;
        if (bool != null) {
            i5 = bool.hashCode();
        }
        return i10 + i5;
    }

    @NotNull
    public String toString() {
        return "TicketResponse(status=" + this.status + ", title=" + this.title + ", ownerId=" + this.ownerId + ", createdAt=" + this.createdAt + ", ticketActionId=" + this.ticketActionId + ", id=" + this.id + ", content=" + this.content + ", attachments=" + this.attachments + ", comments=" + this.comments + ", canReopen=" + this.canReopen + ", active=" + this.active + ")";
    }

    public /* synthetic */ TicketResponse(TicketStatus ticketStatus, String str, int i4, Date date, Integer num, int i5, String str2, List list, List list2, boolean z2, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(ticketStatus, str, i4, date, (i10 & 16) != 0 ? null : num, i5, str2, (i10 & 128) != 0 ? CollectionsKt.emptyList() : list, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 512) != 0 ? false : z2, (i10 & Barcode.FORMAT_UPC_E) != 0 ? null : bool);
    }
}
