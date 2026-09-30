package com.app.network.network.models.captian;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/app/network/network/models/captian/User;", "", "<init>", "()V", "userMobile", "Lcom/app/network/network/models/captian/UserMobile;", "getUserMobile", "()Lcom/app/network/network/models/captian/UserMobile;", "setUserMobile", "(Lcom/app/network/network/models/captian/UserMobile;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "name", "getName", "setName", "profilePictureUrl", "getProfilePictureUrl", "setProfilePictureUrl", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class User {

    @Nullable
    private String email;

    @Nullable
    private String name;

    @Nullable
    private String profilePictureUrl;

    @Nullable
    private UserMobile userMobile;

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    @Nullable
    public final UserMobile getUserMobile() {
        return this.userMobile;
    }

    public final void setEmail(@Nullable String str) {
        this.email = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setProfilePictureUrl(@Nullable String str) {
        this.profilePictureUrl = str;
    }

    public final void setUserMobile(@Nullable UserMobile userMobile) {
        this.userMobile = userMobile;
    }
}
