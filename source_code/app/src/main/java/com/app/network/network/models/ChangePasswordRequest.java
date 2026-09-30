package com.app.network.network.models;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/app/network/network/models/ChangePasswordRequest;", "", "password", "", "userId", "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "getUserId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getToken", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/app/network/network/models/ChangePasswordRequest;", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangePasswordRequest {

    @NotNull
    private final String password;

    @Nullable
    private final String token;

    @Nullable
    private final Integer userId;

    public ChangePasswordRequest(@NotNull String password, @Nullable Integer num, @Nullable String str) {
        Intrinsics.echo(password, "password");
        this.password = password;
        this.userId = num;
        this.token = str;
    }

    public static /* synthetic */ ChangePasswordRequest copy$default(ChangePasswordRequest changePasswordRequest, String str, Integer num, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = changePasswordRequest.password;
        }
        if ((i4 & 2) != 0) {
            num = changePasswordRequest.userId;
        }
        if ((i4 & 4) != 0) {
            str2 = changePasswordRequest.token;
        }
        return changePasswordRequest.copy(str, num, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getUserId() {
        return this.userId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final ChangePasswordRequest copy(@NotNull String password, @Nullable Integer userId, @Nullable String token) {
        Intrinsics.echo(password, "password");
        return new ChangePasswordRequest(password, userId, token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePasswordRequest)) {
            return false;
        }
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) other;
        return Intrinsics.areEqual(this.password, changePasswordRequest.password) && Intrinsics.areEqual(this.userId, changePasswordRequest.userId) && Intrinsics.areEqual(this.token, changePasswordRequest.token);
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = this.password.hashCode() * 31;
        Integer num = this.userId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.token;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.password;
        Integer num = this.userId;
        String str2 = this.token;
        StringBuilder sb2 = new StringBuilder("ChangePasswordRequest(password=");
        sb2.append(str);
        sb2.append(", userId=");
        sb2.append(num);
        sb2.append(", token=");
        return P0.gold(sb2, str2, ")");
    }
}
