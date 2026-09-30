package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/Root;", "", "<init>", "()V", Constants.KEY_ICON, "Lcom/app/network/network/models/Image;", "getIcon", "()Lcom/app/network/network/models/Image;", "setIcon", "(Lcom/app/network/network/models/Image;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "types", "", "Lcom/app/network/network/models/ActionType;", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Root {

    @Nullable
    private Image icon;

    @Nullable
    private String name;

    @Nullable
    private List<ActionType> types;

    @Nullable
    public final Image getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<ActionType> getTypes() {
        return this.types;
    }

    public final void setIcon(@Nullable Image image) {
        this.icon = image;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTypes(@Nullable List<ActionType> list) {
        this.types = list;
    }
}
