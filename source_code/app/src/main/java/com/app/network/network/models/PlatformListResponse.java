package com.app.network.network.models;

import Q0.c;
import androidx.annotation.Keep;
import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/PlatformListResponse;", "Lcom/app/network/network/models/Language;", "created", "", "imageUrl", "isAvailable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCreated", "()Ljava/lang/String;", "getImageUrl", "()Z", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PlatformListResponse extends Language {

    @NotNull
    private final String created;

    @NotNull
    private final String imageUrl;
    private final boolean isAvailable;

    public /* synthetic */ PlatformListResponse(String str, String str2, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i4 & 4) != 0 ? true : z2);
    }

    public static /* synthetic */ PlatformListResponse copy$default(PlatformListResponse platformListResponse, String str, String str2, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = platformListResponse.created;
        }
        if ((i4 & 2) != 0) {
            str2 = platformListResponse.imageUrl;
        }
        if ((i4 & 4) != 0) {
            z2 = platformListResponse.isAvailable;
        }
        return platformListResponse.copy(str, str2, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCreated() {
        return this.created;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public final PlatformListResponse copy(@NotNull String created, @NotNull String imageUrl, boolean isAvailable) {
        Intrinsics.echo(created, "created");
        Intrinsics.echo(imageUrl, "imageUrl");
        return new PlatformListResponse(created, imageUrl, isAvailable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformListResponse)) {
            return false;
        }
        PlatformListResponse platformListResponse = (PlatformListResponse) other;
        return Intrinsics.areEqual(this.created, platformListResponse.created) && Intrinsics.areEqual(this.imageUrl, platformListResponse.imageUrl) && this.isAvailable == platformListResponse.isAvailable;
    }

    @NotNull
    public final String getCreated() {
        return this.created;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int i4;
        int sierra = AbstractC2327c.sierra(this.created.hashCode() * 31, 31, this.imageUrl);
        if (this.isAvailable) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return sierra + i4;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public String toString() {
        String str = this.created;
        String str2 = this.imageUrl;
        return c.romeo(q.india("PlatformListResponse(created=", str, ", imageUrl=", str2, ", isAvailable="), this.isAvailable, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformListResponse(@NotNull String created, @NotNull String imageUrl, boolean z2) {
        super(null, 1, null);
        Intrinsics.echo(created, "created");
        Intrinsics.echo(imageUrl, "imageUrl");
        this.created = created;
        this.imageUrl = imageUrl;
        this.isAvailable = z2;
    }
}
