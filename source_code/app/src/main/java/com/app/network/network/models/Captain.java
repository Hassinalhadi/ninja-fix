package com.app.network.network.models;

import com.app.network.network.models.captian.User;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u001e\u0010'\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001c\u00103\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\u001c\u00106\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/¨\u00069"}, d2 = {"Lcom/app/network/network/models/Captain;", "", "<init>", "()V", "connected", "", "getConnected", "()Ljava/lang/Boolean;", "setConnected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "user", "Lcom/app/network/network/models/captian/User;", "getUser", "()Lcom/app/network/network/models/captian/User;", "setUser", "(Lcom/app/network/network/models/captian/User;)V", "defaultCityId", "", "getDefaultCityId", "()Ljava/lang/Integer;", "setDefaultCityId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "readyToWork", "getReadyToWork", "setReadyToWork", "suspended", "getSuspended", "setSuspended", "workingStatus", "Lcom/app/network/network/models/WorkingStatus;", "getWorkingStatus", "()Lcom/app/network/network/models/WorkingStatus;", "setWorkingStatus", "(Lcom/app/network/network/models/WorkingStatus;)V", Constants.KEY_ID, "getId", "setId", "platformId", "getPlatformId", "setPlatformId", "locationStatusEmoji", "", "getLocationStatusEmoji", "()Ljava/lang/String;", "setLocationStatusEmoji", "(Ljava/lang/String;)V", "locationStatus", "getLocationStatus", "setLocationStatus", "status", "getStatus", "setStatus", Constants.KEY_TYPE, "getType", "setType", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Captain {

    @Nullable
    private Boolean connected;

    @Nullable
    private Integer defaultCityId;

    @Nullable
    private Integer id;

    @Nullable
    private String locationStatus;

    @Nullable
    private String locationStatusEmoji;

    @Nullable
    private Integer platformId;

    @Nullable
    private Boolean readyToWork;

    @Nullable
    private String status;

    @Nullable
    private Boolean suspended;

    @Nullable
    private String type;

    @Nullable
    private User user;

    @Nullable
    private WorkingStatus workingStatus;

    @Nullable
    public final Boolean getConnected() {
        return this.connected;
    }

    @Nullable
    public final Integer getDefaultCityId() {
        return this.defaultCityId;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getLocationStatus() {
        return this.locationStatus;
    }

    @Nullable
    public final String getLocationStatusEmoji() {
        return this.locationStatusEmoji;
    }

    @Nullable
    public final Integer getPlatformId() {
        return this.platformId;
    }

    @Nullable
    public final Boolean getReadyToWork() {
        return this.readyToWork;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Boolean getSuspended() {
        return this.suspended;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final User getUser() {
        return this.user;
    }

    @Nullable
    public final WorkingStatus getWorkingStatus() {
        return this.workingStatus;
    }

    public final void setConnected(@Nullable Boolean bool) {
        this.connected = bool;
    }

    public final void setDefaultCityId(@Nullable Integer num) {
        this.defaultCityId = num;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setLocationStatus(@Nullable String str) {
        this.locationStatus = str;
    }

    public final void setLocationStatusEmoji(@Nullable String str) {
        this.locationStatusEmoji = str;
    }

    public final void setPlatformId(@Nullable Integer num) {
        this.platformId = num;
    }

    public final void setReadyToWork(@Nullable Boolean bool) {
        this.readyToWork = bool;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setSuspended(@Nullable Boolean bool) {
        this.suspended = bool;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUser(@Nullable User user) {
        this.user = user;
    }

    public final void setWorkingStatus(@Nullable WorkingStatus workingStatus) {
        this.workingStatus = workingStatus;
    }
}
