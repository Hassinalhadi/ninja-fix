package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001a\u0010\u001d\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/app/network/network/models/Action;", "Ljava/io/Serializable;", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", Constants.KEY_TYPE, "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "value", "getValue", "setValue", "cameraImagesOnly", "getCameraImagesOnly", "setCameraImagesOnly", "imageRequired", "getImageRequired", "setImageRequired", "actionType", "Lcom/app/network/network/models/TicketActionType;", "getActionType", "()Lcom/app/network/network/models/TicketActionType;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Action implements Serializable {
    private boolean cameraImagesOnly;
    private boolean enabled;

    @Nullable
    private Integer id;
    private boolean imageRequired;

    @Nullable
    private String type;

    @Nullable
    private String value;

    @Nullable
    public final TicketActionType getActionType() {
        return TicketActionType.INSTANCE.fromString(this.type);
    }

    public final boolean getCameraImagesOnly() {
        return this.cameraImagesOnly;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    public final boolean getImageRequired() {
        return this.imageRequired;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final void setCameraImagesOnly(boolean z2) {
        this.cameraImagesOnly = z2;
    }

    public final void setEnabled(boolean z2) {
        this.enabled = z2;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setImageRequired(boolean z2) {
        this.imageRequired = z2;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }
}
