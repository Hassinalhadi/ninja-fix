package com.app.network.network.models.redeem;

import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/redeem/RedeemItemResponse;", "", Constants.KEY_TITLE, "", "description", "Id", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getId", "()I", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RedeemItemResponse {
    private final int Id;

    @NotNull
    private final String description;

    @NotNull
    private final String title;

    public RedeemItemResponse(@NotNull String title, @NotNull String description, int i4) {
        Intrinsics.echo(title, "title");
        Intrinsics.echo(description, "description");
        this.title = title;
        this.description = description;
        this.Id = i4;
    }

    public static /* synthetic */ RedeemItemResponse copy$default(RedeemItemResponse redeemItemResponse, String str, String str2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = redeemItemResponse.title;
        }
        if ((i5 & 2) != 0) {
            str2 = redeemItemResponse.description;
        }
        if ((i5 & 4) != 0) {
            i4 = redeemItemResponse.Id;
        }
        return redeemItemResponse.copy(str, str2, i4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final int getId() {
        return this.Id;
    }

    @NotNull
    public final RedeemItemResponse copy(@NotNull String title, @NotNull String description, int Id2) {
        Intrinsics.echo(title, "title");
        Intrinsics.echo(description, "description");
        return new RedeemItemResponse(title, description, Id2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedeemItemResponse)) {
            return false;
        }
        RedeemItemResponse redeemItemResponse = (RedeemItemResponse) other;
        return Intrinsics.areEqual(this.title, redeemItemResponse.title) && Intrinsics.areEqual(this.description, redeemItemResponse.description) && this.Id == redeemItemResponse.Id;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.Id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AbstractC2327c.sierra(this.title.hashCode() * 31, 31, this.description) + this.Id;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        return P0.cyan(q.india("RedeemItemResponse(title=", str, ", description=", str2, ", Id="), this.Id, ")");
    }
}
