package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010A\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010&J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\u0012HÆ\u0003J\t\u0010E\u001a\u00020\u0014HÆ\u0003J\t\u0010F\u001a\u00020\u0016HÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J¸\u0001\u0010J\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\tHÖ\u0001J\t\u0010P\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u00107R\u001a\u0010\u0019\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\"\"\u0004\b9\u00107¨\u0006Q"}, d2 = {"Lcom/app/network/network/models/AddressNoteListItem;", "Ljava/io/Serializable;", "attachments", "", "Lcom/app/network/network/models/Attachment;", "createdAt", "", "description", Constants.KEY_ID, "", "languageCode", "taskAddressId", "latitude", "", "longitude", "upVotes", "downVotes", "ownerType", "Lcom/app/network/network/models/OwnerType;", "isVoted", "", "localVote", "Lcom/app/network/network/models/LocalVote;", "netRating", "noteNumber", "totalNotes", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;IILcom/app/network/network/models/OwnerType;ZLcom/app/network/network/models/LocalVote;III)V", "getAttachments", "()Ljava/util/List;", "getCreatedAt", "()Ljava/lang/String;", "getDescription", "getId", "()I", "getLanguageCode", "getTaskAddressId", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getUpVotes", "getDownVotes", "getOwnerType", "()Lcom/app/network/network/models/OwnerType;", "()Z", "setVoted", "(Z)V", "getLocalVote", "()Lcom/app/network/network/models/LocalVote;", "setLocalVote", "(Lcom/app/network/network/models/LocalVote;)V", "getNetRating", "getNoteNumber", "setNoteNumber", "(I)V", "getTotalNotes", "setTotalNotes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;IILcom/app/network/network/models/OwnerType;ZLcom/app/network/network/models/LocalVote;III)Lcom/app/network/network/models/AddressNoteListItem;", "equals", "other", "", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AddressNoteListItem implements Serializable {

    @NotNull
    private final List<Attachment> attachments;

    @NotNull
    private final String createdAt;

    @NotNull
    private final String description;
    private final int downVotes;
    private final int id;
    private boolean isVoted;

    @NotNull
    private final String languageCode;

    @Nullable
    private final Double latitude;

    @NotNull
    private LocalVote localVote;

    @Nullable
    private final Double longitude;
    private final int netRating;
    private int noteNumber;

    @NotNull
    private final OwnerType ownerType;
    private final int taskAddressId;
    private int totalNotes;
    private final int upVotes;

    public AddressNoteListItem(@NotNull List<Attachment> attachments, @NotNull String createdAt, @NotNull String description, int i4, @NotNull String languageCode, int i5, @Nullable Double d4, @Nullable Double d9, int i10, int i11, @NotNull OwnerType ownerType, boolean z2, @NotNull LocalVote localVote, int i12, int i13, int i14) {
        Intrinsics.echo(attachments, "attachments");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(description, "description");
        Intrinsics.echo(languageCode, "languageCode");
        Intrinsics.echo(ownerType, "ownerType");
        Intrinsics.echo(localVote, "localVote");
        this.attachments = attachments;
        this.createdAt = createdAt;
        this.description = description;
        this.id = i4;
        this.languageCode = languageCode;
        this.taskAddressId = i5;
        this.latitude = d4;
        this.longitude = d9;
        this.upVotes = i10;
        this.downVotes = i11;
        this.ownerType = ownerType;
        this.isVoted = z2;
        this.localVote = localVote;
        this.netRating = i12;
        this.noteNumber = i13;
        this.totalNotes = i14;
    }

    @NotNull
    public final List<Attachment> component1() {
        return this.attachments;
    }

    /* renamed from: component10, reason: from getter */
    public final int getDownVotes() {
        return this.downVotes;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final OwnerType getOwnerType() {
        return this.ownerType;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsVoted() {
        return this.isVoted;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final LocalVote getLocalVote() {
        return this.localVote;
    }

    /* renamed from: component14, reason: from getter */
    public final int getNetRating() {
        return this.netRating;
    }

    /* renamed from: component15, reason: from getter */
    public final int getNoteNumber() {
        return this.noteNumber;
    }

    /* renamed from: component16, reason: from getter */
    public final int getTotalNotes() {
        return this.totalNotes;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTaskAddressId() {
        return this.taskAddressId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component9, reason: from getter */
    public final int getUpVotes() {
        return this.upVotes;
    }

    @NotNull
    public final AddressNoteListItem copy(@NotNull List<Attachment> attachments, @NotNull String createdAt, @NotNull String description, int id2, @NotNull String languageCode, int taskAddressId, @Nullable Double latitude, @Nullable Double longitude, int upVotes, int downVotes, @NotNull OwnerType ownerType, boolean isVoted, @NotNull LocalVote localVote, int netRating, int noteNumber, int totalNotes) {
        Intrinsics.echo(attachments, "attachments");
        Intrinsics.echo(createdAt, "createdAt");
        Intrinsics.echo(description, "description");
        Intrinsics.echo(languageCode, "languageCode");
        Intrinsics.echo(ownerType, "ownerType");
        Intrinsics.echo(localVote, "localVote");
        return new AddressNoteListItem(attachments, createdAt, description, id2, languageCode, taskAddressId, latitude, longitude, upVotes, downVotes, ownerType, isVoted, localVote, netRating, noteNumber, totalNotes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressNoteListItem)) {
            return false;
        }
        AddressNoteListItem addressNoteListItem = (AddressNoteListItem) other;
        return Intrinsics.areEqual(this.attachments, addressNoteListItem.attachments) && Intrinsics.areEqual(this.createdAt, addressNoteListItem.createdAt) && Intrinsics.areEqual(this.description, addressNoteListItem.description) && this.id == addressNoteListItem.id && Intrinsics.areEqual(this.languageCode, addressNoteListItem.languageCode) && this.taskAddressId == addressNoteListItem.taskAddressId && Intrinsics.areEqual(this.latitude, addressNoteListItem.latitude) && Intrinsics.areEqual(this.longitude, addressNoteListItem.longitude) && this.upVotes == addressNoteListItem.upVotes && this.downVotes == addressNoteListItem.downVotes && this.ownerType == addressNoteListItem.ownerType && this.isVoted == addressNoteListItem.isVoted && this.localVote == addressNoteListItem.localVote && this.netRating == addressNoteListItem.netRating && this.noteNumber == addressNoteListItem.noteNumber && this.totalNotes == addressNoteListItem.totalNotes;
    }

    @NotNull
    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    @NotNull
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getDownVotes() {
        return this.downVotes;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final LocalVote getLocalVote() {
        return this.localVote;
    }

    @Nullable
    public final Double getLongitude() {
        return this.longitude;
    }

    public final int getNetRating() {
        return this.netRating;
    }

    public final int getNoteNumber() {
        return this.noteNumber;
    }

    @NotNull
    public final OwnerType getOwnerType() {
        return this.ownerType;
    }

    public final int getTaskAddressId() {
        return this.taskAddressId;
    }

    public final int getTotalNotes() {
        return this.totalNotes;
    }

    public final int getUpVotes() {
        return this.upVotes;
    }

    public int hashCode() {
        int hashCode;
        int i4;
        int sierra = (AbstractC2327c.sierra((AbstractC2327c.sierra(AbstractC2327c.sierra(this.attachments.hashCode() * 31, 31, this.createdAt), 31, this.description) + this.id) * 31, 31, this.languageCode) + this.taskAddressId) * 31;
        Double d4 = this.latitude;
        int i5 = 0;
        if (d4 == null) {
            hashCode = 0;
        } else {
            hashCode = d4.hashCode();
        }
        int i10 = (sierra + hashCode) * 31;
        Double d9 = this.longitude;
        if (d9 != null) {
            i5 = d9.hashCode();
        }
        int hashCode2 = (this.ownerType.hashCode() + ((((((i10 + i5) * 31) + this.upVotes) * 31) + this.downVotes) * 31)) * 31;
        if (this.isVoted) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return ((((((this.localVote.hashCode() + ((hashCode2 + i4) * 31)) * 31) + this.netRating) * 31) + this.noteNumber) * 31) + this.totalNotes;
    }

    public final boolean isVoted() {
        return this.isVoted;
    }

    public final void setLocalVote(@NotNull LocalVote localVote) {
        Intrinsics.echo(localVote, "<set-?>");
        this.localVote = localVote;
    }

    public final void setNoteNumber(int i4) {
        this.noteNumber = i4;
    }

    public final void setTotalNotes(int i4) {
        this.totalNotes = i4;
    }

    public final void setVoted(boolean z2) {
        this.isVoted = z2;
    }

    @NotNull
    public String toString() {
        return "AddressNoteListItem(attachments=" + this.attachments + ", createdAt=" + this.createdAt + ", description=" + this.description + ", id=" + this.id + ", languageCode=" + this.languageCode + ", taskAddressId=" + this.taskAddressId + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", upVotes=" + this.upVotes + ", downVotes=" + this.downVotes + ", ownerType=" + this.ownerType + ", isVoted=" + this.isVoted + ", localVote=" + this.localVote + ", netRating=" + this.netRating + ", noteNumber=" + this.noteNumber + ", totalNotes=" + this.totalNotes + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AddressNoteListItem(java.util.List r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24, int r25, java.lang.Double r26, java.lang.Double r27, int r28, int r29, com.app.network.network.models.OwnerType r30, boolean r31, com.app.network.network.models.LocalVote r32, int r33, int r34, int r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto Lc
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r3 = r1
            goto Le
        Lc:
            r3 = r20
        Le:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L15
            r14 = r2
            goto L17
        L15:
            r14 = r31
        L17:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L1f
            com.app.network.network.models.LocalVote r1 = com.app.network.network.models.LocalVote.NONE
            r15 = r1
            goto L21
        L1f:
            r15 = r32
        L21:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L2a
            int r1 = r28 - r29
            r16 = r1
            goto L2c
        L2a:
            r16 = r33
        L2c:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L33
            r17 = r2
            goto L35
        L33:
            r17 = r34
        L35:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L54
            r18 = r2
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r2 = r19
            goto L6c
        L54:
            r18 = r35
            r2 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
        L6c:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.network.network.models.AddressNoteListItem.<init>(java.util.List, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.Double, java.lang.Double, int, int, com.app.network.network.models.OwnerType, boolean, com.app.network.network.models.LocalVote, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
