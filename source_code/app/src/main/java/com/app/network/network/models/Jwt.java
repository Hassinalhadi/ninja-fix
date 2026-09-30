package com.app.network.network.models;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/app/network/network/models/Jwt;", "", "<init>", "()V", "jwtToken", "", "getJwtToken", "()Ljava/lang/String;", "setJwtToken", "(Ljava/lang/String;)V", "refreshToken", "getRefreshToken", "setRefreshToken", "jwtTokenExpiryDate", "getJwtTokenExpiryDate", "setJwtTokenExpiryDate", "refreshTokenExpiryDate", "getRefreshTokenExpiryDate", "setRefreshTokenExpiryDate", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Jwt {

    @Nullable
    private String jwtToken;

    @Nullable
    private String jwtTokenExpiryDate;

    @Nullable
    private String refreshToken;

    @Nullable
    private String refreshTokenExpiryDate;

    @Nullable
    public final String getJwtToken() {
        return this.jwtToken;
    }

    @Nullable
    public final String getJwtTokenExpiryDate() {
        return this.jwtTokenExpiryDate;
    }

    @Nullable
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public final String getRefreshTokenExpiryDate() {
        return this.refreshTokenExpiryDate;
    }

    public final void setJwtToken(@Nullable String str) {
        this.jwtToken = str;
    }

    public final void setJwtTokenExpiryDate(@Nullable String str) {
        this.jwtTokenExpiryDate = str;
    }

    public final void setRefreshToken(@Nullable String str) {
        this.refreshToken = str;
    }

    public final void setRefreshTokenExpiryDate(@Nullable String str) {
        this.refreshTokenExpiryDate = str;
    }
}
