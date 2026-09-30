package com.app.network.network.models;

import P8.c;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b \u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR\u001c\u0010'\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR\u001c\u0010*\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR \u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\t¨\u00061"}, d2 = {"Lcom/app/network/network/models/PayLoad;", "Ljava/io/Serializable;", "<init>", "()V", Constants.KEY_TYPE, "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "deeplink", "getDeeplink", "setDeeplink", "source", "getSource", "setSource", "isReturnable", "", "()Ljava/lang/Boolean;", "setReturnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "channelExternalId", "getChannelExternalId", "setChannelExternalId", "isPositive", "setPositive", Constants.KEY_TITLE, "getTitle", "setTitle", Constants.KEY_MESSAGE, "getMessage", "setMessage", Constants.KEY_ID, "getId", "setId", "body", "getBody", "setBody", "createdAt", "getCreatedAt", "setCreatedAt", "tags", "getTags", "setTags", "fileUrl", "getFileUrl", "setFileUrl", "Companion", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayLoad implements Serializable {
    private static final long serialVersionUID = 7050818365591219734L;

    @Nullable
    private String body;

    @Nullable
    private String channelExternalId;

    @Nullable
    private String createdAt;

    @Nullable
    private String deeplink;

    @c("fileUrl")
    @Nullable
    private String fileUrl;

    @Nullable
    private String id;

    @c("isPositive")
    @Nullable
    private Boolean isPositive;

    @c("is_returnable")
    @Nullable
    private Boolean isReturnable;

    @Nullable
    private String message;

    @Nullable
    private String source;

    @Nullable
    private String tags;

    @Nullable
    private String title;

    @Nullable
    private String type;

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getChannelExternalId() {
        return this.channelExternalId;
    }

    @Nullable
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Nullable
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: isPositive, reason: from getter */
    public final Boolean getIsPositive() {
        return this.isPositive;
    }

    @Nullable
    /* renamed from: isReturnable, reason: from getter */
    public final Boolean getIsReturnable() {
        return this.isReturnable;
    }

    public final void setBody(@Nullable String str) {
        this.body = str;
    }

    public final void setChannelExternalId(@Nullable String str) {
        this.channelExternalId = str;
    }

    public final void setCreatedAt(@Nullable String str) {
        this.createdAt = str;
    }

    public final void setDeeplink(@Nullable String str) {
        this.deeplink = str;
    }

    public final void setFileUrl(@Nullable String str) {
        this.fileUrl = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setPositive(@Nullable Boolean bool) {
        this.isPositive = bool;
    }

    public final void setReturnable(@Nullable Boolean bool) {
        this.isReturnable = bool;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setTags(@Nullable String str) {
        this.tags = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
