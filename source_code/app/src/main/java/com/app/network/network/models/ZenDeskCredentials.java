package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/app/network/network/models/ZenDeskCredentials;", "", "<init>", "()V", "appId", "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "clientId", "getClientId", "setClientId", Constants.KEY_URL, "getUrl", "setUrl", "jwtToken", "getJwtToken", "setJwtToken", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZenDeskCredentials {

    @Nullable
    private String appId;

    @Nullable
    private String clientId;

    @Nullable
    private String jwtToken;

    @Nullable
    private String url;

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    public final String getJwtToken() {
        return this.jwtToken;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setClientId(@Nullable String str) {
        this.clientId = str;
    }

    public final void setJwtToken(@Nullable String str) {
        this.jwtToken = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
