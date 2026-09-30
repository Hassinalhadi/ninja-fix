package com.app.network.network.models;

import P8.c;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/app/network/network/models/UserIdentityRequestResponse;", "", Constants.KEY_ID, "", "status", "", "client", "clientDeepLink", Column.DATA, "Lcom/app/network/network/models/RequestData;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/network/network/models/RequestData;)V", "getId", "()J", "getStatus", "()Ljava/lang/String;", "getClient", "getClientDeepLink", "getData", "()Lcom/app/network/network/models/RequestData;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserIdentityRequestResponse {

    @c("client")
    @Nullable
    private final String client;

    @c("clientAppDeeplink")
    @Nullable
    private final String clientDeepLink;

    @c(Column.DATA)
    @Nullable
    private final RequestData data;

    @c(Constants.KEY_ID)
    private final long id;

    @c("status")
    @Nullable
    private final String status;

    public UserIdentityRequestResponse(long j5, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable RequestData requestData) {
        this.id = j5;
        this.status = str;
        this.client = str2;
        this.clientDeepLink = str3;
        this.data = requestData;
    }

    public static /* synthetic */ UserIdentityRequestResponse copy$default(UserIdentityRequestResponse userIdentityRequestResponse, long j5, String str, String str2, String str3, RequestData requestData, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = userIdentityRequestResponse.id;
        }
        long j6 = j5;
        if ((i4 & 2) != 0) {
            str = userIdentityRequestResponse.status;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            str2 = userIdentityRequestResponse.client;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            str3 = userIdentityRequestResponse.clientDeepLink;
        }
        String str6 = str3;
        if ((i4 & 16) != 0) {
            requestData = userIdentityRequestResponse.data;
        }
        return userIdentityRequestResponse.copy(j6, str4, str5, str6, requestData);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getClient() {
        return this.client;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getClientDeepLink() {
        return this.clientDeepLink;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final RequestData getData() {
        return this.data;
    }

    @NotNull
    public final UserIdentityRequestResponse copy(long id2, @Nullable String status, @Nullable String client, @Nullable String clientDeepLink, @Nullable RequestData data) {
        return new UserIdentityRequestResponse(id2, status, client, clientDeepLink, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserIdentityRequestResponse)) {
            return false;
        }
        UserIdentityRequestResponse userIdentityRequestResponse = (UserIdentityRequestResponse) other;
        return this.id == userIdentityRequestResponse.id && Intrinsics.areEqual(this.status, userIdentityRequestResponse.status) && Intrinsics.areEqual(this.client, userIdentityRequestResponse.client) && Intrinsics.areEqual(this.clientDeepLink, userIdentityRequestResponse.clientDeepLink) && Intrinsics.areEqual(this.data, userIdentityRequestResponse.data);
    }

    @Nullable
    public final String getClient() {
        return this.client;
    }

    @Nullable
    public final String getClientDeepLink() {
        return this.clientDeepLink;
    }

    @Nullable
    public final RequestData getData() {
        return this.data;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j5 = this.id;
        int i4 = ((int) (j5 ^ (j5 >>> 32))) * 31;
        String str = this.status;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (i4 + hashCode) * 31;
        String str2 = this.client;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.clientDeepLink;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        RequestData requestData = this.data;
        if (requestData != null) {
            i5 = requestData.hashCode();
        }
        return i12 + i5;
    }

    @NotNull
    public String toString() {
        long j5 = this.id;
        String str = this.status;
        String str2 = this.client;
        String str3 = this.clientDeepLink;
        RequestData requestData = this.data;
        StringBuilder sb2 = new StringBuilder("UserIdentityRequestResponse(id=");
        sb2.append(j5);
        sb2.append(", status=");
        sb2.append(str);
        Q0.c.azure(sb2, ", client=", str2, ", clientDeepLink=", str3);
        sb2.append(", data=");
        sb2.append(requestData);
        sb2.append(")");
        return sb2.toString();
    }
}
