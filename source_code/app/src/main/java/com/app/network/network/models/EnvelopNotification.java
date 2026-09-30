package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/app/network/network/models/EnvelopNotification;", "Ljava/io/Serializable;", "<init>", "()V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", Constants.KEY_TITLE, "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", Constants.KEY_MESSAGE, "getMessage", "setMessage", "createdAt", "getCreatedAt", "setCreatedAt", "unread", "", "getUnread", "()Ljava/lang/Boolean;", "setUnread", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "tags", "", "Lcom/app/network/network/models/EnvelopNotification$Tag;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", CTVariableUtils.FILE, "Lcom/app/network/network/models/Image;", "getFile", "()Lcom/app/network/network/models/Image;", "setFile", "(Lcom/app/network/network/models/Image;)V", "Tag", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnvelopNotification implements Serializable {

    @Nullable
    private String createdAt;

    @Nullable
    private Image file;

    @Nullable
    private Integer id;

    @Nullable
    private String message;

    @Nullable
    private List<Tag> tags;

    @Nullable
    private String title;

    @Nullable
    private Boolean unread;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/app/network/network/models/EnvelopNotification$Tag;", "Ljava/io/Serializable;", "<init>", "()V", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", Constants.KEY_COLOR, "getColor", "setColor", "foregroundColor", "getForegroundColor", "setForegroundColor", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Tag implements Serializable {

        @Nullable
        private String color;

        @Nullable
        private String foregroundColor;

        @Nullable
        private String value;

        @Nullable
        public final String getColor() {
            return this.color;
        }

        @Nullable
        public final String getForegroundColor() {
            return this.foregroundColor;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public final void setColor(@Nullable String str) {
            this.color = str;
        }

        public final void setForegroundColor(@Nullable String str) {
            this.foregroundColor = str;
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }
    }

    @Nullable
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Image getFile() {
        return this.file;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final List<Tag> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Boolean getUnread() {
        return this.unread;
    }

    public final void setCreatedAt(@Nullable String str) {
        this.createdAt = str;
    }

    public final void setFile(@Nullable Image image) {
        this.file = image;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setTags(@Nullable List<Tag> list) {
        this.tags = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUnread(@Nullable Boolean bool) {
        this.unread = bool;
    }
}
