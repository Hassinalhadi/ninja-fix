package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/app/network/network/models/ActionType;", "Ljava/io/Serializable;", "<init>", "()V", Constants.KEY_TITLE, "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", Constants.KEY_ACTIONS, "", "Lcom/app/network/network/models/Action;", "getActions", "()Ljava/util/List;", "setActions", "(Ljava/util/List;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionType implements Serializable {

    @Nullable
    private List<Action> actions;

    @Nullable
    private String description;

    @Nullable
    private String title;

    @Nullable
    public final List<Action> getActions() {
        return this.actions;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setActions(@Nullable List<Action> list) {
        this.actions = list;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
