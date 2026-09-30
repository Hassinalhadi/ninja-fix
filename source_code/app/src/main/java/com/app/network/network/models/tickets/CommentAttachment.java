package com.app.network.network.models.tickets;

import P8.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/app/network/network/models/tickets/CommentAttachment;", "", Constants.KEY_ID, "", "fileUrl", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getFileUrl", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommentAttachment {

    @c("fileUrl")
    @NotNull
    private final String fileUrl;

    @c(Constants.KEY_ID)
    private final int id;

    public CommentAttachment(int i4, @NotNull String fileUrl) {
        Intrinsics.echo(fileUrl, "fileUrl");
        this.id = i4;
        this.fileUrl = fileUrl;
    }

    public static /* synthetic */ CommentAttachment copy$default(CommentAttachment commentAttachment, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = commentAttachment.id;
        }
        if ((i5 & 2) != 0) {
            str = commentAttachment.fileUrl;
        }
        return commentAttachment.copy(i4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @NotNull
    public final CommentAttachment copy(int id2, @NotNull String fileUrl) {
        Intrinsics.echo(fileUrl, "fileUrl");
        return new CommentAttachment(id2, fileUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentAttachment)) {
            return false;
        }
        CommentAttachment commentAttachment = (CommentAttachment) other;
        return this.id == commentAttachment.id && Intrinsics.areEqual(this.fileUrl, commentAttachment.fileUrl);
    }

    @NotNull
    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.fileUrl.hashCode() + (this.id * 31);
    }

    @NotNull
    public String toString() {
        return "CommentAttachment(id=" + this.id + ", fileUrl=" + this.fileUrl + ")";
    }
}
