package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/app/network/network/models/Disclaimer;", "", "<init>", "()V", Constants.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "actionMessage", "getActionMessage", "setActionMessage", "deepLink", "getDeepLink", "setDeepLink", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Disclaimer {

    @Nullable
    private String actionMessage;

    @Nullable
    private String deepLink;

    @Nullable
    private String message;

    @Nullable
    public final String getActionMessage() {
        return this.actionMessage;
    }

    @Nullable
    public final String getDeepLink() {
        return this.deepLink;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final void setActionMessage(@Nullable String str) {
        this.actionMessage = str;
    }

    public final void setDeepLink(@Nullable String str) {
        this.deepLink = str;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }
}
